package First_Semester;

import java.util.Scanner;

public class F03_Third_Week {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Adinizi giriniz: ");
        String userName=scan.next();

        System.out.println("Lutfen bir adet tam sayi giriniz: ");
        int number1 =scan.nextInt();
        System.out.println("Lutfen ikinci tam sayiyi giriniz: ");
        int number2 =scan.nextInt();
        System.out.println("Adiniz ");
        System.out.println(userName);
        System.out.println("Girdiginiz "+"    "+ "1.\n sayi: ");
        System.out.println(number1);
        System.out.println("Girdiginiz 2. sayi: ");
        System.out.println(number2);


    }



}
