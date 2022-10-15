import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Logger {
    private static Logger logger = null;
    private int messageCounter = 1;

    private final Date date = new Date();
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.getDefault());

    private Logger(){}

    public static Logger getInstanceLogger(){
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String message){
        System.out.println("[" + simpleDateFormat.format(date.getTime()) + " " + messageCounter++ + "] " + message);
    }



}
