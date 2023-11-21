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

WebUI.navigateToUrl('https://m2umobilesit.maybank.com.my/cgi-bin/bvAT4UI1/m2u/common/login.do')

not_run: WebUI.maximizeWindow()

WebUI.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Humanising Financial Services_username'), 
    'samuat05')

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_LOGIN'))

WebUI.getText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/p_Is your security phrasepass1234'))

WebUI.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_pass1234'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/button_YES'))

WebUI.setText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Hello_my-password-input'), 
    'Maybank@1')

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_LOGIN'))

WebUI.getText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.takeScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_x'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/div_TRANSFER'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/div_Own Accounts'))

not_run: WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/a_PAY  TRANSFER'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_Other Accounts ( Maybank and other banks )'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_ASNB Accounts_PayFromToContainer---pa_1bae3d'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/div_Maybank  Maybank Islamic'))

WebUI.setText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Account number_toAccount'), 
    '562366010792')

WebUI.setText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Transfer Amount_amount'), 
    '2.00')

not_run: WebUI.setText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Effective Date_form-control'), 
    '06/11/2023')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Effective Date_form-control'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Effective Date_form-control'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/label_Effective Date'))

WebUI.setText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/input_Recipient Reference_transferPurpose'), 
    'happy dipawali')

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_TRANSFER'))

WebUI.getText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/h6_Tap on the notification on your smartpho_593a44'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_REQUEST'))

WebUI.takeScreenshot()

WebUI.getText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_Transaction Successful'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/a_SAVE RECEIPT'))

WebUI.getText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_This receipt is computer generated and_52c908'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/img'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_Status'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/a_MY ACCOUNTS'))

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_562366010785'))

WebUI.rightClick(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/p_Available Balance'))

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/a_Terms  Conditions'), 
    0)

WebUI.delay(3)

not_run: WebUI.rightClick(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/button_VIEW STATEMENTS'))

not_run: WebUI.rightClick(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'))

WebUI.scrollToElement(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'), 
    0)

WebUI.takeScreenshot()

WebUI.getText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_LOGOUT'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.getText(findTestObject('Object Repository/showcaseNov2023/Page_Maybank2u  Maybank Malaysia/span_You have logged out'))

WebUI.takeScreenshot()

WebUI.closeBrowser()

