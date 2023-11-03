package First_Semester;

import java.util.Scanner;

public class F07_Seventh_Week {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* System.out.println("Dilara yarin hava acik olacak mi?");
        boolean dilaraInput = scan.nextBoolean();

        if (dilaraInput) {
            System.out.println("Yarin tiyatroya gidebilirsin");
        } else {
            System.out.println("Yarin tiyatroya gitme hava durumu iyi degil.");
        }*/

        System.out.println("Lutfen haftanin gununu gosteren bir sayi giriniz :");
        int dayNo = scan.nextInt();
        switch (dayNo) {
            case 1:
                System.out.println("Bugun Pazartesi");
                break;

            case 2:
                System.out.println("Bugun Sali");
                break;

            case 3:
                System.out.println("Bugun Carsamba");
                break;
            case 4:
                System.out.println("Bugun Persembe");
                break;
            case 5:
                System.out.println("Bugun Cuma");
                break;
            case 6:
                System.out.println("Bugun Cumartesi");
                break;
            case 7:
                System.out.println("Bugun Pazar");
                break;
            default:
                System.out.println("Yanlis numara girdiniz");
        }
    }

}
