public class
Main {
    public static void main(String[] args)
    {
        final double itemCost = 100.00;
        double itemCost = 100;
        double shippingCost;
        double totalCost;


        if(itemCost <= 100)
        {
            shippingCost = itemCost * .02;
                System.out.println("The Shipping price for the previous item will be " + shippingCost);
            totalCost = itemCost + shippingCost;
                System.out.println("The total price for the item with shipping comes to " + totalCost);
        }

        else
        {
            System.out.println("The shipping is free! The total for your purchase comes to " + itemCost);
        }
    }
}