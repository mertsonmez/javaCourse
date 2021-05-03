package inheritance2;

public class CustomerManager {
    public void add(Logger logger){
        //Müşteri ekleme kodları.
        System.out.println("Müşteri eklendi");

        //1.way
        //DatabaseLogger logger = new DatabaseLogger();
        logger.log();

        //! bir iş yapan sınıf başka bir iş yapan sınıfı kullanacaksa asla ve asla somut sınıftan gidilmez!!
        // ve bunları asla new leyemez!!
        //

    }
}
