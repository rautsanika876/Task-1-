public class ClothingStoreBilling {

    public static double calculateFashionGST(double price, int quantity) {
        double amount = price * quantity;
        double gst = amount * 13 / 100;
        return amount + gst;
    }

    public static double totalBill(double shirt, double jeans,
                                   double kurti, int quantity) {
        double shirtBill = calculateFashionGST(shirt, quantity);
        double jeansBill = calculateFashionGST(jeans, quantity);
        double kurtiBill = calculateFashionGST(kurti, quantity);

        return shirtBill + jeansBill + kurtiBill;
    }

    public static double calculateDiscountedBill(
            double shirt, double jeans, double kurti, int quantity) {

        double total = totalBill(shirt, jeans, kurti, quantity);
        double discount = 0;

        if (total >= 2000) {
            discount = total * 20 / 100;
        } else if (total >= 1000) {
            discount = total * 10 / 100;
        }

        double finalAmount = total - discount;

        System.out.printf("Total after GST = %.2f%n", total);
        System.out.printf("Discount = %.2f%n", discount);
        System.out.printf("Final payable amount = %.2f%n", finalAmount);

        return finalAmount;
    }

    public static void main(String[] args) {
        double shirt = 500;
        double jeans = 800;
        double kurti = 600;
        int quantity = 1;

        calculateDiscountedBill(shirt, jeans, kurti, quantity);
    }
}

    

