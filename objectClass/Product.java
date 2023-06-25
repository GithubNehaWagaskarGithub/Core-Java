package objectClass;

public class Product {
    int productId;
    String productName;
    double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString()
    {
        return  " productId : " + productId +
                "\n productName : " + productName +
                "\n productPrice : " + productPrice;
    }
}
