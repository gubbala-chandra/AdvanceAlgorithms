package org.example.custom.classes;

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);
    }
}
