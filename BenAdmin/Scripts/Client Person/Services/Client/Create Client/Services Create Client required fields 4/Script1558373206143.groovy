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

RequestObject ro = findTestObject('Client Person/Services/Client/Create Client/CreateClient 2');

//body = /{"query":"mutation {createAddress(address:{addressLine1: \"${addressLine1}\" addressLine2: \"${addressLine2}\" city: \"${city}\" postalCode: \"${postalCode}\" stateProvinceCode: \"${stateProvinceCode}\" attention: \"${attention}\" county: \"${county}\" countryISOCode: \"${countryISOCode}\"}){addressUUID addressLine1 addressLine2 city stateProvinceCode attention county countryISOCode}}"}/

gqlQuery = '''\
mutation createAddress($address: AddressCreateInput!) {
	createAddress(address: $address) {
		addressUUID
		addressLine1
		addressLine2
		city
		postalCode
		stateProvinceCode
		attention
		county
		countryISOCode
	}
}
'''

body2 = gqlQuery.replaceAll(/[\n\t]+/," ") // body is now a Java.Lang.String (immutable)
println body2;

// build HTTP header properties
TestObjectProperty header = new TestObjectProperty("Content-Type", ConditionType.EQUALS, "application/json")
ArrayList defaultHeaders = Arrays.asList(header)

ro.setHttpHeaderProperties(defaultHeaders)
ro.setBodyContent(new HttpTextBodyContent(${body}));

// make request
response = WS.sendRequest(ro);

println response.getResponseBodyContent()

// verify status
WS.verifyResponseStatusCode(response, 200);
WS.verifyElementPropertyValue(response, 'data.createAddress.addressLine1', "169 Smith Street")
WS.verifyElementPropertyValue(response, 'data.createAddress.addressLine2', "line2")
WS.verifyElementPropertyValue(response, 'data.createAddress.city', "Chicago")
WS.verifyElementPropertyValue(response, 'data.createAddress.attention', "Laura")
//WS.verifyElementPropertyValue(response, 'data.createAddress.postalCode', "60015") // client or server problem?
WS.verifyElementPropertyValue(response, 'data.createAddress.stateProvinceCode', "IL")
WS.verifyElementPropertyValue(response, 'data.createAddress.county', "McHenry")
WS.verifyElementPropertyValue(response, 'data.createAddress.countryISOCode', "US")
