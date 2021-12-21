package driveAndFly;

public class FlyingCar extends Vehicle implements Driveable, Flyable {
    public int height;
    public int gear;

    public FlyingCar(int speed, float weight) {
        super(speed, weight);
        this.gear = 0;
        this.height = 0;
    }

    @Override
    public void turnOnEngine() {
        System.out.println("WEEEEEEEHHHH");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("HEEEEEEWWW");
    }


    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }

    @Override
    public void land() {
        System.out.println("landing");
    }

    @Override
    public void changeHeight(int height) {
        this.height = height;
    }

    @Override
    public void accelerate() {
        this.speed += this.gear * 10;
    }

    @Override
    public void brake() {
        this.speed -= 10;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }
}
