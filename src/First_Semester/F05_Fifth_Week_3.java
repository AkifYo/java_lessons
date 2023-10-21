package First_Semester;

import java.util.Scanner;

public class F05_Fifth_Week_3 {
    public static void main(String[] args) {
        //Hafsa donem sonu notlarini girip  harf notu olarak hangi puani aldigini
        // gosteren bir program yazmak istemektedir Hafsaya yardimci olalim.
        //  90-100 A,  75-90 B,  60- 75 arasi C, 45-60 D  45 ve asagisi F

        Scanner input= new Scanner(System.in);
        System.out.println("Hafsa notun kac? ");
        int notHafsa= input.nextInt();
        if (notHafsa<45){
            System.out.println("Hafsa notun F kaldin otur");
        } else if (notHafsa>=45 & notHafsa <60) {
            System.out.println("Hafsa notun D zorla geciyosun");
        } else if (notHafsa>=60 & notHafsa <75) {
            System.out.println("Hafsa notun C idare edersin");
        } else if (notHafsa>=75 & notHafsa <90) {
            System.out.println("Hafsa notun B basarilisin");
        } else if(notHafsa>=90 & notHafsa <=100){
            System.out.println("Hafsa notun A Onur derecesi aldin");
        } else if (notHafsa<0 & notHafsa >100){
            System.out.println("Hatali giris yaptiniz");
        }
    }
}
