public class Shop {
    private String shopName;
    private double totalRevenue;
    private int numberOfSales;

    public Shop() {
        this.shopName = shopName;
        this.totalRevenue = 0.0;
        this.numberOfSales = 0;
    }

    public void setShopName(String shopName){
        this.shopName = shopName;
    }

    public void setSaleAmount(double saleAmount){
         if (saleAmount >= 0) {
            totalRevenue += saleAmount;
            numberOfSales++;
            System.out.println("Sale recorded.");
        } else {
            System.out.println("Sale amount must be positive.");
        }
    }

    public String getShopName() {
        return shopName;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public String toString(){
        return "Shop[shopName= "+shopName+", numberOfSales= "+numberOfSales+", totalRevenue= "+totalRevenue+"]";
    }

}
