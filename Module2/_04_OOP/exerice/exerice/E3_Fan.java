package exerice;

public class E3_Fan {

    static final private int SLOW = 1;
    static final private int MEDIUM = 2;
    static final private int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public E3_Fan() {
        this.on = false;
        this.speed = SLOW;
        this.radius = 5;
        this.color = "blue";
    }

    public String toString() {
        if (on) {
            return "Fan in on. Infor of Fan - Speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
        } else {
            return "Fan in off. Infor of Fan - Color: " + this.color + ", radius: " + this.radius;
        }
    }

    public static void main(String[] args) {
        E3_Fan fan1 = new E3_Fan();
        fan1.setOn(true);
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println("Infor fan1: " + fan1);

        E3_Fan fan2 = new E3_Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setColor("blue");
        System.out.println("Infor fan2: " + fan2);
    }
}
