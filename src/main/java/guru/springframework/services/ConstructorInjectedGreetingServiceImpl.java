package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus -- using constrcutor injected service!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
