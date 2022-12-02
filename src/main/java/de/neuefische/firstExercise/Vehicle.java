package de.neuefische.firstExercise;

import lombok.Data;

@Data
public abstract class Vehicle implements Accelerateable {

    private int id;
    private String name;
    private int velocity;

    @Override
    public int accelerate(int kmh) throws Exception {
        return 0;
    }
}
