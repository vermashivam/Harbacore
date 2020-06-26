package com.example.demo.Service;

import com.example.demo.Model.FormElement;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class FormService {

    public Model addToModel(LinkedHashMap<String, ArrayList<String>> listLinkedHashMap, Model model){
        model.addAllAttributes(listLinkedHashMap.entrySet());
        return model;
    }

   /* public void formInfo(FormElement formElement,Model model){
        ArrayList<String> textLabel = formElement.getTextLabel();
        ArrayList<String> numberLabel = formElement.getNumberLabel();
        ArrayList< ArrayList<String> > checkboxLabel = formElement.getCheckboxLabel();
        ArrayList< ArrayList<String> > dropdownLabel = formElement.getDropdownLabel();


        if(!textLabel.isEmpty()) model.addAttribute("text", textLabel);
        if(!numberLabel.isEmpty()) model.addAttribute("number", numberLabel);
        if(!checkboxLabel.isEmpty()) model.addAttribute("checkbox", checkboxLabel);
        if(!dropdownLabel.isEmpty()) model.addAttribute("dropdown", dropdownLabel);



    }

    */
}
