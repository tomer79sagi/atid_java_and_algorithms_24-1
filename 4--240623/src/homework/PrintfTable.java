package homework;

public class PrintfTable {
    public static void main(String[] args) {
        String item1 = "תפוחים";
        String item2 = "בננות";
        String item3 = "דובדבנים";
        String item4 = "תמרים";
        String item5 = "תותים";

        double price1 = 1.99;
        double price2 = 0.99;
        double price3 = 2.99;
        double price4 = 3.99;
        double price5 = 4.99;

        int quantity1 = 10;
        int quantity2 = 20;
        int quantity3 = 15;
        int quantity4 = 5;
        int quantity5 = 7;

        System.out.printf("%-15s %-10s %-10s%n", "פריט", "מחיר", "כמות");
        System.out.printf("%-15s %-10.2f %-10d%n", item1, price1, quantity1);
        System.out.printf("%-15s %-10.2f %-10d%n", item2, price2, quantity2);
        System.out.printf("%-15s %-10.2f %-10d%n", item3, price3, quantity3);
        System.out.printf("%-15s %-10.2f %-10d%n", item4, price4, quantity4);
        System.out.printf("%-15s %-10.2f %-10d%n", item5, price5, quantity5);
    }
}
