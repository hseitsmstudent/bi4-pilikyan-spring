package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by student on 4/6/17.
 */
@Controller
public class StartController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/")
    public ModelAndView start() {
        return new ModelAndView("start", "data", personRepository.findAll());
    }
}
