/**
 *    date: 18 nov 2018
 * @author: kraspu [Pavlo Krasovskyi]
 */

public class Main {
    //#1
    static byte by;
    static short sh;
    static int i;
    static long lo;
    static float fl;
    static double dou;
    static char ch;
    static boolean boo;

    public static void main(String[] args) {
        System.out.println(by);
        System.out.println(sh);
        System.out.println(i);
        System.out.println(lo);
        System.out.println(fl);
        System.out.println(dou);
        System.out.println(ch);
        System.out.println(boo);

        //#2
        byte by;
        short sh;
        int i;
        long lo;
        float fl;
        double dou;
        char ch;
        boolean boo;
//        System.out.println(by);
//        System.out.println(sh);
//        System.out.println(i);
//        System.out.println(lo);
//        System.out.println(fl);
//        System.out.println(dou);
//        System.out.println(ch);
//        System.out.println(boo);

        //#3
        System.out.println("---------------------------------------");
        sh = 3 + 4;
        System.out.println(sh);
        sh = (short)(5 + 3.1);
        System.out.println(sh);
        fl = 3.2f;;
        i = 5;
        sh = (short)(fl + i);
        System.out.println(sh);
        by = 3;
        sh = (short)(sh + by);
        System.out.println(sh);
        dou = 2.3;
        sh = (short)(fl + dou);
        System.out.println(sh);

        //#4
        System.out.println("-------------------------------------------------------");
        double leg1 = 3;
        double leg2 = 4;
        double hypotenuse = 6;
        System.out.println((leg1 * leg1 + leg2 * leg2) == hypotenuse * hypotenuse ?
                ("true = да, это катеты и гипотенуза!"):
                ("false = да неееееееееет! какой это прям.треугольник???"));

        //#5
        System.out.println("-------------------------------------------------------");
        int sum = 0;
        for (int j = 0; j < 20; j++) {
            sum += (j + 1);
        }
        System.out.println("Сумма от 1 до 20 = " + sum);

        //#6
        System.out.println("-------------------------------------------------------");
        sum = 0;
        int j = 0;
//        for (int j = 0; j < 20; j+=2) {
        while (j < 20){
            sum += (j + 1);
            j += 2;
        }
        System.out.println("Сумма четных целых чисел от 1 до 20 = " + sum);

        //№7
        System.out.println("-------------------------------------------------------");
        boolean isprime;
        sum = 0;
        for (i = 1; i < 20; i++) {
            isprime = true;
            for ( j = 2; j <= i/j; ++j) {
                if ((i%j) == 0) isprime = false;
            }
            if (isprime)
                    sum += i;
        }
        System.out.println("Cумма простых чисел от 1 до 20 = " + sum);

        //#8
        System.out.println("-------------------------------------------------------");
        int a = 1;
        int b = 4;
        int c = 3;
        System.out.println(((a+b)==c||(a+c)==b||(b+c)==a)?(true):(false));

        //#9
        System.out.println("-------------------------------------------------------");
        a = 5;
        b = 0;
        sum = 0;
        int count = 0;
//        for (i = a; i >= b; i--) {
//            sum += i;
//            count++;
//        }
        do {
            sum += a;
            a--;
            count++;
        } while(a >= b);
        double av = sum/(double)count;
        System.out.println("sum = " + sum + "\ncount = " + count);
        System.out.println("Average value = " + av);

        //#10
        System.out.println("-------------------------------------------------------");
        double credit = 1200.; // сумма кредита
        final int period = 12; //срок кредитования в месяцах
        double rate = 33.; // процентная ставка  (% годовых)
        double perMonth; // месячный платеж
        double rateValue; //суммарное значение выплаченных процентов за период

        rateValue = credit * rate / 100 ;
        perMonth = (rateValue  + credit) / period;
        System.out.println("Ежемесячный платеж составляет: " + perMonth);
        System.out.println("Cуммарное значение выплаченных процентов за период = " + rateValue);
    }
}
