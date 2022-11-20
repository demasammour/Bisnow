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
import com.kms.katalon.core.util.KeywordUtil


WebUI.openBrowser('')

WebUI.navigateToUrl('https://web.beta.bisnow.net/')

WebUI.maximizeWindow()

WebUI.mouseOver(findTestObject('Sign Up v2/Cities List'))

WebUI.click(findTestObject('Sign Up v2/Atlanta'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/a_Sign Up'))

String dynamicemail = CustomKeywords.'defaultpackage.custome.randomString'('letters', 9)

WebUI.setText(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/input_Email_emailSave'), 
    dynamicemail + '@cnn.com')

WebUI.click(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/a_CONTINUE'))

WebUI.setText(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/input_First Name_first_name'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/input_Last Name_last_name'), 
    'Test')

WebUI.setEncryptedText(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/input_Password_password'), 
    'C/Qzn8ORT1OwpiImlpOEPQ==')

WebUI.setText(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/input_Phone Number_phone'), 
    '22222222222')

WebUI.setText(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/input_Postal Code_zip'), 
    '12345')

WebUI.click(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/span_Type to search for your company'))

WebUI.setText(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/input_CONTINUE_select2-search__field'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/span_Type to search for your company'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/select_Select Title                        _6c5f8c'), 
    'General Manager', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/select_Select Industry                     _c746ee'), 
    'Technology / IT', true)

WebUI.sendKeys(findTestObject('Sign Up/Asset Classes'), 'Office')

WebUI.sendKeys(findTestObject('Sign Up/Asset Classes'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Sign Up v2/Checkbox Subscribe'), 'Subscribe to Atlanta Newsletters')

WebUI.click(findTestObject('Sign Up v2/Bisnow terms'))

WebUI.click(findTestObject('Object Repository/Checkout Page/Sign UP 2/Page_Bisnow Commercial Real Estate News/a_REGISTER'))

WebUI.mouseOver(findTestObject('Invoices/My Account-main menu'))

WebUI.click(findTestObject('Subscribtion/Subscribition submenu'))

WebUI.delay(6)

WebUI.scrollToElement(findTestObject('Subscribtion/Atanta Group/ATLANTA Group'), 3)

def list = WebUI.findWebElements(findTestObject('Object Repository/Subscribtion/Atanta Group/ATLANTA Group'),30)
def isChecked = false;
	for (item in list) {
		if ( item.isSelected()) {
			isChecked = true;
		};
	};
	if ( isChecked ) {
		KeywordUtil.markPassed("at least one is checked")
		} else {
			KeywordUtil.markFailed("Element is not present")
		}