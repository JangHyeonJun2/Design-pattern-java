package case5.step1;

public class TestPattern {
    public static void main(String[] args) {
        Notice notice = new Notice();
        FirstUser fu = new FirstUser("유저1");
        SecondUser su = new SecondUser("유저2");

        notice.attach(fu);
        notice.attach(su);

        String msg = "공지사항입니다. 필독해주세요!";
        notice.notifyObservers(msg);

        notice.detach(fu); //FirstUser 공지사항 받는 대상에서 제거
        msg = "안녕하세요. 회원 한명이 제거 되었어요 ^_^";
        notice.notifyObservers(msg);
    }
}
