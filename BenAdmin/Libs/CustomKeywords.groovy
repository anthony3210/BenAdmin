
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "benAdminQA.RequestSetup.testRequestJSON"(
    	String url	
     , 	String json	) {
    (new benAdminQA.RequestSetup()).testRequestJSON(
        	url
         , 	json)
}

def static "benAdminQA.RequestSetup.testRequestGQL"(
    	String url	
     , 	String gql	) {
    (new benAdminQA.RequestSetup()).testRequestGQL(
        	url
         , 	gql)
}

def static "benAdminQA.RequestSetup.verifyStatusCode"(
    	TestObject request	
     , 	int expectedStatusCode	) {
    (new benAdminQA.RequestSetup()).verifyStatusCode(
        	request
         , 	expectedStatusCode)
}

def static "benAdminQA.RequestSetup.addBasicAuthorizationProperty"(
    	TestObject request	
     , 	String username	
     , 	String password	) {
    (new benAdminQA.RequestSetup()).addBasicAuthorizationProperty(
        	request
         , 	username
         , 	password)
}
