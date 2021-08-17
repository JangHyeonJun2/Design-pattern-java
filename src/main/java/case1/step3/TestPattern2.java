package case1.step3;

public class TestPattern2 {
    static int nNum = 0;

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                nNum++;
                DataBase dataBase = DataBase.getInstance(nNum + "번째 database");
                System.out.println("This is the " + dataBase.getName() + "!!!");
            }catch (Exception e) {

            }
        };

        for (int i=0; i<10; i++) {
            Thread t = new Thread(task);
            t.start();
        }
    }
}
