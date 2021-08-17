package case2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LogWriter {
    private static LogWriter singleton = new LogWriter();
    private static BufferedWriter bw;

    private LogWriter() {
        try {
            bw = new BufferedWriter(new FileWriter("log.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public synchronized void log(String str) throws IOException {
        try {
            //현재 날짜와 시각 추가
            //bw.write(LocalDateTime.now() + ":" + str + "\n");
            bw.write(LocalDateTime.now() + " : " +str + "\n");
            bw.flush();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static LogWriter getInstance() {
        return singleton;
    }
}
