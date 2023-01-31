package com.HTTP.Method.Testing;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethodTesting {
	
	Response response;
	
	@BeforeTest
	public void getSetup() {
		response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
	}
	// to validate the status code
	@Test
	public void getStatusCode() {
	   System.out.println("Status code="+response.getStatusCode());
       Assert.assertEquals(response.getStatusCode(), 200);
    }
    // to validate the content type is application/json
	@Test
	public void getContentType() {
		System.out.println("Data format="+response.getContentType());
	    Assert.assertTrue(response.getContentType().contains("json"));
	    Assert.assertEquals(response.getContentType(), "application/json");
	}
	//to validate the response time
	@Test
	public void getResponseTime() {
		System.out.println("Response time="+response.getTime());
		Assert.assertTrue(response.getTime()<2000);
	}
	//to validate response body is not null
	@Test
	public void getResponseNullOrNot() {
		System.out.println("Is response null or not="+response.toString()!=null);
		
		
		
	
	
	
	
	}

}