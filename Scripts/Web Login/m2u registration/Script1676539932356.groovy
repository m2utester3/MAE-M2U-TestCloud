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

WebUI.click(findTestObject('Object Repository/m2u registration/Page_Maybank2u  Maybank Malaysia/span_REGISTER NOW'))

WebUI.getText(findTestObject('Object Repository/m2u registration/Page_Maybank2u  Maybank Malaysia/span_Ready to create an account'))

WebUI.setText(findTestObject('Object Repository/m2u registration/Page_Maybank2u  Maybank Malaysia/input_Card  Access Number_Registration---pa_a8d3dc'), 
    '11111111111111')

WebUI.setText(findTestObject('Object Repository/m2u registration/Page_Maybank2u  Maybank Malaysia/input_PIN_Registration---pair-input---2_o7S'), 
    '123456')

WebUI.click(findTestObject('Object Repository/m2u registration/Page_Maybank2u  Maybank Malaysia/img_PIN_Registration---radios---3V54f'))

WebUI.click(findTestObject('Object Repository/m2u registration/Page_Maybank2u  Maybank Malaysia/button_CONTINUE'))

WebUI.getText(findTestObject('Object Repository/m2u registration/Page_Maybank2u  Maybank Malaysia/span_Invalid Card Access Number'))

WebUI.closeBrowser()

