/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.controller;

import com.fif.ws.model.customer.dto.CustomerHeaderDto;
import com.fif.ws.model.master.CitiesModel;
import com.fif.ws.model.master.DealerMaster;
import com.fif.ws.model.master.DocumentModel;
import com.fif.ws.model.master.DocumentOccutypeModel;
import com.fif.ws.model.master.EducationModel;
import com.fif.ws.model.master.HouseStatusModel;
import com.fif.ws.model.master.KecamatanModel;
import com.fif.ws.model.master.KelurahanModel;
import com.fif.ws.model.master.MaritalStatusModel;
import com.fif.ws.model.master.ObjectCodesModel;
import com.fif.ws.model.master.ObjectGroupModel;
import com.fif.ws.model.master.OccupationModel;
import com.fif.ws.model.master.OccupationSubModel;
import com.fif.ws.model.master.OccupationTypeModel;
import com.fif.ws.model.master.OfficesModel;
import com.fif.ws.model.master.PromoDetailModel;
import com.fif.ws.model.master.PromoModel;
import com.fif.ws.model.master.ProvinsiModel;
import com.fif.ws.model.master.RegionalModel;
import com.fif.ws.model.master.ReligionModel;
import com.fif.ws.model.master.ZipCodesModel;
import com.fif.ws.model.master.ZipModel;
import com.fif.ws.model.master.dto.CitiesDto;
import com.fif.ws.model.master.dto.CustomerDto;
import com.fif.ws.model.master.dto.DealerDto;
import com.fif.ws.model.master.dto.DealerMpfDto;
import com.fif.ws.model.master.dto.DocumentDto;
import com.fif.ws.model.master.dto.EducationDto;
import com.fif.ws.model.master.dto.HouseStatusDto;
import com.fif.ws.model.master.dto.InsuranceBranchDto;
import com.fif.ws.model.master.dto.InsuranceObjectDto;
import com.fif.ws.model.master.dto.InsuranceProductDto;
import com.fif.ws.model.master.dto.KecamatanDto;
import com.fif.ws.model.master.dto.KelurahanDto;
import com.fif.ws.model.master.dto.MaritalStatusDto;
import com.fif.ws.model.master.dto.ObjectCodesDto;
import com.fif.ws.model.master.dto.ObjectCodesDtoMpf;
import com.fif.ws.model.master.dto.ObjectGroupDto;
import com.fif.ws.model.master.dto.OccupationDetailsDto;
import com.fif.ws.model.master.dto.OccupationDto;
import com.fif.ws.model.master.dto.OccupationTypeDto;
import com.fif.ws.model.master.dto.OfficeDto;
import com.fif.ws.model.master.dto.PromoDetailDto;
import com.fif.ws.model.master.dto.PromoDto;
import com.fif.ws.model.master.dto.ProvinsiDto;
import com.fif.ws.model.master.dto.RegionalDto;
import com.fif.ws.model.master.dto.ReligionDto;
import com.fif.ws.model.master.dto.ZipCodesDto;
import com.fif.ws.model.master.dto.ZipDto;
import com.fif.ws.service.MasterService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author RizkyAkbar
 */
@Controller
public class MasterController {

    private SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

    @Autowired
    private MasterService masterService;

    @RequestMapping(value = "/master/provinsi", method = RequestMethod.GET)
    @ResponseBody
    public List<ProvinsiDto> getMasterProvinsi(HttpSession session) {
        List<ProvinsiModel> provData = new ArrayList<ProvinsiModel>();
        List<ProvinsiDto> jsonData = new ArrayList<ProvinsiDto>();

        try {
            provData = masterService.getProvinsi();
            for (ProvinsiModel p : provData) {
                jsonData.add(new ProvinsiDto(p.getPROV_CODE(), p.getPROVINSI()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/religions", method = RequestMethod.GET)
    @ResponseBody
    public List<ReligionDto> getMasterReligion(HttpSession session) {
        List<ReligionModel> religionData = new ArrayList<ReligionModel>();
        List<ReligionDto> jsonData = new ArrayList<ReligionDto>();

        try {
            religionData = masterService.getReligion();
            for (ReligionModel p : religionData) {
                jsonData.add(new ReligionDto(p.getRELG_ID(), p.getDESCRIPTION(), p.getAAB_CODE()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/educations", method = RequestMethod.GET)
    @ResponseBody
    public List<EducationDto> getMasterEducation(HttpSession session) {
        List<EducationModel> educationData = new ArrayList<EducationModel>();
        List<EducationDto> jsonData = new ArrayList<EducationDto>();

        try {
            educationData = masterService.getEducation();
            for (EducationModel p : educationData) {
                jsonData.add(new EducationDto(p.getEDU_TYPE(), p.getEDU_DESCR(), p.getBI_STATUS(),
                        p.getAAB_CODE()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/marital_status", method = RequestMethod.GET)
    @ResponseBody
    public List<MaritalStatusDto> getMasterMaritalStatus(HttpSession session) {
        List<MaritalStatusModel> maritalStatusData = new ArrayList<MaritalStatusModel>();
        List<MaritalStatusDto> jsonData = new ArrayList<MaritalStatusDto>();

        try {
            maritalStatusData = masterService.getMaritalStatus();
            for (MaritalStatusModel p : maritalStatusData) {
                jsonData.add(new MaritalStatusDto(p.getMARITAL_STAT(), p.getMARITAL_DESC()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/house_status", method = RequestMethod.GET)
    @ResponseBody
    public List<HouseStatusDto> getMasterHouseStatus(HttpSession session) {
        List<HouseStatusModel> houseStatusData = new ArrayList<HouseStatusModel>();
        List<HouseStatusDto> jsonData = new ArrayList<HouseStatusDto>();

        try {
            houseStatusData = masterService.getHouseStatus();
            for (HouseStatusModel p : houseStatusData) {
                jsonData.add(new HouseStatusDto(p.getHOUSE_STAT(), p.getSTATUS_DESCR()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/city/{city_code}", method = RequestMethod.GET)
    @ResponseBody
    public List<CitiesDto> getMasterCity(@PathVariable String city_code, HttpSession session) {
        List<CitiesModel> cityData = new ArrayList<CitiesModel>();
        List<CitiesDto> jsonData = new ArrayList<CitiesDto>();

        try {
            cityData = masterService.getCityByCityCode(city_code);
            for (CitiesModel p : cityData) {
                jsonData.add(new CitiesDto(p.getCITY_CODE(), p.getCITY(), p.getDATI2(), p.getPROV_CODE()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/cities", method = RequestMethod.GET)
    @ResponseBody
    public List<CitiesDto> getMasterCityByProvCode(@RequestParam(required = false) String prov_code,
            HttpSession session) {
        List<CitiesModel> cityData = new ArrayList<CitiesModel>();
        List<CitiesDto> jsonData = new ArrayList<CitiesDto>();

        if (prov_code == null || prov_code.equals("") || prov_code.isEmpty()) {
            try {
                cityData = masterService.getCities();
                for (CitiesModel p : cityData) {
                    jsonData.add(new CitiesDto(p.getCITY_CODE(), p.getCITY(), p.getDATI2(), p.getPROV_CODE()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                cityData = masterService.getCityByProvCode(prov_code);
                for (CitiesModel p : cityData) {
                    jsonData.add(new CitiesDto(p.getCITY_CODE(), p.getCITY(), p.getDATI2(), p.getPROV_CODE()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/kecamatans", method = RequestMethod.GET)
    @ResponseBody
    public List<KecamatanDto> getMasterKecamatanByCityCode(@RequestParam(required = false) String city_code,
            HttpSession session) {
        List<KecamatanModel> kecamatanData = new ArrayList<KecamatanModel>();
        List<KecamatanDto> jsonData = new ArrayList<KecamatanDto>();

        if (city_code == null || city_code.equals("") || city_code.isEmpty()) {
            try {
                kecamatanData = masterService.getKecamatan();
                for (KecamatanModel p : kecamatanData) {
                    jsonData.add(new KecamatanDto(p.getKEC_CODE(), p.getKECAMATAN(), p.getCITY_CODE()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                kecamatanData = masterService.getKecamatanByCityCode(city_code);
                for (KecamatanModel p : kecamatanData) {
                    jsonData.add(new KecamatanDto(p.getKEC_CODE(), p.getKECAMATAN(), p.getCITY_CODE()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/kecamatan/{kec_code}", method = RequestMethod.GET)
    @ResponseBody
    public List<KecamatanDto> getMasterKecamatanByKecCode(@PathVariable String kec_code,
            HttpSession session) {
        List<KecamatanModel> kecamatanData = new ArrayList<KecamatanModel>();
        List<KecamatanDto> jsonData = new ArrayList<KecamatanDto>();

        try {

            kecamatanData = masterService.getKecamatanByKecCode(kec_code);
            for (KecamatanModel p : kecamatanData) {
                jsonData.add(new KecamatanDto(p.getKEC_CODE(), p.getKECAMATAN(), p.getCITY_CODE()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/kelurahans", method = RequestMethod.GET)
    @ResponseBody
    public List<KelurahanDto> getMasterKelurahanByKecCode(@RequestParam(required = false) String kec_code,
            HttpSession session) {
        List<KelurahanModel> kelurahanData = new ArrayList<KelurahanModel>();
        List<KelurahanDto> jsonData = new ArrayList<KelurahanDto>();

        if (kec_code == null || kec_code.equals("") || kec_code.isEmpty()) {
            try {
                kelurahanData = masterService.getKelurahan();
                for (KelurahanModel p : kelurahanData) {
                    jsonData.add(new KelurahanDto(p.getKEL_CODE(), p.getKELURAHAN(), p.getKEC_CODE()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                kelurahanData = masterService.getKelurahanByKecCode(kec_code);
                for (KelurahanModel p : kelurahanData) {
                    jsonData.add(new KelurahanDto(p.getKEL_CODE(), p.getKELURAHAN(), p.getKEC_CODE()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return jsonData;
    }

    @RequestMapping(value = "/master/kelurahan/{kel_code}", method = RequestMethod.GET)
    @ResponseBody
    public List<KelurahanDto> getMasterKelurahanByKelCode(@PathVariable String kel_code,
            HttpSession session) {
        List<KelurahanModel> kelurahanData = new ArrayList<KelurahanModel>();
        List<KelurahanDto> jsonData = new ArrayList<KelurahanDto>();

        try {

            kelurahanData = masterService.getKelurahanByKelCode(kel_code);
            for (KelurahanModel p : kelurahanData) {
                jsonData.add(new KelurahanDto(p.getKEL_CODE(), p.getKELURAHAN(), p.getKEC_CODE()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/occupations", method = RequestMethod.GET)
    @ResponseBody
    public List<OccupationDto> getMasterOccupation(HttpSession session) {
        List<OccupationModel> occupationData = new ArrayList<OccupationModel>();
        List<OccupationDto> jsonData = new ArrayList<OccupationDto>();

        try {
            occupationData = masterService.getOccupation();
            for (OccupationModel p : occupationData) {
                jsonData.add(new OccupationDto(p.getOCPT_CODE(), p.getDESCRIPTION(),
                        p.getOCPT_TYPE(), p.getAAB_CODE()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/occupation_details", method = RequestMethod.GET)
    @ResponseBody
    public List<OccupationDetailsDto> getMasterOccupationByOcptCode(@RequestParam String ocpt_code,
            HttpSession session) {
        List<OccupationSubModel> occupationData = new ArrayList<OccupationSubModel>();
        List<OccupationDetailsDto> jsonData = new ArrayList<OccupationDetailsDto>();

        try {
            occupationData = masterService.getOccupationByOcptCode(ocpt_code);
            for (OccupationSubModel p : occupationData) {
                jsonData.add(new OccupationDetailsDto(p.getOCPT_CODE(),
                        p.getOCPT_SUB_CODE(), p.getOCPT_DESC()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/occupation_types", method = RequestMethod.GET)
    @ResponseBody
    public List<OccupationTypeDto> getMasterOccupationByOcptType(@RequestParam String ocpt_type,
            HttpSession session) {
        List<OccupationTypeModel> occupationData = new ArrayList<OccupationTypeModel>();
        List<OccupationTypeDto> jsonData = new ArrayList<OccupationTypeDto>();

        try {
            occupationData = masterService.getOccupationByOcptType(ocpt_type);
            for (OccupationTypeModel p : occupationData) {
                jsonData.add(new OccupationTypeDto(p.getOCPT_TYPE(),
                        p.getOCPT_DESCR()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/coll_zips", method = RequestMethod.GET)
    @ResponseBody
    public List<ZipDto> getMasterZipByCityCode(@RequestParam(required = false) String city_code, HttpSession session) {
        List<ZipModel> zipData = new ArrayList<ZipModel>();
        List<ZipDto> jsonData = new ArrayList<ZipDto>();

        if (city_code == null || city_code.equals("") || city_code.isEmpty()) {
            try {
                zipData = masterService.getZipCodeByAll();
                for (ZipModel p : zipData) {
                    jsonData.add(new ZipDto(p.getZIP_CODE(), p.getSUB_ZIP_CODE(), p.getZIP_DESC(), p.getKEL_CODE(),
                            p.getKEC_CODE(), p.getCITY_CODE(), p.getPROV_CODE()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                zipData = masterService.getZipByCityCode(city_code);
                for (ZipModel p : zipData) {
                    jsonData.add(new ZipDto(p.getZIP_CODE(), p.getSUB_ZIP_CODE(), p.getZIP_DESC(), p.getKEL_CODE(),
                            p.getKEC_CODE(), p.getCITY_CODE(), p.getPROV_CODE()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return jsonData;
    }

    @RequestMapping(value = "/master/zipcodes", method = RequestMethod.GET)
    @ResponseBody
    public List<ZipCodesDto> getMasterZipCodes(HttpSession session) {
        List<ZipCodesModel> zipCodesData = new ArrayList<ZipCodesModel>();
        List<ZipCodesDto> jsonData = new ArrayList<ZipCodesDto>();

        try {
            zipCodesData = masterService.getZipCodes();
            for (ZipCodesModel p : zipCodesData) {
                jsonData.add(new ZipCodesDto(p.getZIP_CODE(), p.getOFFICE_CODE(), p.getDESCRIPTION()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/objectgroups", method = RequestMethod.GET)
    @ResponseBody
    public List<ObjectGroupDto> getMasterObjectGroup(HttpSession session) {
        List<ObjectGroupModel> objectGroupData = new ArrayList<ObjectGroupModel>();
        List<ObjectGroupDto> jsonData = new ArrayList<ObjectGroupDto>();

        try {
            objectGroupData = masterService.getObjectGroup();
            for (ObjectGroupModel p : objectGroupData) {
                jsonData.add(new ObjectGroupDto(p.getOBJ_GRP(), p.getOBJ_DESCR(), p.getCOLL_TYPE()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/objectcodes", method = RequestMethod.GET)
    @ResponseBody
    public List<ObjectCodesDto> getMasterObjectCodesByObjGrp(@RequestParam String obj_grp, HttpSession session) {
        List<ObjectCodesModel> objectCodesData = new ArrayList<ObjectCodesModel>();
        List<ObjectCodesDto> jsonData = new ArrayList<ObjectCodesDto>();

        try {
            objectCodesData = masterService.getObjectCodesByObjGrp(obj_grp);
            for (ObjectCodesModel p : objectCodesData) {
                jsonData.add(new ObjectCodesDto(p.getOBJ_CODE(), p.getOBJ_GRP(), p.getOBJ_DESCR(),
                        p.getOBJ_BRAND(), p.getOBJ_MODEL(), p.getOBJ_TYPE(), p.getOBJ_SIZE(), p.getOBJ_MAKE(),
                        p.getBRANCH_ID(), p.getCATEGORY_ID(), p.getNEED_ADD_COLL(), p.getNEW_USED(), p.getIS_VEHICLE(), p.getCODE_AHM()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/objectcodes/mpf", method = RequestMethod.GET)
    @ResponseBody
    public List<Map> getMasterObjectCodesMpfAll(@RequestParam(required = false) String sinceDate, HttpSession session) {
        List<Map> daoData = new ArrayList<Map>();
        if (sinceDate == null || sinceDate.equals("") || sinceDate.isEmpty()) {
            try {
                daoData = masterService.getObjectCodesMpf();
                System.out.println("object codes mpf all");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        } else {

            try {
                daoData = masterService.getObjectCodesMpfByDate(df.parse(sinceDate));
                System.out.println("object codes mpf sincedate");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }

        }
        return daoData;
    }

    @RequestMapping(value = "/branches", method = RequestMethod.GET)
    @ResponseBody
    public List<OfficeDto> getMasterOffices(@RequestParam(required = false) String since_date, HttpSession session) {
        List<OfficesModel> officesData = new ArrayList<OfficesModel>();
        List<OfficeDto> jsonData = new ArrayList<OfficeDto>();

        if (since_date == null || since_date.equals("") || since_date.isEmpty()) {
            try {
                officesData = masterService.getOffices();
                for (OfficesModel p : officesData) {
                    jsonData.add(new OfficeDto(p.getOFFICE_CODE(), p.getOFFICE_CODE_REP(), p.getNAME_SHORT(),
                            p.getNAME_FULL(), p.getREGIONAL_ID().getREGIONAL_ID(), p.getREGIONAL_ID().getNAME_SHORT(),
                            p.getADDRESS1(), p.getADDRESS2(), p.getADDRESS3(),
                            p.getCITY(), p.getLOCATION(), p.getPHONE1(), p.getPHONE2(), p.getPHONE3(), p.getPIC_FIRST_NAME(),
                            p.getPIC_LAST_NAME(), p.getOFFICE_CATEGORY()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                officesData = masterService.getOfficesByDate(df.parse(since_date));
                for (OfficesModel p : officesData) {
                    jsonData.add(new OfficeDto(p.getOFFICE_CODE(), p.getOFFICE_CODE_REP(), p.getNAME_SHORT(),
                            p.getNAME_FULL(), p.getREGIONAL_ID().getREGIONAL_ID(), p.getREGIONAL_ID().getNAME_SHORT(),
                            p.getADDRESS1(), p.getADDRESS2(), p.getADDRESS3(),
                            p.getCITY(), p.getLOCATION(), p.getPHONE1(), p.getPHONE2(), p.getPHONE3(), p.getPIC_FIRST_NAME(),
                            p.getPIC_LAST_NAME(), p.getOFFICE_CATEGORY()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return jsonData;
    }

    @RequestMapping(value = "/branch/{branch_code}", method = RequestMethod.GET)
    @ResponseBody
    public List<OfficeDto> getMasterOfficesByBranchCode(@PathVariable String branch_code, HttpSession session) {
        List<OfficesModel> officesData = new ArrayList<OfficesModel>();
        List<OfficeDto> jsonData = new ArrayList<OfficeDto>();

        try {
            officesData = masterService.getOfficesByBranchCode(branch_code);
            for (OfficesModel p : officesData) {
                jsonData.add(new OfficeDto(p.getOFFICE_CODE(), p.getOFFICE_CODE_REP(), p.getNAME_SHORT(),
                        p.getNAME_FULL(), p.getREGIONAL_ID().getREGIONAL_ID(), p.getREGIONAL_ID().getNAME_SHORT(), p.getADDRESS1(), p.getADDRESS2(), p.getADDRESS3(),
                        p.getCITY(), p.getLOCATION(), p.getPHONE1(), p.getPHONE2(), p.getPHONE3(), p.getPIC_FIRST_NAME(),
                        p.getPIC_LAST_NAME(), p.getOFFICE_CATEGORY()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/customer/individu", method = RequestMethod.GET)
    @ResponseBody
    public List<CustomerDto> getCustomerIndByAll(@RequestParam(required = false) String cust_name,
            @RequestParam(required = false) String birth_date, @RequestParam(required = false) String no_kontrak,
            @RequestParam(required = false) String id_type, @RequestParam(required = false) String id_number, HttpSession session) {
        List<CustomerDto> jsonData = new ArrayList<CustomerDto>();

        if (no_kontrak == null || no_kontrak.equals("") || no_kontrak.isEmpty()) {
            try {
                jsonData = masterService.getCustomerInd(df.parse(birth_date), id_type, id_number);
                System.out.println("sukses");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("gagal");
            }
        } else {
            try {
                jsonData = masterService.getCustomerIndividu(cust_name,
                        df.parse(birth_date), no_kontrak, id_type, id_number);
                System.out.println("sukses");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("gagal");
            }

        }

        return jsonData;
    }

    @RequestMapping(value = "/customer/individu/{cust_no}", method = RequestMethod.GET)
    public @ResponseBody
    List<CustomerDto> getCustomerIndividu(@PathVariable String cust_no,
            HttpSession session) {
        List<com.fif.ws.model.master.CustomerModel> customerData = new ArrayList<com.fif.ws.model.master.CustomerModel>();
        List<CustomerDto> jsonData = new ArrayList<CustomerDto>();
        return jsonData;
    }

    @RequestMapping(value = "/customer/{cust_no}", method = RequestMethod.GET)
    public @ResponseBody
    List<CustomerHeaderDto> getCustomerByCustNo(@PathVariable String cust_no, HttpSession session) {
        List<CustomerHeaderDto> jsonData = new ArrayList<CustomerHeaderDto>();
        try {
            jsonData = masterService.getCustomerByCustNo(cust_no);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/documents", method = RequestMethod.GET)
    public @ResponseBody
    List<DocumentDto> getMasterDocument(@RequestParam(required = false) String since_date, HttpSession session) {
        List<DocumentModel> documentData = new ArrayList<DocumentModel>();
        List<DocumentDto> jsonData = new ArrayList<DocumentDto>();

        if (since_date == null || since_date.equals("") || since_date.isEmpty()) {
            try {
                documentData = masterService.getDocument();
                for (DocumentModel p : documentData) {
                    List<OccupationTypeDto> d = new ArrayList<OccupationTypeDto>();
                    for (DocumentOccutypeModel x : p.getOCPT_TYPE()) {
                        d.add(new OccupationTypeDto(x.getOCPT_TYPE(), x.getREQUIRED()));
                    }
                    jsonData.add(new DocumentDto(p.getDESCRIPTION(), p.getDOC_CODE(), d));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                documentData = masterService.getDocumentByDate(df.parse(since_date));
                for (DocumentModel p : documentData) {
                    List<OccupationTypeDto> d = new ArrayList<OccupationTypeDto>();
                    for (DocumentOccutypeModel x : p.getOCPT_TYPE()) {
                        d.add(new OccupationTypeDto(x.getOCPT_TYPE(), x.getREQUIRED()));
                    }
                    jsonData.add(new DocumentDto(p.getDESCRIPTION(), p.getDOC_CODE(), d));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return jsonData;
    }

    @RequestMapping(value = "/dealer/{dealer_code}", method = RequestMethod.GET)
    @ResponseBody
    public List<DealerDto> getDealerByDealerCode(@PathVariable String dealer_code,
            HttpSession session) {
        List<DealerMaster> dealerData = new ArrayList<DealerMaster>();
        List<DealerDto> jsonData = new ArrayList<DealerDto>();

        try {

            dealerData = masterService.getDealerByDealerCode(dealer_code);
            for (DealerMaster p : dealerData) {
                jsonData.add(new DealerDto(p.getSUPL_CODE(), p.getSUPL_BRANCH_ID(), p.getSUPL_NAME(), p.getSUPL_ADDRESS1(), p.getSUPL_ADDRESS2(), p.getSUPL_CITY(), p.getSUPL_PROVINCE(), p.getSUPL_ZIPCODE(), p.getSUPL_STATUS(), p.getSUPL_TYPE(), p.getSUPL_GROUP_ID(), p.getSUPL_OUTLET_TYPE(), p.getSUPL_COMP_TYPE(), p.getSUPL_COMP_NAME(), p.getSUPL_MAINDEALER_ID()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/dealers", method = RequestMethod.GET)
    @ResponseBody
    public List<DealerDto> getDealer(HttpSession session) {
        List<DealerMaster> dealerData = new ArrayList<DealerMaster>();
        List<DealerDto> jsonData = new ArrayList<DealerDto>();

        try {
            dealerData = masterService.getDealer();
            for (DealerMaster p : dealerData) {
                jsonData.add(new DealerDto(p.getSUPL_CODE(), p.getSUPL_BRANCH_ID(), p.getSUPL_NAME(), p.getSUPL_ADDRESS1(), p.getSUPL_ADDRESS2(), p.getSUPL_CITY(), p.getSUPL_PROVINCE(), p.getSUPL_ZIPCODE(), p.getSUPL_STATUS(), p.getSUPL_TYPE(), p.getSUPL_GROUP_ID(), p.getSUPL_OUTLET_TYPE(), p.getSUPL_COMP_TYPE(), p.getSUPL_COMP_NAME(), p.getSUPL_MAINDEALER_ID()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonData;
    }

    @RequestMapping(value = "/dealer/mpf", method = RequestMethod.GET)
    @ResponseBody
    public List<DealerMpfDto> getDealerByMpf(@RequestParam(required = false) String since_date, HttpSession session) {
        List<DealerMaster> dealerData = new ArrayList<DealerMaster>();
        List<DealerMpfDto> jsonData = new ArrayList<DealerMpfDto>();

        if (since_date == null || since_date.equals("") || since_date.isEmpty()) {
            try {
                dealerData = masterService.getDealerByAllMpf();
                for (DealerMaster p : dealerData) {
                    jsonData.add(new DealerMpfDto(p.getSUPL_CODE(), p.getSUPL_NAME(), p.getSUPL_BRANCH_ID(), p.getSUPL_ADDRESS1(), p.getSUPL_ADDRESS2(),
                            p.getSUPL_CITY(), p.getSUPL_PROVINCE(), p.getSUPL_ZIPCODE(), p.getSUPL_TYPE(), p.getSUPL_OUTLET_TYPE()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                dealerData = masterService.getDealerByMpf(df.parse(since_date));
                for (DealerMaster p : dealerData) {
                    jsonData.add(new DealerMpfDto(p.getSUPL_CODE(), p.getSUPL_NAME(), p.getSUPL_BRANCH_ID(), p.getSUPL_ADDRESS1(), p.getSUPL_ADDRESS2(),
                            p.getSUPL_CITY(), p.getSUPL_PROVINCE(), p.getSUPL_ZIPCODE(), p.getSUPL_TYPE(), p.getSUPL_OUTLET_TYPE()));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/promotions", method = RequestMethod.GET)
    @ResponseBody
    public List<PromoDto> getPromotions(@RequestParam(required = false) String since_date, HttpSession session) {
        List<PromoModel> promoData = new ArrayList<PromoModel>();
        List<PromoDto> jsonData = new ArrayList<PromoDto>();
        if (since_date == null || since_date.equals("") || since_date.isEmpty()) {
            try {
                promoData = masterService.getPromoByAll();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {

            try {
                promoData = masterService.getPromoBySinceDate(df.parse(since_date));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        for (PromoModel m : promoData) {
            List<PromoDetailDto> jsonDataDetail = new ArrayList<PromoDetailDto>();
            for (PromoDetailModel d : m.getPromoDetails()) {
                jsonDataDetail.add(new PromoDetailDto(d.getPROMO_DTL_ID(), d.getPROMO_DTL_DESC(),
                        d.getPROMO_DTL_BRANCH(), "", "", "", "",
                        df.format(d.getPROMO_DTL_VALID_DATE()),
                        df.format(d.getPROMO_DTL_INVALID_DATE())));
            }
            jsonData.add(new PromoDto(m.getPROMO_MST_CODE(), m.getPROMO_MST_DESC(), m.getBUSS_UNIT(), jsonDataDetail));
        }
        return jsonData;

    }

    @RequestMapping(value = "/master/promotions/mpf", method = RequestMethod.GET)
    @ResponseBody
    public List<PromoDto> getPromotionsMpfAll(@RequestParam(required = false) String since_date,
            HttpSession session) {
        List<Map> daoData = new ArrayList<Map>();

        if (since_date == null || since_date.equals("") || since_date.isEmpty()) {
            try {
                daoData = masterService.getPromoRateMpfByAll();
                System.out.println("promo rate mpf all");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        } else {

            try {
                daoData = masterService.getPromoRateMpfByAllSinceDate(df.parse(since_date));
                System.out.println("promo rate mpf sincedate");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }

        }
        List<PromoDto> jsonData = new ArrayList<PromoDto>();
        List<PromoDto> jsonDataTemp = new ArrayList<PromoDto>();
        List<PromoDetailDto> jsonDataBranch = new ArrayList<PromoDetailDto>();
        String _promoCode_ = "";
        int x = 0;
        for (Map m : daoData) {
            if (_promoCode_.equals(m.get("promoCode").toString())) {
                jsonDataTemp.get(0).getPromoDetail().add(new PromoDetailDto(m.get("detailId").toString(),
                        m.get("detailDescription").toString(), m.get("branch").toString(), m.get("dealerId").toString(),
                        m.get("objectCode").toString(), m.get("objectGroup").toString(), m.get("ratePromo").toString(),
                        (df.format(m.get("startDate"))), (df.format(m.get("endDate")))));
            } else {
                _promoCode_ = m.get("promoCode").toString();

                jsonDataBranch.add(new PromoDetailDto(m.get("detailId").toString(),
                        m.get("detailDescription").toString(), m.get("branch").toString(), m.get("dealerId").toString(),
                        m.get("objectCode").toString(), m.get("objectGroup").toString(), m.get("ratePromo").toString(),
                        (df.format(m.get("startDate"))), (df.format(m.get("endDate")))));
                jsonDataTemp.add(new PromoDto(m.get("promoCode").toString(), m.get("promoDescription").toString(),
                        m.get("businessUnit").toString(), jsonDataBranch));

                if (jsonDataTemp.size() > 0) {
                    jsonData.add(jsonDataTemp.get(0));
                }
            }

        }
        return jsonData;

    }

    @RequestMapping(value = "/master/regionals", method = RequestMethod.GET)
    @ResponseBody
    public List<RegionalDto> getRegionals(@RequestParam(required = false) String since_date, HttpSession session) {
        List<RegionalModel> daoData = new ArrayList<RegionalModel>();
        List<RegionalDto> jsonData = new ArrayList<RegionalDto>();
        if (since_date == null || since_date.equals("") || since_date.isEmpty()) {
            try {
                daoData = masterService.getRegionals();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                daoData = masterService.getRegionalsBySinceDate(df.parse(since_date));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (RegionalModel m : daoData) {
            jsonData.add(new RegionalDto(m.getREGIONAL_ID(), m.getNAME_SHORT(), m.getNAME_FULL()));
        }
        return jsonData;
    }

    @RequestMapping(value = "/master/insc/mpf", method = RequestMethod.GET)
    @ResponseBody
    public List<InsuranceProductDto> getInsurances(@RequestParam(required = false) String since_date, HttpSession session) {
        List<Map> daoData = new ArrayList<Map>();

        if (since_date == null || since_date.equals("") || since_date.isEmpty()) {
            try {
                daoData = masterService.getInsurances();
                System.out.printf("get insurance");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                daoData = masterService.getInsurancesBySinceDate(df.parse(since_date));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String _product_no = "", _branch_id = "";
        List<InsuranceProductDto> jsonData = new ArrayList<InsuranceProductDto>();
        List<InsuranceProductDto> jsonDataTemp = new ArrayList<InsuranceProductDto>();
        List<InsuranceBranchDto> jsonDataBranch;
        List<InsuranceObjectDto> jsonDataObject;
        int x = 0;
        for (Map m : daoData) {
            if (_product_no.equals(m.get("product_no").toString())) {
                if (_branch_id.equals(m.get("branch_id").toString())) {
                    jsonDataTemp.get(0).getBranch().get(jsonDataTemp.get(0).getBranch().size() - 1)
                            .getObjectGroup().add(new InsuranceObjectDto(m.get("obj_grp").toString(),
                                            (Double) m.get("top"), (Double) m.get("net_rate_pct"), (Double) m.get("bruto_rate_pct"),
                                            (Double) m.get("depreciation_pct"), (Double) m.get("amount_ceiling")));

                } else {
                    _branch_id = m.get("branch_id").toString();
                    jsonDataObject = new ArrayList<InsuranceObjectDto>();
                    jsonDataObject.add(new InsuranceObjectDto(m.get("obj_grp").toString(),
                            (Double) m.get("top"), (Double) m.get("net_rate_pct"), (Double) m.get("bruto_rate_pct"),
                            (Double) m.get("depreciation_pct"), (Double) m.get("amount_ceiling")));

                    jsonDataTemp.get(0).getBranch().add(new InsuranceBranchDto(m.get("branch_id").toString(),
                            m.get("rate_no").toString(), jsonDataObject));

                }
            } else {
                _product_no = m.get("product_no").toString();
                if (jsonDataTemp.size() > 0) {
                    jsonData.add(jsonDataTemp.get(0));
                }
                jsonDataTemp = new ArrayList<InsuranceProductDto>();
                jsonDataObject = new ArrayList<InsuranceObjectDto>();
                jsonDataObject.add(new InsuranceObjectDto(m.get("obj_grp").toString(),
                        (Double) m.get("top"), (Double) m.get("net_rate_pct"), (Double) m.get("bruto_rate_pct"),
                        (Double) m.get("depreciation_pct"), (Double) m.get("amount_ceiling")));
                jsonDataBranch = new ArrayList<InsuranceBranchDto>();
                jsonDataBranch.add(new InsuranceBranchDto(m.get("branch_id").toString(),
                        m.get("rate_no").toString(), jsonDataObject));
                jsonDataTemp.add(new InsuranceProductDto(m.get("product_no").toString(),
                        m.get("product_desc").toString(), (Double) m.get("adm_fee"),
                        m.get("start_date").toString(), m.get("end_date").toString(), jsonDataBranch));

            }
        }
        return jsonData;

    }

    @RequestMapping(value = "/master/insc/mpf/product", method = RequestMethod.GET)
    @ResponseBody
    public List<Map> getInsurancesProduct(HttpSession session) {
        List<Map> daoData = new ArrayList<Map>();
        try {
            daoData = masterService.getInsurancesProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return daoData;
    }

    @RequestMapping(value = "/master/insc/mpf/branch/{product_no}", method = RequestMethod.GET)
    @ResponseBody
    public List<Map> getInsurancesBranchByProduct(@PathVariable String product_no, HttpSession session) {
        List<Map> daoData = new ArrayList<Map>();
        try {
            daoData = masterService.getInsurancesBranchByProduct(product_no);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return daoData;
    }

    @RequestMapping(value = "/master/insc/mpf/objgrp/{rate_no}", method = RequestMethod.GET)
    @ResponseBody
    public List<Map> getInsurancesObjGroupByRate(@PathVariable String rate_no, HttpSession session) {
        List<Map> daoData = new ArrayList<Map>();
        try {
            daoData = masterService.getInsurancesObjGroupByRate(rate_no);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return daoData;
    }
}
