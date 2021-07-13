package com.crm.order.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinalRequestPayload {

	BillingEntityDetailsNode billingEntityDetails;
	String caseExternalRefId;
	int caseId;
	PurchaseOrderNode purchaseOrder;
	boolean isUpdate;
	int requestType;

	public FinalRequestPayload(BillingEntityDetailsNode BEDN, String FCaseRefID, int cseid,PurchaseOrderNode PON,
			boolean update, int reqtype) {

		this.billingEntityDetails=BEDN;
		this.caseExternalRefId=FCaseRefID;
		this.caseId=cseid;
		this.purchaseOrder=PON;
		this.isUpdate=update;
		this.requestType=reqtype;
	}

	public BillingEntityDetailsNode getBillingEntityDetails() {
		return billingEntityDetails;
	}

	public void setBillingEntityDetails(BillingEntityDetailsNode billingEntityDetails) {
		this.billingEntityDetails = billingEntityDetails;
	}

	public String getCaseExternalRefId() {
		return caseExternalRefId;
	}

	public void setCaseExternalRefId(String caseExternalRefId) {
		this.caseExternalRefId = caseExternalRefId;
	}

	public int getCaseId() {
		return caseId;
	}

	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}

	public PurchaseOrderNode getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrderNode purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public boolean isUpdate() {
		return isUpdate;
	}

	public void setUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}

	public int getRequestType() {
		return requestType;
	}

	public void setRequestType(int requestType) {
		this.requestType = requestType;
	}

}
