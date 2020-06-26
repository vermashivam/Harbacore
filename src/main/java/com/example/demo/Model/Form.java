package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Form {
    @JsonProperty("formName")
    String formName;
    @JsonProperty("element")
    ArrayList<FormElement> elements;

    public Form() {
    }

    public Form(String formName, ArrayList<FormElement> elements) {
        this.formName = formName;
        this.elements = elements;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public ArrayList<FormElement> getElements() {
        return elements;
    }

    public void setElements(ArrayList<FormElement> elements) {
        this.elements = elements;
    }
}
