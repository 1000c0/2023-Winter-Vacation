import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class remainder {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] semi_list = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remainder = num % 42;
            semi_list[i] = remainder;
        }
        List<int[]> list = Arrays.asList(semi_list);
        sc.close();

        for (int k = 0; k < 10; k++) {
            if (list.contains(semi_list[k]) == false) {
                System.out.println(semi_list[k]);
                count++;
            }
        }

        System.out.println(count);
    }
}
