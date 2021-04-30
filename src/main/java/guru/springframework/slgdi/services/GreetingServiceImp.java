package guru.springframework.slgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImp implements GreetingService {

    @Override
    public String sayGreeting() {
        
        return "Hello World";
    }
    
}
