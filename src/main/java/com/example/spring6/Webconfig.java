package com.example.spring6;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    //FormmatterRegistry는 ConverterRegistry를 상속 받고 있기때문에 사용 가능

    //Converter
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new EventConverter.StringToEventConverter());
//
//    }
    //Formatter
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addFormatter(new EventFormatter());
//
//    }
}
