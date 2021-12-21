package driveAndFly;

public class Car extends Vehicle implements Driveable {
    public int gear;

    public Car(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void turnOnEngine() {
        System.out.println("brrrrrrrrrr");
    }

    @Override
    public void turnOffEngine() {
        System.out.println("rrrrrr.....___          ");
    }

    @Override
    public void accelerate() {
        int currentSpeed = this.getSpeed();
        if (currentSpeed > 0) {
            this.setSpeed(currentSpeed + (this.gear * 10));
        }
    }

    @Override
    public void brake() {
        this.setSpeed(this.speed -= 10);
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }
}
