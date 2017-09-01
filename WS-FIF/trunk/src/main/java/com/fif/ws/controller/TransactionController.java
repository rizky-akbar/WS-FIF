/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.controller;

import com.fif.ws.model.dto.order.InvoiceHeaderDto;
import com.fif.ws.model.master.BucketOrderFif;
import com.fif.ws.model.master.dto.BucketOrderDto;
import com.fif.ws.model.master.dto.ResponseMessage;
import com.fif.ws.model.dto.order.OrderFullHeaderDto;
import com.fif.ws.model.master.dto.ResponseMessageMap;
import com.fif.ws.model.master.dto.UpdateBillingDto;
import com.fif.ws.service.TransactionService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.core.convert.TypeDescriptor.map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author RizkyAkbar
 */
@Controller
public class TransactionController {

    DecimalFormat d = new DecimalFormat();
    DecimalFormatSymbols symbols = new DecimalFormatSymbols();
    private SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

    @Autowired
    private TransactionService transactionService;


    

    @RequestMapping(value = "/preorder", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage savePreOrder(@RequestParam String order, HttpSession session) {
        ResponseMessage resp = new ResponseMessage();

        try {
            BucketOrderDto boDto = new BucketOrderDto();
            Gson gson = new Gson();
            Type type = new TypeToken<List<BucketOrderDto>>() {
            }.getType();
            List<BucketOrderDto> lbo = gson.fromJson(order, type);
            if (lbo.size() == 0) {
                return new ResponseMessage("11", "Invalid Parameter", "");
            }

            String noRef = "|";
            for (BucketOrderDto bo : lbo) {
                try {
                    resp = transactionService.insertBucketOrder(bo);
                    return resp;

                } catch (Exception e) {
                    e.printStackTrace();
                    
                    return new ResponseMessage("20", "Error Save Order", e.getMessage());
                }
            }

            return new ResponseMessage("00", "Success", noRef);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("10", "Error Parsing Parameter", e.getMessage());
        }
    }

    @RequestMapping(value = "/order/status", method = RequestMethod.GET)
    @ResponseBody
    public Map getTrackingOrder(@RequestParam String transactionId, @RequestParam String sourceInput,
            HttpSession session) {
        try {
            List<Map> l = transactionService.getTrackingOrder(transactionId, sourceInput);
            if (l.size() > 0) {
                return l.get(0);
            }
            System.out.println("order status : berhasil di hit");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("132123abc");
        }
        return new HashMap();
    }

    @RequestMapping(value = "/order/payment", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage updatePaymentStatus(@RequestParam String transactionId,
            @RequestParam String virtualAccount, @RequestParam String status,
            @RequestParam String paymentAmount, @RequestParam String paymentDate,
            @RequestParam String sourceInput, HttpSession session) {
        ResponseMessage resp = new ResponseMessage();
        String noRef = "";
        try {
            Double _amount = Double.valueOf(paymentAmount);
            Date _tanggal = df.parse(paymentDate);
            try {
                transactionService.updatePaymentStatus(transactionId, virtualAccount, status, _amount, _tanggal, sourceInput);
                noRef = transactionId;
            } catch (Exception e) {
                e.printStackTrace();
                return new ResponseMessage("20", "Error Update Payment Order", e.getMessage());
            }

            return new ResponseMessage("00", "Success", noRef);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("10", "Error Parsing Parameter", e.getMessage());
        }
    }

    @RequestMapping(value = "/orderfull", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessageMap saveFullOrder(@RequestParam(required = false) String order,
            HttpSession session) {
        ResponseMessageMap resp = new ResponseMessageMap();
        ResponseMessageMap resp1 = new ResponseMessageMap();
        
        try {
            OrderFullHeaderDto boDto = new OrderFullHeaderDto();
            Gson gson = new Gson();
            Type type = new TypeToken<List<OrderFullHeaderDto>>() {
            }.getType();
            List<OrderFullHeaderDto> lbo = gson.fromJson(order, type);
            if (lbo.size() == 0) {
                return new ResponseMessageMap("11", "Invalid Parameter", null);
            }

            String noRef = "|";
            for (OrderFullHeaderDto bo : lbo) {
                try {
                    resp = transactionService.insertFullOrder(bo);
                    if (resp.getResponseCode().equals("00")) {
                        ResponseMessageMap r = transactionService.approvePO(resp.getResponseRef().get(0).get("applNo").toString());
                        
                        return r;
                    } else {
                        return resp;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return new ResponseMessageMap("20", "Error Save Order", null);
                }
            }

            return new ResponseMessageMap("00", "Success", null);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessageMap("10", "Error Parsing Parameter", null);
        }
    }

    @RequestMapping(value = "/order/settlement", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage invoiceOrder(@RequestParam(required = false) String settlement,
            HttpSession session) {
        ResponseMessage resp = new ResponseMessage();

        try {
            InvoiceHeaderDto iDto = new InvoiceHeaderDto();
            Gson gson = new Gson();
            Type type = new TypeToken<List<InvoiceHeaderDto>>() {
            }.getType();
            List<InvoiceHeaderDto> lbo = gson.fromJson(settlement, type);
            if (lbo.size() == 0) {
                return new ResponseMessage("11", "Invalid Parameter", "");
            }

            String noRef = "|";
            for (InvoiceHeaderDto bo : lbo) {
                try {
                    resp = transactionService.orderInvoice(bo);
                    if (resp.getResponseCode().equals("01")) {
                        bo.setInvNo(resp.getResponseRef());
                        return transactionService.invoiceDetailOrder(bo);

                    } else {
                        return resp;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return new ResponseMessage("20", "Error Save Order", e.getMessage());
                }
            }

            return new ResponseMessage("00", "Success", noRef);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("10", "Error Parsing Parameter", e.getMessage());
        }
    }

    @RequestMapping(value = "/update/billing", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage updateBilling(@RequestParam(required = false) String address,
            HttpSession session) {
        ResponseMessage resp = new ResponseMessage();

        try {
            UpdateBillingDto iDto = new UpdateBillingDto();
            Gson gson = new Gson();
            Type type = new TypeToken<List<UpdateBillingDto>>() {
            }.getType();
            List<UpdateBillingDto> lbo = gson.fromJson(address, type);
            if (lbo.size() == 0) {
                return new ResponseMessage("11", "Invalid Parameter", "");
            }

            String noRef = "|";
            for (UpdateBillingDto bo : lbo) {
                try {
                    resp = transactionService.updateBilling(bo);

                    return resp;

                } catch (Exception e) {
                    e.printStackTrace();
                    return new ResponseMessage("20", "Error Save Order", e.getMessage());
                }
            }

            return new ResponseMessage("00", "Success", lbo.get(0).getApplNo());

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("10", "Error Parsing Parameter", e.getMessage());
        }
    }

    @RequestMapping(value = "/premi", method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessage premiRate(@RequestParam String productNo, @RequestParam String branchId,
            @RequestParam int top, @RequestParam Double totalAmount, HttpSession session) {
        ResponseMessage respm = new ResponseMessage();
        String noRef = "|";
        try {
            return respm = transactionService.premiRate(productNo, branchId, top, totalAmount);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("10", "error hitung premi", e.getMessage());
        }
    }

    @RequestMapping(value = "update/phone", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage updateCustomerPhone(@RequestParam String custNo,
            @RequestParam String mobilePhone, HttpSession session) {
        ResponseMessage resp = new ResponseMessage();
        String noRef = "";
        try {
            transactionService.updateCustomerPhone(custNo, mobilePhone);
            noRef = custNo;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseMessage("20", "Error Save Phone", e.getMessage());
        }
        return new ResponseMessage("00", "Success", noRef);
    }

}
