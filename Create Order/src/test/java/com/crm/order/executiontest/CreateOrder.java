package com.crm.order.executiontest;

import java.util.*;
import org.testng.annotations.*;
import com.crm.order.pojo.*;
import com.crm.order.utils.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.crm.order.apiconstant.StatusCode;
import com.crm.order.apiconstant.StatusCode.*;
import static com.crm.order.apiconstant.Route.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertThat;
import static com.crm.order.utils.FakerUtils.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
public class CreateOrder extends BaseTest {

	@BeforeClass

	public void beforeclass() {
		Map<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("ApplicationId", ConfigLoader.getInstance().Application_Id());
		headerMap.put("SecurityToken", ConfigLoader.getInstance().Security_Token_Test());
		headerMap.put("Content-Type", ConfigLoader.getInstance().Content_Type());

		RequestSpecBuilder reqBuilder = new RequestSpecBuilder().setBaseUri(BASE_URI).addHeaders(headerMap)
				// .addHeader("ApplicationId", ConfigLoader.getInstance().Application_Id())
				// .addHeader("SecurityToken", ConfigLoader.getInstance().Security_Token_Test())
				// .addHeader("Content-Type", ConfigLoader.getInstance().Content_Type())
				.log(LogDetail.ALL);
		RestAssured.requestSpecification = reqBuilder.build();

		ResponseSpecBuilder resBuilder = new ResponseSpecBuilder().expectStatusCode(200)
				.expectContentType(ContentType.JSON).log(LogDetail.ALL);
		RestAssured.responseSpecification = resBuilder.build();

	}

	// POJO Serialization

	CustomerNode customernode = new CustomerNode(DataLoader.getInstance().getCustomerId(), false, State_Value,
			entityName(), address(), address(), City_Value, State_Value, pincode(), entityName(), mobilenumber(),
			email(), Global_dim_Code, Posting_Group, gstIN(), false, entityName());
	List<CustomerNode> headerList = new ArrayList<CustomerNode>();

	BillingEntityDetailsNode billingNode = new BillingEntityDetailsNode(externalRefId(), Entity_Type, panNumber(),
			entityName(), entityName(), address(), address(), City_Value, State_Value, pincode(), entityName(), email(),
			headerList, false);

	List<Object> headerList1 = new ArrayList<Object>();
	PurchaseOrderNode POnode = new PurchaseOrderNode(externalRefId(), true, "1068976", SO_Type, SO_Type, "Hard Green",
			randomdate(), Hard_POS, Soft_POS, headerList1, MCC_Value, externalRefId(), randomdate(), randomdate(),
			false, false);

	FinalRequestPayload FinalPayload = new FinalRequestPayload(billingNode, externalRefId(), 5999481, POnode, false, 1);

	@Test(enabled=true)
	public void test1() throws JsonProcessingException {
		headerList.add(customernode);
		headerList1.add(DataLoader.getInstance().getCustomerId());

		given().body(FinalPayload).when().post(BASE_PATH).then().log().all();
		
	}


	
	

}
