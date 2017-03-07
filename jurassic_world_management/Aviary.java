package jurassic_world_management;

import java.util.*;

public class Aviary extends Enclosure {

  ArrayList<Flyable> dinosaurs;

  public Aviary(String name) {
    super(name);
    this.dinosaurs = new ArrayList<Flyable>();
  }

  public void addDinosaur(Flyable flyer) {
    dinosaurs.add(flyer);
  }

  public void removeDinosaur(Flyable flyer) {
    dinosaurs.remove(flyer);
  }
}