//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double purchasePrice = 100.0;

        final double SALES_TAX_RATE = 0.05; // 7% sales tax

        double salesTax = purchasePrice * SALES_TAX_RATE;
        double totalPrice = purchasePrice + salesTax;

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Sales Tax: $" + salesTax);
        System.out.println("Total Price: $" + totalPrice);
    }
}