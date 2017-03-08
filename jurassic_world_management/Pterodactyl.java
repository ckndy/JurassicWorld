package jurassic_world_management;

public class Pterodactyl extends Dinosaur implements Flyable {

  public Pterodactyl(String name) {
    super(name);
    this.type = DinosaurType.PTERODACTYL;
  }
}

