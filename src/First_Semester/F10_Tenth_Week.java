package First_Semester;

import java.util.Scanner;

public class F10_Tenth_Week {
    public static void main(String[] args) {
        //String, int, double, boolean, char,
        String text1 = "JavatoryadaJahve";
        System.out.println(text1.contains("Java"));

        String text2 = "FIRST";
        String text3 = "BRICK";
        String text4 = "a";
        System.out.println(text1.length());
        System.out.println(text1.charAt(1));
        System.out.println(text2.toLowerCase());
        System.out.println(text2.indexOf("T"));
        System.out.println(text1.toUpperCase());
        System.out.println(text2.concat(text3));
        //System.out.println();
        //System.out.println(text1.compareTo(text4));
        System.out.println(text1.replace("e", "a"));
        char[] arrText1 = {'J', 'A', 'V', 'A'};
        //harfleri yazdiralim

        //System.out.println(arrText1[0]);
        //System.out.println(arrText1[0] +" "+ arrText1[1] +" "+ arrText1[2] +" "+ arrText1[3]);
        String toplam="";
        for (int i=0; i<arrText1.length;i++){
            toplam=toplam+arrText1[i];


        }
        System.out.println(toplam);
    }






}
