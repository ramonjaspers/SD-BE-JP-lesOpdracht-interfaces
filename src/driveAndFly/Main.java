package driveAndFly;

public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car(150, 300);
        ferrari.turnOnEngine();
        System.out.println("ferrari is" + ferrari.getWeight() + "KG");

        while(ferrari.getSpeed() < 400){
            ferrari.changeGear(++ferrari.gear);
            ferrari.accelerate();
            System.out.println("accelerating speed" + ferrari.getSpeed() + "KM/H");
        }

        while(ferrari.getSpeed() > 0){
            ferrari.brake();
            System.out.println("breaking, speed" + ferrari.getSpeed() + "KM/H");
        }

        ferrari.turnOffEngine();

        //same here but diff scenarios
        Helicopter apache = new Helicopter(300, 900);
        FlyingCar frankenstein = new FlyingCar(200, 500);
    }

}
