package case5.step2;

public class MyClassB implements Observer {
    private boolean bplay;

    @Override
    public void update(boolean play) {
        this.bplay = play;
        myActControl();
    }

    private void myActControl() {
        if (bplay) {
            System.out.println("MyClassB : 동작을 시작합니다.");
        } else
            System.out.println("MyClassB : 동작을 정지합니다.");
    }
}
