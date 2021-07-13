package com.crm.order.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerNode {
	
	String externalRefId;
	boolean isDefault;
	String stateList;
	String entityName;
	String address1;
	String address2;
	String city;
	String state;
	String pincode;
	String contactPerson;
	String contactNumber;
	String email;
	String globalDim2Code;
	String customerPostingGroup;
	String gsTinNo;
	boolean blacklisted;
	String legalMerchantName;
	
	public CustomerNode() {
		
	}

	public CustomerNode(String crefid, boolean ID, String SL, String CEName, String cadd1, String cadd2, String ccty,
			String CST, String cpin, String CPOC, String CNum, String ceml, String Dim2Code, String PostingGroup,
			String gst, boolean cisblacklisted, String clegalName) {
		this.externalRefId=crefid;
		this.isDefault=ID;
		this.stateList=SL;
		this.entityName=CEName;
		this.address1=cadd1;
		this.address2=cadd2;
		this.city=ccty;
		this.state=CST;
		this.pincode=cpin;
		this.contactPerson=CPOC;
		this.contactNumber=CNum;
		this.email=ceml;
		this.globalDim2Code=Dim2Code;
		this.customerPostingGroup=PostingGroup;
		this.gsTinNo=gst;
		this.blacklisted=cisblacklisted;
		this.legalMerchantName=clegalName;

	}

	public String getExternalRefId() {
		return externalRefId;
	}

	public void setExternalRefId(String externalRefId) {
		this.externalRefId = externalRefId;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getStateList() {
		return stateList;
	}

	public void setStateList(String stateList) {
		this.stateList = stateList;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGlobalDim2Code() {
		return globalDim2Code;
	}

	public void setGlobalDim2Code(String globalDim2Code) {
		this.globalDim2Code = globalDim2Code;
	}

	public String getCustomerPostingGroup() {
		return customerPostingGroup;
	}

	public void setCustomerPostingGroup(String customerPostingGroup) {
		this.customerPostingGroup = customerPostingGroup;
	}

	public String getGsTinNo() {
		return gsTinNo;
	}

	public void setGsTinNo(String gsTinNo) {
		this.gsTinNo = gsTinNo;
	}

	public boolean isBlacklisted() {
		return blacklisted;
	}

	public void setBlacklisted(boolean blacklisted) {
		this.blacklisted = blacklisted;
	}

	public String getLegalMerchantName() {
		return legalMerchantName;
	}

	public void setLegalMerchantName(String legalMerchantName) {
		this.legalMerchantName = legalMerchantName;
	}

	

}
