<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>This is an HTTP POST request that creates a client.</description>
   <name>CreateClient 2 - Copy</name>
   <tag></tag>
   <elementGuidId>0142ed4a-967b-4461-8db1-281c6d4f852e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;query\&quot;:\&quot;mutation {createAddress(address:{addressLine1: \\\&quot;${addressLine1}\\\&quot; addressLine2: \\\&quot;${addressLine2}\\\&quot; city: \\\&quot;${city}\\\&quot; postalCode: \\\&quot;${postalCode}\\\&quot; stateProvinceCode: \\\&quot;${stateProvinceCode}\\\&quot; attention: \\\&quot;${attention}\\\&quot; county: \\\&quot;${county}\\\&quot; countryISOCode: \\\&quot;${countryISOCode}\\\&quot;}){addressUUID addressLine1 addressLine2 city stateProvinceCode attention county countryISOCode}}\&quot;}&quot;,
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
      <defaultValue>'169 Smith Street'</defaultValue>
      <description></description>
      <id>b9128c1f-f164-4a1a-adfa-243ede4f6c01</id>
      <masked>false</masked>
      <name>addressLine1</name>
   </variables>
   <variables>
      <defaultValue>'line2'</defaultValue>
      <description></description>
      <id>3ad337bb-8221-4658-ba65-8efdd167ba40</id>
      <masked>false</masked>
      <name>addressLine2</name>
   </variables>
   <variables>
      <defaultValue>'Chicago'</defaultValue>
      <description></description>
      <id>da72c215-b148-4c7b-b359-c301a3e1442d</id>
      <masked>false</masked>
      <name>city</name>
   </variables>
   <variables>
      <defaultValue>'60015'</defaultValue>
      <description></description>
      <id>e8a62a1f-5ff1-4612-be6e-f9a8032fc2f0</id>
      <masked>false</masked>
      <name>postalCode</name>
   </variables>
   <variables>
      <defaultValue>'IL'</defaultValue>
      <description></description>
      <id>b0218406-a331-48ac-9bc0-5af6582bbc29</id>
      <masked>false</masked>
      <name>stateProvinceCode</name>
   </variables>
   <variables>
      <defaultValue>'Laura'</defaultValue>
      <description></description>
      <id>e4cdc927-3bd2-4cb0-a51a-bceb971b33ba</id>
      <masked>false</masked>
      <name>attention</name>
   </variables>
   <variables>
      <defaultValue>'McHenry'</defaultValue>
      <description></description>
      <id>9efd465c-7f5a-4622-9263-c54e97b54cb6</id>
      <masked>false</masked>
      <name>county</name>
   </variables>
   <variables>
      <defaultValue>'US'</defaultValue>
      <description></description>
      <id>cc5aa061-abba-4bf7-9580-e7568d674c26</id>
      <masked>false</masked>
      <name>countryISOCode</name>
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
