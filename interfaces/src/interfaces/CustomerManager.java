package interfaces;

public class CustomerManager {
    //neye bağımlıysak onun değişkenini yapıyoruz !!
    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }
    //bağımlılık türleri
    //loosely coupled
    //tightly coupled

    public void add(Customer customer) {
        System.out.println("Müşteri eklendi " + customer.getFirstName());
        //way1
        //Utils utils = new Utils();
        //utils.runLoggers(loggers,customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName());


    }

    public void delete(Customer customer) {
        System.out.println("Müşteri silindi " + customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
    }


}
