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

WebUI.click(findTestObject('Event Page/InPerson US event'))

WebUI.delay(3)

String Price1 = WebUI.getText(findTestObject('Event Page/Get Price 1/Event price first page - Get ticket Info page'))

WebUI.click(findTestObject('Checkout Page/Get Tickets and Info button on the first page'))

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quanitiy for event'), '1', false)

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quantity for attendace list'), '1', false)

WebUI.scrollToElement(findTestObject('Checkout Page/Your Information section'), 3)

WebUI.scrollToElement(findTestObject('Checkout Page/Name Tag Information'), 3)

WebUI.delay(6)

WebUI.check(findTestObject('Checkout Page/Acknowledge Checkbox'))

WebUI.click(findTestObject('Checkout Page/Agree Button'))

WebUI.click(findTestObject('Checkout Page/Complete Checkout button'))

WebUI.scrollToElement(findTestObject('Checkout Page/Your Information section'), 3)

WebUI.verifyElementText(findTestObject('Checkout Page/Erorr Messgae elements/Whoops'), 'Whoops! We ran into a few issues:')

WebUI.verifyElementText(findTestObject('Checkout Page/Erorr Messgae elements/Card number'), 'Card number is invalid')

WebUI.verifyElementText(findTestObject('Checkout Page/Erorr Messgae elements/Card Date'), 'Card is expired or date is invalid')

WebUI.verifyElementText(findTestObject('Checkout Page/Erorr Messgae elements/CVV'), 'Card CVV is invalid')

WebUI.verifyElementText(findTestObject('Checkout Page/Erorr Messgae elements/Postal code'), 'Postal code is invalid')

WebUI.verifyElementText(findTestObject('Checkout Page/Erorr Messgae elements/Country'), 'Country code is invalid')

