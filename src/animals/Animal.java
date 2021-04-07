package animals;

public abstract class Animal {
  private static int maxId = 0;
  private int id;
  private String name;
  private int yearNamed;

  public Animal(String name, int yearNamed) {
    this.id = maxId;
    maxId++;
    this.name = name;
    this.yearNamed = yearNamed;
  }

  public abstract String move();
  public abstract String breathe();
  public abstract String reproduce();

  public String getName() {
    return name;
  }

  public int getYearNamed() {
    return yearNamed;
  }

  @Override
  public String toString() {
    return 
      "Animals{"
      + "id=" + this.id + ", "
      + "name='" + this.name + "', "
      + "yearNamed=" + this.yearNamed
      + "}\n"
    ;
  }

  public void display() {
    System.out.println(
      this.name + " "
      + this.reproduce() + " "
      + this.move() + " "
      + this.breathe() + " "
      + this.yearNamed
    );
  }
}