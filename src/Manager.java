public class Manager {
    public int purchses;
    public int sales;
    public  double price;

    public Manager(int purchses, int sales, double price) {
        this.purchses = purchses;
        this.sales = sales;
        this.price = price;
    }

    public int getPurchses() {

        return purchses;
    }

    public void setPurchses(int purchses) {
        int madePurchase = purchses -1;
        this.purchses = purchses;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
}


