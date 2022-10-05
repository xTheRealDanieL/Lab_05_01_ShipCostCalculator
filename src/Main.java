public class Main
{
    public static void main(String[] args)
    {
        double price=140;
        double shipCost;

        if (price >=100)
        {
            shipCost = 0;
        }
        else
        {
            shipCost = price * 2/100;
        }
        double totalCost = price + shipCost;

        System.out.println("The shipping cost is " + shipCost);
        System.out.println("The total price is " + totalCost);
    }
}