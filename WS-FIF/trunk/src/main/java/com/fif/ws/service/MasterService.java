/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.service;

import com.fif.ws.model.customer.dto.CustomerHeaderDto;

import com.fif.ws.model.master.CitiesModel;
import com.fif.ws.model.master.CustomerModel;
import com.fif.ws.model.master.DealerMaster;
import com.fif.ws.model.master.DocumentModel;
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
import com.fif.ws.model.master.PromoModel;
import com.fif.ws.model.master.ProvinsiModel;
import com.fif.ws.model.master.RegionalModel;
import com.fif.ws.model.master.ReligionModel;
import com.fif.ws.model.master.ZipCodesModel;
import com.fif.ws.model.master.ZipModel;
import com.fif.ws.model.master.dto.CustomerDto;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author RizkyAkbar
 */
public interface MasterService {

    public List<ProvinsiModel> getProvinsi();

    public List<ReligionModel> getReligion();

    public List<EducationModel> getEducation();

    public List<EducationModel> getEducationByDate(Date since_date);

    public List<HouseStatusModel> getHouseStatus();

    public List<MaritalStatusModel> getMaritalStatus();

    public List<ProvinsiModel> getByprovinsi();

    public List<CitiesModel> getCities();

    public List<CitiesModel> getCitiesByDate(Date since_date);

    public List<CitiesModel> getCityByProvCode(String prov_code);

    public List<CitiesModel> getCityByCityCode(String city_code);

    public List<KecamatanModel> getKecamatan();

    public List<KecamatanModel> getKecamatanByCityCode(String city_code);

    public List<KecamatanModel> getKecamatanByKecCode(String kec_code);

    public List<KelurahanModel> getKelurahan();

    public List<KelurahanModel> getKelurahanByKecCode(String kec_code);

    public List<KelurahanModel> getKelurahanByKelCode(String kel_code);

    public List<ZipModel> getZip();

    public List<ZipCodesModel> getZipCodes();

    public List<ZipModel> getZipByCityCode(String city_code);

    public List<ZipModel> getZipCodeByAll();

    public List<ObjectGroupModel> getObjectGroup();

    public List<ObjectCodesModel> getObjectCodesByObjGrp(String obj_grp);

    public List<OccupationModel> getOccupation();

    public List<OccupationModel> getOccupationByDate(Date since_date);

    public List<OccupationSubModel> getOccupationByOcptCode(String ocpt_code);

    public List<OccupationTypeModel> getOccupationByOcptType(String ocpt_type);

    public List<DocumentModel> getDocument();

    public List<DocumentModel> getDocumentByDate(Date since_date);

    public List<OfficesModel> getOfficesByBranchName(String branch_name);

    public List<OfficesModel> getOffices();

    public List<OfficesModel> getOfficesByBranchCode(String branch_code);

    public List<CustomerDto> getCustomerIndividu(String cust_name, Date birth_date,
            String no_kontrak, String id_type, String id_number);

    public List<CustomerDto> getCustomerInd(Date birth_date, String id_type, String id_number);

    public List<CustomerHeaderDto> getCustomerByCustNo(String cust_no);

    public List<DealerMaster> getDealerByDealerCode(String dealer_code);

    public List<DealerMaster> getDealer();

    public List<DealerMaster> getDealerByMpf(Date since_date);

    public List<Map> getObjectCodesMpf();

    public List<PromoModel> getPromoBySinceDate(Date sinceDate);

    public List<PromoModel> getPromoByAll();

    public List<DealerMaster> getDealerByAllMpf();

    public List<Map> getObjectCodesMpfByDate(Date sinceDate);

    public String getInsurance(String objectCode);

    public List<OfficesModel> getOfficesByDate(Date since_date);

    public List<RegionalModel> getRegionalsBySinceDate(Date since_date);

    public List<RegionalModel> getRegionals();

    public List<Map> getInsurances();

    public List<Map> getInsurancesBySinceDate(Date since_date);

    public List<Map> getInsurancesProduct();

    public List<Map> getInsurancesBranchByProduct(String product_no);

    public List<Map> getInsurancesObjGroupByRate(String rate_no);

    public List<PromoModel> getPromoMpfBySinceDate(Date sinceDate);

    public List<PromoModel> getPromoMpfByAll();

    public List<Map> getPromoRateMpfByAllSinceDate(Date sinceDate);

    public List<Map> getPromoRateMpfByAll();

}
