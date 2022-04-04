package org.example;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Magician {
    public static void main(String[] args) {
        /*try {
            new ByteBuddy().redefine(Cap.class)
                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!"))
                    .make().saveIn(new File("/Users/undefinedkosmos/IdeaProjects/manipulate-java-code/build/classes/java/main/"));

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        System.out.println("확인 :: " + new Cap().pullOut());
    }
}
