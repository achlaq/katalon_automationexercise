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

WebUI.click(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 
    'Filbert Bojinov')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/input_Card Number_card_number'), 
    '8373738383')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/input_CVC_cvc'), '211')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/input_Expiration_expiry_month'), 
    '08')

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/input_Expiration_expiry_year'), 
    '2000')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/input_Expiration_expiry_year'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/input_Expiration_expiry_year'), 
    '2030')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Automation Exercise - Payment/button_Pay and Confirm Order'))

