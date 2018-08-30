import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dice {
    public static void main(String[] A00) {
        int L00 = 100;

        BufferedReader L01 = new BufferedReader(
                new InputStreamReader(System.in));

        while (L00 > 0) {
            int L02 = 0;
            try {
                System.out.println("--------------------------");
                System.out.println("所持金：" + L00);
                System.out.print("いくら賭けますか？：");
                L02 = Integer.parseInt(L01.readLine());
                if (L00 < L02 || L02 <= 0) {
                    System.out.println("お客さん、冗談はやめてくださいよ。");
                    continue;
                }
                L00 -= L02;

            } catch (IOException L03) {
                System.out.println("入力エラーが発生したので終了します。");
                System.exit(1);
            } catch (NumberFormatException L04) {
                System.out.println("数字を入力してください。");
                continue;
            }

            System.out.print("スロットの数字：000");

            long L05 = System.currentTimeMillis() + 1000;

            int L06;

            do {
                L06 = (int)(Math.random() * 1000);
                System.out.printf("\b\b\b%03d", L06);
            } while (System.currentTimeMillis() < L05);

            System.out.println();

            if (L06 == 777) {
                L00 += (L02 * 1000);
                System.out.println("大当たり！");
            } else if (L06 % 111 == 0) {
                L00 += (L02 * 100);
                System.out.println("当たり！");
            }

        }
    }
}
