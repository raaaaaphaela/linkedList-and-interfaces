package de.neuefische.firstExercise;

public class Auto extends Vehicle {

    public Auto (int velocity) {
        this.setVelocity(velocity);
    }

    @Override
    public int accelerate(int kmh) {
        int newVelocity = this.getVelocity() + kmh;

        this.setVelocity(newVelocity);
        System.out.println("Geschwindigkeit um " + kmh + " erhöht. Neue Geschwindigkeit: " + this.getVelocity());
        return this.getVelocity();
    }
}
