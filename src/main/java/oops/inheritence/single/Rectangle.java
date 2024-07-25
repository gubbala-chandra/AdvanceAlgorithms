package oops.inheritence.single;

public class Rectangle extends Shape{
    int diagonal;
    public Rectangle(int length, int breath, int diagonal) {
        super(length, breath);
        this.diagonal = diagonal;
    }

    public Rectangle(Rectangle rect) {
        super(rect);
        this.diagonal = rect.diagonal;
    }

    public int calculateArea() {
        return super.calculateArea() * (diagonal/2);
    }

    public void currentFeature() {
        System.out.println("this is rectangle");
    }
}
