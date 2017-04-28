package design.pattern.AbstracFactoryPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() Method");
    }
}
