package com.javaselenium.saucedemo.tests.login;

import org.testng.annotations.Test;
import org.testng.Assert;

import com.javaselenium.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginErrorMessage() {
		loginPage.setUsername("standard_user");
		loginPage.setPassword("xyz987");
		loginPage.clickLoginButton();
		String actualMessage = loginPage.getErrorMessage();
		Assert.assertTrue(
				actualMessage.contains("Epic sadface: Username and password do not match any user in this service"));

	}

}
