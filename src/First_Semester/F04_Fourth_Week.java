package First_Semester;

import java.util.Scanner;

public class F04_Fourth_Week {
    public static void main(String[] args) {
        // S07 Patlican medikal centrumda giris memuru olarak,
        // kayyda gelen hastalarin isim, soyisim ve kimlik numarasi, ve yasini alarak,
        // asagidaki formule gore odemesi gereken faturayi yazdirin.
        // Faturada Isim soyisim kinmlik numarasi, yasi ve fiyat olsun.
        // Tam muayene ucreti 500TL   KDV 0.18

        //=======================================================

        // ilk olarak scanner clasimizi cagiriyoruz
        Scanner scan= new Scanner(System.in);

        //Hastane girisi ve super nezaketliyiz.
        System.out.println("***PATLICAN HASTANESINE HOSGELDINIZ***");
        System.out.println("LUTFEN ISMINIZI RICA EDEYIM : ");
        //Burada kisiden ismini string degiskenime atiyorum.
        String yourName= scan.next();


        System.out.println("LUTFEN SOYISMINIZI GIRINIZ : ");
        //Simdi soyismini string degiskenime atadim.
        String yourSurname= scan.next();

        System.out.println("KIMLIK NUMARANIZI UNUTMAYALIM LUTFEN : ");
        //Sahsin kimlik numarasiyla matematiksel bi islem yapmayacagim icin stringe atiyorum.
        String yourID= scan.next();


        System.out.println("VE TABIKI YASINIZ : ");
        //Kisinin yasini int degiskenimize atiyoruz
        int yourAge= scan.nextInt();

        //Sonrasind aldigimiz degerleri sahsin faturasina yazdiriyoruz
        //Muayene ucretimizi de ekliyoruz
        int treatingPrice=500;

        // Muayene ucretine kdv ekleyelim.
        double totalPrice= treatingPrice+treatingPrice*(0.18);

        System.out.println("*** PATLICAN HASTENESI FATURASI ***");
        System.out.println("ISIM =====================> :"+yourName);
        System.out.println("SOYISIM ==================> :"+yourSurname);

        System.out.println("K. NO ====================> :"+yourID);
        System.out.println("YASINIZ ==================> :"+yourAge);

        System.out.println("TUTAR ====================> :"+treatingPrice+" TL");
        System.out.println("TOPLAM TUTAR =============> :"+totalPrice+" TL");



    }
}
