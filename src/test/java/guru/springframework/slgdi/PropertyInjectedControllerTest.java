package guru.springframework.slgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.slgdi.controllers.PropertyInjectedController;
import guru.springframework.slgdi.services.GreetingServiceImp;

class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {

		controller = new PropertyInjectedController();

		controller.greetingService = new GreetingServiceImp();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
