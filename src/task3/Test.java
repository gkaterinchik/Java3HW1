package task3;

public class Test {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Orange orange1 = new Orange(3);
        Orange orange2 = new Orange(2);
        Apple apple1 = new Apple(4);
        Orange orange3 = new Orange(3);
        Orange orange4 = new Orange(3);
        Orange orange5 = new Orange(3);

        box1.add(orange1);
        box2.add(orange1);
        box1.add(orange2);
        box1.add(apple1);
        box1.getWeight();
        box2.add(orange3);
        box2.add(orange4);
        System.out.println("!!!!!");
        box1.transferBox(box2);
        box1.getWeight();
        box2.getWeight();
        box2.compare(box1);

    }
}
