package case3.step2;

public class TestPattern {
    public static void main(String[] args) {
        MyData myData = new MyData();
        myData.xpos = 10;
        myData.ypos = 11;
        myData.name = "홍길동";

        MyData myData2 = new MyData();
        myData2 = myData;

        MyData myData3 = new MyData();
        myData3.xpos = 20;
        myData3.ypos = 21;
        myData3.name = "손오공";

        myData2.name = "전우치";
        myData2.xpos = 5;
    }
}

class MyData {
    int xpos;
    int ypos;
    String name;
}
