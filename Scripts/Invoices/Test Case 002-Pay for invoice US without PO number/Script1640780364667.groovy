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

WebUI.navigateToUrl('https://web.beta.bisnow.net/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Invoices/Log In - Header'))

WebUI.setText(findTestObject('Invoices/input_Email'), 'sammouraspire@gmail.com')

WebUI.setEncryptedText(findTestObject('Invoices/input_Password'), 'C/Qzn8ORT1OwpiImlpOEPQ==')

WebUI.click(findTestObject('Invoices/LOGIN -button'))

WebUI.mouseOver(findTestObject('Invoices/My Account-main menu'))

WebUI.click(findTestObject('Invoices/a_Invoices'))

WebUI.click(findTestObject('Invoices/Pay for an invoice link'))

WebUI.sendKeys(findTestObject('Invoices/Invoice Number'), '55555')

WebUI.sendKeys(findTestObject('Invoices/Payment amount'), '50')

WebUI.selectOptionByIndex(findTestObject('Invoices/Select Currency'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToFrame(findTestObject('Invoices/Card information frame'), 2)

WebUI.sendKeys(findTestObject('Invoices/card number field'), '4111 1111 1111 1111')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Invoices/Month Iframe'), 3)

WebUI.click(findTestObject('Invoices/Month'))

WebUI.selectOptionByIndex(findTestObject('Invoices/Month'), 12)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Invoices/year iframe'), 3)

WebUI.selectOptionByValue(findTestObject('Invoices/Year'), '2022', true)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Invoices/CVV iframe'), 3)

WebUI.sendKeys(findTestObject('Invoices/CVV'), '111')

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('Invoices/Postal code iframe'), 3)

WebUI.sendKeys(findTestObject('Invoices/Postal Code'), '12345')

WebUI.switchToDefaultContent()

WebUI.selectOptionByIndex(findTestObject('Invoices/Country Code'), 7)

WebUI.uncheck(findTestObject('Invoices/Save card checkbox'))

WebUI.check(findTestObject('Invoices/Recaptcha'))

