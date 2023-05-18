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

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Transfer'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Transfer'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - 5623 6601 0806'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - 5623 6601 0806'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Enter amount'), 0)

Mobile.tap(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - 1'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE new app Transfer/android.widget.ImageView'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Enter recipient reference'), 
    0)

Mobile.setText(findTestObject('Object Repository/MAE new app Transfer/android.widget.EditText'), 'samuat06', 0)

Mobile.takeScreenshot()

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Continue'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Continue'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Confirmation'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Transfer Now'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Transfer Now'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Transfer successful'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Share Receipt'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Share Receipt'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Own Account Transfer'), 
    0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Successful'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE new app Transfer/android.widget.ImageView (1)'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Done'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Done'), 0)

Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Hello,'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE new app Transfer/android.widget.ImageView (2)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Secure2u'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Secure2u'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Home'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Home'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Activate Secure2u to approve transactions safely and quickly with a single tap'), 
    0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Activate Now'), 
    0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Activate Now'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - One Time Password'), 
    0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Confirm'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Confirm'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Your OTP no. is 977143'), 
    0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Enter your ID number'), 
    0)

not_run: Mobile.setText(findTestObject('Object Repository/MAE new app Transfer/android.widget.EditText - Your ID number'), 
    '960829143986', 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('MAE new app Transfer/android.widget.TextView - Continue'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Confirm your device name'), 
    0)

not_run: Mobile.getText(findTestObject('MAE UAT new app/android.widget.TextView - Done'), 0)

not_run: Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Done'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Secure2u activation in progress'), 
    0)

not_run: Mobile.getText(findTestObject('MAE new app Transfer/android.widget.TextView - Continue'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('MAE new app Transfer/android.widget.TextView - Transfer'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - Transfer'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - MAYBANK'), 0)

not_run: Mobile.tap(findTestObject('MAE new app Transfer/android.widget.TextView - MAYBANK'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE new app Transfer/android.widget.TextView - Account number'), 
    0)

not_run: Mobile.closeApplication()

