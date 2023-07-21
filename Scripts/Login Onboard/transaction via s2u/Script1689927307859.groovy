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

not_run: Mobile.startExistingApplication('com.maybank2u.life.uat')

Mobile.getDeviceHeight()

Mobile.getDeviceWidth()

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Transfer'), 0)

Mobile.tap(findTestObject('transaction via s2u/android.widget.TextView - Transfer'), 0)

WebUI.delay(15)

Mobile.swipe(400, 900, 50, 900)

WebUI.delay(15)

not_run: Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Banks'), 0)

Mobile.tap(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Banks'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - MAYBANK'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('transaction via s2u/android.widget.TextView - MAYBANK'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Account number'), 0)

WebUI.delay(10)

Mobile.setText(findTestObject('Object Repository/transaction via s2u/android.widget.EditText'), '562366010792', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Continue'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('transaction via s2u/android.widget.TextView - Continue'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Enter amount'), 0)

WebUI.delay(15)

Mobile.tap(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - 2'), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/transaction via s2u/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Enter recipient reference'), 
    0)

Mobile.takeScreenshot()

WebUI.delay(10)

Mobile.setText(findTestObject('transaction via s2u/android.widget.EditText'), 'cloud testing s2u', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('transaction via s2u/android.widget.TextView - Continue'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('transaction via s2u/android.widget.TextView - Continue'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Recipient reference'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Transfer Now'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('transaction via s2u/android.widget.TextView - Transfer Now'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Secure2u authorisation'), 
    0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Approve'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('transaction via s2u/android.widget.TextView - Approve'), 0)

Mobile.getText(findTestObject('Object Repository/transaction via s2u/android.widget.TextView - Transfer successful'), 0)

Mobile.takeScreenshot()

not_run: Mobile.closeApplication()

