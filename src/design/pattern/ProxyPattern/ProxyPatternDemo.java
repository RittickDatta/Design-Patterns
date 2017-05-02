package design.pattern.ProxyPattern;

/**
 * Created by Rittick on 4/29/2017.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
