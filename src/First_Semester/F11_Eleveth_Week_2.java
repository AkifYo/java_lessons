package First_Semester;

import java.util.Scanner;

public class F11_Eleveth_Week_2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("HAFSA YILSONU ORTALAMA NOTUN KAC?");
        int notHafsa= input.nextInt();
        hafsaninNotunuHesapla(notHafsa);

    }


    public static  void hafsaninNotunuHesapla(int notHafsa){
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
