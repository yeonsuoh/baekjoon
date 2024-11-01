import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] HArr = new int[n];
        int[] WArr = new int[n];
        int[] NArr = new int[n];

        for (int i = 0; i < n; i++) {
            HArr[i] = scanner.nextInt();
            WArr[i] = scanner.nextInt();
            NArr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int yy = NArr[i] % HArr[i];
            String yyStr = String.valueOf(yy);
            if (yy == 0) {
                yyStr = HArr[i] + "";
            }
            int xx = NArr[i] / HArr[i];
            if (NArr[i] % HArr[i] != 0) {xx++;}
            String xxStr = String.valueOf(xx);
            if (xx < 10)
                xxStr = "0" + xx;
            System.out.println(yyStr + "" + xxStr);
        }
    }
}