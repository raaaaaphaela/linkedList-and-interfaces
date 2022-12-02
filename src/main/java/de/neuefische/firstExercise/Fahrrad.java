package de.neuefische.firstExercise;

public class Fahrrad extends Vehicle {

    public Fahrrad (int velocity) {
        this.setVelocity(velocity);
    }

    @Override
    public int accelerate(int kmh) throws UnsupportedOperationException {

        try {
            if (this.getVelocity() + kmh < 35) {
                this.setVelocity(this.getVelocity() + kmh);
                System.out.println("Geschwindigkeit um " + kmh + " erhöht. Neue Geschwindigkeit: " + this.getVelocity());
            } else {
                throw new UnsupportedOperationException("Error: Darf nicht schneller als 34 km/h fahren!");
            }
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return this.getVelocity();
    }
}
