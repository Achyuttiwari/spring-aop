package aspectDemo;

import org.springframework.stereotype.Component;
@Component
public class ShoppingCart {
    //Logging
    //Authentication and Autuhorization
    //Sanititze the Data
    public void checkout(String status){
        System.out.println("Checkout Method is Called");
    }
    public int quantity(){
        return 6;
    }

}
