package First_Semester;

import java.util.Scanner;

public class F11_Eleveth_Week_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bekir sehiricine kac KM hizala girdin?");
        int speedBekir= scan.nextInt();
        bekirinHiziniHesapla(speedBekir);


    }
    public static void bekirinHiziniHesapla(int speedBekir){

        if (speedBekir<=50){
            System.out.println("Bekir su an cezalik bir durum yok");
        } else if (speedBekir>50 & speedBekir <=70) {
            System.out.println("Bekir su an 180 dolar odemelisin");
        } else if (speedBekir>70 & speedBekir <=90) {
            System.out.println("Bekir su an 250 dolar odemelisin");
        } else if (speedBekir>90 & speedBekir <=110) {
            System.out.println("Bekir su an 350 dolar odemelisin");
        } else {

            System.out.println("Bekir su an ehliyeti birakmalisin!");
        }
    }

}
