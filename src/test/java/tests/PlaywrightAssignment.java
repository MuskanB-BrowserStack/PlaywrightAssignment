package tests;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.*;

import org.junit.jupiter.api.*;
import runners.BstackRunner;

public class PlaywrightAssignment extends BstackRunner {
    @Test
    void demoPlaywrightTest() {
        page.navigate("https://www.google.com/");
        page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).click();
        page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).fill("bstackdemo");
        page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("StackDemo StackDemo https://")).click();
        page.getByRole(AriaRole.COMBOBOX).selectOption("lowestprice");
        page.locator("[id=\"\\31 9\"]").getByText("Add to cart").click();
        page.getByText("Checkout").click();
    }
}
