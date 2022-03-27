package Mouse;

import java.util.Arrays;

public class Cat {
    private String name;
    private int speedCat;
    private int weight;
    private Mouse[] caughtMouse = new Mouse[100];

    public Cat( String name, int speedCat, int weight) {
        this.name = name;
        this.speedCat = speedCat;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSpeedCat() {
        return speedCat;
    }

    public int getWeight() {
        return weight;
    }


    private void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Значение name должно быть не null");
        }
        this.name = name;
    }
    private void setSpeedCat(int speed) {
        if (speed < 0){
            throw new IllegalArgumentException("Значение speed должно быть больше нуля");
        }
        this.speedCat = speed;
    }

    private void setWeight (int weight){
        if (weight > 0 ){
            throw new IllegalArgumentException("Значение weight должно быть больше нуля");
        }
        this.weight = weight;
    }

    public void caughtMouse(Mouse mouse){
        if (mouse == null) {
            throw new IllegalArgumentException("Mouse Null");
        }
        if (this.getSpeedCat() > mouse.getSpeed()) {
            System.out.println("Кот поймал " + mouse);
            for (int i = 0; i < caughtMouse.length; i++) {
                if (caughtMouse[i] == null) {
                    caughtMouse[i] = mouse;
                    return;
                }
            }
        } else System.out.println(mouse + " убежала");
    }

    public void catFight(Cat cat) {
        if (cat == null){
            throw new IllegalArgumentException("Cat Null");
        }
        if (this.getWeight() > cat.getWeight()) {
            System.out.println(this.getName() + " победил");
            this.getMouse(cat);
        } else {
            System.out.println(cat.getName() + " победил");
            cat.getMouse(this);
        }
    }

    public void getMouse(Cat cat){
        for (int i = 0; i < this.caughtMouse.length; i++) {
            if (caughtMouse[i] == null) {
                for (int j = 0; j < cat.caughtMouse.length; j++) {
                    if (cat.caughtMouse[j] != null) {
                        if (getSpeedCat() > cat.caughtMouse[j].getSpeed()) {
                            caughtMouse[i] = cat.caughtMouse[j];
                            if (cat.caughtMouse[j] != null)
                                cat.caughtMouse[j] = null;
                        } else {
                            System.out.println("Мышь " + cat.caughtMouse[j] + " убежала");
                            if (cat.caughtMouse[j] != null)
                                cat.caughtMouse[j] = null;
                            continue;
                        }
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", speedCat=" + speedCat +
                ", weight=" + weight +
                ", caughtMouse=" + Arrays.toString(caughtMouse) +
                '}';
    }
}
