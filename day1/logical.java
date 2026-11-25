package day1;

public class logical {
    public static void main(String[] args) {
        boolean paidFess=true;
        boolean registered=false;
        boolean attendExam=paidFess&&registered;
        System.out.println("can attend exam="+attendExam);
       }
}
