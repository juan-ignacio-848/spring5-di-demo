package guru.springframework;

import guru.springframework.controllers.MyController;
import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication //Component scan from THIS PACKAGE AND DOWN. => From guru.springframework and down
@ComponentScan(basePackages = {"guru.springframework.services", "guru.springframework"}) // We refactored packages so that services is out of guru.springframework scope. So we have to change the ComponentScan. This is a base it will search under those packages.
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(ctx.getBean(FakeDataSource.class).getUsername());
		System.out.println(ctx.getBean(FakeJmsBroker.class).getUsername());
	}
}
