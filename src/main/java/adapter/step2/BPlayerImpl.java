package adapter.step2;

public class BPlayerImpl extends BPlayer {
    @Override
    public void playFile(String fileName) {
        System.out.println("(B) " + fileName);
    }

    @Override
    public void stopFile() {

    }
}
