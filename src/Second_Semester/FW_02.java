package Second_Semester;

import java.util.Scanner;

public class FW_02 {
    public static void main(String[] args) {
        //Soru 2 iki degisken alan ve us bulan bir fonksiyon yaziniz?
        // usBul(2,5)  2*2*2*2*2

       // usBul(2,2);
       // loginPage();
       // findNumberKind(0);
        tersYazdir("nihaS misA temheM");
    }
    public static  void loginPage(){
        String uName="AliKerem";
        String uPassword="555555";
        Scanner scan= new Scanner(System.in);
        System.out.println("*** LUTFEN KULLANICI ADINI GIRINIZ :");
        String userName= scan.next();
        System.out.println("*** LUTFEN SIFRENIZI GIRINIZ :");
        String passWord= scan.next();

        if (userName.equals(uName)&&passWord.equals(uPassword)){
            System.out.println("Basarili Giris Yaptiniz");
        } else {
            System.out.println("Girdiginiz Bilgileri Kontrol Ediniz");
        }
    }
    public static void  usBul(int num1,int num2){
       int result=1;
        for (int i = 0; i <num2 ; i++) {
            result*=num1;

        }
        System.out.println(result);
    }
    public  static  void findNumberKind(int number){

        if (number==0){
            System.out.println(number+" sifira esit.");
        } else if (number<0) {
            System.out.println(number+" sifirdan kucuk negatif.");
        } else {
            System.out.println(number+" sifirdan buyuk pozitif.");
        }

    }
    public static void tersYazdir(String userText){
       String text="";
        for (int i = userText.length()-1; i >=0 ; i--) {
            text+=userText.charAt(i);


        }
        System.out.println(text);
    }
}
