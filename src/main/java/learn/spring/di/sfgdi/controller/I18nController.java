package learn.spring.di.sfgdi.controller;

import learn.spring.di.sfgdi.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    /**
     * the service injected will be determined by the activated profile
     * see example of activation in 'application.properties'
     * @param greetingService
     */
    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return greetingService.sayGreeting();
    }
}
