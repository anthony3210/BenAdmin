<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>This is an HTTP POST request that creates a client.</description>
   <name>CreateClient_REST</name>
   <tag></tag>
   <elementGuidId>1f3db8fb-a522-43f2-8434-925859b789f0</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;query\&quot;:\&quot;mutation {createAddress(address:{addressLine1: \\\&quot;168 smith\\\&quot; addressLine2: \\\&quot;line2\\\&quot; city: \\\&quot;chicago\\\&quot; attention: \\\&quot;laura\\\&quot; postalCode: \\\&quot;60014\\\&quot; stateProvinceCode: \\\&quot;IL\\\&quot; county: \\\&quot;Mchenry\\\&quot; countryISOCode: \\\&quot;US\\\&quot;}){addressUUID addressLine1 addressLine2 city stateProvinceCode attention county countryISOCode}}\&quot;}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.benadmin.qa.maestroedgy.com/api/clientperson/graphql</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
