package case3.step3;

public class TestPattern {
    public static void main(String[] args) {
        FlyweightFactory flyweight = new FlyweightFactory();
        flyweight.getSubject("a");
        flyweight.getSubject("a");
        flyweight.getSubject("b");
        flyweight.getSubject("b");
        flyweight.getSubject("d");
    }
}
