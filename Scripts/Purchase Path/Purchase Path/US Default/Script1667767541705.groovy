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

WebUI.setText(findTestObject('Login Page/Email Field'), 
    'ghostinspector@bisnow.com')

WebUI.setEncryptedText(findTestObject('Login Page/Password'), 
    '3GJ0VyD0NrYL0HVPw3wZK5ajrPlioJ91wZqDD4PXt8U=')

WebUI.click(findTestObject('Login Page/submit Login'))

WebUI.click(findTestObject('Event Page/Select US Event specific one'))

WebUI.delay(3)

WebUI.click(findTestObject('Checkout Page/Get Tickets and Info'))

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quanitiy for event'), '1', true)

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quantity for attendace list'), '1', true)

WebUI.scrollToElement(findTestObject('Checkout Page/Your Information section'), 3)

WebUI.setText(findTestObject('Checkout Page/Card Number/Credit Card Number field'),'4111111111111111') 

WebUI.sendKeys(findTestObject('Object Repository/Checkout Page/Expiration Date/Page_/div__expirationMonth'), 'December')

WebUI.sendKeys(findTestObject('Object Repository/Checkout Page/Expiration Date/Page_/div__expirationYear'), '2022')

WebUI.sendKeys(findTestObject('Checkout Page/input_CVV_cvv'), '111')

WebUI.sendKeys(findTestObject('Checkout Page/Postal Code text box'), '12345') 

WebUI.uncheck('Object Repository/First Case US Default/Save Card_checkmark')

WebUI.delay(3)

WebUI.verifyElementNotChecked(findTestObject('Checkout Page/Save Card_checkmark'),3)

WebUI.scrollToElement(findTestObject('Checkout Page/Name Tag Information'),3)

WebUI.sendKeys(findTestObject('Checkout Page/Company'),'Bisnow')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Checkout Page/Industry Drop Down list'),'Energy') 

WebUI.sendKeys(findTestObject('Checkout Page/Job Title'),'CEO')

WebUI.check(findTestObject('Checkout Page/Acknowledge Checkbox'))

WebUI.check(findTestObject('Checkout Page/Agree Button'))

WebUI.click(findTestObject('Checkout Page/Complete Checkout button'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Checkout Page/label any other topics you would'), 3)

WebUI.click(findTestObject('Checkout Page/Skip, go to my receipt')) 

