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

Mobile.startApplication('\\androidfile.apk', true)

Mobile.getText(findTestObject('Object Repository/Mobile - XE/android.widget.TextView - Convert'), 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Mobile - XE/android.widget.Button - currency_myr MYR custom icon-xe-chevron-down RM 130,000.00 custom icon-calculator'), 
    0)

WebUI.delay(5)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Mobile - XE/android.widget.TextView - Done'), 0)

Mobile.tap(findTestObject('Object Repository/Mobile - XE/android.widget.Button - custom icon-xe-tab-charts Charts'), 0)

WebUI.delay(5)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Mobile - XE/android.widget.Button - custom icon-xe-tab-send'), 0)

Mobile.takeScreenshot()

Mobile.closeApplication()

