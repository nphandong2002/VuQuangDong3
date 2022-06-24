package com.example.vuquangdong.Controller;

import com.example.vuquangdong.Entity.EmployeesEntity;
import com.example.vuquangdong.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller

public class WebController {
    @Autowired
    EmployeesService employeesService;

    @GetMapping({"/","/index"})
    public String index(Model model) {
        List<EmployeesEntity> employess = employeesService.findAllEmployees();
        model.addAttribute("employess", employess);
        return "index";
    }
    @PostMapping("/create")
    public String createemployess(Model model, @RequestParam Map<String, String> param) {
        System.out.println(param);
        String name = param.get("name");
        String wage = param.get("wage");

        EmployeesEntity e = new EmployeesEntity(name, Integer.valueOf(wage));
        employeesService.createEmployee(e);
        return "redirect:/index";
    }
}
