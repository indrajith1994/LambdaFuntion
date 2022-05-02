package org.tests;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;

public class GoogleTest {

	@Test
	public void googleTest() {
		open("https://www.google.com/");
		$(By.name("q")).setValue("Selenide");
		$(By.name("btnK")).click();
		$(By.id("logo")).shouldHave(Condition.appear);
		$$(By.cssSelector(".LC20lb.DKV0Md")).shouldHave(CollectionCondition.size(11));
	}
	
}
