package com.maestrohealth.qa.api
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent

public class GraphQL {
	/**
	 * Builds and sends a request object from a GraphQL and endpoint
	 * @param testObject a test object from the object repo
	 * @param url the endpoint to send query
	 * @param gql the GraphQL query
	 * @return response ResponseObject
	 */
	public static def ResponseObject testRequest(RequestObject testObject, String url, String gql) {
		// set HTTP Body
		testObject.setBodyContent(new HttpTextBodyContent(convertGrapqQLToJSON(gql)))
		testObject.setServiceType('REST')
		testObject.setRestUrl(url)
		testObject.setRestRequestMethod('POST')
		
		// build and set HTTP Header properties
		TestObjectProperty header = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
		ArrayList defaultHeaders = Arrays.asList(header)
		testObject.setHttpHeaderProperties(defaultHeaders)
		
		def response = WS.sendRequestAndVerify(testObject)
		// could test against a passed status code here: WS.verifyResponseStatusCode(response, 200)
		
		return response;
	}
	
	/**
	 * Converts a GraphQL query into valid JSON
	 * @param gql the graphQL query
	 * @return json JSON of the form: {"query":"graphQL query"}
	 */
	public static def String convertGrapqQLToJSON(String gql) {
		// build JSON from GraphQL query
		def json = gql.replaceAll(/[\n]+/,' '); // Java.Lang.String (immutable)
		json = json.replaceAll(/\s{2,}/, ' ');
		json = json.replaceAll(/\"/, /\\"/);
		json = '{"query":"'+json+'"}'
		return json
	}
}