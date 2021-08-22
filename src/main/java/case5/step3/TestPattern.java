package case5.step3;

public class TestPattern {
    //Sub객체처럼 바꾸었음!
    public static void main(String[] args) {
        PlayController controller = new PlayController();
        MyClassA A = new MyClassA(controller);
        MyClassB B = new MyClassB(controller);

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
