package learn.spring.di.sfgdi.controller;

import learn.spring.di.sfgdi.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hello World!");
        return "Hi Folks!";
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
