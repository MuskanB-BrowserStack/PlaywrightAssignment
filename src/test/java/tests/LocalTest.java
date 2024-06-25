package tests;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import runners.BstackRunner;

public class LocalTest extends BstackRunner {

	@Test
	void bstackSampleLocalTest() {
		try {
			/*page.navigate("http://bs-local.com:45454/");
			String validateContent = page.title();
			assertTrue(validateContent.contains("BrowserStack Local"), "Local content not validated!");*/
			/*page.navigate("https://www.google.com/");
			page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).click();
			page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).fill("bstackdemo");
			page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("StackDemo StackDemo https://")).click();
			page.getByRole(AriaRole.COMBOBOX).selectOption("lowestprice");
			page.locator("[id=\"\\31 9\"]").getByText("Add to cart").click();
			page.getByText("Checkout").click();*/
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
