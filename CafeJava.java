public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.5;
        double latte = 5;
        double cappuccino = 4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + pendingMessage);
        System.out.println(" "); 

    	// ** Customer 1 ** //
        if(isReadyOrder2 == true){
            System.out.println(generalGreeting + customer2);
            System.out.println(customer2 + readyMessage); 
            System.out.println(displayTotalMessage + cappuccino); 
            System.out.println(" "); 
        }
        else {
            System.out.println(generalGreeting + customer2);
            System.out.println(customer2 + pendingMessage); 
            System.out.println(" "); 
        }

        // ** Customer 2 ** //
        if(isReadyOrder3 == true){
            System.out.println(generalGreeting + customer3);
            System.out.println(customer3 + readyMessage); 
            System.out.println(displayTotalMessage + (latte * 2)); 
            System.out.println(" "); 
        }
        else {
            System.out.println(generalGreeting + customer3);
            System.out.println(customer2 + pendingMessage); 
            System.out.println(" "); 
        } 

        System.out.println("Sorry, " + customer4 + ". There must have been a mix up.");
        System.out.println("Here is your new total " + (latte - dripCoffee)); 
    }
}
