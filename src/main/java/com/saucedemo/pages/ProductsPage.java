package com.saucedemo.pages;

import org.openqa.selenium.By;

import com.base.BasePage;

public class ProductsPage extends BasePage {
	private By productsHeader = By.cssSelector("span.title");

	public boolean isProductsPageDisplayed() {
		return find(productsHeader).isDisplayed();
	}
}
