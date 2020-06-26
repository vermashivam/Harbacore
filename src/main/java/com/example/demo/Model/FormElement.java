package com.example.demo.Model;



import java.util.ArrayList;


public class FormElement {
    String type;
    String name;
    ArrayList<String> values;

    public FormElement() {
    }

    public FormElement(String type, String name, ArrayList<String> values) {
        this.type = type;
        this.name = name;
        this.values = values;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getValues() {
        return values;
    }

    public void setValues(ArrayList<String> values) {
        this.values = values;
    }
}
