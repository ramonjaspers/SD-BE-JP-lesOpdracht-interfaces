package driveAndFly;

public class Helicopter extends Vehicle implements Flyable {
    public int height;

    public Helicopter(int speed, float weight) {
        super(speed, weight);
        this.height = 0;
    }

    @Override
    public void turnOnEngine() {
        System.out.println("BOBOBOBOBOBOOBOBOBBOBOBOOOP");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("WOPWOWPWOPWOWPOWPOWOWWPWPPppp............__  ");

    }

    @Override
    public void takeOff() {
        System.out.println("Taking off");
        this.height = 1;
    }

    @Override
    public void land() {
        System.out.println("landing");
        this.height = 0;

    }

    @Override
    public void changeHeight(int height) {
        this.height = height;
    }
}
