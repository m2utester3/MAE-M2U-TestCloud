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

Mobile.startApplication('/Users/APK/app-uat-universal-release.apk', false)

Mobile.takeScreenshot()

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.Button - While using the app'), 
    0)

not_run: Mobile.tap(findTestObject('MAE UAT new app/android.widget.Button - While using the app'), 0)

not_run: Mobile.tap(findTestObject('MAE UAT new app/android.widget.Button - While using the app'), 0)

not_run: Mobile.tap(findTestObject('MAE UAT new app/android.widget.Button - Allow'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.Button - Allow'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Agree'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Agree'), 0)

WebUI.delay(10)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Log In Now'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Log In Now'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Existing M2UMAE user Log in here'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Please enter your username'), 
    0)

Mobile.setText(findTestObject('Object Repository/MAE UAT new app/android.widget.EditText'), 'ninalee', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Continue'), 0)

Mobile.takeScreenshot()

Mobile.hideKeyboard()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Continue'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Yes, Its Mine'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Yes, Its Mine'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Enter your password'), 0)

Mobile.setText(findTestObject('Object Repository/MAE UAT new app/android.widget.EditText (1)'), 'Maybank@1', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Create your PIN for the app'), 
    0)

WebUI.delay(10)

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Confirm your 6-digit PIN'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - 1'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Set Up Later'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Set Up Later'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Yes, Proceed'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Yes, Proceed'), 0)

OTP = Mobile.getText(findTestObject('MAE UAT new app/spy OTP/android.widget.TextView - Your OTP no. is 121727'), 0)

Mobile.takeScreenshot()

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.EditText - Enter your name'), 0)

not_run: Mobile.setText(findTestObject('MAE UAT new app/android.widget.EditText - Enter your name'), 'Mosaj', 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Maybank2u.Premier'), 
    0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.ImageView (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Next (2)'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Next (2)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Skip'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Skip'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Set Up Successful'), 
    0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Done'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Done'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Mosaj'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Hello,'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - View All Accounts'), 
    0)

Mobile.closeApplication()

