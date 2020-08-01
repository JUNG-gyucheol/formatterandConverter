package com.example.spring6;

import jdk.nashorn.internal.ir.CallNode;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    //서로 다른 쓰레드에 공유가 되기때문에 쓰레드세이프하지 않다.
    //bean으로 등록해서 사용하면 안된다.
    //회원 1번을 수정했는데 2번 회원의정보가 수정 될 수도 있다.
    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return super.getAsText();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
