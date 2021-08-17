package case1.step2;

public class TestPattern1 {
    public static void main(String[] args) {
        DataBase dataBase;

        dataBase = DataBase.getInstance("첫 번째 Database");
        System.out.println("this is the " + dataBase.getName() + "!!!");

        dataBase = DataBase.getInstance("두 번째 Database");
        System.out.println("this is the " + dataBase.getName() + "!!!");

    }
}
