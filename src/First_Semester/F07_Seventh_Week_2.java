package First_Semester;

import java.util.Scanner;

public class F07_Seventh_Week_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz birinci sayiyi giriniz : ");
        double num1= scan.nextDouble();
        System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi giriniz : ");
        double num2= scan.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi giriniz : ");
        String userIslem= scan.next();

        switch (userIslem){
            case "+" :
                double total= num1+num2;
                System.out.println("Sayilarin toplami "+total);
                break;

            case "-" :
                double dif= num1-num2;
                System.out.println("Sayilarin farki "+dif);
                break;
            case "*" :
                double multiple= num1*num2;
                System.out.println("Sayilarin carpimi "+multiple);
                break;

            case "/" :
                double diversion= num1/num2;
                System.out.println("Sayilarin bolumu "+diversion);
                break;

            default:
                System.out.println("Lutfen dort islemden birini giriniz...");
        }
    }

}
