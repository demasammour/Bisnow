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

WebUI.navigateToUrl('https://web.beta.bisnow.net/events')

WebUI.click(findTestObject('Login Page/Log in Button from header'))

WebUI.setText(findTestObject('Login Page/Email Field'), GlobalVariable.Email)

WebUI.setEncryptedText(findTestObject('Login Page/Password'), 'C/Qzn8ORT1OwpiImlpOEPQ==')

WebUI.click(findTestObject('Login Page/submit Login'))

WebUI.scrollToElement(findTestObject('Event Page/All event'), 3)

WebUI.click(findTestObject('Event Page/InPerson EU event'))

WebUI.delay(3)

String Price1 = WebUI.getText(findTestObject('Event Page/Get Price 1/Event price first page - Get ticket Info page'))

WebUI.click(findTestObject('Event Page/Get Tickets and Info'))

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quanitiy for event'), '1', false)

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quantity for attendace list'), '1', false)

String Price2 = WebUI.getText(findTestObject('Checkout Page/Get Price 2/Event price in the Checkout page'))

WebUI.verifyEqual(Price1, Price2)

String Total = WebUI.getText(findTestObject('Checkout Page/Order Total in checkout page'))

WebUI.scrollToElement(findTestObject('Checkout Page/Your Information section'), 3)

WebUI.setText(findTestObject('Checkout Page/Card Number/Credit Card Number field'), '4000000000001091')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Checkout Page/Expiration Date/Page_/ifram_expirationMonth'), 3)

WebUI.focus(findTestObject('Checkout Page/Expiration Date/Page_/div__expirationMonth'))

WebUI.selectOptionByLabel(findTestObject('Checkout Page/Expiration Date/Page_/div__expirationMonth'), 'December', false)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Checkout Page/Expiration Date/Page_/ifram_expirationYear'), 3)

WebUI.focus(findTestObject('Checkout Page/Expiration Date/Page_/div__expirationYear'))

WebUI.selectOptionByLabel(findTestObject('Checkout Page/Expiration Date/Page_/div__expirationYear'), '2022', false)

WebUI.switchToDefaultContent()

WebUI.sendKeys(findTestObject('Object Repository/Checkout Page/CVV field/Page_/input_CVV_cvv'), '123')

WebUI.sendKeys(findTestObject('Checkout Page/Postal Code/input_Postal Code_postal-code'), '12345')

WebUI.sendKeys(findTestObject('Checkout Page/Country'), 'United States')

WebUI.click(findTestObject('Checkout Page/CheckBox'))

WebUI.sendKeys(findTestObject('Checkout Page/VAT TAX ID'), InvalidVATID)

WebUI.click(findTestObject('Checkout Page/Space beside the VAT ID Field'))

WebUI.verifyElementText(findTestObject('Checkout Page/Message of invalid VAT ID'), 'The VAT tax id is invalid')

WebUI.scrollToElement(findTestObject('Checkout Page/Name Tag Information'), 3)

WebUI.click(findTestObject('Checkout Page/Company Arrow'))

WebUI.setText(findTestObject('Checkout Page/Company field Ticket 1'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(6)

WebUI.click(findTestObject('Checkout Page/first option in company'))

String companyfieldcheckoutpage = WebUI.getText(findTestObject('Checkout Page/first option in company'))

WebUI.sendKeys(findTestObject('Checkout Page/Industry Drop Down list'), 'Energy')

WebUI.sendKeys(findTestObject('Checkout Page/Job Title'), 'Chairman')

String Emailcheckoutpage = WebUI.getText(findTestObject('Checkout Page/Email value in Ticket 1/Email Ticket 1 in UK cases'))

WebUI.check(findTestObject('Checkout Page/Acknowledge Checkbox'))

WebUI.check(findTestObject('Checkout Page/Agree Button'))

WebUI.click(findTestObject('Checkout Page/Complete Checkout button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checkout Page/Your Information section'), 3)

WebUI.verifyElementText(findTestObject('Checkout Page/VAT ID Instruction message after clicking on complete purchase button'), 
    'Valid VAT tax ID is required. If you\'re having issues with your tax ID or your tax ID was issued 2021 or after, please email customerservice@bisnow.com for assistance.')

