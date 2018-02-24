package com.example.superheropage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SuperHeroController {
    @RequestMapping("/superhero")
    public String greeting(Model model) {
        model.addAttribute("name", " cabbage man");
        model.addAttribute("power1", "supper cabbage");
        model.addAttribute("power2", "cabbage growth");
        model.addAttribute("power3", "red cabbage");
        model.addAttribute("fact1", "cabbage is an exellent source of vitamin K, C, and B6");
        model.addAttribute("fact2", "cabbage man is trying to lose weight");
        model.addAttribute("fact3", "cabbage man is nearsighted");

        return "hero"; //Return "hero" to tell spring to use the hero.html template
    }
}
