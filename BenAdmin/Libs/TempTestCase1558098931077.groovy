import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/6x/d61f1qfs55jgxhlg5s7rbj180000gp/T/Katalon/Test Cases/Client Person/Services/Client/Create Client/TC-11-AUTO-Services Create Client required fields_KS - Copy/20190517_081518/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Client Person/Services/Client/Create Client/TC-11-AUTO-Services Create Client required fields_KS - Copy', new TestCaseBinding('Test Cases/Client Person/Services/Client/Create Client/TC-11-AUTO-Services Create Client required fields_KS - Copy',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
