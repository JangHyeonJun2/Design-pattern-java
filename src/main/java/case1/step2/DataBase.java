package case1.step2;

public class DataBase {
    private static DataBase singleton;
    private String name;

    private DataBase(String name) {
//        super();
        this.name = name;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public synchronized static DataBase getInstance(String name) {
        if (singleton == null) {
            singleton = new DataBase(name);
        }
        return singleton;
    }
    public String getName() {
        return name;
    }
}
