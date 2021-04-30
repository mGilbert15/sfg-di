package guru.springframework.slgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.slgdi.controllers.ConstructorInjectedController;
import guru.springframework.slgdi.services.GreetingServiceImp;

public class ConstructorInjectedControllerTest {
    
    ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController( new GreetingServiceImp());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
