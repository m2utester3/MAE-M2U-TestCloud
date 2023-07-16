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

Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Proceed'), 0)

Mobile.tap(findTestObject('cloud device PIN registration/android.widget.TextView - Proceed'), 0)

WebUI.delay(3)

Mobile.swipe(550, 2000, 550, 1450)

Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Lock screen'), 
    0)

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

Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Set PIN'), 0)

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

Mobile.getText(findTestObject('Object Repository/cloud device PIN registration/android.widget.TextView - Set PIN'), 0)

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

Mobile.takeScreenshot()

Mobile.getText(findTestObject('cloud device PIN registration/android.widget.TextView - Activate Now'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('cloud device PIN registration/android.widget.TextView - Activate Now'), 0)

