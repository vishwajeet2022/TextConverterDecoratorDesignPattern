package org.example;

public class BoldTextDecorator extends TextDecorator{
    BoldTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText(){
        return "<b> "+this.text.getText()+" <b>";
    }
}
