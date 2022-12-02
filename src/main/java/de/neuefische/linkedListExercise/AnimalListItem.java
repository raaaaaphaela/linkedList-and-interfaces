package de.neuefische.linkedListExercise;

import lombok.Data;

@Data
public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value){
         this.value = value;
    }
}
