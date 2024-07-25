package abstractDemo;

import java.io.IOException;

public class Son extends Parent{
    @Override
    public void career(String name) throws IOException {
        System.out.println("I want to be " + name);
    }

    @Override
    public void partner(String name, Integer age) {
        System.out.println("I love "+ name + " her age is "+age);
    }
}
