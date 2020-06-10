package learn.spring.di.sfgdi.config;

import learn.spring.di.sfgdi.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class LocalizationServiceConfig {
//    @Bean
//    LocalizaitonServiceFactory createLocalizationServiceFactory() {
//        return new LocalizaitonServiceFactory();
//    }

//    @Bean("i18nService")
//    @Profile({"default", "en"})
//    GreetingService createEnglishGreetingService(LocalizaitonServiceFactory factory) {
//        return factory.createGreetingService("en");
//    }
//
//    @Bean("i18nService")
//    @Profile("es")
//    GreetingService createSpanishGreetingService(LocalizaitonServiceFactory factory) {
//        return factory.createGreetingService("es");
//    }
//
//    @Bean("i18nService")
//    @Profile("zh")
//    GreetingService createChineseGreetingService(LocalizaitonServiceFactory factory) {
//        return factory.createGreetingService("zh");
//    }

    @Bean("i18nService")
    @Profile({"default", "en"})
    GreetingService createEnglishGreetingService() {
        return new I18nEnglishService();
    }

    @Bean("i18nService")
    @Profile("es")
    GreetingService createSpanishGreetingService() {
        return new I18nSpanishService();
    }

    @Bean("i18nService")
    @Profile("zh")
    GreetingService createChineseGreetingService() {
        return new I18nChineseService();
    }
}
