package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * Created by jt on 5/24/17.
 */

// 1. Uncomment line 21 from DiDemoApplication.java
// 2. Run => No qualifying bean PropertyInjectedController.
// 3. Add @Controller annotation to mark it as a Spring component. That tells the Spring Framework to manage this class as a Spring Bean.
// 4. Run => NULL POINTER EXCEPTION in line 26
// 5. Missing @Autowire
@Controller
public class PropertyInjectedController {

    // PUBLIC -> BAD
    // GreetingServiceIMPL -> IMPLEMENTATION = BAD!
    // Property Injected -> BAD
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
