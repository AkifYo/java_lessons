package First_Semester;

import java.util.Scanner;

public class F05_Fifth_Week_2 {
    public static void main(String[] args) {
        //Bekir Misir da ferrari arabasiyla geziyor. Ama gezdigi sehirde  hiz siniri 50 km dir.
        // Farkli hiz ihlallerinde farkli cezalar odenmektedir.
        // Eger Bekir 50 km den 70 km  hizlarda 180 dolar, 70 den 90a kadarki hizlarda 250 dolar
        // 90 dan ve 110 a kadar hizlarda 350 dolar 110 ve ustundeki hizlarda ehliyete elkoyma cezasi uygulanmaktadir.
        // buna gore Bekire hangi hizda, hangi cezayi alacagini gosteren programi yaziniz.

        Scanner input= new Scanner(System.in);
        System.out.println("Bekir suan ki hizin kac? ");
        int speedBekir= input.nextInt();
        if (speedBekir<=50){
            System.out.println("Bekir su an cezalik bir durum yok");
        } else if (speedBekir>50 & speedBekir <=70) {
            System.out.println("Bekir su an 180 dolar odemelisin");
        } else if (speedBekir>70 & speedBekir <=90) {
            System.out.println("Bekir su an 250 dolar odemelisin");
        } else if (speedBekir>90 & speedBekir <=110) {
            System.out.println("Bekir su an 350 dolar odemelisin");
        } else {
            System.out.println("Bekir su an ehliyeti birakmalisin");
        }
    }
}
