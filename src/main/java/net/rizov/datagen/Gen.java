package net.rizov.datagen;

public class Gen {

  public static String string() {
    return TextGenerator.string(9, 50);
  }

  public static String shortString() {
    return TextGenerator.string(1, 9);
  }

  public static String longString() {
    return TextGenerator.string(50, 500);
  }

  public static String name() {
    return Edit.capitalize(shortString());
  }

  public static String firstLastName() {
    return String.format("%s %s", name(), name());
  }

  public static String fullName() {
    return String.format("%s %s %s", name(), name(), name());
  }

  public static String sentence() {
    return Edit.toSentence(TextGenerator.text(5, 9));
  }

  public static String shortSentence() {
    return Edit.toSentence(TextGenerator.text(2, 5));
  }

  public static String lognSentence() {
    return Edit.toSentence(TextGenerator.text(9, 15));
  }

  public static String paragraph() {
    return TextGenerator.text(50, 70);
  }

  public static String shortParagraph() {
    return TextGenerator.text(15, 30);
  }

  public static String longParagraph() {
    return TextGenerator.text(100, 200);
  }

}
