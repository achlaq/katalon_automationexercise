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

WebUI.click(findTestObject('Object Repository/Add review on product/Page_Automation Exercise/a_Products'))

WebUI.click(findTestObject('Object Repository/Add review on product/Page_Automation Exercise - All Products/a_View Product'))

WebUI.setText(findTestObject('Object Repository/Add review on product/Page_Automation Exercise - Product Details/input_Write Your Review_name'), 
    'Ola')

WebUI.setText(findTestObject('Object Repository/Add review on product/Page_Automation Exercise - Product Details/input_Write Your Review_email'), 
    'ola@katalon.com')

WebUI.setText(findTestObject('Object Repository/Add review on product/Page_Automation Exercise - Product Details/textarea_Write Your Review_review'), 
    'testo')

WebUI.click(findTestObject('Object Repository/Add review on product/Page_Automation Exercise - Product Details/button_Submit'))

WebUI.verifyElementVisible(findTestObject('Add review on product/Page_Automation Exercise - Product Details/span_Thank you for your review'))

