import java.util.Scanner;

public class a_sum_b_v5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 & b == 0) {
                break;
            } else if (a != 0 && b != 0) {
                System.out.println(a + b);
                sc.close();
            }
        }
    }
}
