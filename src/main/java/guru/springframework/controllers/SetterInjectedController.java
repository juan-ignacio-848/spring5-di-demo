package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;

/**
 * Created by jt on 5/24/17.
 */
public class SetterInjectedController {
    // PRIVATE -> GOOD
    // Interface instead of implementation -> GOOD
    // Setter Injected Controller -> Not so good. (See SetterInjectedControllerTest)
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
