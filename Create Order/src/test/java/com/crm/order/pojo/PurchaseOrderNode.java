package com.crm.order.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseOrderNode {

	String externalRefId;
	boolean isAggregator;
	String poNumber;
	String soType;
	String docSubType;
	String greenInitiative;
	String poDate;
	int hardPosQuantity;
	int softPosQuantity;
	List<Object> customerList;
	String mccCode;
	String primaryCustomer;
	String orderDate;
	String releaseDate;
	boolean isBankIntegrationSuccess;
	boolean isTestOrder;

	public PurchaseOrderNode(String prefid, boolean isAgg, String PNum, String Ptype, String PStype, String iniative,
			String PDate, int HPOS, int SPOS, List<Object> CList, String PMCC, String PC, String POrderDate,
			String PReleasedate, boolean Pintegration, boolean PTestOrder) {

		this.externalRefId = prefid;
		this.isAggregator = isAgg;
		this.poNumber = PNum;
		this.soType = Ptype;
		this.docSubType = PStype;
		this.greenInitiative = iniative;
		this.poDate = PDate;
		this.hardPosQuantity = HPOS;
		this.softPosQuantity = SPOS;
		this.customerList = CList;
		this.mccCode = PMCC;
		this.primaryCustomer = PC;
		this.orderDate = POrderDate;
		this.releaseDate = PReleasedate;
		this.isBankIntegrationSuccess = Pintegration;
		this.isTestOrder = PTestOrder;
	}

	public List<Object> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Object> customerList) {
		this.customerList = customerList;
	}

	public String getExternalRefId() {
		return externalRefId;
	}

	public void setExternalRefId(String externalRefId) {
		this.externalRefId = externalRefId;
	}

	public boolean isAggregator() {
		return isAggregator;
	}

	public void setAggregator(boolean isAggregator) {
		this.isAggregator = isAggregator;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getSoType() {
		return soType;
	}

	public void setSoType(String soType) {
		this.soType = soType;
	}

	public String getDocSubType() {
		return docSubType;
	}

	public void setDocSubType(String docSubType) {
		this.docSubType = docSubType;
	}

	public String getGreenInitiative() {
		return greenInitiative;
	}

	public void setGreenInitiative(String greenInitiative) {
		this.greenInitiative = greenInitiative;
	}

	public String getPoDate() {
		return poDate;
	}

	public void setPoDate(String poDate) {
		this.poDate = poDate;
	}

	public int getHardPosQuantity() {
		return hardPosQuantity;
	}

	public void setHardPosQuantity(int hardPosQuantity) {
		this.hardPosQuantity = hardPosQuantity;
	}

	public int getSoftPosQuantity() {
		return softPosQuantity;
	}

	public void setSoftPosQuantity(int softPosQuantity) {
		this.softPosQuantity = softPosQuantity;
	}

	public String getMccCode() {
		return mccCode;
	}

	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getPrimaryCustomer() {
		return primaryCustomer;
	}

	public void setPrimaryCustomer(String primaryCustomer) {
		this.primaryCustomer = primaryCustomer;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public boolean isBankIntegrationSuccess() {
		return isBankIntegrationSuccess;
	}

	public void setBankIntegrationSuccess(boolean isBankIntegrationSuccess) {
		this.isBankIntegrationSuccess = isBankIntegrationSuccess;
	}

	public boolean isTestOrder() {
		return isTestOrder;
	}

	public void setTestOrder(boolean isTestOrder) {
		this.isTestOrder = isTestOrder;
	}

}
