package org.example;

public class LowerCaseDecorator extends TextDecorator{
    LowerCaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText(){
        return "<l> "+this.text.getText()+" <l>";
    }
}
