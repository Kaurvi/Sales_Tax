public class Sales_Tax
{
    public static void main(String[] args)
    {
        int itemPrice = 15;
        double taxRate = 0.05;
        double salesTax = itemPrice * taxRate;
        System.out.println("the sales tax of item price is " + salesTax);
    }
}