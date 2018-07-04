package net.rizov.datagen.example;

import java.util.stream.Stream;
import net.rizov.datagen.Gen;

public class NameList {

  public static void main(String[] args) {
    System.out.println("First names:\n");
    Stream.generate(Gen::name)
        .limit(10).forEach(System.out::println);
    System.out.println("\nFirst and last names:\n");
    Stream.generate(Gen::firstLastName)
        .limit(10).forEach(System.out::println);
    System.out.println("\nFull names:\n");
    Stream.generate(Gen::fullName)
        .limit(10).forEach(System.out::println);
  }

}
