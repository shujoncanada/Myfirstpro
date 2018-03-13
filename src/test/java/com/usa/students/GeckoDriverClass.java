package com.usa.students;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class GeckoDriverClass {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "./DriverBrowser/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.samsung.com/");
		driver.manage().window().maximize();}}
