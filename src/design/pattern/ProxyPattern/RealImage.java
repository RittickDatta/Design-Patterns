package design.pattern.ProxyPattern;

/**
 * Created by Rittick on 4/29/2017.
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying "+fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading "+fileName);
    }
}
