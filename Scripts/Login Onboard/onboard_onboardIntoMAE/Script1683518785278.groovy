import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

//'Datafiles TestData, sheet test_data'
Mobile.startApplication('/Users/APK/app-uat-universal-release.apk', false)

//Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 03)
if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 10, FailureHandling.OPTIONAL)) {
    Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 3000)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Login Onboarding/onboardWelcomeSkipBtn'), 0)

    Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Agree']), 0)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Login Onboarding/onboardTNCAgreeBtn'), 0)
} else if (Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Your enhanced experience\nis here.']), 10, FailureHandling.OPTIONAL)) {
    Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Next']), 0)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('ImageNo', [('No') : 2]), 0)

    Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Agree']), 0)

    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Login Onboarding/onboardTNCAgreeBtn'), 0)
}

if (Mobile.verifyElementExist(findTestObject('Dashboard/dashboardSetUpWalletIcon'), 10, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Dashboard/dashboardSetUpWalletIcon'), 0)
} else {
    Mobile.tap(findTestObject('Text', [('Verify') : 'Log In Now']), 0)
}

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/getStartedExistingUserBtn'), 0)

Mobile.setText(findTestObject('Login Onboarding/loginExistingUsernameInputField'), 'ninalee', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.waitForElementPresent(findTestObject('Login Onboarding/loginExistingMineConfirmationBtn'), 50)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/loginExistingMineConfirmationBtn'), 0)

Mobile.setText(findTestObject('Login Onboarding/loginPasswordInputField'), 'Maybank@1', 0)

Mobile.hideKeyboard()

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(5)

if (Mobile.verifyElementVisible(findTestObject('Login Onboarding/Proceed'), 3, FailureHandling.OPTIONAL)) {
    Mobile.takeScreenshot()

    Mobile.tap(findTestObject('Login Onboarding/Proceed'), 5)
}

pinNO = findTestData('test_data').getValue(11, 1)

def length = pinNO.length()

for (def i = 0; i < length; i++) {
    def TapNo = pinNO[i]

    Mobile.tap(findTestObject('Text', [('Verify') : TapNo]), 0)
}

Mobile.takeScreenshot()

'Tick button'
Mobile.tap(findTestObject('Object Repository/Dynamic Object/Tap Image Following 2', [('text') : '0']), 0)

Mobile.delay(2)

pinNO = findTestData('test_data').getValue(11, 1)

length = pinNO.length()

for (def i = 0; i < length; i++) {
    TapNo = (pinNO[i])

    Mobile.tap(findTestObject('Text', [('Verify') : TapNo]), 0)
}

Mobile.delay(2)

Mobile.takeScreenshot()

'Tick button'
Mobile.tap(findTestObject('Object Repository/Dynamic Object/Tap Image Following 2', [('text') : '0']), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/loginTouchIDSetUpLaterBtn'), 0)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/loginVerifyNumberYesProceedBtn'), 0)

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

Mobile.waitForElementPresent(findTestObject('Login Onboarding/onboardNameInputField'), 0)

Mobile.setText(findTestObject('Login Onboarding/onboardNameInputField'), findTestData('test_data').getValue(3, 21), 0)

Mobile.hideKeyboard()

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

Mobile.delay(2)

Mobile.verifyElementVisible(findTestObject('Object Repository/Transfer/onboardSelectWallet_AccountType'), 0)

Mobile.tap(findTestObject('Object Repository/Transfer/onboardSelectWallet_AccountType'), 0)

Last = Mobile.getText(findTestObject('TextNo', [('No') : 'last()']), 0)

if (Last == 'Continue') {
    Mobile.verifyElementExist(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)

    Mobile.tap(findTestObject('Login Onboarding/loginExistingContinueBtn'), 0)
} else {
    Mobile.verifyElementExist(findTestObject('Text', [('Verify') : 'Next']), 0)

    Mobile.tap(findTestObject('Text', [('Verify') : 'Next']), 0)
}

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/onboardReferSkipBtn'), 0, FailureHandling.OPTIONAL)

Mobile.delay(2)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Login Onboarding/Main/mainDoneBtn'), 0)

Mobile.delay(5)

Mobile.takeScreenshot()

Mobile.verifyEqual(Mobile.getText(findTestObject('Object Repository/Dynamic Object/VerifyText', [('text') : 'Quick Actions']), 
        0), 'Quick Actions')

Mobile.takeScreenshot()

