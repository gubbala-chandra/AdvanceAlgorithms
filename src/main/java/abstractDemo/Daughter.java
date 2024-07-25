package abstractDemo;

import java.io.IOException;

public class Daughter extends Parent{
    @Override
    public void career(String name) throws IOException {
        System.out.println("I want to be " + name);
    }

    @Override
    public void partner(String name, Integer age) {
        System.out.println("I love "+ name + " his age is "+age);
    }
}
