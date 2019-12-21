package com.medium.java13;

/**
 * @author ragcrix
 */
public class TextBlocks {

    /**
     * JEP 355: Preview Feature
     */
    @SuppressWarnings("preview")
    public static void main(String[] args) {
        String textBlock = """
				Hello
				Java13
				New Feature""";

        String str = "Hello\nJava13\nNew Feature";

        System.out.println("Text Block String:\n" + textBlock);
        System.out.println("Normal String:\n" + str);

        System.out.println("Text Block and String Literal equals() Comparison: " + (textBlock.equals(str)));
        System.out.println("Text Block and String Literal == Comparison: " + (textBlock == str));
    }

}