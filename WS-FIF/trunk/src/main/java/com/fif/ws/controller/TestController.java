/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.controller;

import com.fif.ws.dao.OrderFullDao;
import com.fif.ws.model.dto.order.InvoiceDetailDto;
import com.fif.ws.model.dto.order.InvoiceHeaderDto;
import com.fif.ws.model.dto.order.ObjectPembiayaanSchemeObject;
import com.fif.ws.model.dto.order.OrderFullDocuments;
import com.fif.ws.model.dto.order.OrderFullHeaderDto;
import com.fif.ws.model.dto.order.OrderFullMarketingSchemeContract;
import com.fif.ws.model.dto.order.OrderFullObjectPembiayaan;
import com.fif.ws.model.dto.order.OrderFullPromotions;
import com.fif.ws.model.dto.order.OrderFullStrukturKredit;
import com.fif.ws.model.master.dto.BucketOrderDto;
import com.fif.ws.model.master.dto.ResponseMessageMap;
import com.fif.ws.model.master.dto.UpdateBillingDto;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.lang.reflect.Type;

/**
 *
 * @author RizkyAkbar
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test/preorder", method = RequestMethod.GET)
    @ResponseBody
    public List<BucketOrderDto> getMasterProvinsi(HttpSession session) {
        List<BucketOrderDto> asd = new ArrayList<BucketOrderDto>();
        BucketOrderDto bo = new BucketOrderDto();
        bo.setAddress("JL PELAN PELAN");
        bo.setBirthPlace("SOLO");
        bo.setBirthdate("20130101000000");
        bo.setBranchId("40300");
        bo.setCity("SOLO");
        bo.setCityCode("01");
        bo.setComments("TEST");
        bo.setCustomerMobilePhone1("0813999999");
        bo.setCustomerMobilePhone2("08131");
        bo.setCustomerName("RizkyAkbar");
        bo.setCustomerOfficePhone("08132");
        bo.setCustomerOfficePhoneArea("0271");
        bo.setCustomerPhone("08133");
        bo.setCustomerPhoneArea("0271");
        bo.setDealerId("H257");
        bo.setDealerIdFif("VS-000021168");
        bo.setDpAmount(5000.01);
        bo.setTotProdPrice(2500.01);
        bo.setTop( 3209);
      
        bo.setKecamatan("BANJARSARI");
        bo.setKecamatanCode("");
        bo.setKelurahan("NUSUKAN");
        bo.setKelurahanCode("");
        bo.setObjectType("A16");
        bo.setObjectTypeFif("Z9999");
        bo.setOrderDate("20140101000000");
        bo.setProvinsi("JAWA TENGAH");
        bo.setProvinsiCode("");
        bo.setRT("00");
        bo.setRW("00");
        bo.setTransactionId("1002");
        bo.setSalesId("ACJ");
        bo.setSourceInput("E");
        bo.setSubZip(null);
        bo.setZip("57135");
        

        asd.add(bo);
        bo.setTransactionId("1000");
        asd.add(bo);
        bo.setTransactionId("1001");
        asd.add(bo);
        return asd;
    }

    @Autowired
    private OrderFullDao orderFullDao;

    @RequestMapping(value = "/test/applNo", method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessageMap generateApplNo(HttpSession session) {
        return orderFullDao.scoreMeter("10114000327");
    }
    @RequestMapping(value = "/test/gson",method = RequestMethod.POST)
    @ResponseBody
    public UpdateBillingDto update(@RequestBody String billing, HttpSession session){
       UpdateBillingDto boDto = new UpdateBillingDto();
        try{
            
            Gson gson = new Gson();
            Type type = new TypeToken<UpdateBillingDto>() {
            }.getType();
            UpdateBillingDto lbo = gson.fromJson(billing, type);
            boDto.setApplNo(lbo.getApplNo());
            boDto.setBilling(lbo.getBilling());
            boDto.setEmer(lbo.getEmer());
            boDto.setSubZipCode(lbo.getSubZipCode());
            return boDto;
           
        }catch(Exception e){
            e.getMessage();
            return null;
        }
        
    }

    @RequestMapping(value = "/test/billing",method = RequestMethod.GET)
    @ResponseBody
    public List<UpdateBillingDto> getJsonBilling(HttpSession session){
        List<UpdateBillingDto> lb = new ArrayList<UpdateBillingDto>();
        UpdateBillingDto u = new UpdateBillingDto();
        u.setApplNo("92900009-08");
        u.setBilling("HOME");
        u.setSubZipCode("01");
        u.setEmer("HOME");
        lb.add(u);
        return lb;
    }
    @RequestMapping(value = "/test/invoice", method = RequestMethod.GET)
    @ResponseBody
    public List<InvoiceHeaderDto> getJsonInvoice(HttpSession session) {

        InvoiceHeaderDto i = new InvoiceHeaderDto();

        i.setInvoiceDealerDate("20140429000000");
        i.setInvoiceNoSupplier("0001");
        i.setTotalObject("2");

        InvoiceDetailDto d = new InvoiceDetailDto();
        InvoiceDetailDto d1 = new InvoiceDetailDto();
        d.setApplicationNo("50314027450");
        d.setApplicationSequenceNo("1");
        d.setBast_date("20140429000000");
        d.setBast_no("718TEDDYBEAR776");
        d.setPoNo("5030014PO00026955");
        d1.setApplicationNo("50314027450");
        d1.setApplicationSequenceNo("2");
        d1.setBast_date("20140429000000");
        d1.setBast_no("718TEDDYBEARudra775");
        d1.setPoNo("5030014PO00026955");
        

        List<InvoiceDetailDto> l = new ArrayList<InvoiceDetailDto>();
        l.add(d);
        l.add(d1);
        i.setInvoiceDetail(l);

        List<InvoiceHeaderDto> lR = new ArrayList<InvoiceHeaderDto>();
        lR.add(i);
        return lR;
    }

    @RequestMapping(value = "/test/order", method = RequestMethod.GET)
    @ResponseBody
    public List<OrderFullHeaderDto> orderFull(HttpSession session){
        List<OrderFullHeaderDto> jsonData = new ArrayList<OrderFullHeaderDto>();
        OrderFullHeaderDto dto = new OrderFullHeaderDto();
        List<com.fif.ws.model.dto.order.OrderFullObjectPembiayaan> ofop1 = new ArrayList<com.fif.ws.model.dto.order.OrderFullObjectPembiayaan>();
        OrderFullObjectPembiayaan ofop = new OrderFullObjectPembiayaan();
        ObjectPembiayaanSchemeObject opso = new ObjectPembiayaanSchemeObject();
        OrderFullMarketingSchemeContract ofmsc = new OrderFullMarketingSchemeContract();
        List<OrderFullDocuments> ofd1 =  new ArrayList<OrderFullDocuments>();
        List<ObjectPembiayaanSchemeObject> pembiayaanSchemeObjects = new ArrayList<ObjectPembiayaanSchemeObject>();
        OrderFullDocuments ofd = new OrderFullDocuments();
        OrderFullPromotions ofp = new OrderFullPromotions();
        OrderFullStrukturKredit ofsk = new OrderFullStrukturKredit();
         
        
        dto.setOfficeCode("92900");
        dto.setServiceOfficeCode("92900");
        dto.setApplicationDate("20140202000000");
        dto.setCustomerNo("929080000007");
        dto.setPlatform("K");
        dto.setBusinessUnit("MPF");
        dto.setProgramCode("MP01");
        dto.setSupplierCode("9290002");
        dto.setSourceOrderCode("");
        dto.setTotalProductPrice("18000000");
        dto.setTotalDp("8000000");
        dto.setTotalObject("");
        dto.setBranchAR("92900");
        dto.setObjectPembiayaan(ofop1);
        dto.setMarketingSchemeContract(ofmsc);
        dto.setDocuments(ofd1);
        dto.setPromotions(ofp);
        dto.setStrukturKredit(ofsk);
        
        
        ofop.setObjectCode("EL2640");
        ofop.setNewUsed("N");
        ofop.setObjectBrand("SPECTRA");
        ofop.setObjectModel("DIVICAM");
        ofop.setObjectType("DUMMY");
        ofop.setObjectSize("0");
        ofop.setObjectYear("2007");
        ofop.setObjectPrice("1650000");
        ofop.setQuantity("1");
        ofop.setMonthInstallment("151000");
        ofop.setInsuranceProduct("");
        ofop.setInsuranceRateNo("");
        ofop.setSerialNo("");
        ofop.setNomerMesin("230P074C00");
        ofop.setNomerRangka("");
        ofop.setNomerPolisi("");
        ofop.setWarna("");
        ofop.setStnkDate("");
      //  ofop.setSchemeObject(pembiayaanSchemeObjects);
        
        
      
        ofop1.add(ofop);
        opso.setMsCode("");
        opso.setAmount("");
        
        ofmsc.setMsCode("");
        ofmsc.setAmount("");
        
        ofd.setDocumentCode("001");
        ofd.setRequired("Y");
        
        ofd1.add(ofd);
        
        ofp.setPromoDetailCode("BEX0052");
        ofp.setPromoMasterCode("EX");
        
        
        ofsk.setInterestType("A");
        ofsk.setTenor("9");
        ofsk.setPeriode("1");
        ofsk.setPeriodeType("M");
        ofsk.setAdvArrear("AD");
        ofsk.setAdmin("50000");
        ofsk.setChoiceInstallmentRate("2");
        ofsk.setPercentFlat("45");
        ofsk.setPercentResidu("");
        ofsk.setAmountResidu("");
        
        jsonData.add(dto);
        jsonData.add(dto);
        dto.setCustomerNo("929080000017");
        jsonData.add(dto);
        dto.setCustomerNo("929080000018");
        jsonData.add(dto);
        return jsonData;
               
        
        
    }
}
