package First_Semester;

import java.util.Scanner;

public class F05_Fifth_Week {
    public static void main(String[] args) {
        // if statement
        // Elma hastanesi 18 yasindan kucukler ucretsiz tedavi gormektir.
        // 18 yasindan buyukler muayene ucretinin %70  ilac ucretinin %50 sini odemektedir
        // 65 yasindan buyukler yuzde % 30 unu ve ilac ucretinin %20 sini odemektedir.
        //Faturasi Muayene ucreti 500 tl  Ilac ucreti 300 tl.
        int muayeneUcreti=500;
        int ilacUcreti=300;

        //kullanicidan bilgi almak icin scanner klasimizi cagirdik
        Scanner input= new Scanner(System.in);
        System.out.println(" HASTANEMIZE HOS GELDINIZ");
        System.out.println(" Isminizi : ");
        String userName= input.next();

        System.out.println(" Kimlik no giriniz : ");
        String userId= input.next();

        System.out.println(" Yasinizi giriniz : ");
        int userAge= input.nextInt();

        if (userAge<18){
            System.out.println(" Isim  : "+userName);
            System.out.println(" Kimlik No  : "+userId);
            System.out.println(" Odemeniz gereken tutar  : UCRETSIZ");
        } else if (userAge>18 & userAge<65) {
            double total=muayeneUcreti*(0.7)+ilacUcreti*(0.5);
            System.out.println(" Isim  : "+userName);
            System.out.println(" Kimlik No  : "+userId);
            System.out.println(" Odemeniz gereken tutar  :"+total);
        } else if (userAge>65) {
            double total=muayeneUcreti*(0.3)+ilacUcreti*(0.2);
            System.out.println(" Isim  : "+userName);
            System.out.println(" Kimlik No  : "+userId);
            System.out.println(" Odemeniz gereken tutar  :"+total);
        }






    }
}
