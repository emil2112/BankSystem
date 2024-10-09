package version1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    TextUI ui = new TextUI();
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer c){
        this.customers.add(c);
    }
    public String toString(){
        String s = "";
        for (Customer c:customers) {
            s+=c+"\n";
        }
        return s;
    }

    public List<Customer> getCustomers(){
        return customers;
    }

    public void runCreateCustomerDialog(){
        String continueDialog = "y";

        while(continueDialog.equalsIgnoreCase("y")){
            String name = ui.promptText("Type name of customer");
            int startAmount = ui.promptNumeric("How much would you like to deposit, to your account?");

            Customer c1 = new Customer(name, startAmount);
            this.addCustomer(c1);
            continueDialog = ui.promptText("Do you wish to create another customer? Y/N");
        }

    }

}
