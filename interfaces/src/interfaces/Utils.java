package interfaces;

public class Utils { //Araç-Araçlar (Utilities)
    public static void runLoggers(Logger[] loggers, String message){
        for (Logger logger:loggers) {
            logger.log(message);
        }
    }
    //! Javada en üst class en dış class static olmaz
    //alt classlar static olabilir.
    // public static class Birsey{ }

}
