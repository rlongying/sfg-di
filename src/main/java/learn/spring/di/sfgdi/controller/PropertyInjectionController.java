package learn.spring.di.sfgdi.controller;

import learn.spring.di.sfgdi.service.GreetingService;

public class PropertyInjectionController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
