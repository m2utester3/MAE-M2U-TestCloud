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

Mobile.startApplication('/Users/APK/uat_MAEs2uCPuplift.apk', false)

WebUI.delay(10)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Next'), 0)

Mobile.getText(findTestObject('SPY MAE without firebase/spy 2/Got It'), 0)

Mobile.tap(findTestObject('SPY MAE without firebase/spy 2/Got It'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Agree'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Agree'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Log In Now'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Log In Now'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Existing M2UMAE user Log in here'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Please enter your username'), 
    0)

WebUI.delay(5)

Mobile.tap(findTestObject('SPY MAE without firebase/spy3/userid EditText'), 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('SPY MAE without firebase/spy3/userid EditText'), 'samuat05', 0)

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

WebUI.delay(3)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

if (Mobile.verifyElementText(findTestObject('SPY MAE without firebase/Proceed'), 'Proceed', FailureHandling.OPTIONAL) == 
true) {
    Mobile.tap(findTestObject('SPY MAE without firebase/Proceed'), 0)
}

//Mobile.getText(findTestObject('SPY MAE without firebase/Proceed'), 0)
Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Create your PIN for the app'), 
    0)

WebUI.delay(3)

Mobile.takeScreenshot()

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

def OTP = Mobile.getText(findTestObject('Object Repository/Login Onboarding/Your OTP no. is 2'), 0)

Mobile.delay(2)

for (def i = 16; i <= 21; i++) {
    def TapNo = OTP[i]

    Mobile.tap(findTestObject('Text', [('Verify') : TapNo]), 0)
}

Mobile.takeScreenshot()

Mobile.delay(3)

'Tick button'
Mobile.tap(findTestObject('Object Repository/Dynamic Object/Tap Image Following 2', [('text') : '0']), 0)

Mobile.delay(3)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.EditText - Enter your name'), 0)

Mobile.setText(findTestObject('MAE UAT new app/android.widget.EditText - Enter your name'), 'Mosaj', 0)

Mobile.hideKeyboard()

Mobile.getText(findTestObject('MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

Mobile.tap(findTestObject('MAE UAT new app/android.widget.TextView - Continue (1)'), 0)

Mobile.getText(findTestObject('SPY MAE without firebase/CASA account'), 0)

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.ImageView (1)'), 0)

Mobile.getText(findTestObject('SPY MAE without firebase/CASA account number'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Next (2)'), 0)

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Next (2)'), 0)

WebUI.delay(5)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Skip'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Set Up Successful'), 0)

Mobile.getText(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Done'), 0)

Mobile.tap(findTestObject('Object Repository/MAE UAT new app/android.widget.TextView - Done'), 0)

