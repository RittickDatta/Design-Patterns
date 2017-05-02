package design.pattern.BuilderPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
