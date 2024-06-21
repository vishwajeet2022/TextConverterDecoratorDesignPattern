package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Text normalText=new SimpleText("Vishwajeet");

        TextDecorator boldText=new BoldTextDecorator(normalText);
        System.out.println("Converted to Bold :- "+boldText.getText());

        TextDecorator italicText=new ItalicTextDecorator(normalText);
        System.out.println("Converted to Italic :- "+italicText.getText());

        TextDecorator upperCase=new UpperCaseDecorator(normalText);
        System.out.println("Converted to UpperCase :- "+upperCase.getText());

        TextDecorator lowerCase=new LowerCaseDecorator(normalText);
        System.out.println("Converted to Lower :- "+lowerCase.getText());
    }
}