package guru.springframework.slgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.slgdi.controllers.SetterInjectedController;
import guru.springframework.slgdi.services.GreetingServiceImp;

class SetterInjectedControllerTest {

	SetterInjectedController controller;

	@BeforeEach
	void setUp() {

		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImp());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
