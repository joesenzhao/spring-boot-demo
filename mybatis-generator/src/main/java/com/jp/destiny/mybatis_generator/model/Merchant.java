package com.jp.destiny.mybatis_generator.model;

import java.math.BigDecimal;
import java.util.Date;

public class Merchant {
    private String pkId;

    private String merchantId;

    private String processInstanceId;

    private String merchantName;

    private String merchantShortName;

    private String merchantShortCode;

    private String creditCode;

    private String upMerchantId;

    private String upMerchantIds;

    private String registeredCapital;

    private Date registeredDate;

    private String bizEndDate;

    private String bizStartDate;

    private Date contractStartDate;

    private Integer contractYear;

    private String isStandard;

    private String address;

    private String industry;

    private String merchantRelationId;

    private String merchantType;

    private String enterpriseType;

    private String enterpriseMailbox;

    private String legalName;

    private String legalMobile;

    private String legalIdNo;

    private String legalStartDate;

    private String legalEndDate;

    private String legalMailbox;

    private String contactsName;

    private String contactsMobile;

    private String registeredCompany;

    private String merchantSources;

    private String toCustomerManagerId;

    private String toCustomerManagerName;

    private String recUserName;

    private String recUserMobile;

    private String recommendMerchantName;

    private String recommendMerchantId;

    private String expandUserName;

    private String registeredProvinceCode;

    private String registeredProvinceName;

    private String registeredCityCode;

    private String registeredCityName;

    private String registeredAreaCode;

    private String registeredAreaName;

    private String registeredAddr;

    private String contactsProvinceCode;

    private String contactsProvinceName;

    private String contactsCityCode;

    private String contactsCityName;

    private String contactsAreaCode;

    private String contactsAreaName;

    private String contactsAddr;

    private String merchantStatus;

    private String bizScope;

    private String approvalStatus;

    private String rawCreateUser;

    private Date rawCreateTime;

    private String rawUpdateUser;

    private Date rawUpdateTime;

    private String operationUserName;

    private String operationUserMobile;

    private String financeUserName;

    private String financeUserMobile;

    private String otherUserName;

    private String otherUserMobile;

    private String controlUserType;

    private String controlUserName;

    private String controlUserMobile;

    private String controlIdNo;

    private String isLegalPersonChange;

    private Integer isLegalSign;

    private String belongOpportunityId;

    private String belongOpportunityName;

    private String verificationDesc;

    private String currentRoleId;

    private String esignAccountId;

    private Integer staffNum;

    private BigDecimal monthLoanAmt;

    private String isTenant;

    private String fundingPartyNature;

    private String useAuthLevel;

    private String follower;

    private String chargingVersion;

    private Date contractBillingStartDate;

    private String contractBillingYear;

    private String merchantChargeAccountOpen;

    private String followerId;

    public String getPkId() {
        return pkId;
    }

    public void setPkId(String pkId) {
        this.pkId = pkId == null ? null : pkId.trim();
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId == null ? null : processInstanceId.trim();
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName == null ? null : merchantName.trim();
    }

    public String getMerchantShortName() {
        return merchantShortName;
    }

    public void setMerchantShortName(String merchantShortName) {
        this.merchantShortName = merchantShortName == null ? null : merchantShortName.trim();
    }

    public String getMerchantShortCode() {
        return merchantShortCode;
    }

    public void setMerchantShortCode(String merchantShortCode) {
        this.merchantShortCode = merchantShortCode == null ? null : merchantShortCode.trim();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getUpMerchantId() {
        return upMerchantId;
    }

    public void setUpMerchantId(String upMerchantId) {
        this.upMerchantId = upMerchantId == null ? null : upMerchantId.trim();
    }

    public String getUpMerchantIds() {
        return upMerchantIds;
    }

    public void setUpMerchantIds(String upMerchantIds) {
        this.upMerchantIds = upMerchantIds == null ? null : upMerchantIds.trim();
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital == null ? null : registeredCapital.trim();
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }

    public String getBizEndDate() {
        return bizEndDate;
    }

    public void setBizEndDate(String bizEndDate) {
        this.bizEndDate = bizEndDate == null ? null : bizEndDate.trim();
    }

    public String getBizStartDate() {
        return bizStartDate;
    }

    public void setBizStartDate(String bizStartDate) {
        this.bizStartDate = bizStartDate == null ? null : bizStartDate.trim();
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Integer getContractYear() {
        return contractYear;
    }

    public void setContractYear(Integer contractYear) {
        this.contractYear = contractYear;
    }

    public String getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(String isStandard) {
        this.isStandard = isStandard == null ? null : isStandard.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getMerchantRelationId() {
        return merchantRelationId;
    }

    public void setMerchantRelationId(String merchantRelationId) {
        this.merchantRelationId = merchantRelationId == null ? null : merchantRelationId.trim();
    }

    public String getMerchantType() {
        return merchantType;
    }

    public void setMerchantType(String merchantType) {
        this.merchantType = merchantType == null ? null : merchantType.trim();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getEnterpriseMailbox() {
        return enterpriseMailbox;
    }

    public void setEnterpriseMailbox(String enterpriseMailbox) {
        this.enterpriseMailbox = enterpriseMailbox == null ? null : enterpriseMailbox.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalMobile() {
        return legalMobile;
    }

    public void setLegalMobile(String legalMobile) {
        this.legalMobile = legalMobile == null ? null : legalMobile.trim();
    }

    public String getLegalIdNo() {
        return legalIdNo;
    }

    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo == null ? null : legalIdNo.trim();
    }

    public String getLegalStartDate() {
        return legalStartDate;
    }

    public void setLegalStartDate(String legalStartDate) {
        this.legalStartDate = legalStartDate == null ? null : legalStartDate.trim();
    }

    public String getLegalEndDate() {
        return legalEndDate;
    }

    public void setLegalEndDate(String legalEndDate) {
        this.legalEndDate = legalEndDate == null ? null : legalEndDate.trim();
    }

    public String getLegalMailbox() {
        return legalMailbox;
    }

    public void setLegalMailbox(String legalMailbox) {
        this.legalMailbox = legalMailbox == null ? null : legalMailbox.trim();
    }

    public String getContactsName() {
        return contactsName;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName == null ? null : contactsName.trim();
    }

    public String getContactsMobile() {
        return contactsMobile;
    }

    public void setContactsMobile(String contactsMobile) {
        this.contactsMobile = contactsMobile == null ? null : contactsMobile.trim();
    }

    public String getRegisteredCompany() {
        return registeredCompany;
    }

    public void setRegisteredCompany(String registeredCompany) {
        this.registeredCompany = registeredCompany == null ? null : registeredCompany.trim();
    }

    public String getMerchantSources() {
        return merchantSources;
    }

    public void setMerchantSources(String merchantSources) {
        this.merchantSources = merchantSources == null ? null : merchantSources.trim();
    }

    public String getToCustomerManagerId() {
        return toCustomerManagerId;
    }

    public void setToCustomerManagerId(String toCustomerManagerId) {
        this.toCustomerManagerId = toCustomerManagerId == null ? null : toCustomerManagerId.trim();
    }

    public String getToCustomerManagerName() {
        return toCustomerManagerName;
    }

    public void setToCustomerManagerName(String toCustomerManagerName) {
        this.toCustomerManagerName = toCustomerManagerName == null ? null : toCustomerManagerName.trim();
    }

    public String getRecUserName() {
        return recUserName;
    }

    public void setRecUserName(String recUserName) {
        this.recUserName = recUserName == null ? null : recUserName.trim();
    }

    public String getRecUserMobile() {
        return recUserMobile;
    }

    public void setRecUserMobile(String recUserMobile) {
        this.recUserMobile = recUserMobile == null ? null : recUserMobile.trim();
    }

    public String getRecommendMerchantName() {
        return recommendMerchantName;
    }

    public void setRecommendMerchantName(String recommendMerchantName) {
        this.recommendMerchantName = recommendMerchantName == null ? null : recommendMerchantName.trim();
    }

    public String getRecommendMerchantId() {
        return recommendMerchantId;
    }

    public void setRecommendMerchantId(String recommendMerchantId) {
        this.recommendMerchantId = recommendMerchantId == null ? null : recommendMerchantId.trim();
    }

    public String getExpandUserName() {
        return expandUserName;
    }

    public void setExpandUserName(String expandUserName) {
        this.expandUserName = expandUserName == null ? null : expandUserName.trim();
    }

    public String getRegisteredProvinceCode() {
        return registeredProvinceCode;
    }

    public void setRegisteredProvinceCode(String registeredProvinceCode) {
        this.registeredProvinceCode = registeredProvinceCode == null ? null : registeredProvinceCode.trim();
    }

    public String getRegisteredProvinceName() {
        return registeredProvinceName;
    }

    public void setRegisteredProvinceName(String registeredProvinceName) {
        this.registeredProvinceName = registeredProvinceName == null ? null : registeredProvinceName.trim();
    }

    public String getRegisteredCityCode() {
        return registeredCityCode;
    }

    public void setRegisteredCityCode(String registeredCityCode) {
        this.registeredCityCode = registeredCityCode == null ? null : registeredCityCode.trim();
    }

    public String getRegisteredCityName() {
        return registeredCityName;
    }

    public void setRegisteredCityName(String registeredCityName) {
        this.registeredCityName = registeredCityName == null ? null : registeredCityName.trim();
    }

    public String getRegisteredAreaCode() {
        return registeredAreaCode;
    }

    public void setRegisteredAreaCode(String registeredAreaCode) {
        this.registeredAreaCode = registeredAreaCode == null ? null : registeredAreaCode.trim();
    }

    public String getRegisteredAreaName() {
        return registeredAreaName;
    }

    public void setRegisteredAreaName(String registeredAreaName) {
        this.registeredAreaName = registeredAreaName == null ? null : registeredAreaName.trim();
    }

    public String getRegisteredAddr() {
        return registeredAddr;
    }

    public void setRegisteredAddr(String registeredAddr) {
        this.registeredAddr = registeredAddr == null ? null : registeredAddr.trim();
    }

    public String getContactsProvinceCode() {
        return contactsProvinceCode;
    }

    public void setContactsProvinceCode(String contactsProvinceCode) {
        this.contactsProvinceCode = contactsProvinceCode == null ? null : contactsProvinceCode.trim();
    }

    public String getContactsProvinceName() {
        return contactsProvinceName;
    }

    public void setContactsProvinceName(String contactsProvinceName) {
        this.contactsProvinceName = contactsProvinceName == null ? null : contactsProvinceName.trim();
    }

    public String getContactsCityCode() {
        return contactsCityCode;
    }

    public void setContactsCityCode(String contactsCityCode) {
        this.contactsCityCode = contactsCityCode == null ? null : contactsCityCode.trim();
    }

    public String getContactsCityName() {
        return contactsCityName;
    }

    public void setContactsCityName(String contactsCityName) {
        this.contactsCityName = contactsCityName == null ? null : contactsCityName.trim();
    }

    public String getContactsAreaCode() {
        return contactsAreaCode;
    }

    public void setContactsAreaCode(String contactsAreaCode) {
        this.contactsAreaCode = contactsAreaCode == null ? null : contactsAreaCode.trim();
    }

    public String getContactsAreaName() {
        return contactsAreaName;
    }

    public void setContactsAreaName(String contactsAreaName) {
        this.contactsAreaName = contactsAreaName == null ? null : contactsAreaName.trim();
    }

    public String getContactsAddr() {
        return contactsAddr;
    }

    public void setContactsAddr(String contactsAddr) {
        this.contactsAddr = contactsAddr == null ? null : contactsAddr.trim();
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus == null ? null : merchantStatus.trim();
    }

    public String getBizScope() {
        return bizScope;
    }

    public void setBizScope(String bizScope) {
        this.bizScope = bizScope == null ? null : bizScope.trim();
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus == null ? null : approvalStatus.trim();
    }

    public String getRawCreateUser() {
        return rawCreateUser;
    }

    public void setRawCreateUser(String rawCreateUser) {
        this.rawCreateUser = rawCreateUser == null ? null : rawCreateUser.trim();
    }

    public Date getRawCreateTime() {
        return rawCreateTime;
    }

    public void setRawCreateTime(Date rawCreateTime) {
        this.rawCreateTime = rawCreateTime;
    }

    public String getRawUpdateUser() {
        return rawUpdateUser;
    }

    public void setRawUpdateUser(String rawUpdateUser) {
        this.rawUpdateUser = rawUpdateUser == null ? null : rawUpdateUser.trim();
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    public String getOperationUserName() {
        return operationUserName;
    }

    public void setOperationUserName(String operationUserName) {
        this.operationUserName = operationUserName == null ? null : operationUserName.trim();
    }

    public String getOperationUserMobile() {
        return operationUserMobile;
    }

    public void setOperationUserMobile(String operationUserMobile) {
        this.operationUserMobile = operationUserMobile == null ? null : operationUserMobile.trim();
    }

    public String getFinanceUserName() {
        return financeUserName;
    }

    public void setFinanceUserName(String financeUserName) {
        this.financeUserName = financeUserName == null ? null : financeUserName.trim();
    }

    public String getFinanceUserMobile() {
        return financeUserMobile;
    }

    public void setFinanceUserMobile(String financeUserMobile) {
        this.financeUserMobile = financeUserMobile == null ? null : financeUserMobile.trim();
    }

    public String getOtherUserName() {
        return otherUserName;
    }

    public void setOtherUserName(String otherUserName) {
        this.otherUserName = otherUserName == null ? null : otherUserName.trim();
    }

    public String getOtherUserMobile() {
        return otherUserMobile;
    }

    public void setOtherUserMobile(String otherUserMobile) {
        this.otherUserMobile = otherUserMobile == null ? null : otherUserMobile.trim();
    }

    public String getControlUserType() {
        return controlUserType;
    }

    public void setControlUserType(String controlUserType) {
        this.controlUserType = controlUserType == null ? null : controlUserType.trim();
    }

    public String getControlUserName() {
        return controlUserName;
    }

    public void setControlUserName(String controlUserName) {
        this.controlUserName = controlUserName == null ? null : controlUserName.trim();
    }

    public String getControlUserMobile() {
        return controlUserMobile;
    }

    public void setControlUserMobile(String controlUserMobile) {
        this.controlUserMobile = controlUserMobile == null ? null : controlUserMobile.trim();
    }

    public String getControlIdNo() {
        return controlIdNo;
    }

    public void setControlIdNo(String controlIdNo) {
        this.controlIdNo = controlIdNo == null ? null : controlIdNo.trim();
    }

    public String getIsLegalPersonChange() {
        return isLegalPersonChange;
    }

    public void setIsLegalPersonChange(String isLegalPersonChange) {
        this.isLegalPersonChange = isLegalPersonChange == null ? null : isLegalPersonChange.trim();
    }

    public Integer getIsLegalSign() {
        return isLegalSign;
    }

    public void setIsLegalSign(Integer isLegalSign) {
        this.isLegalSign = isLegalSign;
    }

    public String getBelongOpportunityId() {
        return belongOpportunityId;
    }

    public void setBelongOpportunityId(String belongOpportunityId) {
        this.belongOpportunityId = belongOpportunityId == null ? null : belongOpportunityId.trim();
    }

    public String getBelongOpportunityName() {
        return belongOpportunityName;
    }

    public void setBelongOpportunityName(String belongOpportunityName) {
        this.belongOpportunityName = belongOpportunityName == null ? null : belongOpportunityName.trim();
    }

    public String getVerificationDesc() {
        return verificationDesc;
    }

    public void setVerificationDesc(String verificationDesc) {
        this.verificationDesc = verificationDesc == null ? null : verificationDesc.trim();
    }

    public String getCurrentRoleId() {
        return currentRoleId;
    }

    public void setCurrentRoleId(String currentRoleId) {
        this.currentRoleId = currentRoleId == null ? null : currentRoleId.trim();
    }

    public String getEsignAccountId() {
        return esignAccountId;
    }

    public void setEsignAccountId(String esignAccountId) {
        this.esignAccountId = esignAccountId == null ? null : esignAccountId.trim();
    }

    public Integer getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(Integer staffNum) {
        this.staffNum = staffNum;
    }

    public BigDecimal getMonthLoanAmt() {
        return monthLoanAmt;
    }

    public void setMonthLoanAmt(BigDecimal monthLoanAmt) {
        this.monthLoanAmt = monthLoanAmt;
    }

    public String getIsTenant() {
        return isTenant;
    }

    public void setIsTenant(String isTenant) {
        this.isTenant = isTenant == null ? null : isTenant.trim();
    }

    public String getFundingPartyNature() {
        return fundingPartyNature;
    }

    public void setFundingPartyNature(String fundingPartyNature) {
        this.fundingPartyNature = fundingPartyNature == null ? null : fundingPartyNature.trim();
    }

    public String getUseAuthLevel() {
        return useAuthLevel;
    }

    public void setUseAuthLevel(String useAuthLevel) {
        this.useAuthLevel = useAuthLevel == null ? null : useAuthLevel.trim();
    }

    public String getFollower() {
        return follower;
    }

    public void setFollower(String follower) {
        this.follower = follower == null ? null : follower.trim();
    }

    public String getChargingVersion() {
        return chargingVersion;
    }

    public void setChargingVersion(String chargingVersion) {
        this.chargingVersion = chargingVersion == null ? null : chargingVersion.trim();
    }

    public Date getContractBillingStartDate() {
        return contractBillingStartDate;
    }

    public void setContractBillingStartDate(Date contractBillingStartDate) {
        this.contractBillingStartDate = contractBillingStartDate;
    }

    public String getContractBillingYear() {
        return contractBillingYear;
    }

    public void setContractBillingYear(String contractBillingYear) {
        this.contractBillingYear = contractBillingYear == null ? null : contractBillingYear.trim();
    }

    public String getMerchantChargeAccountOpen() {
        return merchantChargeAccountOpen;
    }

    public void setMerchantChargeAccountOpen(String merchantChargeAccountOpen) {
        this.merchantChargeAccountOpen = merchantChargeAccountOpen == null ? null : merchantChargeAccountOpen.trim();
    }

    public String getFollowerId() {
        return followerId;
    }

    public void setFollowerId(String followerId) {
        this.followerId = followerId == null ? null : followerId.trim();
    }
}