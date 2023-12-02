package First_Semester;

import java.util.Scanner;

public class F11_Eleveth_Week {
    public static void main(String[] args) {

    //sayiToplam(6,7);
    //sayiCarpimi(6,7);
    //sayiBolumu(7,2);
    //sayiFarki(56,23);
        Scanner input= new Scanner(System.in);
        System.out.println("Hafsa notun kac? ");
        int notHafsa= input.nextInt();
        hafsaninNotu(notHafsa);


    }

    public  static  void sayiToplam(int sayi1, int sayi2){
       int sayilarToplami=sayi1+sayi2;
        System.out.println(sayilarToplami);
    }
    public  static  void sayiCarpimi(int sayi1, int sayi2){
        int sayilarCarpimi=sayi1*sayi2;
        System.out.println(sayilarCarpimi);
    }
    public  static  void sayiBolumu(double sayi1, double sayi2){
        double sayilarBolumu=sayi1/sayi2;
        System.out.println(sayilarBolumu);
    }
    public  static  void sayiFarki(int sayi1, int sayi2){
        int sayilarFarki=sayi1-sayi2;
        System.out.println(sayilarFarki);
    }
    public static  void hafsaninNotu(int notHafsa){
        if (notHafsa<45){
            System.out.println("Hafsa notun F kaldin otur.");
        } else if (notHafsa>=45 & notHafsa <60) {
            System.out.println("Hafsa notun D zorla geciyosun.");
        } else if (notHafsa>=60 & notHafsa <75) {
            System.out.println("Hafsa notun C idare edersin.");
        } else if (notHafsa>=75 & notHafsa <90) {
            System.out.println("Hafsa notun B basarilisin.");
        } else if(notHafsa>=90 & notHafsa <=100){
            System.out.println("Hafsa notun A onur derecesi aldin TEBRIKLER!");
        } else if (notHafsa<0 & notHafsa >100){
            System.out.println("Hatali giris yaptiniz...");
        }
    }
}
