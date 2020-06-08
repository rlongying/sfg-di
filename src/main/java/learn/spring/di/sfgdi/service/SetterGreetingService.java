package learn.spring.di.sfgdi.service;

import org.springframework.stereotype.Controller;

@Controller
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world - Setter";
    }
}
