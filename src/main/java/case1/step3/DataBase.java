package case1.step3;

/**
 * step2와 비교를 하면 private static DataBase singleton = new DataBase("products");에서 바로 객체를 생성하였다.
 * 또한 singleton이 null인지 비교를 하지 않아도 된다. 이유는 static 메서드 또는 클래스는 Runtime때 바로 생기기 때문에 굳이 getInstance메서드에서 비교할 필요가 없었다.
 * 과정은 이렇게 된다. 만약 10개의 DataBase를 만든다면 이미 Runtime때 product라는 생성자의 이름으로 만들어졌고, 그렇다면 이름은 product로 고정이 될 것이다.
 * 그리고 getInstance메서드에서 만들어진 생성자 즉, new DataBase("products");을 내보내준다.
 */
public class DataBase {
    private static DataBase singleton = new DataBase("products");
    private String name;

    private DataBase(String name) {
        this.name = name;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static DataBase getInstance(String name) {
        return singleton;
    }
    public String getName() {
        return name;
    }
}
