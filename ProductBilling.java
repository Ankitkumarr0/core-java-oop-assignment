class ProductBilling {

    // Method for 1 product
    void bill(int price1) {
        int total = price1;
        System.out.println("Total bill for 1 product: " + total);
    }

    // Method for 2 products (Overloaded)
    void bill(int price1, int price2) {
        int total = price1 + price2;
        System.out.println("Total bill for 2 products: " + total);
    }

    // Method for 3 products (Overloaded)
    void bill(int price1, int price2, int price3) {
        int total = price1 + price2 + price3;
        System.out.println("Total bill for 3 products: " + total);
    }

    public static void main(String[] args) {

        ProductBilling pb = new ProductBilling();

        // Calling different methods
        pb.bill(100);
        pb.bill(100, 200);
        pb.bill(100, 200, 300);
    }
}
