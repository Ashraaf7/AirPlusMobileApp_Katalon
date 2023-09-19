import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication(GlobalVariable.AppId)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Support'), 0)

Mobile.tap(findTestObject('Support/android.widget.TextView - Support'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Support (1)'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Support (2)'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Just reach out to our customer service. We are happy to help'), 
    0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Germany'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 49 69 790001 00'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardservicedeairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - United Kingdom'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 44 20-81 75 28 55'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardserviceukairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Belgium'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 32 2 4000 150'), 0)

Mobile.scrollToText('Austria')

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardservicebeairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - France'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 33 1 700 601 66'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardservicefrairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Netherlands'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 31 20 714 39 81'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardservicenlairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Austria'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 43 720 204540'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardserviceatairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Switzerland'), 0)

Mobile.scrollToText('Luxembourg')

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 41 44 55 10 560'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardservicechairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Italy'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 39 051 0920 912'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardserviceitairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Luxembourg'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 352 278 710 8 1'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardserviceluxairplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - Poland'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - 48 22-26 30 74 7'), 0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - cardserviceplairplus.com'), 0)

Mobile.scrollToText('www.airplus.com')

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - For further information, please visit our website'), 
    0)

Mobile.getText(findTestObject('Object Repository/Support/android.widget.TextView - www.airplus.com'), 0)

Mobile.tap(findTestObject('Support/android.widget.TextView - www.airplus.com'), 0)

Mobile.pressBack()

Mobile.getText(findTestObject('Support/android.widget.TextView - Support (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Support/android.widget.ImageButton'), 0)

Mobile.closeApplication()

