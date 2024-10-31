import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private final File logFile;

    private Logger() {
        logFile = new File("log.txt");
    }

    public static Logger getInstance() { // Corrigido para getInstance()
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try (FileWriter writer = new FileWriter(logFile, true);
             PrintWriter printer = new PrintWriter(writer)) {
            printer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
