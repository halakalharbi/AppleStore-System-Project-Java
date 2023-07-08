
import java.util.Scanner;
// ------------------------------------ PRODUCTS CLASS
public class Products {
     // DECLARING THE ARRAY ( TYPE OF IPHONES AND TYPE OF IPAD)
    private String[] iPhoneType={" 1-Iphone10 price "+10000,
        " 2-Iphone11 price "+10000 , 
        " 3-Iphone12 price "+10000} ;
    private String[] iPadType={"1-ipad mini price 12000",
        "2-ipad pro2020 price 12000"};
     //DECLARING VARIABLES
   private int SelectedProductItem;
   // scanner
    Scanner scan=new Scanner(System.in);
   
    /**
     * METHOD GETTING THE TYPE OF IPHONE
     * @return the type of iPhone selected by the user
     */
    public String  GetiPhoneType()
    {
        // Asking the user the type of iPhone they want
       System.out.println("Select whic type of iPhone you want?");
       // ENHANCED LOOP FOR TYPE OF TABLETS
       for(String iphone:iPhoneType)
       {
          System.out.println(iphone); 
       }
       SelectedProductItem=scan.nextInt();
       // IF THEY SELECT 1 = IPHONE 10
       if (SelectedProductItem==1)
       {
           return "Iphone10";
       }
       // IF THEY SELECT 2 = IPHONE 11
       else if(SelectedProductItem==2)
       {
           return "Iphone11";
       }
       // IF THEY SELECT 3 = IPHONE 12
       else if (SelectedProductItem==3)
       {
           return "Iphone12";
       } 
       else {
          return null;
         }
    }
    /**
     * METHOD FOR THE TYPE OF TABLETS
     * @return the type of tablet selected by the user
     */
    public String GetiPadType ( )
    { 
        
        // Asking the user the type of iPad they want
        System.out.println("Select whic type of iPad you want? ");
       // ENHANCED LOOP FOR TYPE OF TABLETS
       for(String iPad:iPadType)
       {
          System.out.println(iPad); 
       }
       SelectedProductItem=scan.nextInt();
       // IF THEY SELECT 1 = IPAD MINI
       if (SelectedProductItem==1)
       {
           return "ipad mini";
       }
       // IF THEY SELECT 2 = IPAD PRO 2020
       else if(SelectedProductItem==2)
       {
           return "ipad pro2020";
       }
      
       else{
        
          return null;
         }
    }
   
}
