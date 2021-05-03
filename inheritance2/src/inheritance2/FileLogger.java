package inheritance2;

public class FileLogger extends Logger { // sub class
    //! Override etmek üzerine yazmak demek.
    //Method overriding denir.
    // Aynı zamanda kendi kodumu yazabilmek için base deki kodu eziyorum demek!
    @Override
    public void log() {
        System.out.println("Dosyaya loglandı");
    }
}
