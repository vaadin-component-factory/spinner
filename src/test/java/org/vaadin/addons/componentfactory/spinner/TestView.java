package org.vaadin.addons.componentfactory.spinner;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.router.Route;

/**
 * Test View for our {@link Spinner} add-on class. This class and others in the
 * test folder will not be included in the final JAR.
 */
@Route("")
@CssImport("./styles.css")
public class TestView extends VerticalLayout implements AppShellConfigurator {

    public TestView() {
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        Spinner spinner = new Spinner();
        Button button = new Button("Spice", e -> {
            spinner.setSize("50px");
            spinner.setColor("red");
            spinner.setTooltipText("I am spinning");
        });
        add(spinner, button);
    }
}
