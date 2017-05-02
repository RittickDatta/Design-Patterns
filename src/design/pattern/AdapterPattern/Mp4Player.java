package design.pattern.AdapterPattern;

/**
 * Created by Rittick on 4/28/2017.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file. Name: "+fileName);
    }

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }
}
