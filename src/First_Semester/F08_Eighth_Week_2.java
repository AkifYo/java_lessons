package First_Semester;


import java.util.Arrays;
import java.util.Scanner;

public class F08_Eighth_Week_2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // int[] intListesi = new int[]

        System.out.println("Lutfen 5 kisilik listeyi doldurunuz");
        String [] elemanListesi= new String[5];
        System.out.println("Birinci ismi giriniz : ");
        elemanListesi[0]= scan.next();
        System.out.println("Ikinci ismi giriniz : ");
        elemanListesi[1]= scan.next();
        System.out.println("Ucuncu ismi giriniz : ");
        elemanListesi[2]= scan.next();
        System.out.println("Doruduncu ismi giriniz : ");
        elemanListesi[3]= scan.next();
        System.out.println("Besinci ismi giriniz : ");
        elemanListesi[4]= scan.next();

        System.out.println(" Girdiniz isimler : "+ Arrays.toString(elemanListesi));

    }
}
