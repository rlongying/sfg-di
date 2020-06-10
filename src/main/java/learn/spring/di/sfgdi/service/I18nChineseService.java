package learn.spring.di.sfgdi.service;

public class I18nChineseService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "你好， 世界 -- 中文";
    }
}
