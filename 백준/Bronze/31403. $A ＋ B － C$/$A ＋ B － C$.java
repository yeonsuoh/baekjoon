import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String aPlusB = a + "" + b;
        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(aPlusB) - c);
    }
}
