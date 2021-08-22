package case5.step1;

public class Observer {
    public String msg;

    public void receive(String msg) {
        System.out.println(this.msg + "에서 메세지를 받음 : " + msg);
    }
}
