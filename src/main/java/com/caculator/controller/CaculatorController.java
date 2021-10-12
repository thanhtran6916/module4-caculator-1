package com.caculator.controller;

import com.caculator.model.Caculator;
import com.caculator.service.CaculatorService;
import com.caculator.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CaculatorController {

    @Autowired
    private IGeneralService caculatorService;

    @GetMapping("/")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("/index");
        Caculator caculator = new Caculator();
        modelAndView.addObject("caculator", caculator);
        return modelAndView;
    }

    @PostMapping("/caculator")
    public String caculator(@ModelAttribute("caculator") Caculator caculator, @RequestParam("cal") String cal, Model model) {
        double result = 0;
        CaculatorService caculatorService2 = (CaculatorService) caculatorService;
        caculatorService2.setCaculator(caculator);
        switch (cal) {
            case "+":
                result = caculatorService2.cong();
                break;
            case "-":
                result = caculatorService2.tru();
                break;
            case "*":
                result = caculatorService2.nhan();
                break;
            case "/":
                result = caculatorService2.chia();
                break;
        }
        model.addAttribute("result", Double.toString(result));
        return "/index";
    }

}
