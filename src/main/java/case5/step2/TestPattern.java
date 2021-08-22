package case5.step2;

public class TestPattern {
    public static void main(String[] args) {
        PlayController controller = new PlayController();
        MyClassA A = new MyClassA();
        MyClassB B = new MyClassB();

        //구독자(옵저버) 등록
        controller.addObserver(A);
        controller.addObserver(B);

        //메세지 등록
        controller.setFlag(true);//set 메서드안에서 notify메서드가 호출됨.

        //구독해지
        controller.deleteObserver(A);

        System.out.println("================");

        //메세지 등록
        controller.setFlag(false);
    }
}
