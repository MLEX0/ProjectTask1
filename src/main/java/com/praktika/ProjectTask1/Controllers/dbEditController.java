package com.praktika.ProjectTask1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class dbEditController {
    @GetMapping("/dbEdit")
    public String dbEdit (Model model) {
        model.addAttribute("title", "Редактирование БД");
        return "dbEdit";
    }
}
