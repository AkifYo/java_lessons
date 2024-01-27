package First_Semester;


import java.sql.Array;
import java.util.Arrays;

public class F08_Eighth_Week {
    public static void main(String[] args) {
    //int, String, Double, Boolean...
    // very tipi []  arrayin ismi =  {very turune gore tut}
        int [] sayiListesi= {10,5,3,7,10};
        System.out.println(sayiListesi[0]);
        System.out.println(sayiListesi[1]);
        System.out.println(sayiListesi[2]);
        System.out.println(sayiListesi[3]);
        System.out.println(sayiListesi[4]);

        String [] jahveListesi={"ali","bekir","dilara", "hafsa","levent","sabri", "zulal"};

        /*System.out.println(Arrays.toString(jahveListesi));
        System.out.println(jahveListesi.length);
        System.out.println(jahveListesi[0]);
        System.out.println(jahveListesi[1]);
        System.out.println(jahveListesi[2]);
        System.out.println(jahveListesi[3]);
        System.out.println(jahveListesi[4]);
        System.out.println(jahveListesi[5]);
        System.out.println(jahveListesi[6]);*/

        for (int i = 0; i < 7; i++) {
            //System.out.println(jahveListesi[i]);
            if (jahveListesi[i]=="ali"){
                System.out.println(jahveListesi[i]);
            }
            System.out.println("=====================================");
            System.out.println(jahveListesi[i]);
            // Oncelikle sayilardan olusan bir array olusturup daha sonra
            // arrayin elemanlarinin toplamin yazdiran bir program yaziniz.
        }
    }
}
