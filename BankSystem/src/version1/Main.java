package version1;

/** This example demonstrates the foundations of building an object-oriented system in Java.
 *  It uses the domain of a bank
 *
 *  version1.Main branch, subjects and techniques:
 *
 *    version1.Customer and version1.Bank classes
 *
 *    - access modifiers
 *    - this keyword
 *    - constructors
 *    - getters (and setters)
 *    - toString
 *    - creating a method for adding object to list
 *
 *    version1.Main class
 *
 *    - instantiation
 *    - calling instance methods
 *    - displaying state
 *
 *
 *  THINGS TO CONSIDER
 *    The creation of objects is fixed in the main method.
 *    What if we want to give the user the ability to add new customers to the bank? (see branch add-hoc object creation)
 *
 */


class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Sparekassen");

        if(bank.getCustomers().isEmpty()){
            bank.runCreateCustomerDialog();
        }

        /*
        Customer c1 = new Customer("Kamala",3000);
        c1.setBalance(4000);
        c1.addToBalance(1000);

        bank.addCustomer(c1);

        Customer c2 = new Customer("Tim",3000);
        c2.setBalance(4000);
        c2.addToBalance(500);



        bank.addCustomer(c2);

         */

        System.out.print(bank);


    }
}