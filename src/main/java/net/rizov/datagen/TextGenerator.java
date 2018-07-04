package net.rizov.datagen;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class TextGenerator {

  private static final String AB = "abcdefghijklmnopqrstuvwxyz";

  private static Random random = new Random();

  public static String string(int length) {
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append(AB.charAt(random.nextInt(AB.length())));
    }
    return sb.toString();
  }

  public static String string(int minLength, int maxLength) {
    return string(minLength + random.nextInt(maxLength - minLength));
  }

  public static String text(int words) {
    return Stream.generate(Gen::shortString)
        .limit(words)
        .collect(Collectors.joining(" "));
  }

  public static String text(int minWords, int maxWords) {
    return text(minWords + random.nextInt(maxWords - minWords));
  }

}
