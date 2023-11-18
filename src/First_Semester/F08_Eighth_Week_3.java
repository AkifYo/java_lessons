package First_Semester;


import java.util.Arrays;
import java.util.Scanner;

public class F08_Eighth_Week_3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // int[] intListesi = new int[]
        // kullanicidan vize, vize, final notlarini alarak bir arraya atiniz
        // ve bu notlarin ortalamasini kullaniciya gosteriniz.
        int [] arr1= new int[3];
        //int[] arr2={3,5,7,8,};
        System.out.println("Lutfen donem icindeki notlari giriniz :" +
                "\nVize 1 ?:");
        arr1[0]= scan.nextInt();
        System.out.println(" Vize 2 ?:");
        arr1[1]= scan.nextInt();
        System.out.println("Final notunuz ? :");
        arr1[2]= scan.nextInt();
        double total=arr1[0]+arr1[1]+arr1[2];
        double ort=total/3;
        System.out.println("Yilsonu donem ortalamaniz :" +ort+"\n" +
                "ve notlariniz");



        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i < 5; i++) {

        }
    }
}
