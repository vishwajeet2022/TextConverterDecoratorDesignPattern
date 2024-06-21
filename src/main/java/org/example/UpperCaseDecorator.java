package org.example;

public class UpperCaseDecorator extends TextDecorator{
    UpperCaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText(){
        return "<U> "+this.text.getText()+" <U>";
    }
}
