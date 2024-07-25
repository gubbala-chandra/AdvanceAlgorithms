package SingleLinkedList;

public class HappYNumber {

    public static void main(String[] args) {
        HappYNumber hp = new HappYNumber();
        System.out.println(hp.isHappy(19));
    }
    public boolean isHappy(int n) {
        int slow =n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        return slow == 1;
    }

    private int findSquare(int number) {
        int ans = 0;
        while(number > 0) {
            int rem = number%10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }


}
