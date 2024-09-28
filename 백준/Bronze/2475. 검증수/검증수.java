import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int i1 = kb.nextInt();
        int i2 = kb.nextInt();
        int i3 = kb.nextInt();
        int i4 = kb.nextInt();
        int i5 = kb.nextInt();

        int sum = (i1 * i1) + (i2 * i2) + (i3 * i3) + (i4 * i4) + (i5 * i5);
        int mod = sum % 10;

        System.out.println(mod);
    }
}