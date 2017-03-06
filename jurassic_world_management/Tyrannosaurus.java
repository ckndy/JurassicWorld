package jurassic_world_management;

public class Tyrannosaurus extends Dinosaur implements Carnivore {

  public Tyrannosaurus(String name) {
    super(name);
    this.type = DinosaurType.TYRANNOSAURUS;
  } 
}