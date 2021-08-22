package case5.step3;

public class MyClassB implements Observer {
    Publisher observable; //등록될 Observable
    private boolean bplay;

    //생성될 때 직접 자기 자신을 옵저버에 등록한다.
    public MyClassB(Publisher observable) {
        this.observable = observable;
    }

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
