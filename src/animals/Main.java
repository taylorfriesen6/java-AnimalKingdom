package animals;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Mammal("Panda", 1869));
    animals.add(new Mammal("Zebra", 1778));
    animals.add(new Mammal("Koala", 1816));
    animals.add(new Mammal("Sloth", 1804));
    animals.add(new Mammal("Armadillo", 1758));
    animals.add(new Mammal("Raccoon", 1758));
    animals.add(new Mammal("Bigfoot", 2021));

    animals.add(new Bird("Pigeon", 1837));
    animals.add(new Bird("Peacock", 1821));
    animals.add(new Bird("Toucan", 1758));
    animals.add(new Bird("Parrot", 1824));
    animals.add(new Bird("Swan", 1758));

    animals.add(new Fish("Salmon", 1758));
    animals.add(new Fish("Catfish", 1817));
    animals.add(new Fish("Perch", 1758));


    System.out.println("*** List all the animals in descending order by year named ***");
    animals.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
    System.out.println(animals);

    System.out.println("*** List all the animals alphabetically ***");
    animals.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
    System.out.println(animals);

    System.out.println("*** List all the animals by how they move ***");
    animals.sort((a1, a2) -> a1.move().compareTo(a2.move()));
    System.out.println(animals);

    System.out.println("*** List only those animals the breath with lungs ***");
    animals.stream()
      .filter(a -> a.breathe() == "lungs")
      .forEachOrdered(a -> a.display())
    ;

    System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
    animals.stream()
      .filter(a -> a.breathe() == "lungs" && a.getYearNamed() == 1758)
      .forEachOrdered(a -> a.display())
    ;

    System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
    animals.stream()
      .filter(a -> a.breathe() == "lungs" && a.reproduce() == "eggs")
      .forEachOrdered(a -> a.display())
    ;

    
    System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
    animals.stream()
      .filter(a -> a.getYearNamed() == 1758)
      .sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
      .forEachOrdered(a -> a.display())
    ;

    System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
    animals.stream()
      .filter(a -> a instanceof Mammal)
      .sorted((a1, a2) -> a1.getName().compareTo(a2.getName()))
      .forEachOrdered(a -> a.display())
    ;
  }
}
