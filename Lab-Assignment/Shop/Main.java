public class Main{
    public static void main(String[] args) {

        Shop myShop = new Shop();

        myShop.setShopName("Super Mart");

        System.out.println("Shop Name: " + myShop.getShopName());
        System.out.println("Total Revenue: $" + myShop.getTotalRevenue());
        System.out.println("Number of Sales: " + myShop.getNumberOfSales());

        myShop.setSaleAmount(50.0);
        myShop.setSaleAmount(30.0);
        myShop.setSaleAmount(75.0);
        
        System.out.println("\nUpdated Sale Information:");
        System.out.println("Shop Name: " + myShop.getShopName());
        System.out.println("Number of Sales: " + myShop.getNumberOfSales());
        System.out.println("Total Revenue: BDT " + myShop.getTotalRevenue());
    }
}

// Name: Showrav Kormokar
// ID: 222311077
// Section: B