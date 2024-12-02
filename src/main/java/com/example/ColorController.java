package com.example;

import com.example.api.MyCustomApi;

import com.example.model.Color;
import io.micronaut.http.annotation.Controller;

@Controller
public class ColorController implements MyCustomApi {

    Color color = null;

    @Override
    public Color getSelectedColor() {
        return color;
    }

    @Override
    public void selectColor(String body) {
        color = Color.valueOf(body);
    }
}
