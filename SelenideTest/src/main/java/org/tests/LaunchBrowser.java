package org.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;

public class LaunchBrowser {

	@Test
	public void LaunchbrowserTest() {
		Configuration.browser="firefox";
		open("https://www.google.com/");
		$(By.name("q")).setValue("Selenide");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		$$(By.cssSelector(".LC20lb.DKV0Md")).shouldHave(CollectionCondition.size(11));
	}
}
