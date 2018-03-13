package com.usa.students;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromDriverBrowser {
	
        public static void main(String[] args) {
		System. setProperty("webdriver.chrome.driver", "./DriverBrowser/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sony.com/");
		driver.manage().window().maximize(); 

	}

}
