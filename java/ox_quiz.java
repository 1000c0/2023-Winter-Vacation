import java.util.Scanner;

public class ox_quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();

        for (int i = 0; i < len; i++) {
            int score = 0;
            int flag = 1;
            String req = sc.next();
            String[] arr = req.split("");

            for (int k = 0; k < req.length(); k++) {
                if (arr[k].equals("O")) {
                    score += 1 * flag;
                    flag += 1;
                } else {
                    flag = 1;
                }
            }
            System.out.println(score);
        }
        sc.close();
    }
}