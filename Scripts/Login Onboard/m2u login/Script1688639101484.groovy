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

WebUI.openBrowser('')

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://172.31.11.35/cgi-bin/bvUIUX2/m2u/common/login.do')

WebUI.delay(15)

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/m2u login/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'), 
    'tunnel')

WebUI.click(findTestObject('Object Repository/m2u login/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'))

WebUI.takeScreenshot()

not_run: WebUI.click(findTestObject('Object Repository/m2u login/Page_Maybank2u  Maybank Malaysia/button_LOGIN'))

not_run: WebUI.click(findTestObject('Object Repository/m2u login/Page_Maybank2u  Maybank Malaysia/button_YES'))

not_run: WebUI.delay(15)

not_run: WebUI.takeScreenshot()

not_run: WebUI.closeBrowser()

