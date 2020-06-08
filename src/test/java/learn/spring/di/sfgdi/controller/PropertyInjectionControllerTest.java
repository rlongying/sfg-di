package learn.spring.di.sfgdi.controller;

import learn.spring.di.sfgdi.service.PrimaryGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectionControllerTest {
    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        controller.greetingService = new PrimaryGreetingService();

    }

    @Test
    void testGetGreetingReturnHelloWorld() {
        assertEquals("Hello world!", controller.getGreeting());
    }

}