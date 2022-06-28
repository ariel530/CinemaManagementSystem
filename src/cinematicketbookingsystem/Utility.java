
package cinematicketbookingsystem;

import cinematicketbookingsystem.Database.DatabaseInteraction;
import cinematicketbookingsystem.Model.Cart;
import cinematicketbookingsystem.Model.Users;
import java.util.ArrayList;


public class Utility {
   
    public static DatabaseInteraction databaseInteraction = new DatabaseInteraction();
   
    public static Users currentUsers = null;
   
    public static ArrayList<Cart> cartData = new ArrayList<>();
    
    
    public static final int DRINKPRICE=10;
    public static final int POPCORNPRICE=30;

}
