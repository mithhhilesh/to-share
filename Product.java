public class Product {
    private String productName;
    private double cost;
    private String manufacturer;
    private double maxDiscount;

    public void setProduct(String productName, double cost, String manufacturer, double maxDiscount) {
        this.productName = productName;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.maxDiscount = maxDiscount;
    }

    public double getMaxDiscount() {
        return maxDiscount;
    }

    public double getFinalCost() {
        return cost - (cost * maxDiscount / 100);
    }

    @Override
    public String toString() {
        return "Product [Name=" + productName + ", Cost=" + cost + ", Manufacturer=" + manufacturer +
                ", Max Discount=" + maxDiscount + "%]";
    }
}

