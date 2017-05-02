package design.pattern.SingletonPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
