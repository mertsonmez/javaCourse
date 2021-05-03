package inheritance;

public class CustomerManager {
    public void add(Customer customer) {
        System.out.println(customer.customerNumber + " kaydedildi.");
    }

    //bulk insert
    public void addMultiple(Customer[] customers) {
        for (Customer customer : customers) {
            add(customer);
        }
    }


    public void add(IndividualCustomer customer) {
        System.out.println(customer.customerNumber + " kaydedildi.");
    }

    public void add(CorporateCustomer customer) {
        System.out.println(customer.customerNumber + " kaydedildi.");
    }
}


/*
! SOLID
* Single Responsibility Principle
* Open-Close Principle
* Liskov Substitution Principle
* Interface Segregation Principle
* Dependency Inversion Principle
*/
