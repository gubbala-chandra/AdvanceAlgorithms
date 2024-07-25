package oops.inheritence.single;

public class Shape {
    int length;
    int breath;

    public Shape(int length, int breath) {
        this.breath = breath;
        this.length=length;
    }

    public Shape(Shape shape) {
        this.breath = shape.breath;
        this.length=shape.length;
    }

    public int calculateArea() {
        return length * breath;
    }
}
