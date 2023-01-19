import java.util.Scanner;

public class super_mairo {
    public static void main(String[] args) {
        int score = 0;
        int semi = 0;
        Scanner sc = new Scanner(System.in);

        int[] mushroom = new int[10];

        for (int i = 0; i < 10; i++) {
            mushroom[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i < 10) {
                score += mushroom[i];
            }

            if (Math.abs(100 - score) < Math.abs(100 - semi)) {
                semi = score;
            } else if (Math.abs(100 - score) > Math.abs(100 - semi)) {
                break;
            } else if (Math.abs(100 - score) == Math.abs(100 - semi) && score > semi) {
                semi = score;
            }
        }
        sc.close();
        System.out.println(semi);
    }
}
