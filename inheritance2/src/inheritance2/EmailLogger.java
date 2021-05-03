package inheritance2;

public class EmailLogger extends Logger { //sub class

    @Override
    public void log() {
        System.out.println("Email yollandı");
    }
}
