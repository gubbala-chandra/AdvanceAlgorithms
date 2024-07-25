package abstractDemo;

public class Main {
    public static void main(String[] args) throws Exception {
        Parent p = new Son();
        p.career("engineer");
        p.partner("Bhavana", 25);
    }
}
