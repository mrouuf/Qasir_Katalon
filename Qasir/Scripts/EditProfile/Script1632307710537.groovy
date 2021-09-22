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

WebUI.navigateToUrl('https://www.qasir.id/sign-in')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('sign_in_page/input__phonenumber'), '85894935298')

WebUI.setEncryptedText(findTestObject('sign_in_page/input_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('sign_in_page/btn-signin'))

WebUI.click(findTestObject('chose_outlet/btn_outlet_pusat'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('dashboard_page/btn_account'))

WebUI.click(findTestObject('dashboard_page/a_profil_pengguna'))

WebUI.waitForPageLoad(0)

WebUI.setText(findTestObject('profile_page/input_first_name'), 'muhamad edit')

WebUI.setText(findTestObject('profile_page/input_last_name'), 'last name edit')

WebUI.click(findTestObject('profile_page/button_Simpan'))

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

