package org.vaadin.addons.componentfactory.spinner;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SpinnerTest {

    @Test
    public void tableSerializable() throws IOException {
        Spinner spinner = new Spinner();
        new ObjectOutputStream(new ByteArrayOutputStream())
                .writeObject(spinner);
    }
}
