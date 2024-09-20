import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();

        int multipleNumbers = a * b * c;

        String multipleNumbersString = Integer.toString(multipleNumbers);

        String[] numberArray = multipleNumbersString.split("");
        int[] answerArray = new int[10];

        for (int i = 0; i < 10; i++) {
            for (String number : numberArray) {
                String j = String.valueOf(i);
                if (Objects.equals(number, j)) {
                    answerArray[i]++;
                }
            }
            System.out.println(answerArray[i]);
        }
    }
}
