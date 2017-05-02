package design.pattern.BridgePattern;

/**
 * Created by Rittick on 4/29/2017.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing circle: radius"+radius+" x: "+x+" y: "+y);
    }
}
