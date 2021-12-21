package driveAndFly;

public abstract class Vehicle {
    public int speed;
    public float weight;

    public Vehicle(int speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public abstract void turnOnEngine();

    public abstract void turnOffEngine();

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
