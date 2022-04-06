package org.example;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        // 클래스 인스턴스 접근 방법
        // 1
        Class<Book> bookClass = Book.class;

        // 2
        Book book = new Book();
        // Class<? extends Book> aClass = book.getClass();

        // 3
        // Class<?> aClass1 = Class.forName("me.example.Book");

        Arrays.stream(bookClass.getFields()).forEach(System.out::println); // public 만 보여줌
        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println); // 모든 필드 출력
        // 필드 및 필드정보 가져오기
        Arrays.stream(bookClass.getDeclaredFields()).forEach(f -> {
            try {
                f.setAccessible(true); // 접근제어자 무시
                System.out.printf("%s %s \n", f, f.get(book));

                int modifiers = f.getModifiers();
                System.out.println(f);
                System.out.println(Modifier.isPrivate(modifiers));
                System.out.println(Modifier.isStatic(modifiers));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        // 메서드 가져오기
        Arrays.stream(bookClass.getMethods()).forEach(m -> {
            int modifiers = m.getModifiers();
        });

        // 생성자 가져오기
        Arrays.stream(bookClass.getConstructors()).forEach(System.out::println);

        // 상위클래스 가져오기
        System.out.println(MyBook.class.getSuperclass());
    }
}
