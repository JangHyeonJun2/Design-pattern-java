package adapter.step2;

import adapter.step1.APlayer;
import adapter.step1.APlayerImpl;
import adapter.step1.BPlayer;
import adapter.step1.BPlayerImpl;

public class TestPattern {
    public static void main(String[] args) {
        APlayer aPlayer1 = new APlayerImpl();
        aPlayer1.play("aaa.mp3");

        //계약기간 만료로 APlayerImpl() 를 사용할 수 없다.

        //BPlayer : 새로 도입된 방식( 잘 동작할 것이다. )
        BPlayer bPlayer1 = new adapter.step1.BPlayerImpl();
        bPlayer1.playFile("bbb.mp3");

        /**
         * APlayer obj = (어댑터) = new BPlayerImpl();
         * 기존의 잘 동작하던 코드와 새로 도입된 코드를 변경없이 사용하고 싶은 것이다.
         * 어댑터 작용 후 에러가 난다면 어댑터 부분만 보면 될 것이다.
         */

        adapter.step2.APlayer player3 = new BToAAdapter();
        player3.play("ccc.mp3");


        /**
         * 현재 모든 코드가 APlayer 인터페이스에 맞춰서 코딩되어 있다. 그러므로 여기서 APlayer 에 대입되는 객체만 수정해주면 APlayer 인터페이스가 사용되는 부분에서는 수정할 필요가 없다.
         */
    }
}
