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

Mobile.getText(findTestObject('Object Repository/FAQ/android.widget.TextView - FAQ'), 0)

Mobile.tap(findTestObject('FAQ/android.widget.TextView - FAQ'), 0)

Mobile.switchToNative()

Mobile.getText(findTestObject('Object Repository/FAQ/android.widget.TextView - airplus.com'), 0)

Mobile.getText(findTestObject('Object Repository/FAQ/android.widget.TextView - faq-v1.0.pdf'), 0)

Mobile.getText(findTestObject('Object Repository/FAQ/android.widget.Button - Delete'), 0)

Mobile.getText(findTestObject('Object Repository/FAQ/android.widget.Button - Open'), 0)

Mobile.tap(findTestObject('Object Repository/FAQ/android.widget.ImageButton'), 0)

Mobile.getText(findTestObject('FAQ/android.widget.TextView - FAQ'), 0)

Mobile.closeApplication()

