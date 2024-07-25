package oops.inheritence.single;

import java.util.concurrent.RecursiveAction;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 20, 30);
        System.out.println(rect.calculateArea());
        Rectangle rect1 = new Rectangle(10,20,30);
        rect1.currentFeature();
    }
}
