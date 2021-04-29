package guru.springframework.slgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.slgdi.controllers.MyController;

@SpringBootApplication
public class SlgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SlgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
