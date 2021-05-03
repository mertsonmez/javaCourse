package interfaces;

public class Main {

    public static void main(String[] args) {
        Logger[] loggers = {new EmailLogger(),new SmsLogger(),new DatabaseLogger()};
	// write your code here
        CustomerManager customerManager = new CustomerManager(loggers);
        Customer engin = new Customer(1,"Engin","Demiroğ");

        customerManager.add(engin);
    }
}
