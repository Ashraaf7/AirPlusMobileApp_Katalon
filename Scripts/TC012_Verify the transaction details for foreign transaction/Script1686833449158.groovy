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

Mobile.scrollToText('SHOW MORE')

Mobile.tap(findTestObject('Object Repository/TransactionDetails/android.widget.Button - SHOW MORE'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Prine Hotel'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - 24 Apr 2023'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - 8,00'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - CHF9,01'), 0)

Mobile.tap(findTestObject('TransactionDetails/android.widget.TextView - Prine Hotel'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.view.View - Debit'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Food  Beverage'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Prine Hotel (1)'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Zurich, Switzerland'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Corporate Card'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - 24 Apr 2023 (1)'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - AMOUNT DETAILS'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView -'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - CHF'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Exchange rate'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - PAYMENT INFO'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Payment'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Transaction type'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - ADDITIONAL INFO'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - Booking date'), 0)

Mobile.tap(findTestObject('Object Repository/TransactionDetails/android.widget.ImageButton'), 0)

Mobile.getText(findTestObject('Object Repository/TransactionDetails/android.widget.TextView - TRANSACTIONS (1)'), 0)

Mobile.closeApplication()

