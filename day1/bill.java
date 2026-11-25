package day1;

public class bill {
    public static void main(String[] args) {
        int fruit=100;
        int quatFruit=10;
        int vegetable=150;
        int quatvegetale=15;
        int milk=45;
        int quatMilk=3;
        float tax=18.6f;
        float subtotal=0f;
        float total=0f;
        subtotal=fruit*quatFruit+vegetable*quatvegetale+milk*quatMilk;
        total=subtotal*tax;
        System.out.println("total bill ="+total);

    }
}
