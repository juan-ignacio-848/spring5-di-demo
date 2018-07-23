package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 5/24/17.
 */
// 1. Uncomment line 22 from DiDemoApplication.java
// 2. Run => No qualifying bean SetterInjectedController.
// 3. Add @Controller annotation to mark it as a Spring component. That tells the Spring Framework to manage this class as a Spring Bean.
// 4. Run => NULL POINTER EXCEPTION in line 23
// 5. Missing @Autowire
@Controller
public class SetterInjectedController {
    // PRIVATE -> GOOD
    // Interface instead of implementation -> GOOD
    // Setter Injected Controller -> Not so good. (See SetterInjectedControllerTest)
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(@Qualifier("setterInjectedGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
