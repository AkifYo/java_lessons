package Second_Semester;

public class FW_02 {
    public static void main(String[] args) {
        //Soru 2 iki degisken alan ve us bulan bir fonksiyon yaziniz?
        // usBul(2,5)  2*2*2*2*2

        usBul(2,2);
    }
    public static void  usBul(int num1,int num2){
       int result=1;
        for (int i = 0; i <num2 ; i++) {
            result*=num1;

        }
        System.out.println(result);
    }
}
