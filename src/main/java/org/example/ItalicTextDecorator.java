package org.example;

public class ItalicTextDecorator extends TextDecorator{
    ItalicTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText(){
        return "<i> "+this.text.getText()+" <i>";
    }
}
