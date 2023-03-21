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

Mobile.startExistingApplication('com.maybank2u.life')

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Pay Bills'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - Pay Bills'), 0)

Mobile.setText(findTestObject('Object Repository/MAE PayBills/android.widget.EditText - M2U password'), findTestData('DevOps').getValue(
        2, 1), 0)

Mobile.takeScreenshot()

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Continue'), 0)

Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Tenaga Nasional Berhad'), 
    0)

not_run: Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - Tenaga Nasional Berhad'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE PayBills/SPY/android.widget.TextView - Pay Bills'), 0)

Mobile.tap(findTestObject('MAE PayBills/SPY/android.widget.ImageView'), 0)

not_run: Mobile.setText(findTestObject('MAE PayBills/spy2/type biller edit box'), 'Tenaga Nasional', 0)

Mobile.setText(findTestObject('MAE PayBills/spy2/type biller edit box'), 'Visa Infinite', 0)

WebUI.delay(2)

Mobile.takeScreenshot()

not_run: Mobile.tap(findTestObject('MAE PayBills/SPY/android.widget.TextView - Tenaga Nasional Berhad'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAE PayBills/Visa Infinite'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

not_run: Mobile.tap(findTestObject('MAE PayBills/SPY/android.widget.TextView - Tenaga Nasional Berhad'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('MAE PayBills/Visa Infinite'), 0, FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.setText(findTestObject('MAE PayBills/spy2/type account number'), '210311409607', 0)

Mobile.setText(findTestObject('MAE PayBills/spy2/type account number'), '4365000260004396', 0)

WebUI.delay(2)

Mobile.takeScreenshot()

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAE PayBills/SPY/android.widget.TextView - Continue'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Enter amount'), 0)

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - The minimum payment for this transaction is RM 1'), 
    0)

WebUI.delay(3)

Mobile.takeScreenshot()

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - 0'), 0)

Mobile.tap(findTestObject('MAE PayBills/android.widget.ImageView'), 0)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Today'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

not_run: Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - Today'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - 31'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Done'), 0)

not_run: Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - Done'), 0)

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Pay Now'), 0)

Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - Pay Now'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE PayBills/S2U'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Payment scheduled'), 0)

WebUI.delay(3)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Share Receipt'), 0)

WebUI.delay(10)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Done (1)'), 0)

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Maybank2u'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - Maybank2u'), 0)

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - Savings Account-i'), 0)

Mobile.getText(findTestObject('Object Repository/MAE PayBills/android.widget.TextView - View Transactions'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE PayBills/android.widget.TextView - View Transactions'), 0)

WebUI.delay(5)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE PayBills/android.widget.ImageView (2)'), 0)

Mobile.closeApplication()

