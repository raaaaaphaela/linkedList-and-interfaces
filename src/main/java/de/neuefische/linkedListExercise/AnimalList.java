package de.neuefische.linkedListExercise;

import lombok.Data;

@Data
public class AnimalList {

    private AnimalListItem head;

    public String toString() {
        AnimalListItem current = head;

        StringBuilder list = new StringBuilder();

        while (current != null) {
            list.append(current.getValue().getName());
            if (current.getNext() != null) {
                list.append(" -> ");
            }
            current = current.getNext();
        }
        return String.valueOf(list);
    }


    public void append(Animal animal) {
        AnimalListItem current = head;

        if (head == null) {
            head = new AnimalListItem(animal);
            return;
        }

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new AnimalListItem(animal));
    }

    public void deleteWithAnimal(Animal animal) {
        // if head is null, just leave
        if (head == null) {
            return;
        }
        // if it's the head, just get it and leave
        if (head.getValue().equals(animal)) {
            head = head.getNext();
            return;
        }

        // if it's in the list, run through and find the element, that has the delete obj as the next
        AnimalListItem current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(animal)) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }
}
