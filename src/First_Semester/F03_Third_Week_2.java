package First_Semester;

import java.util.Scanner;

public class F03_Third_Week_2 {
    public static void main(String[] args) {
        // Kullanicidan iki farkli integer deger alarak bu sayilarin toplamini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi girer misiniz?");
        int num1=scan.nextInt();
        System.out.println("Ikinci bir tam sayi girer misiniz?");
        int num2= scan.nextInt();
        int num3=num1+num2;
        System.out.println(num3);
    }
}
