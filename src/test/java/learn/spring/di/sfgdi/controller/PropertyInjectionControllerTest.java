package learn.spring.di.sfgdi.controller;

import learn.spring.di.sfgdi.service.GreetingService;
import learn.spring.di.sfgdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {
    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService = new GreetingServiceImpl();

    }

    @Test
    void testGetGreetingReturnHelloWorld() {
        assertEquals("Hello world!", controller.getGreeting());
    }

}