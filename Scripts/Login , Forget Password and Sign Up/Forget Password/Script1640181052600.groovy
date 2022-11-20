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

WebUI.click(findTestObject('Object Repository/Forget Password/Page_Bisnow Commercial Real Estate News/a_Log In'))

WebUI.click(findTestObject('Object Repository/Forget Password/Page_Bisnow Commercial Real Estate News/a_Forgot your password'))

WebUI.click(findTestObject('Object Repository/Forget Password/Page_Bisnow Commercial Real Estate News/a_RECOVER'))

WebUI.setText(findTestObject('Object Repository/Forget Password/Page_Bisnow Commercial Real Estate News/input_CONTINUE_email'), 
    'dema22sammour@gmail.com')

WebUI.click(findTestObject('Object Repository/Forget Password/Page_Bisnow Commercial Real Estate News/a_RECOVER'))

WebUI.click(findTestObject('Object Repository/Forget Password/Page_Bisnow Commercial Real Estate News/div_Reset link has generated for the provid_7e4b62'))

WebUI.click(findTestObject('Object Repository/Forget Password/Page_Bisnow Commercial Real Estate News/a_x'))

