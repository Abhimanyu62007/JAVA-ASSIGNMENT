public class Product_inventory {
    String productName;
    int productId;
    int quantity;
    double price;

    Product_inventory(String productName, int productId, int quantity, double price) {
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    void addStock(int amount) {
        quantity += amount;
    }

    void sellProduct(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Insufficient Stock");
        }
    }

    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product_inventory product =
                new Product_inventory("Laptop", 101, 10, 50000);

        product.addStock(5);
        product.sellProduct(3);

        product.display();
    }
}