package org.vaadin.addons.componentfactory.spinner;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.testbench.TestBenchElement;

public class SpinnerIT extends AbstractViewTest {

    @Override
    public void setup() throws Exception {
        super.setup();

        // Hide dev mode gizmo, it would interfere screenshot tests
        $("vaadin-dev-tools").first().setProperty("hidden", true);
    }

    @Test
    public void smokeTest() {
        SpinnerElement spinner = $(SpinnerElement.class).first();
        Assert.assertEquals("", spinner.getAttribute("loading"));
        TestBenchElement div = spinner.$("div").id("loader");
        Assert.assertEquals("loader", div.getAttribute("part"));
    }

    @Test
    public void tooltipWorks() {
        $(ButtonElement.class).first().click();
        SpinnerElement spinner = $(SpinnerElement.class).first();
        Actions action = new Actions(getDriver());
        action.moveToElement(spinner).perform();
        waitForElementPresent(By.tagName("vaadin-tooltip-overlay"));
        TestBenchElement tooltip = $("vaadin-tooltip-overlay").first();
        Assert.assertEquals("Correct tooltip was not found", "I am spinning",
                tooltip.getText());
    }

}
