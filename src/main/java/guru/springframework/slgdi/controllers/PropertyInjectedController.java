package guru.springframework.slgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.slgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
    
}
