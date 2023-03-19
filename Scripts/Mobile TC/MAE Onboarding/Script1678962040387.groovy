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

Mobile.startApplication('MAE.apk', false)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.Button - Allow'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.Button - While using the app'), 0)

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.Button - While using the app (1)'), 0)

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.Button - Allow'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/New Folder/android.widget.Button - Allow'), 0)

Mobile.takeScreenshot()

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Agree'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Agree'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Hello'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Hello'), 0)

Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

Mobile.takeScreenshot()

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\5.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Existing M2UMAE user Log in here'), 
    0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Login to Maybank2u'), 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\6.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.setText(findTestObject('MAE Onboarding/android.widget.EditText'), 'mosajgohar1', 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\7.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\8.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - cap'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Its Mine'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\9.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Its Mine'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Enter your password'), 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\10.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.setText(findTestObject('Object Repository/MAE Onboarding/android.widget.EditText (1)'), findTestData('DevOps').getValue(
        2, 1), 0)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Continue (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Create your PIN for the app'), 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\11.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\12.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.ImageView'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Confirm your 6-digit PIN'), 
    0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - 1'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\13.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.ImageView'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Set Up Later'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\14.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Set Up Later'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Verify Number'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Proceed'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\15.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Yes, Proceed'), 0)

not_run: WebUI.delay(20)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\16.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.ImageView'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.EditText - Enter your name'), 0)

not_run: Mobile.setText(findTestObject('Object Repository/MAE Onboarding/android.widget.EditText - Enter your name'), 'Mayesha', 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\17.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.hideKeyboard()

not_run: Mobile.getText(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\18.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Introducing Wallet'), 
    0)

not_run: Mobile.tap(findTestObject('MAE Onboarding/android.widget.TextView - Continue'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip (1)'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Skip (1)'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Set Up Successful'), 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\19.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Done'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Mayesha'), 0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\20.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Maybank2u'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Total Balance'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Savings Account-i'), 
    0)

not_run: Mobile.takeScreenshot('C:\\Users\\00123955\\git\\screenshot\\M2U\\21.png', FailureHandling.CONTINUE_ON_FAILURE)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Savings Account-i'), 0)

not_run: Mobile.getText(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Transfer'), 0)

not_run: Mobile.tap(findTestObject('Object Repository/MAE Onboarding/android.widget.TextView - Transfer'), 0)

Mobile.closeApplication()

