package jurassic_world_management;

import java.util.*;

public class Paddock9 extends Enclosure {

  ArrayList<Carnivore> dinosaurs;

  public Paddock9(String name) {
    super(name);
    this.dinosaurs = new ArrayList<Carnivore>();
  }

  public void addDinosaur(Carnivore carnivore) {
    dinosaurs.add(carnivore);
  }

  public void removeDinosaur(Carnivore carnivore) {
    dinosaurs.remove(carnivore);
  }
}