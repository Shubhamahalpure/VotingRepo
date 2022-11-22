package com.voting.testCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import com.voting.pageObjects.BaseClass;
import com.voting.pageObjects.CCpage;

public class TC_010 extends BaseClass {
	
	@Test
	public void test() throws InterruptedException {
		driver.get(urlCC);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		CCpage cp = new CCpage(driver);

		// Select Article
		cp.clickOption();
		cp.enterEmail(mail10);
		cp.clickOnSignup();
		cp.clickOnSubmit();

		cp.enterFirstName(FirstName10);
		cp.enterLastName(LastName10);
		cp.enterPassword(pass);
		cp.enterConfirmPassword(confirmPass);
		cp.clickMovingOn();

		// switch to mailinator tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(urlmailinator);

		cp.clearMailinator();
		Thread.sleep(2000);
		cp.enterMailinator(mailinator10);
		cp.clickGoBtn();
		cp.openMail();

		// switch to frame
		driver.switchTo().frame("html_msg_body");
		cp.verifyMail();

		// Verify Email Address
		Set<String> window_ID = driver.getWindowHandles();

		for (String win_ID : window_ID) {
			String title = driver.switchTo().window(win_ID).getTitle();
			System.out.println(title);
			if (title.equals("Customer Contact Central")) {
				cp.verifyMailAddress();
				Thread.sleep(2000);
			}

		}

		// Select Article to Vote : Kaylene Eckels
		for (String win_ID : window_ID) {
			String title = driver.switchTo().window(win_ID).getTitle();
			if (title.equals("Coaching and Culture - 2022 Customer Contact Central MVP Awards")) {
				cp.clickClose();
				Thread.sleep(2000);

				cp.selectOption();
				Thread.sleep(2000);
			}

		}

		// Select Article to Vote : Jim Iyoob
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(urlCS);
		cp.selectKE();
		Thread.sleep(2000);

	}

}
