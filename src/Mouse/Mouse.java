package Mouse;

public class Mouse {
    private int speed;

    public Mouse(int speed) {
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        if (speed<0) return;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                '}';
    }
}
