package Second_Semester;

public class FW_01 {
    public static void main(String[] args) {
        //Concatination nedir?
        String myName="Ali";
        String surName=" Kerem";
        System.out.println(myName+surName);
        // Hesap Makinasi
        // fonksiyon icine uc tane degisken alacak ve bu degiskenlerin ikisi integer biri char ve hesapmakinesi
        //3+5=8
        //Soru 2 iki degisken alan ve us bulan bir fonksiyon yaziniz?
        // usBul(2,5)  2*2*2*2*2
       hesapMakinasi(20,'-',5);
    }

    public static  void hesapMakinasi(double sayi1, char islem, double sayi2){
        if (islem=='+'){
            System.out.println("Sayilar toplami = "+(sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println("Sayilar farki = "+ (sayi1-sayi2));
        }else if (islem=='*') {
            System.out.println("Sayilar carpimi = "+ (sayi1*sayi2));
        }else if (islem=='/') {
            System.out.println("Sayilar bolumu = "+ (sayi1/sayi2));
        } else {
            System.out.println("Lutfen girdiginiz islemi kontrol ediniz.");
        }
    }
}
