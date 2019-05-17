import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent

body = /{"query":"mutation {createAddress(address:{addressLine1: \"168 smith\" addressLine2: \"line2\" city: \"chicago\" attention: \"laura\" postalCode: \"60014\" stateProvinceCode: \"IL\" county: \"Mchenry\" countryISOCode: \"US\"}){addressUUID addressLine1 addressLine2 city stateProvinceCode attention county countryISOCode}}"}/

//body = body.replaceAll(/[\s]+/,"") // body is now a Java.Lang.String (immutable)

// build HTTP header properties
TestObjectProperty header = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
ArrayList defaultHeaders = Arrays.asList(header)

RequestObject ro = findTestObject('Client Person/Services/Client/Create Client/CreateClient_REST_KS - Copy');
ro.setHttpHeaderProperties(defaultHeaders)
ro.setBodyContent(new HttpTextBodyContent(body));

// make request
response = WS.sendRequest(ro);

// verify status
WS.verifyResponseStatusCode(response, 200);
println response.getResponseBodyContent()