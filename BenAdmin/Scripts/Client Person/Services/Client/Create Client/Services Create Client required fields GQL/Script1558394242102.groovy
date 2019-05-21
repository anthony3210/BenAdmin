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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import com.kms.katalon.core.testobject.RestRequestObjectBuilder as RestRequestObjectBuilder
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import benAdminQA.RequestSetup as RequestSetup
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.maestrohealth.qa.api.GraphQL as GraphQL

// build HTTP request body
gql = '''\
mutation {
  createAddress(
    address: {
      addressLine1: "169 Smith Street"
      addressLine2: "line2"
      city: "Chicago"
      postalCode: "60014"
      stateProvinceCode: "IL"
      attention: "Laura"
      county: "McHenry"
      countryISOCode: "US"
    }
  ) {
    addressUUID
    addressLine1
    addressLine2
    city
    stateProvinceCode
    postalCode
    attention
    county
    countryISOCode
  }
}
'''
url = 'https://api.benadmin.qa.maestroedgy.com/graphql'

// make request (drag and drop!)
testObject = findTestObject('Object Repository/Client Person/Services/Client/Create Client/CreateClient')
response = GraphQL.testRequest(testObject, url, gql);
//response = WS.sendRequestAndVerify(CustomKeywords.'benAdminQA.RequestSetup.testRequestGQL'(url, gql))

// verify status
WS.verifyResponseStatusCode(response, 200)
WS.verifyElementPropertyValue(response, 'data.createAddress.addressLine1', '169 Smith Street')
WS.verifyElementPropertyValue(response, 'data.createAddress.addressLine2', 'line2')
WS.verifyElementPropertyValue(response, 'data.createAddress.city', 'Chicago')
WS.verifyElementPropertyValue(response, 'data.createAddress.attention', 'Laura')
WS.verifyElementPropertyValue(response, 'data.createAddress.postalCode', "60014")
WS.verifyElementPropertyValue(response, 'data.createAddress.stateProvinceCode', 'IL')
WS.verifyElementPropertyValue(response, 'data.createAddress.county', 'McHenry')
WS.verifyElementPropertyValue(response, 'data.createAddress.countryISOCode', 'US')
