package learn.spring.di.sfgdi.controller;

import learn.spring.di.sfgdi.service.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new PrimaryGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println( controller.getGreeting());
    }
}