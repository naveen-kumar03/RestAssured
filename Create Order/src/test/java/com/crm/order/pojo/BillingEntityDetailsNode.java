package com.crm.order.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BillingEntityDetailsNode {

	String externalRefId;
	int entityTypeId;
	String pan;
	String entityName;
	String legalName;
	String address1;
	String address2;
	String City;
	String State;
	String pincode;
	String contactPerson;
	String email;
	List<CustomerNode> Customer;
	boolean blacklisted;

	public BillingEntityDetailsNode(String eref, int eID, String ePAN, String eName, String eLegalName, String eAdd1,
			String eAdd2, String eCity, String eState, String ePin, String ePOC, String eEmail,
			List<CustomerNode> CNode, boolean isblacklisted) {

		this.externalRefId = eref;
		this.entityTypeId = eID;
		this.pan = ePAN;
		this.entityName = eName;
		this.legalName = eLegalName;
		this.address1 = eAdd1;
		this.address2 = eAdd2;
		this.City = eCity;
		this.State = eState;
		this.pincode = ePin;
		this.contactPerson = ePOC;
		this.email = eEmail;
		this.Customer = CNode;
		this.blacklisted = isblacklisted;

	}

	public List<CustomerNode> getCustomer() {
		return Customer;
	}

	public void setCustomer(List<CustomerNode> customer) {
		Customer = customer;
	}

	public String getExternalRefId() {
		return externalRefId;
	}

	public void setExternalRefId(String externalRefId) {
		this.externalRefId = externalRefId;
	}

	public int getEntityTypeId() {
		return entityTypeId;
	}

	public void setEntityTypeId(int entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getLegalName() {
		return legalName;
	}

	public void setLegalName(String legalName) {
		this.legalName = legalName;
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
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getBlacklisted() {
		return blacklisted;
	}

	public void setBlacklisted(boolean blacklisted) {
		this.blacklisted = blacklisted;
	}

}
