package kunal.assignments.conditionalLoop;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println(area(radius));
    }

    private static double area(int radius) {
        return Math.PI * radius*radius;
    }
}
