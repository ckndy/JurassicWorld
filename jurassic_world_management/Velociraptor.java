package jurassic_world_management;

public class Velociraptor extends Dinosaur implements Carnivore {

  public Velociraptor(String name) {
    super(name);
    this.type = DinosaurType.VELOCIRAPTOR;
  } 
}