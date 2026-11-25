package day1;

public class interest {
    public static void main(String[] args) {
        int principle=100;
        int time=2;  //in years
        float rate=2.5f;
        float s_i=0f;
        s_i=(principle*time*rate)/100;
        System.out.println("Simple interest="+s_i);


    }
}
