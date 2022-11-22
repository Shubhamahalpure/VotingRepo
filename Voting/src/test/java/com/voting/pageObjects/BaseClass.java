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

	public String mail1 = "ring100@mailinator.com";
	public String mailinator1="ring100";
	public String FirstName1 = "ann";
	public String LastName1="joy";
	
	public String mail2 = "ring21@mailinator.com";
	public String mailinator2="ring21";
	public String FirstName2 = "ammy";
	public String LastName2="hillson";
	
	public String mail3 = "ring031@mailinator.com";
	public String mailinator3="ring031";
	public String FirstName3 = "anthony";
	public String LastName3="hordy";
	
	public String mail4 = "ring041@mailinator.com";
	public String mailinator4="ring041";
	public String FirstName4 = "tom";
	public String LastName4="s";
	
	public String mail5 = "ring051@mailinator.com";
	public String mailinator5="ring051";
	public String FirstName5 = "aimy";
	public String LastName5="jo";
	
	public String mail6 = "ring06@mailinator.com";
	public String mailinator6="ring06";
	public String FirstName6 = "andy";
	public String LastName6="karl";
	
	public String mail7 = "ring07@mailinator.com";
	public String mailinator7="ring07";
	public String FirstName7 = "phillip";
	public String LastName7="h";

	public String mail8 = "ring08@mailinator.com";
	public String mailinator8="ring08";
	public String FirstName8 = "andru";
	public String LastName8="bint";
	
	public String mail9 = "ring091@mailinator.com";
	public String mailinator9="ring091";
	public String FirstName9 = "laura";
	public String LastName9="lily";
	
	public String mail10 = "ring101@mailinator.com";
	public String mailinator10="ring101";
	public String FirstName10 = "robin";
	public String LastName10="simson";
	
	public String mail11 = "ring123@mailinator.com";
	public String mailinator11="ring123";
	public String FirstName11 = "church";
	public String LastName11="will";
	
	public String mail12 = "ring12@mailinator.com";
	public String mailinator12="ring12";
	public String FirstName12 = "weignberg";
	public String LastName12="zod";
	
	public String mail13 = "ring13@mailinator.com";
	public String mailinator13="ring13";
	public String FirstName13 = "reilly";
	public String LastName13="halfman";
	
	public String mail14 = "ring141@mailinator.com";
	public String mailinator14="ring141";
	public String FirstName14 = "annalisa";
	public String LastName14="peter";
	
	public String mail15 = "ring15@mailinator.com";
	public String mailinator15="ring15";
	public String FirstName15 = "white";
	public String LastName15="j";
	
	public String mail16 = "ring16@mailinator.com";
	public String mailinator16="ring16";
	public String FirstName16 = "june";
	public String LastName16="thom";
	
	public String mail17 = "ring17@mailinator.com";
	public String mailinator17="ring17";
	public String FirstName17 = "elise";
	public String LastName17="b";
	
	public String mail18 = "ring180@mailinator.com";
	public String mailinator18="ring180";
	public String FirstName18 = "angel";
	public String LastName18="church";
	
	public String mail19 = "ring191@mailinator.com";
	public String mailinator19 ="ring191";
	public String FirstName19 = "quijano";
	public String LastName19="jo";
	
	public String mail20 = "ring20@mailinator.com";
	public String mailinator20="ring20";
	public String FirstName20 = "paris";
	public String LastName20="bell";
	
	public String mail21 = "ring211@mailinator.com";
	public String mailinator21="ring211";
	public String FirstName21 = "cuevas";
	public String LastName21="b";
	
	public String mail22 = "ring22@mailinator.com";
	public String mailinator22="ring22";
	public String FirstName22 = "braddy";
	public String LastName22="craft";
	
	public String mail23 = "ring231@mailinator.com";
	public String mailinator23="ring231";
	public String FirstName23 = "anthon";
	public String LastName23="marchello";
	
	public String mail24 = "ring24@mailinator.com";
	public String mailinator24="ring24";
	public String FirstName24 = "neilson";
	public String LastName24="milly";
	
	public String mail25 = "ring25@mailinator.com";
	public String mailinator25="ring25";
	public String FirstName25 = "april";
	public String LastName25="brown";
	
	
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
