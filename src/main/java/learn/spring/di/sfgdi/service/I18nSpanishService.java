package learn.spring.di.sfgdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class I18nSpanishService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
