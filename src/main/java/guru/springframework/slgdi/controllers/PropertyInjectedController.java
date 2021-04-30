package guru.springframework.slgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.slgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
    
}
