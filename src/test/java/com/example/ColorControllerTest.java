package com.example;

import com.example.client.api.MyCustomApi;
import com.example.client.model.Color;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class ColorControllerTest {

    @Inject
    MyCustomApi client;

    @Test
    void colors() {
        Color selectedColor = client.getSelectedColor();
        assertNull(selectedColor);

        client.selectColor("BLUE");

        Color selectedColorAfter = client.getSelectedColor();
        assertEquals(Color.BLUE, selectedColorAfter);
    }
}