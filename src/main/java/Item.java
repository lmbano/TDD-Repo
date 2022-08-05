public class Item {
    private double unitPrice;
    private int quantity;

    public Item(double unitPrice, int quantity) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public  double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public double getSubTotal() {
        return unitPrice* quantity;
    }
}
