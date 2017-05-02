package design.pattern.ChainOfResponsibility;

/**
 * Created by Rittick on 4/29/2017.
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: "+message);
    }
}
