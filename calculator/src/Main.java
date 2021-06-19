//全体の処理だけについて扱うクラス

public class Main {
    public static void main(String[] args) {
        int a = 1; int b = 2;

        int kekka1 = Calc.tasu(a, b);
        int kekka2 = Calc.hiku(a, b);
        int kekka3 = Calc.kake(a, b);
        int kekka4 = Calc.waru(a, b);
        
        System.out.println("和="+ kekka1);
        System.out.println("差="+ kekka2);
        System.out.println("乗="+ kekka3);
        System.out.println("除="+ kekka4);
    }
}

//aaa

