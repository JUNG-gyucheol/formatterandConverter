package com.example.spring6;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Formattable;
import java.util.Locale;

@Component
public class EventFormatter implements Formatter<Event> {

    //메세지리소스로도 가능
    @Override
    public Event parse(String s, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(s));
    }

    @Override
    public String print(Event event, Locale locale) {
        return event.getId().toString();
    }
}
