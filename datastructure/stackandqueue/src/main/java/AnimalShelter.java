import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AnimalShelter {
    public Queue<Animal> animals = new Queue<Animal>();
    public void enqueue(Animal animal) {
        animals.enqueue(animal);
    }
    public Animal dequeue(String animal) {
        if (animal.equals("dog")) {
            return animals.dequeue() ;
        } else if (animal.equals("cat")) {
            return animals.dequeue();
        } else {
            return null;
        }
    }
}
