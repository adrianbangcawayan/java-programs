
import java.util.*;

public class Fibonacci2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a term for Fibonacci");
        int term = sc.nextInt();
        System.out.println("The Fibonacci is " + F(term) + " and the term is " + term);
    }

    public static int F(int n) {
	if (n == 0) {
            return 0;
        }if (n == 1) {
            return 1;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }
}
