package guru.springframework.slgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.slgdi.controllers.ConstructorInjectedController;
import guru.springframework.slgdi.services.ConstructorGreetingService;

public class ConstructorInjectedControllerTest {
    
    ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController( new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
