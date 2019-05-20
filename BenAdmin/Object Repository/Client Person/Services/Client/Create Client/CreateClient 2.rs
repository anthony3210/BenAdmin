<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>This is an HTTP POST request that creates a client.</description>
   <name>CreateClient 2</name>
   <tag></tag>
   <elementGuidId>712c12b8-67c4-42c6-82af-5be06448b26c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
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
   <variables>
      <defaultValue>'{&quot;query&quot;:&quot;mutation {createAddress(address:{addressLine1: \\&quot;${addressLine1}\\&quot; addressLine2: \\&quot;${addressLine2}\\&quot; city: \\&quot;${city}\\&quot; postalCode: \\&quot;${postalCode}\\&quot; stateProvinceCode: \\&quot;${stateProvinceCode}\\&quot; attention: \\&quot;${attention}\\&quot; county: \\&quot;${county}\\&quot; countryISOCode: \\&quot;${countryISOCode}\\&quot;}){addressUUID addressLine1 addressLine2 city stateProvinceCode attention county countryISOCode}}&quot;}'</defaultValue>
      <description></description>
      <id>7f2d66b7-e045-4c95-84df-810f4eec22e2</id>
      <masked>false</masked>
      <name>body</name>
   </variables>
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
