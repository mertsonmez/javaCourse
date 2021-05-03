package inheritance2;

public class DatabaseLogger extends Logger { //sub class

    @Override
    public void log() {
        System.out.println("Veritabanına loglandı");
    }
}
