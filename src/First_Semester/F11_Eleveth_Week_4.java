package First_Semester;

import java.util.Scanner;

public class F11_Eleveth_Week_4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" HASTANEMIZE HOS GELDINIZ");
        System.out.println(" Isminizi : ");
        String userName= input.next();

        System.out.println(" Kimlik no giriniz : ");
        String userId= input.next();

        System.out.println(" Yasinizi giriniz : ");
        int userAge= input.nextInt();
        faturaGoster(userName,userId,userAge);
    }
    public  static  void faturaGoster(String userName,String userId,int userAge){
        int muayeneUcreti=500;
        int ilacUcreti=300;
        if (userAge<=18){
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
