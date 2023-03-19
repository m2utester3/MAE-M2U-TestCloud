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

WebUI.setText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'), 
    findTestData('DevOps').getValue(1, 1))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/button_YES'))

WebUI.setText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/input_Hello_my-password-input'), 
    findTestData('DevOps').getValue(2, 1))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_LOGIN'))

WebUI.delay(4)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/a_MY ACCOUNTS'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_x'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_Own Accounts'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_Other Accounts ( Maybank and other banks )'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_Maybank  Maybank Islamic'))

WebUI.setText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/input_Account number_toAccount'), 
    '164017298921')

WebUI.setText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/input_Transfer Amount_amount'), 
    '0.1')

WebUI.setText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transferPurpose'), 
    'DevOps test')

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/p_Money withdrawn from your insured deposit_747020'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_TRANSFER'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/h6_Tap on the notification on your smartpho_593a44'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_REQUEST'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_REQUEST'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/h4_Check your Secure2u registered device an_fd105e'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_StatusSuccessful'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_Successful'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_Transaction Successful'))

WebUI.verifyElementText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_Transaction Successful'), 
    'Transaction Successful!')

WebUI.takeScreenshot()

WebUI.scrollToPosition(1300, 40)

WebUI.verifyElementVisible(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/a_MY ACCOUNTS'))

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_ACCOUNTS'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'), 0)

WebUI.click(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/th_ACTIVITY DETAILS'))

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_You have logged out'))

WebUI.verifyElementText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/span_You have logged out'), 
    'You have logged out!')

WebUI.getText(findTestObject('Object Repository/Web Login/Page_Maybank2u  Maybank Malaysia/div_Transfer from   Savings Account-i 16401_e08176'))

WebUI.delay(3)

WebUI.closeBrowser()

