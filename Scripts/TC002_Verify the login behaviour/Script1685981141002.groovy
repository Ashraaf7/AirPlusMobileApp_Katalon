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

Mobile.verifyElementVisible(findTestObject('Login/android.widget.TextView - WelcomeLabelOnHeaderOfPage'), 0,FailureHandling.STOP_ON_FAILURE)

if(Mobile.verifyElementVisible(findTestObject('Login/android.widget.TextView - WelcomeLabelOnboardingPage'), 5,FailureHandling.OPTIONAL)
	|| Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Welcome backWhenNotFirstLogin'), 5,FailureHandling.OPTIONAL)
   )
   {
if(Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Nice to see you here. Please proceed with the login via our OpenID Connect service portal'), 
    5,FailureHandling.OPTIONAL)
|| Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Nice to see you again. Please proceed with the login via our OpenID Connect service portal'), 
    5,FailureHandling.OPTIONAL)
)
{

	Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.Button - LOG INOnLandingPage'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/android.widget.Button - LOG INOnLandingPage'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Welcome to Label'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - AirPlus Mobile'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText Email'), GlobalVariable.emailForLogin, 0)

Mobile.setText(findTestObject('Login/android.widget.EditText Password'), GlobalVariable.paswordForLogin, 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.Button - Login'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Forgot password'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Login'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Use Alternative'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Would you like to set an alternative login method for faster access to the app'), 
    0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.Button - CLOSE'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.Button - OK'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/android.widget.Button - OK'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Login  Security'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Biometrics'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Use Biometrics for login'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Switch'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login/android.widget.TextView - Available amount'), 0,FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()
}
}