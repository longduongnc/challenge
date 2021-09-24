import java.util.ArrayList;

public class Fizz_Buzz {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Fizz_Buzz fi_bu = new Fizz_Buzz();
        arrList = fi_bu.zeroToHundrd();
        System.out.println( fi_bu.Fizz_Buzz_Cal(arrList));
    }
    
    public ArrayList<Integer> zeroToHundrd(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x <= 100; x++){
            list.add(x);
        }
        return list;
    }

    
    public String Fizz_Buzz_Cal(ArrayList<Integer> y) {
        String str ="";
        for (int x = 0; x <= 100; x++){
            if (y.get(x)%3==0 && y.get(x)%5==0){
                str +="Fizz_Buzz ";
            }
            else if(y.get(x)%5==0){
                str += "Buzz ";
            }
            else if(y.get(x)%3==0){
                str += "Fizz ";
            }
        }
        return str;
    }
}
