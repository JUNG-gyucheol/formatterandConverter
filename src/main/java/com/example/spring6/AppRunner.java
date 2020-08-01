package com.example.spring6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ConversionService conversionService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //WebConversionService는 스프링 부트가 제공해주는 것
        //등록 되있는포멧터 보는 방법
        System.out.println(conversionService);

        System.out.println(conversionService.getClass().toGenericString());
    }
}
