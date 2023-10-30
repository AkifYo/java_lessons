package First_Semester;

import java.util.Scanner;

public class F06_Sixth_Week {
    public static void main(String[] args) {
        // Girdiginiz sayinin cift yada tek mi oldugunu gosteren programi yaziniz.
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");


        int inputUser= scan.nextInt();

        if (inputUser%2==0){
            System.out.println("Girdiginiz sayi CIFT");
        } else {
            System.out.println("Girdiginiz sayi TEK");
        }
        System.out.println(inputUser%3);



        //Kullanicidan aldiginiz sayinin
        // uce tam bolunup bolunmedigini kullanicaya soyleyen uygulamayi yaziniz.

        // bir sayinin 2 ye ve hem uce bolunup bolunmedigini kontrol ediniz
        System.out.println("Kapi acik mi?");

        boolean doorIsOpened= scan.nextBoolean();

        if (doorIsOpened){
            System.out.println("Iceri kedi girebilir");
        } else {
            System.out.println("Iceri havasiz kalir");
        }

    }
}
