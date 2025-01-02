package com.javaselenium.saucedemo.tests.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.javaselenium.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;

public class ProductsTest extends BaseTest {

	@Test
	public void testProductsHeaderIsDisplayed() {
		ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");

		Assert.assertTrue(productsPage.isProductsPageDisplayed(), "Products header is not displayed");

	}

}
