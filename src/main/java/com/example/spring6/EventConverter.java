package com.example.spring6;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.xml.transform.Source;

//컨버터와 포매터는 스프링부트에서 제공해주기때문에 자동으로 등록해준다.
public class EventConverter  {

//    @Component
    public  static  class StringToEventConverter implements Converter<String,Event> {
        @Override
        public Event convert(String s) {
            return new Event(Integer.parseInt(s));
        }
    }
//    @Component
    public  static  class EventToStringConverter implements Converter<Event,String>{
        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
