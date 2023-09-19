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



Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - Two-Factor Authentication'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - Transforms your mobile phone into a personal authentication device'),   0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.Button - NEXT'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutorial/android.widget.Button - NEXT'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - You are in control'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - When you initiate a transaction, youll receive a notification. You can then approve the transaction or reject with just one tap'), 
    0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Tutorial/android.widget.Button - NEXT'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutorial/android.widget.Button - NEXT'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - No connection No problem'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - If you do not have an internet connection, you can generate a one-time PIN for authorization'), 
    0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Tutorial/android.widget.Button - NEXT'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutorial/android.widget.Button - NEXT'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - 3D Secure'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - Enjoy all the 3D Secure benefits by activating each card in your app for safe and secure authentication'), 
    0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.Button - FINISH'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tutorial/android.widget.Button - FINISH'), 0)
Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - Allow AirPlus Mobile to send you notifications'),
	0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.Button - ALLOW'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.Button - DONT ALLOW'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Tutorial/android.widget.Button - ALLOW'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Tutorial/android.widget.TextView - Welcome'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

