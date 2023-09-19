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

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Card Settings'), 0)

Mobile.tap(findTestObject('3DSecure/android.widget.TextView - Card Settings'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Card settings (1)'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - E-Commerce payment security'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - 3D Secure'), 0)

Mobile.tap(findTestObject('Object Repository/3DSecure/android.widget.TextView - Active - Linked to iPhone. Tap here for more details'), 
    0)

Mobile.getText(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Register on this device'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Register on this device (1)'), 0)

Mobile.getText(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.Button - CHANGE DEVICE'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Choose an authentication method'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Please choose how you want to secure the release of your payments'), 
    0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.RadioButton - Biometric with PIN'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.RadioButton - PIN'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.Button - CONTINUE'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - enter PIN'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Please enter a six-digit PIN here. If your biometrics are not recognized, release your payment with this PIN'), 
    0)

Mobile.setText(findTestObject('Object Repository/3DSecure/android.widget.EditText - PIN'), '123456', 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.Button - CANCEL'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.Button - CONTINUE (1)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Enter PIN (1)'), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.TextView - Please confirm the entry of your PIN'), 
    0)

Mobile.setText(findTestObject(''), '123456', 0)

Mobile.getText(findTestObject(''), 0)

Mobile.getText(findTestObject('Object Repository/3DSecure/android.widget.Button - CONFIRM'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

