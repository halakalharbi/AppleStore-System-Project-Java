import java.util.Scanner;
// ------------------------------------ CUSTOMER CLASS

public class customers {

  // DECLARING Variabls
    private String FirstName, LastName, Address;
   
    Scanner scan = new Scanner(System.in);

    // constructor
    public customers(String FirstName, String LastName, String address) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = address;
    }
    /**
     * METHOD FOR GETTING THE FIRST NAME OF THE USER
     *
     * @return the first name entered by the user
     */
    public String getFirstname() {
        return FirstName;
    }

    /**
     * METHOD FOR GETTING THE LAST NAME OF THE USER
     *
     * @return the last name entered by the user
     */
    public String getLastname() {
        return LastName;
        
    }

    /**
     * METHOD FOR GETTING THE ADDRESS OF THE USER
     *
     * @return the address entered by the user
     */

    public String getAddress() {
        return Address;
    }

    /**
     * METHOD User Information()
     *
     * @return last name first name and the address entered by the user
     */
    public String toString() {
        return "Name   "+ FirstName+ " " + LastName+ "\n" + "Address   "+ Address;
    }
    /**
     * this is a compare method if its the first time visit the store it
     * should input (yes) if its not then ( no )
     *
     * @return true or false depends on they visited or not
     */
    public boolean CompareStateCotromerVisit() {
        String CustomerVisitState;
        System.out.println("first time visiting our Store? \n yes \n no");
        CustomerVisitState = scan.next();
        
        if (CustomerVisitState.equalsIgnoreCase("yes")) {
            return false;
        } else {
            return true;
        }
    }
}