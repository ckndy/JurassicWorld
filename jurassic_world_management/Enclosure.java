package jurassic_world_management;

import java.util.*;

public abstract class Enclosure {

  String name;

  public Enclosure(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  } 

  public void setName(String name) {
    this.name = name;
  }
}