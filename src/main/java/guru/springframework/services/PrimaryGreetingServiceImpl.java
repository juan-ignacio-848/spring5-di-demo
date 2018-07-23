package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus --- Primary greeting service!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
