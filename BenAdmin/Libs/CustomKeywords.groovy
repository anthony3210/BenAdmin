
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "benAdminQA.RequestSetup.testRequest"(
    	Object url	
     , 	Object body	) {
    (new benAdminQA.RequestSetup()).testRequest(
        	url
         , 	body)
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
