package de.neuefische;

import de.neuefische.firstExercise.Auto;
import de.neuefische.firstExercise.Fahrrad;
import de.neuefische.linkedListExercise.Animal;
import de.neuefische.linkedListExercise.AnimalList;

public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto(20);
        auto.accelerate(5);

        Fahrrad fahrrad = new Fahrrad(10);

        fahrrad.accelerate(35);

        Fahrrad rad = new Fahrrad(12);
        rad.accelerate(3);


        // LinkedList
        Animal first = new Animal("Affe");
        Animal second = new Animal("Hund");
        Animal third = new Animal("Katze");

        AnimalList list = new AnimalList();
        list.append(first);
        System.out.println("first: " + list);
        list.append(second);
        System.out.println("second: " + list);

        list.append(third);
        System.out.println("third: " + list);

        list.deleteWithAnimal(second);
        System.out.println(list);

    }
}