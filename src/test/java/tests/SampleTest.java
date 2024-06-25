package tests;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import runners.BstackRunner;
import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.*;

import org.junit.jupiter.api.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.*;


@UsePlaywright
public class SampleTest extends BstackRunner {

    //@Test
    //void bstackSampleTest() {
        /*try {
            page.navigate("https://bstackdemo.com/");
            String product_name = page.locator("//*[@id='1']/p").textContent();
            page.locator("//*[@id='1']/div[4]").click();
            page.locator(".float\\-cart__content");
            String product_in_cart = page.locator("//*[@id='__next']/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]")
                    .textContent();
            assertEquals(product_in_cart, product_name);
        } */
        /*try{


            // Navigate to the website
            page.navigate("https://bstackdemo.com/");

            // Click on 'Sign In'
            page.click("text=Sign In");

            // Verify 'Select Username' is visible and click
            assertTrue(page.isVisible("text=Select Username"));
            page.click("text=Select Username");

            // Type username
            page.fill("#react-select-2-input", "fav_user");
            page.keyboard().press("Enter");

            // Click on 'Select Password'
            page.click("text=Select Password");

            // Type password
            page.fill("#react-select-3-input", "testingisfun99");
            page.keyboard().press("Enter");

            // Click login button
            page.click("#login-btn");

            // Select the first product
            assertTrue(page.isVisible("//*[@id='1']/div[4]"));
            page.click("//*[@id='1']/div[4]");

            // Click on 'Checkout'
            assertTrue(page.isVisible("text=Checkout"));
            page.click("text=Checkout");

            // Fill in the shipping information
            page.fill("#firstNameInput", "Varad");
            page.fill("#lastNameInput", "Prabhu");
            page.fill("#addressLine1Input", "Dadar");
            page.fill("#provinceInput", "Maharashtra");
            page.fill("#postCodeInput", "400028");

            // Continue checkout
            page.click("#checkout-shipping-continue");

            // Verify confirmation message
            assertEquals("Your Order has been successfully placed.", page.textContent("#confirmation-message"));
        }catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }*/
        @Test
        void test() {
            page.navigate("https://bstackdemo.com/");
            page.locator("[id=\"\\31 \"]").getByText("Add to cart").click();
            page.getByText("Checkout").click();
            page.getByText("Select Username").click();
            page.getByText("demouser", new Page.GetByTextOptions().setExact(true)).click();
            page.getByText("Select Password").click();
            page.getByText("testingisfun99", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Log In")).click();
            page.getByLabel("First Name").click();
            page.getByLabel("First Name").press("CapsLock");
            page.getByLabel("First Name").fill("Muskan");
            page.getByLabel("Last Name").click();
            page.getByLabel("Last Name").press("CapsLock");
            page.getByLabel("Last Name").fill("Bahrani");
            page.getByLabel("Address").click();
            page.getByLabel("Address").fill("101-b");
            page.getByLabel("State/Province").click();
            page.getByLabel("State/Province").fill("mh");
            page.getByLabel("Postal Code").click();
            page.getByLabel("Postal Code").fill("401");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
        }



    }

