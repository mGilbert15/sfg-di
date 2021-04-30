package guru.springframework.slgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.slgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
    
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
