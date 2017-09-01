/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fif.ws.service.impl;

import com.fif.ws.dao.BucketOrderDao;
import com.fif.ws.dao.CitiesDao;
import com.fif.ws.dao.CustomerDao;
import com.fif.ws.dao.CustomerIndDao;
import com.fif.ws.dao.DealerDao;
import com.fif.ws.dao.DocumentDao;
import com.fif.ws.dao.EducationDao;
import com.fif.ws.dao.HouseStatusDao;
import com.fif.ws.dao.InsuranceDao;
import com.fif.ws.dao.KecamatanDao;
import com.fif.ws.dao.KelurahanDao;
import com.fif.ws.dao.MaritalStatusDao;
import com.fif.ws.dao.ObjectCodesDao;
import com.fif.ws.dao.ObjectGroupDao;
import com.fif.ws.dao.OccupationDao;
import com.fif.ws.dao.OccupationSubDao;
import com.fif.ws.dao.OccupationTypeDao;
import com.fif.ws.dao.OfficeDao;
import com.fif.ws.dao.PromoDao;
import com.fif.ws.dao.ProvinsiDao;
import com.fif.ws.dao.RegionalDao;
import com.fif.ws.dao.ReligionDao;
import com.fif.ws.dao.ZipCodesDao;
import com.fif.ws.dao.ZipDao;
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
import com.fif.ws.service.MasterService;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RizkyAkbar
 */
@Service
@Transactional(readOnly = true)
public class MasterServiceImpl implements MasterService {

    @Autowired
    private ProvinsiDao provinsiDao;
    @Autowired
    private ReligionDao religionDao;
    @Autowired
    private EducationDao educationDao;
    @Autowired
    private MaritalStatusDao maritalStatusDao;
    @Autowired
    private HouseStatusDao houseStatusDao;
    @Autowired
    private CitiesDao citiesDao;
    @Autowired
    private KecamatanDao kecamatanDao;
    @Autowired
    private KelurahanDao kelurahanDao;
    @Autowired
    private ZipDao zipDao;
    @Autowired
    private ZipCodesDao zipCodeDao;
    @Autowired
    private OccupationDao occupationDao;
    @Autowired
    private OccupationSubDao occupationSubDao;
    @Autowired
    private OccupationTypeDao occupationTypeDao;
    @Autowired
    private ObjectGroupDao objectGroupDao;
    @Autowired
    private ObjectCodesDao objectCodesDao;
    @Autowired
    private DocumentDao documentDao;
    @Autowired
    private OfficeDao officeDao;
    @Autowired
    private CustomerIndDao customerIndDao;
    @Autowired
    private DealerDao dealerDao;
    @Autowired
    private PromoDao promoDao;
    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private BucketOrderDao bucketOrderDao;
    @Autowired
    private RegionalDao regionalDao;
    @Autowired
    private InsuranceDao insuranceDao;

    public List<ProvinsiModel> getProvinsi() {
        return provinsiDao.getProvinsi();
    }

    public List<CitiesModel> getCities() {
        return citiesDao.getCities();
    }

    public List<KecamatanModel> getKecamatan() {
        return kecamatanDao.getKecamatan();
    }

    public List<KelurahanModel> getKelurahan() {
        return kelurahanDao.getKelurahan();
    }

    public List<ProvinsiModel> getByprovinsi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CitiesModel> getByCities() {
        return citiesDao.getCities();
    }

    public List<KecamatanModel> getByKecamatan() {
        return kecamatanDao.getKecamatan();
    }

    public List<KelurahanModel> getByKelurahan() {
        return kelurahanDao.getKelurahan();
    }

    public List<ZipModel> getZip() {
        return zipDao.getZip();
    }

    public List<ZipCodesModel> getZipCodes() {
        return zipCodeDao.getZipCodes();
    }

    public List<OccupationModel> getOccupation() {
        return occupationDao.getOccupation();
    }

    public List<OccupationModel> getOccupationByDate(Date since_date) {
        return occupationDao.getOccupationByDate(since_date);
    }

    public List<CitiesModel> getCitiesByDate(Date since_date) {
        return citiesDao.getCitiesByDate(since_date);
    }

    public List<CitiesModel> getCityByProvCode(String prov_code) {
        return citiesDao.getCityByProvCode(prov_code);
    }

    public List<CitiesModel> getCityByCityCode(String city_code) {
        return citiesDao.getCityByCityCode(city_code);
    }

    public List<KecamatanModel> getKecamatanByCityCode(String city_code) {
        return kecamatanDao.getKecamatanByCityCode(city_code);
    }

    public List<KecamatanModel> getKecamatanByKecCode(String kec_code) {
        return kecamatanDao.getKecamatanByKecCode(kec_code);
    }

    public List<KelurahanModel> getKelurahanByKecCode(String kec_code) {
        return kelurahanDao.getKelurahanByKecCode(kec_code);
    }

    public List<KelurahanModel> getKelurahanByKelCode(String kel_code) {
        return kelurahanDao.getKelurahanByKelCode(kel_code);
    }

    public List<OccupationSubModel> getOccupationByOcptCode(String ocpt_code) {
        return occupationSubDao.getOccupationByOcptCode(ocpt_code);
    }

    public List<OccupationTypeModel> getOccupationByOcptType(String ocpt_type) {
        return occupationTypeDao.getOccupationByOcptType(ocpt_type);
    }

    public List<ZipModel> getZipByCityCode(String city_code) {
        return zipDao.getZipByCityCode(city_code);
    }

    public List<ZipModel> getZipCodeByAll() {
        return zipDao.getZipCodeByAll();
    }

    public List<ReligionModel> getReligion() {
        return religionDao.getReligion();
    }

    public List<EducationModel> getEducation() {
        return educationDao.getEducation();
    }

    public List<EducationModel> getEducationByDate(Date since_date) {
        return educationDao.getEducationByDate(since_date);
    }

    public List<HouseStatusModel> getHouseStatus() {
        return houseStatusDao.getHouseStatus();
    }

    public List<MaritalStatusModel> getMaritalStatus() {
        return maritalStatusDao.getMaritalStatus();
    }

    public List<ObjectGroupModel> getObjectGroup() {
        return objectGroupDao.getObjectGroup();
    }

    public List<ObjectCodesModel> getObjectCodesByObjGrp(String obj_grp) {
        return objectCodesDao.getObjectCodesByObjGrp(obj_grp);
    }

    public List<DocumentModel> getDocument() {
        return documentDao.getDocument();
    }

    public List<OfficesModel> getOfficesByBranchName(String branch_name) {
        return officeDao.getOfficesByBranchName(branch_name);
    }

    public List<OfficesModel> getOfficesByBranchCode(String branch_code) {
        return officeDao.getOfficesByBranchCode(branch_code);
    }

    public List<CustomerDto> getCustomerIndividu(String cust_name, Date birth_date, String no_kontrak, String id_type, String id_number) {
        return customerIndDao.getCustomerIndividu(birth_date, id_number, id_type, cust_name, no_kontrak);
    }

    public List<CustomerDto> getCustomerInd(Date birth_date, String id_type, String id_number) {
        return customerIndDao.getCustomerInd(birth_date, id_type, id_number);
    }

    public List<CustomerHeaderDto> getCustomerByCustNo(String cust_no) {
        return customerDao.getCustomerByCustNo(cust_no);
    }

    public List<DealerMaster> getDealerByDealerCode(String dealer_code) {
        return dealerDao.getDealerByDealerCode(dealer_code);
    }

    public List<DealerMaster> getDealer() {
        return dealerDao.getDealer();
    }

    public List<OfficesModel> getOffices() {
        return officeDao.getOffices();
    }

    public List<DealerMaster> getDealerByMpf(Date since_date) {
        return dealerDao.getDealerByMpf(since_date);
    }

    public List<Map> getObjectCodesMpf() {
        return objectCodesDao.getObjectCodesMpf();
    }

    public List<PromoModel> getPromoBySinceDate(Date sinceDate) {
        return promoDao.getPromoBySinceDate(sinceDate);
    }

    public List<PromoModel> getPromoByAll() {
        return promoDao.getPromoByAll();
    }
    
    public List<Map> getPromoRateMpfByAllSinceDate(Date sinceDate){
        return promoDao.getPromoRateMpfByAllSinceDate(sinceDate);
    }
    
    public List<Map> getPromoRateMpfByAll(){
        return promoDao.getPromoRateMpfByAll();
    }

    public List<DealerMaster> getDealerByAllMpf() {
        return dealerDao.getDealerByAllMpf();
    }

    public List<Map> getObjectCodesMpfByDate(Date sinceDate) {
        return objectCodesDao.getObjectCodesMpfByDate(sinceDate);
    }

    public List<OfficesModel> getOfficesByDate(Date since_date) {
        return officeDao.getOfficesByDate(since_date);
    }

    public List<DocumentModel> getDocumentByDate(Date since_date) {
        return documentDao.getDocumentbydate(since_date);
    }

    public List<RegionalModel> getRegionalsBySinceDate(Date since_date) {
        return regionalDao.getRegionalsBySinceDate(since_date);
    }

    public List<RegionalModel> getRegionals() {
        return regionalDao.getRegionals();
    }

    public List<Map> getInsurances() {
        return insuranceDao.getInsurances();
    }

    public List<Map> getInsurancesBySinceDate(Date since_date) {
        return insuranceDao.getInsurancesBySinceDate(since_date);
    }

    public List<Map> getInsurancesProduct() {
        return insuranceDao.getInsurancesProduct();
    }

    public List<Map> getInsurancesBranchByProduct(String product_no) {
        return insuranceDao.getInsurancesBranchByProduct(product_no);
    }

    public List<Map> getInsurancesObjGroupByRate(String rate_no) {
        return insuranceDao.getInsurancesObjGroupByRate(rate_no);
    }

    public List<PromoModel> getPromoMpfBySinceDate(Date sinceDate) {
        return promoDao.getPromoMpfBySinceDate(sinceDate);
    }

    public List<PromoModel> getPromoMpfByAll() {
        return promoDao.getPromoMpfByAll();
    }

    public String getInsurance(String objectCode) {
        return objectCodesDao.getInsurance(objectCode);
    }

      
}
