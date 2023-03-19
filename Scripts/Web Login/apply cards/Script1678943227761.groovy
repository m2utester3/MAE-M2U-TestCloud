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

WebUI.navigateToUrl('https://www.maybank2u.com.my/home/m2u/common/login.do')

WebUI.click(findTestObject('Object Repository/apply cards/Page_Maybank2u  Maybank Malaysia/span_Maybank Cards'))

WebUI.click(findTestObject('Object Repository/apply cards/Page_Maybank Cards  Maybank Malaysia/button_Discover'))

WebUI.click(findTestObject('Object Repository/apply cards/Page_Maybank Cards  Maybank Malaysia/button_Find The Right Card'))

WebUI.click(findTestObject('Object Repository/apply cards/Page_Credit Cards  Maybank Malaysia/button_RESUME APPLICATION'))

WebUI.click(findTestObject('Object Repository/apply cards/Page_Maybank2u  Maybank Malaysia/button_RESUME'))

WebUI.getText(findTestObject('Object Repository/apply cards/Page_Maybank2u  Maybank Malaysia/span_We are sorry, There are no records to _1bb556'))

WebUI.closeBrowser()

