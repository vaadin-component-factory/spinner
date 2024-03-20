package org.vaadin.addons.componentfactory.spinner;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.shared.HasTooltip;

@SuppressWarnings("serial")
@JsModule("./src/vcf-spinner.ts")
@Tag("vcf-spinner")
public class Spinner extends Component implements HasTooltip {

    public Spinner() {
        setLoading(true);
    }

    /**
     * Set size, the default is Lumo small icon size
     *
     * @param size
     *            CSS size definition as a string
     */
    public void setSize(String size) {
        getElement().getStyle().set("--lumo-icon-size-s", size);
    }

    /**
     * Set color (default is Lumo primary color)
     *
     * @param color
     *            CSS color definition as a string
     */
    public void setColor(String color) {
        getElement().getStyle().set("--lumo-primary-color", color);
    }

    /**
     * Toggle loading animation on/off
     *
     * @param spinning
     *            boolean value
     */
    public void setLoading(boolean spinning) {
        if (spinning) {
            getElement().setAttribute("loading", "");
        } else {
            getElement().removeAttribute("loading");
        }
    }
}
