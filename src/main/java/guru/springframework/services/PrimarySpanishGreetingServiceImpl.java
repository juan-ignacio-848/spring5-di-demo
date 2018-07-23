package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hola Gurus --- Servicio de saludo primario!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
