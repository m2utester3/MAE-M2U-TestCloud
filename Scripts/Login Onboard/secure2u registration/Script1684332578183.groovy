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

//import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
//import io.appium.java_client.AppiumDriver as AppiumDriver
//import io.appium.java_client.MobileElement as MobileElement
//AppiumDriver<MobileElement> driver = MobileDriverFactory.getDriver()
//driver.lockDevice()
//driver.unlockDevice()
not_run: Mobile.getText(findTestObject('Transfer/android.widget.TextView - Secure2u'), 0)

not_run: Mobile.tap(findTestObject('Transfer/android.widget.TextView - Secure2u'), 0)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Activate Now'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('s2u registration/android.widget.TextView - Activate Now'), 0)

Mobile.delay(2)

not_run: Mobile.verifyElementText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Proceed'), 
    'Proceed')

not_run: Mobile.takeScreenshot()

not_run: if (Mobile.verifyElementText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Proceed'), 
    'Proceed') == true) {
    Mobile.tap(findTestObject('cloud device PIN registration/android.widget.TextView - Proceed'), 0)

    WebUI.delay(3)

    Mobile.swipe(550, 2000, 550, 1450)

    Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Lock screen'), 
        0)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('cloud device PIN registration/android.widget.TextView - Lock screen'), 0)

    WebUI.delay(3)

    Mobile.takeScreenshot()

    Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Screen lock type'), 
        0)

    Mobile.tap(findTestObject('cloud device PIN registration/android.widget.TextView - Screen lock type'), 0)

    WebUI.delay(3)

    Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - PIN'), 0)

    Mobile.tap(findTestObject('cloud device PIN registration/android.widget.TextView - PIN'), 0)

    WebUI.delay(3)

    Mobile.takeScreenshot()

    Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Set PIN'), 
        0)

    WebUI.delay(3)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(1)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(1)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(1)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(3)

    Mobile.takeScreenshot()

    Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.Button - Continue'), 0)

    Mobile.tap(findTestObject('cloud device PIN registration/android.widget.Button - Continue'), 0)

    WebUI.delay(3)

    Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Set PIN'), 
        0)

    WebUI.delay(3)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(1)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(1)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(1)

    Mobile.tapAtPosition(200, 1635)

    WebUI.delay(3)

    Mobile.takeScreenshot()

    Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.Button - OK'), 0)

    Mobile.tap(findTestObject('cloud device PIN registration/android.widget.Button - OK'), 0)

    WebUI.delay(3)

    Mobile.takeScreenshot()

    Mobile.pressBack()

    WebUI.delay(3)

    Mobile.takeScreenshot()

    Mobile.pressBack()

    WebUI.delay(3)

    Mobile.takeScreenshot()

    Mobile.pressBack()

    WebUI.delay(3)

    Mobile.takeScreenshot()

    not_run: Mobile.pressBack()

    WebUI.delay(3)

    if (Mobile.verifyElementText(findTestObject('SPY MAE without firebase/spy3/Are you sure you want to quit the app'), 
        'Are you sure you want to quit the app?') == true) {
        Mobile.getText(findTestObject('SPY MAE without firebase/spy3/Quit App - No'), 0)

        Mobile.tap(findTestObject('SPY MAE without firebase/spy3/Quit App - No'), 0)
    }
    
    Mobile.takeScreenshot()
}

not_run: Mobile.getText(findTestObject('cloud device PIN registration/android.widget.TextView - Activate Now'), 0)

not_run: Mobile.takeScreenshot()

not_run: Mobile.tap(findTestObject('cloud device PIN registration/android.widget.TextView - Activate Now'), 0)

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Confirm'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('s2u registration/android.widget.TextView - Confirm'), 0)

def OTP = Mobile.getText(findTestObject('Object Repository/Login Onboarding/Your OTP no. is 2'), 0)

Mobile.takeScreenshot()

Mobile.delay(2)

for (def i = 16; i <= 21; i++) {
    def TapNo = OTP[i]

    Mobile.tap(findTestObject('Text', [('Verify') : TapNo]), 0)
}

Mobile.takeScreenshot()

Mobile.delay(3)

'Tick button'
Mobile.tap(findTestObject('Object Repository/Dynamic Object/Tap Image Following 2', [('text') : '0']), 0)

WebUI.delay(2)

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Enter your ID number'), 0)

Mobile.setText(findTestObject('Object Repository/s2u registration/android.widget.EditText - Your ID number'), '960829149762', 
    0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Continue'), 0)

Mobile.tap(findTestObject('s2u registration/android.widget.TextView - Continue'), 0)

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Device Name'), 0)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('s2u registration/android.widget.TextView - Continue (1)'), 0)

Mobile.tap(findTestObject('s2u registration/android.widget.TextView - Continue (1)'), 0)

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Secure2u enabled'), 0)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Continue (1)'), 0)

Mobile.tap(findTestObject('s2u registration/android.widget.TextView - Continue (1)'), 0)

Mobile.getText(findTestObject('Object Repository/s2u registration/android.widget.TextView - Home'), 0)

Mobile.tap(findTestObject('s2u registration/android.widget.TextView - Home'), 0)

Mobile.tap(findTestObject('s2u registration/android.widget.TextView - Home'), 0)

Mobile.delay(5)

Mobile.takeScreenshot()

