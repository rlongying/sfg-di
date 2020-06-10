package learn.spring.di.sfgdi.service;

import org.springframework.stereotype.Component;

public class LocalizaitonServiceFactory {

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new I18nEnglishService();
            case "es":
                return new I18nSpanishService();
            case "zh":
                return new I18nChineseService();
            default:
                return new PrimaryGreetingService();
        }
    }
}
