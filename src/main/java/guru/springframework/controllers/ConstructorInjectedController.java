package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
// 1. Uncomment line 23 from DiDemoApplication.java
// 2. Run => No qualifying bean ConstructorInjectedController.
// 3. Add @Controller annotation to mark it as a Spring component. That tells the Spring Framework to manage this class as a Spring Bean.
// 4. Run => OK! :)
// 5. Missing @Autowire? No! It's not necessary. We can add it optionally to express our intention of autowiring.
@Controller
public class ConstructorInjectedController {

    // PRIVATE -> GOOD
    // Interface instead of implementation -> GOOD
    // ConstructorInjectedController -> GOOD
    private GreetingService greetingService;

    // We use Qualifier because we have multiple implementations of GreetingService and Spring doesn't know which one to use.
    //@Autowired OPTIONAL
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
