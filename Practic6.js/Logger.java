import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Logger {
    private Logger(){
    }
    private static Logger logger;
    public static Logmessage _level = Logmessage.INFO;
    public static Logger GetInstance(){
        if(logger == null)
            logger = new Logger();
        return logger;
    }
    public static void SetLevel(Logmessage level){
        _level = level;
    }
    public void Log(String message, Logmessage level){
        if(_level == level){
            try {
                Files.write(Paths.get("C:\\Users\\KhanekShakh\\Desktop\\Lessons\\3 курс\\1 семестр\\Шаблоны проектирования приложений\\Пр\\Practic6.js\\text.txt"),
                        (level + " " + message + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}