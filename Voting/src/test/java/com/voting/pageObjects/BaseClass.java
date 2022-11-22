package com.voting.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String urlCC = "https://www.customercontactcentral.com/mvp-awards/2022-CCC-MVP-AWARDS/coaching";
	public String urlCS = "https://www.customercontactcentral.com/mvp-awards/2022-CCC-MVP-AWARDS/customers";
	public String urlmailinator = "https://www.mailinator.com/v4/public/inboxes.jsp?to=red";
	
	// Credentials
    public String pass= "12345678";
	public String confirmPass="12345678";
	
	//Mails
   
	public String mail1 = "camp011@mailinator.com";
	public String mailinator1="camp011";
	public String FirstName1 = "pta";
	public String LastName1="ltd";
	
	public String mail2 = "camp021@mailinator.com";
	public String mailinator2="camp021";
	public String FirstName2 = "wer";
	public String LastName2="bcv";
	
	public String mail3 = "camp031@mailinator.com";
	public String mailinator3="camp031";
	public String FirstName3 = "asd";
	public String LastName3="cvb";
	
	public String mail4 = "camp041@mailinator.com";
	public String mailinator4="camp041";
	public String FirstName4 = "dfg";
	public String LastName4="vbc";
	
	public String mail5 = "camp051@mailinator.com";
	public String mailinator5="camp051";
	public String FirstName5 = "wet";
	public String LastName5="jhg";
	
	public String mail6 = "camp06@mailinator.com";
	public String mailinator6="camp06";
	
	public String mail7 = "camp07@mailinator.com";
	public String mailinator7="camp07";
	
	public String mail8 = "camp08@mailinator.com";
	public String mailinator8="camp08";
	
	public String mail9 = "camp09@mailinator.com";
	public String mailinator9="camp09";
	
	public String mail10 = "camp101@mailinator.com";
	public String mailinator10="camp101";
	
	public String mail11 = "camp111@mailinator.com";
	public String mailinator11="camp111";
	
	public String mail12 = "camp12@mailinator.com";
	public String mailinator12="camp12";
	
	public String mail13 = "camp13@mailinator.com";
	public String mailinator13="camp13";
	
	public String mail14 = "camp141@mailinator.com";
	public String mailinator14="camp141";
	
	public String mail15 = "camp15@mailinator.com";
	public String mailinator15="camp15";
	
	public String mail16 = "camp16@mailinator.com";
	public String mailinator16="camp16";
	
	public String mail17 = "camp17@mailinator.com";
	public String mailinator17="camp17";
	
	public String mail18 = "camp180@mailinator.com";
	public String mailinator18="camp180";
	
	public String mail19 = "camp191@mailinator.com";
	public String mailinator19 ="camp191";
	
	public String mail20 = "camp20@mailinator.com";
	public String mailinator20="camp20";
	
	public String mail21 = "camp21@mailinator.com";
	public String mailinator21="camp21";
	
	public String mail22 = "camp22@mailinator.com";
	public String mailinator22="camp22";
	
	public String mail23 = "camp23@mailinator.com";
	public String mailinator23="camp23";
	
	public String mail24 = "camp24@mailinator.com";
	public String mailinator24="camp24";
	
	public String mail25 = "camp25@mailinator.com";
	public String mailinator25="camp25";
	
	public String mail26 = "camp26@mailinator.com";
	public String mailinator26="camp26";
	
	public String mail27 = "camp27@mailinator.com";
	public String mailinator27="camp27";
	
	public String mail28 = "camp28@mailinator.com";
	public String mailinator28="camp28";
	
	public String mail29 = "camp29@mailinator.com";
	public String mailinator29="camp29";
	
	public String mail30 = "camp30@mailinator.com";
	public String mailinator30="camp30";
	
	public String mail31 = "camp31@mailinator.com";
	public String mailinator31="camp31";
	
	public String mail32 = "camp32@mailinator.com";
	public String mailinator32="camp32";
	
	public String mail33 = "camp33@mailinator.com";
	public String mailinator33="camp33";
	
	public String mail34 = "camp34@mailinator.com";
	public String mailinator34="camp34";
	
	public String mail35 = "camp35@mailinator.com";
	public String mailinator35="camp35";
	
	public String mail36 = "camp36@mailinator.com";
	public String mailinator36="camp36";
	
	public String mail37 = "camp37@mailinator.com";
	public String mailinator37="camp37";
	
	public String mail38 = "camp38@mailinator.com";
	public String mailinator38="camp38";
	
	public String mail39 = "camp39@mailinator.com";
	public String mailinator39="camp39";
	
	public String mail40 = "camp40@mailinator.com";
	public String mailinator40="camp40";
	
	public String mail41 = "camp41@mailinator.com";
	public String mailinator41="camp41";
	
	public String mail42 = "camp42@mailinator.com";
	public String mailinator42="camp42";
	
	public String mail43 = "camp43@mailinator.com";
	public String mailinator43="camp43";
	
	public String mail44 = "camp44@mailinator.com";
	public String mailinator44="camp44";
	
	public String mail45 = "camp451@mailinator.com";
	public String mailinator45="camp451";
	
	public String mail46 = "camp46@mailinator.com";
	public String mailinator46="camp46";
	
	public String mail47 = "camp47@mailinator.com";
	public String mailinator47="camp47";
	
	public String mail48 = "camp48@mailinator.com";
	public String mailinator48="camp48";
	
	public String mail49 = "camp49@mailinator.com";
	public String mailinator49="camp49";
	
	public String mail50 = "camp501@mailinator.com";
	public String mailinator50="camp501";
	
	
	
	
	
	

	
	
	
	
   public static WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smahalpure112191\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
