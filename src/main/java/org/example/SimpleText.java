package org.example;

public class SimpleText implements Text{
    private final String text;

    SimpleText(String text){
        this.text=text;
    }
    @Override
    public String getText() {
        return text;
    }
}
