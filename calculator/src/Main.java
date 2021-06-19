//全体の処理だけについて扱うクラス

public class Main {
    public static void main(String[] args) {
        int a = 1; int b = 2;
        int total = tasu(a, b);
        int delta = hiku(a, b);
        int kekka1 = tasu(a, b);
        int kekka2 = hiku(a, b);
        System.out.println("和="+ kekka1);
        System.out.println("差="+ kekka2);

    }
}
