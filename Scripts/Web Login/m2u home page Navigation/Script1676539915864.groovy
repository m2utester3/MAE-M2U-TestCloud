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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.maybank2u.com.my/home/m2u/common/login.do')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/m2u home page/Page_Maybank2u  Maybank Malaysia/a_BUSINESS'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('Object Repository/m2u home page/Page_Maybank2u Business  One Stop Digital S_523ae9/span_Login'), 
    'LOGIN')

WebUI.click(findTestObject('Object Repository/m2u home page/Page_Maybank2u Business  One Stop Digital S_523ae9/span_Login'))

WebUI.click(findTestObject('Object Repository/m2u home page/Page_Maybank2u.com Online Financial Services/button_close'))

WebUI.click(findTestObject('Object Repository/m2u home page/Page_Maybank2u.com Online Financial Services/input_Username_action'))

WebUI.getText(findTestObject('Object Repository/m2u home page/Page_Maybank2u.com Online Financial Services/span_Username is required'))

WebUI.verifyElementText(findTestObject('Object Repository/m2u home page/Page_Maybank2u.com Online Financial Services/span_Username is required'), 
    'Username is required.')

WebUI.closeBrowser()

