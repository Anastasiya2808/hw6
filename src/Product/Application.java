package Product;

public class Application {
    public static void main(String[] args) {

        Product product1 = new Product("Йогурт", 5, 3, 4, 80);
        Product product2 = new Product("молоко", 3, 2, 5, 45);
        Product product3 = new Product("сыр", 20, 20, 2, 240);
        Product product4 = new Product("тыква", 1, 1, 4, 22);

        MyProduct a = new MyProduct();
        a.addProduct(product1);
        a.addProduct(product2);
        a.addProduct(product3);
        a.addProduct(product4);
        a.printMyProducts();
    }
}
