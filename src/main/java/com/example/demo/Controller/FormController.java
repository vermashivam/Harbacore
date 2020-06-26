package com.example.demo.Controller;

import com.example.demo.Model.Form;
import com.example.demo.Model.FormData;
import com.example.demo.Service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class FormController {

    @Autowired
    FormService formService;

    @PostMapping("/printform")
    public String toPrint(@RequestBody Form form, Model model){
        System.out.println(form.getFormName());
        System.out.println(form.getElements());
        model.addAttribute("elements",form.getElements());
        model.addAttribute("formData" , new FormData());
        return "printForm";
    }

    @PostMapping("/formData")
    public void formData (@ModelAttribute FormData formData){

        System.out.println(formData);
        System.out.println(formData.getName());
        System.out.println(formData.getOption());

    }
}
