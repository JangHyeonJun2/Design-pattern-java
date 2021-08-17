package case2;

import java.io.IOException;

public class TestPattern1 {
    public static void main(String[] args) throws IOException {
        LogWriter logger;

        logger = LogWriter.getInstance();
        logger.log("홍길동");

        logger = LogWriter.getInstance();
        logger.log("전우치");

    }
}
