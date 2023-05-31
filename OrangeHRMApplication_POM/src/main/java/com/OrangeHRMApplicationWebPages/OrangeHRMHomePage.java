package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.BaseTest.BaseTest;
import com.Utility.Log;

import io.reactivex.rxjava3.functions.Action;

public class OrangeHRMHomePage extends OrangeHRMLogInPage{
	
	
	
	public OrangeHRMHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"menu_admin_viewAdminModule\"]/b")
	WebElement orangeHRMHomePageAdmin;
	
	@FindBy(id =  "menu_pim_viewPimModule")
	WebElement orangeHRMHomePagePIM;
	
	@FindBy(xpath = "//*[@id=\"menu_leave_viewLeaveModule\"]/b")
	WebElement orangeHRMHomePageLeave;
	
	@FindBy(xpath = "//*[@id=\"menu_time_viewTimeModule\"]/b")
	WebElement orangeHRMHomePageTime;
	
	@FindBy(xpath = "//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")
	WebElement orangeHRMHomePageRecruitment;
	
	@FindBy(xpath = "//*[@id=\"menu__Performance\"]/b")
	WebElement orangeHRMHomePagePerformance;
	
	@FindBy(xpath = "//*[@id=\"menu_dashboard_index\"]/b")
	WebElement orangeHRMHomePageDashboard;
	
	@FindBy(xpath = "//*[@id=\"menu_directory_viewDirectory\"]/b")
	WebElement orangeHRMHomePageDirectory;
	
	@FindBy(xpath = "//*[@id=\"menu_maintenance_purgeEmployee\"]/b")
	WebElement orangeHRMHomePageMaintenance;
	
	
	public void validatingHomePageAdminText() throws InterruptedException
	{
		String actual_OrangeHRMHomePageAdminText=orangeHRMHomePageAdmin.getText();
		Log.info("The Actual Text Of The OrangeHRM Application Home Page Admin is:- "+actual_OrangeHRMHomePageAdminText);
		
		String expected_OrangeHRMHomePageAdminText="Admin";
		Log.info("The Expected Text Of The OrangeHRM Application Home Page Admin is:- "+expected_OrangeHRMHomePageAdminText);
		
		Assert.assertEquals(actual_OrangeHRMHomePageAdminText, expected_OrangeHRMHomePageAdminText, "The Text Of The Admin is Not Matched:-FAIL");
		Log.info("The Text Of The OrangeHRMApplication Home Page Admin is Matched:-PASS");
		
		Actions adminAction=new Actions(driver);
		adminAction.moveToElement(orangeHRMHomePageAdmin).build().perform();
		
		//Thread.sleep(5000);
	}
	
	public void validatingHomePagePIMText()
	{
		
		String actual_OrangeHRMHomePagePIMText=orangeHRMHomePagePIM.getText();
		Log.info("The Actual Text Of The OrangeHRM Application Home Page PIM is:- "+actual_OrangeHRMHomePagePIMText);
		
		String expected_OrangeHRMHomePagePIMText="PIM";
		Log.info("The Expected Text Of The OrangeHRM Application Home Page PIM is:- "+expected_OrangeHRMHomePagePIMText);
		
		Assert.assertEquals(actual_OrangeHRMHomePagePIMText, expected_OrangeHRMHomePagePIMText, "The Text Of The PIM is Not Matched:-FAIL");
		Log.info("The Text Of The OrangeHRMApplication Home Page PIM is  Matched:-PASS");
		
		Actions pimAction=new Actions(driver);
		pimAction.moveToElement(orangeHRMHomePagePIM).build().perform();
		
	}
	
	public void validatingHomePageLeaveText()
	{
		String actual_OrangeHRMHomePageLeaveText=orangeHRMHomePageLeave.getText();
		Log.info("The Actual Text Of The OrangeHRM Application Home Page Leave is:- "+actual_OrangeHRMHomePageLeaveText);
		
		String expected_OrangeHRMHomePageLeaveText="Leave";
		Log.info("The Expected Text Of The OrangeHRM Application Home Page Leave is:- "+expected_OrangeHRMHomePageLeaveText);
		
		Assert.assertEquals(actual_OrangeHRMHomePageLeaveText, expected_OrangeHRMHomePageLeaveText, "The Text Of The Leave is Not Matched:-FAIL");
		Log.info("The Text Of The OrangeHRMApplication Home Page Leave is  Matched:-PASS");
		
		Actions leaveAction=new Actions(driver);
		leaveAction.moveToElement(orangeHRMHomePageLeave).build().perform();
		
	}
	
	public void validatingHomePageTimeText()
	{
		
		String actual_OrangeHRMHomePageTimeText=orangeHRMHomePageTime.getText();
        Log.info("The Actual Text Of The OrangeHRM Application Home Page Time is:- "+actual_OrangeHRMHomePageTimeText);
		
		String expected_OrangeHRMHomePageTimeText="Time";
		Log.info("The Expected Text Of The OrangeHRM Application Home Page time is:- "+expected_OrangeHRMHomePageTimeText);
		
		Assert.assertEquals(actual_OrangeHRMHomePageTimeText, expected_OrangeHRMHomePageTimeText, "The Text Of The Time is Not Matched:-FAIL");
		Log.info("The Text Of The OrangeHRMApplication Home Page Time is  Matched:-PASS");
		
		Actions timeAction=new Actions(driver);
		timeAction.moveToElement(orangeHRMHomePageTime).build().perform();
		
	}
}
