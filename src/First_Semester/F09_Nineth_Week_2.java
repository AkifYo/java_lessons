package First_Semester;

import java.util.Scanner;

public class F09_Nineth_Week_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Koç Burcu : 21 Mart - 20 Nisan
    Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
         */
        System.out.println("Lutfen kacinci ayda dogdugunuzu rakam olarak giriniz :");
        int userAgeMonth = scan.nextInt();
        System.out.println("Lutfen ayin kacinci gununde dogdugunuzu rakam olara giriniz :");
        int userAgeDay = scan.nextInt();

        switch (userAgeMonth) {
            case 1:
                if (userAgeDay > 22) {
                    System.out.println("Burcunuz ***KOVA***");
                } else {
                    System.out.println("Burcunuz ***OGLAK***");
                }
                break;
            case 2:
                if (userAgeDay > 19) {
                    System.out.println("Burcunuz ***BALIK***");
                } else {
                    System.out.println("Burcunuz ***KOVA***");
                }
                break;
            case 3:
                if (userAgeDay > 20) {
                    System.out.println("Burcunuz ***KOC***");
                } else {
                    System.out.println("Burcunuz ***BALIK***");
                }
                break;
            case 4:
                if (userAgeDay > 20) {
                    System.out.println("Burcunuz ***BOGA***");
                } else {
                    System.out.println("Burcunuz ***KOC***");
                }
                break;
            case 5:
                if (userAgeDay > 21) {
                    System.out.println("Burcunuz ***IKIZLER***");
                } else {
                    System.out.println("Burcunuz ***BOGA***");
                }
                break;
            case 6:
                if (userAgeDay > 22) {
                    System.out.println("Burcunuz ***YENGEC***");
                } else {
                    System.out.println("Burcunuz ***IKIZLER***");
                }
                break;
            case 7:
                if (userAgeDay > 22) {
                    System.out.println("Burcunuz ***ASLAN***");
                } else {
                    System.out.println("Burcunuz ***YENGEC***");
                }
                break;
            case 8:
                if (userAgeDay > 22) {
                    System.out.println("Burcunuz ***BASAK***");
                } else {
                    System.out.println("Burcunuz ***ASLAN***");
                }
                break;
            case 9:
                if (userAgeDay > 20) {
                    System.out.println("Burcunuz ***TERAZI***");
                } else {
                    System.out.println("Burcunuz ***BASAK***");
                }
                break;
            case 10:
                if (userAgeDay > 21) {
                    System.out.println("Burcunuz ***AKREP***");
                } else {
                    System.out.println("Burcunuz ***TERAZI***");
                }
                break;
            case 11:
                if (userAgeDay > 21) {
                    System.out.println("Burcunuz ***YAY***");
                } else {
                    System.out.println("Burcunuz ***AKREP***");
                }
                break;
            case 12:
                if (userAgeDay > 20) {
                    System.out.println("Burcunuz ***OGLAK***");
                } else {
                    System.out.println("Burcunuz ***YAY***");
                }
                break;
        }
    }

}
