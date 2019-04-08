package com.myform.webform.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class FormController {

    @RequestMapping({"", "/", "/index", "/index.html", "/webform", "/webform.html"})
    public String webForm(@RequestParam(name="name", required=false, defaultValue="Stranger") String name, Model model) {
        model.addAttribute("name", name);
        return "webform";
    }

}
