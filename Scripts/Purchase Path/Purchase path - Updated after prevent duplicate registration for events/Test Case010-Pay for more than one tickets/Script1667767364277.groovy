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

WebUI.click(findTestObject('Event Page/Get Tickets and Info'))

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quanitiy for event'), '2', false)

WebUI.selectOptionByValue(findTestObject('Checkout Page/Select item Quantity for attendace list'), '1', false)

String Total = WebUI.getText(findTestObject('Checkout Page/Order Total in checkout page'))

WebUI.scrollToElement(findTestObject('Checkout Page/Your Information section'), 3)

WebUI.setText(findTestObject('Checkout Page/Card Number/Credit Card Number field'), '4111111111111111')

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

WebUI.sendKeys(findTestObject('Checkout Page/VAT TAX ID'), '123456')

WebUI.scrollToElement(findTestObject('Checkout Page/Name Tag Information'), 3)

dynamicemail = CustomKeywords.'defaultpackage.custome.randomString'('letters', 9)

WebUI.setText(findTestObject('Checkout Page/Email of attendee'), dynamicemail + '@ccn.com')

WebUI.click(findTestObject('Checkout Page/Company Arrow'))

WebUI.setText(findTestObject('Checkout Page/Company field Ticket 1'), 'Test', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(6)

WebUI.click(findTestObject('Checkout Page/first option in company'))

String companyfieldcheckoutpage = WebUI.getText(findTestObject('Checkout Page/first option in company'))

WebUI.sendKeys(findTestObject('Checkout Page/Industry Drop Down list'), 'Energy')

WebUI.sendKeys(findTestObject('Checkout Page/Job Title'), 'Chairman')

String Emailcheckoutpage = WebUI.getText(findTestObject('Checkout Page/Email value in Ticket 1/Email Ticket 1 in UK cases'))

WebUI.sendKeys(findTestObject('Checkout Page/Ticket 2/First Name'), 'Test')

WebUI.sendKeys(findTestObject('Checkout Page/Ticket 2/Last Name'), 'Ticket two')

WebUI.sendKeys(findTestObject('Checkout Page/Ticket 2/Cell Phone Ticket2'), '0787616754')

dynamicemail2 = CustomKeywords.'defaultpackage.custome.randomString'('letters', 9)

WebUI.setText(findTestObject('Checkout Page/Ticket 2/Email Ticket 2'), dynamicemail2 + '@ccn.com')

WebUI.click(findTestObject('Checkout Page/Ticket 2/Company Arrow Ticekt2'))

WebUI.setText(findTestObject('Checkout Page/Ticket 2/Company field Ticket2'), 'Bisnow')

WebUI.delay(6)

WebUI.click(findTestObject('Checkout Page/Ticket 2/Selected option in company Ticket2'))

WebUI.sendKeys(findTestObject('Checkout Page/Ticket 2/Industry Ticket2'), 'Security Company')

WebUI.sendKeys(findTestObject('Checkout Page/Ticket 2/Job Title Ticket2'), 'Chief Technology Officer')

WebUI.check(findTestObject('Checkout Page/Acknowledge Checkbox'))

WebUI.check(findTestObject('Checkout Page/Agree Button'))

WebUI.scrollToElement(findTestObject('Checkout Page/Complete Checkout button'), 3)

WebUI.click(findTestObject('Checkout Page/Complete Checkout button'))

WebUI.delay(5)

WebUI.verifyElementVisible(findTestObject('Checkout Page/SCA Challenge/SCA Pop-up'))

WebUI.switchToFrame(findTestObject('Checkout Page/SCA Challenge/Submit button/iframe_headhead  bodydivdivbody'), 3)

WebUI.sendKeys(findTestObject('Checkout Page/SCA Challenge/Code/ChallengeDataEntry Code'), '1234')

WebUI.click(findTestObject('Checkout Page/SCA Challenge/Submit button/Submit button'))

WebUI.switchToDefaultContent(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Checkout Page/Checkout Thank You Page/label any other topics you would'), 3)

WebUI.click(findTestObject('Checkout Page/Checkout Thank You Page/Skip, go to my receipt'))

String FinalTotal = WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Total in order summary page'))

WebUI.verifyEqual(Total, FinalTotal)

WebUI.scrollToElement(findTestObject('Checkout Page/Elements Order Summary Page/Scroll to elements Order summary'), 3)

WebUI.verifyElementPresent(findTestObject('Checkout Page/Elements Order Summary Page/Name Ticket1'), 3)

String companyfieldSummarypage = WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Company Ticket1'))

String Email1 = WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Email Ticket1'))

WebUI.verifyEqual(companyfieldcheckoutpage, companyfieldSummarypage)

String title = WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Title Ticket1'))

WebUI.verifyEqual('Chairman', title)

WebUI.verifyEqual(dynamicemail + '@ccn.com', Email1)

WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Name Ticket1'))

WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Name Ticket2'))

WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Email Ticket2'))

WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Title Ticket2'))

String Title2 = WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Title Ticket2'))

WebUI.verifyEqual('Chief Technology Officer', Title2)

WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Company Ticket2'))

String Company2 = WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Company Ticket2'))

WebUI.verifyEqual('Bisnow', Company2)

String Email2 = WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Email Ticket2'))

WebUI.verifyEqual(dynamicemail2 + '@ccn.com', Email2)

WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Order id'))

WebUI.getText(findTestObject('Checkout Page/Elements Order Summary Page/Quantity'))

