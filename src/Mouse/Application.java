package Mouse;

public class Application {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурзик", 30, 20);
        Cat cat2 = new Cat("Муся", 35, 11);

        cat1.caughtMouse(new Mouse(20));
        cat1.caughtMouse(new Mouse(15));
        cat1.caughtMouse(new Mouse(10));
        cat1.caughtMouse(new Mouse(20));
        cat1.caughtMouse(new Mouse(9));


        cat2.caughtMouse(new Mouse(12));
        cat2.caughtMouse(new Mouse(18));
        cat2.caughtMouse(new Mouse(15));
        cat2.caughtMouse(new Mouse(10));

        System.out.println(cat1);
        System.out.println(cat2);
        cat1.catFight(cat2);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}