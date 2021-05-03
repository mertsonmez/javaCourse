package inheritance2;

public class LogManager { //operations class
    public void log(int logType) {
        if (logType == 1) {
            System.out.println("Veritabanına loglandı.");
        } else if (logType == 2) {
            System.out.println("Dosyaya loglandı.");
        } else {
            System.out.println("Email gönderildi.");
        }
    }
}

/*Log types
 * Database
 * File
 * Email
 */