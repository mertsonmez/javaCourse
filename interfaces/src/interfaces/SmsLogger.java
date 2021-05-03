package interfaces;

public class SmsLogger implements Logger {
    @Override
    public void log(String message) {
        //TODO
        System.out.println("Sms gönderildi : " + message);
    }
}
