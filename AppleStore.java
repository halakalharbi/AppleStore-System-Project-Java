import java.util.Scanner;

public class AppleStore {
//------------------------------------ Apple store class
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Products products = new Products();
        int selectedProductItem;
        boolean TryAgain = true;// boolean of try again if the user entered a wrong number
// Welcoming message for the usera
        System.out.println("****************************************************");
        System.out.println("\tWelcome to our AppleStore");
        System.out.println("****************************************************");
// let the user choose between iPhones or iPads
        do {
            System.out.println(" if you want IPHONES press \"1\"  \n if you went TABLETS press\"2\"");
            selectedProductItem = scan.nextInt();
// if the user selected the first choice
            if (selectedProductItem == 1) {
                String typeOfProduct = products.GetiPhoneType();
                if (typeOfProduct != null) {
                    getCustomerInformation(scan, typeOfProduct);
                    TryAgain = true;
                } else {
                    System.out.println("Wrong input. Please try again:");
                    TryAgain = false;
                }
                // if the user selected the second choice
            } else if (selectedProductItem == 2) {
                String type = products.GetiPadType();
                if (type != null) {
                    getCustomerInformation(scan, type);
                    TryAgain = true;
                } 
                else {// else selected a number that doesnt exis
                    System.out.println("Wrong input. Please try again:");
                    TryAgain = false;
                }
            } 
            else { // else selected a number that doesnt exist
                System.out.println("Wrong input. Please try again:");
                TryAgain = false;
            }
        } 
        while (!TryAgain);
    }
// Method for the user to enter their information such as their fist name , last name and home address
    private static void getCustomerInformation(Scanner scan, String typeOfProduct) {
        System.out.println("Please enter your first name:"); // Asking the user to enter their first name
        String firstName = scan.next();
        System.out.println("Please enter your last name:");// Asking the user to enter their last name
        String lastName = scan.next();
        System.out.println("Please enter your address:");// Asking the user to enter their home address
        String homeAddress = scan.next();
// takes user infromation and save it
        customers customerInformation = new customers(firstName, lastName, homeAddress);
        boolean customerVisitState = customerInformation.CompareStateCotromerVisit();

        if (!customerVisitState) {
            // create a new bill and pass ( discount , bill pay amount and price amount)
            // this is for a favorite customer
            Bill bill = new Bill(.10, .10 * 10000, 10000);
            bill.savebill(customerInformation, typeOfProduct);
            System.out.println(customerInformation.toString());
            System.out.println("Type " + typeOfProduct);
            System.out.println(bill.toString());
        } 
        else {
            // create a new bill and pass ( discount , bill pay amount and price amount)
            Bill bill = new Bill(0, 10000, 10000);
            bill.savebill(customerInformation, typeOfProduct);
            System.out.println(customerInformation.toString());
            System.out.println("Type " + typeOfProduct);
            System.out.println(bill.toString());
        }
    }
}