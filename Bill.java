import java.io.*;
// ----------------Bill Class
public class Bill {

    // declaring variabls
    double DiscountAmount, billPayAmount, PriceAmount;

    // constructor for the bill to count the amounts of price...etc
    public Bill(double DiscountAmount, double billPayAmount, double PriceAmount) {
        this.DiscountAmount = DiscountAmount;
        this.billPayAmount = billPayAmount;
        this.PriceAmount = PriceAmount;
    }

    /**
     * METHOD FOR SETTING DISCOUNT
     * @param DiscountAmount
     */
    public void setDiscount(double DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    /**
     * METHOD FOR SETTING BILLPAY
     * @param billPayAmount
     */
    public void setBilPay(double billPayAmount) {
        this.billPayAmount = billPayAmount;
    }

    /**
     * METHOD FOR SETTING THE PRICE
     * @param PriceAmount
     */
    public void setPrice(double PriceAmount) {
        this.PriceAmount = PriceAmount;
    }

    /**
     * METHOD SAVEBILL IT WILL BE PRINTED OUT ON FILE (BILLS.TXT)
     * @param customer
     * @param type
     */
    public void savebill(customers customer, String type) {
        try {
            // file write to write the bill in a notepad . txt
            FileWriter file = new FileWriter("Bills.txt");
            BufferedWriter writeout = new BufferedWriter(file);
            writeout.write("firstname  " + customer.getFirstname() + "\n" + "lastname   "
                    + customer.getLastname() + "\n" + "address   " + customer.getAddress()
                    + "\n" + "type   " + type + "\n" + "Discount   " + DiscountAmount + "\n" + "bilpay  "
                    + billPayAmount + "\n" + "price   " + PriceAmount + "");
            // thanking message for the user
            System.out.println("****************************************************");
            System.out.println("\t THANK YOU FOR VISITING APPLE STORE");
            System.out.println("****************************************************");
            writeout.close();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    @Override
    public String toString() {
        return "price   " +
                PriceAmount + "\n" +
                "Discount   " + DiscountAmount + "\n" + 
                "bilPay   " + billPayAmount;
    }

}
