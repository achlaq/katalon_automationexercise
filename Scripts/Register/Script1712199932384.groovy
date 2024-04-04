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

WebUI.navigateToUrl('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/Register/Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 
    'Filbert Bojinov')

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 
    'filbert.bojinov@katalon.com')

WebUI.click(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input_Mr_title'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input__password'), 'tzH6RvlfSTg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '17', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'), 
    '2003', true)

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input__first_name'), 'Filbert')

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input__last_name'), 'Bojinov')

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input_Company_company'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 
    'Jalan jalan')

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'Singapore', true)

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input__state'), 'Singapore')

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input__city'), 'Singapore')

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input__zipcode'), '113030')

WebUI.setText(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/input__mobile_number'), '0838383838')

WebUI.click(findTestObject('Object Repository/Register/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.click(findTestObject('Object Repository/Register/Page_Automation Exercise - Account Created/a_Continue'))

WebUI.click(findTestObject('Object Repository/Register/Page_Automation Exercise - Account Created/path'))

