package com.bdd.stepdefs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetsSwaggerStepDef {
	RequestSpecification httpRequest = null;
	Response response = null;
	String endPoint_URL;

	@Given("I have an endpoint url {string}")
	public void i_have_an_endpoint_url(String string) {
		endPoint_URL = RestAssured.baseURI = string;

	}

	@When("I hit the post request with header")
	public void i_hit_the_post_request_with_header() {
		response = RestAssured.given().when()
				.body("{\n" + "    \"name\": \"morpheus\",\n" + "    \"job\": \"leader\"\n" + "}").post(endPoint_URL)
				.then().extract().response();
	}

	@Then("I should validate the response code and success message after Post request")
	public void i_should_validate_the_response_code_and_success_message_after_post_request() {
		System.out.println(response.getStatusCode());
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
	}

	@Then("I should validate all the headers from the response")
	public void i_should_validate_all_the_headers_from_the_response() {
		Headers allHeaders = response.headers();
		for (Header header : allHeaders) {
			System.out.println("Key: " + header.getName() + "\nValue: " + header.getValue() + "\n");
		}
	}

	@Then("Body has below given json details")
	public void body_has_below_given_json_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> list = dataTable.asMaps();
		int count = list.size();
		int num;
		for (num = 0; num < count; num++) {
			if (response.getBody().jsonPath().getString(list.get(num).get("Key"))
					.equalsIgnoreCase(list.get(num).get("Value"))) {
				System.out.println("Response got " + response.getBody().jsonPath().getString(list.get(num).get("Key"))
						+ " Post request sent is " + list.get(num).get("Value") + " Matched");
			} else
				System.out.println("not Matched");

		}
	}

	@When("I hit the get request")
	public void i_hit_the_get_request() {
		response = RestAssured.given().when().get(endPoint_URL).then().extract().response();

	}

	@Then("I should validate the response code and response body after Get request")
	public void i_should_validate_the_response_code_and_response_body_after_get_request() {
		System.out.println(response.getStatusCode());
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		System.out.println(response.getBody().jsonPath().getString("status"));

		Map<String, Object> retMap = new HashMap<String, Object>();
		System.out.println(retMap.size());
		System.out.println(retMap);

	}

	@When("I hit the delete request")
	public void i_hit_the_delete_request() {
		response = RestAssured.given().when().delete(endPoint_URL).then().assertThat().statusCode(200).extract()
				.response();
	}

	@Then("I should validate the response code after Delete request")
	public void i_should_validate_the_response_code_after_delete_request() {
		System.out.println(response.getStatusCode());
	}

}
