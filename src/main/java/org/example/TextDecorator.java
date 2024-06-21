package org.example;



public abstract class TextDecorator implements Text {
    protected Text text;

    TextDecorator(Text text){
        this.text=text;
    }

    @Override
    public String getText(){
        return this.text.getText();
    }
}
