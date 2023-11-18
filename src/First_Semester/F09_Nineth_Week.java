package First_Semester;

import java.util.Scanner;

public class F09_Nineth_Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz :");
        int userAge= scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz :");
        double userWeight= scan.nextDouble();
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz :");
        double userTall= scan.nextDouble();

        double userEndeks= userWeight/(userTall*userTall);

        System.out.println("Sizin boy kilo endeksiniz :"+userEndeks);

        /*

        < 18,4 Zayıf
18.5 – 24,99 Normal
25,0 – 29,9 Fazla Kilolu
30,0 – 34,9 Şişman / Obez – 1. Sınıf
35,0 – 44,9 Şişman /  Obez – 2. Sınıf
45,0 > Aşırı Şişman / Aşırı Obez – 3. Sınıf
        */
        if (userEndeks<18){
            System.out.println("Boy kilo endeksiniz ZAYIF oldugunuzu soyluyor");

        } else if (userEndeks<25) {
            System.out.println("Boy kilo endeksiniz NORMAL oldugunuzu soyluyor");
        } else if (userEndeks<30) {
            System.out.println("Boy kilo endeksiniz KILOLU oldugunuzu soyluyor");
        } else if (userEndeks<35) {
            System.out.println("Boy kilo endeksiniz 1. SINIF OBEZ oldugunuzu soyluyor");
        } else if (userEndeks<45) {
            System.out.println("Boy kilo endeksiniz 2. SINIF OBEZ oldugunuzu soyluyor");
        }else if (userEndeks>45) {
            System.out.println("ASIRI KILOLU lutfen tartiya cikmayin.");
        }
    }
}
