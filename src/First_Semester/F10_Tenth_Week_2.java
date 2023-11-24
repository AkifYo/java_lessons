package First_Semester;

public class F10_Tenth_Week_2 {
    public static void main(String[] args) {
       //Tersten yazdiralim
        String text1= "JAVATOR";

        System.out.println(text1.charAt(0));
        String toplam="";
        for (int i=text1.length()-1;i>=0;i--){
            toplam=toplam+text1.charAt(i);
        }
        System.out.println(toplam);
    }


}
