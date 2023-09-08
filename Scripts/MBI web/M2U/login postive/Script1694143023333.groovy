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

//not_run: WebUI.callTestCase(findTestCase('MBI web/M2U/login negative'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/MBI M2U team/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'), 
    'mosajgohar1')

WebUI.click(findTestObject('Object Repository/MBI M2U team/Page_Maybank2u  Maybank Malaysia/span_LOGIN'))

WebUI.click(findTestObject('Object Repository/MBI M2U team/Page_Maybank2u  Maybank Malaysia/button_YES'))

WebUI.setEncryptedText(findTestObject('MAE PROD/spy2/Page_Maybank2u  Maybank Malaysia/input_Hello_my-password-input'), 'Mayesha@19')

WebUI.click(findTestObject('Object Repository/MBI M2U team/Page_Maybank2u  Maybank Malaysia/span_LOGIN'))

WebUI.click(findTestObject('Object Repository/MBI M2U team/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'))

b = WebUI.getText(findTestObject('Object Repository/MBI M2U team/Page_Maybank2u  Maybank Malaysia/span_You do not have any activities for today'))

WebUI.verifyEqual('You do not have any activities for today.', b)

not_run: WebUI.closeBrowser()

