package jurassic_world_management;

public abstract class Dinosaur {

  String name;
  DinosaurType type;
  int hungerLevel;
  
  public Dinosaur(String name) {
    this.name = name;
    this.type = type;
    this.hungerLevel = 50;
  }

  public String getName() {
    return this.name;
  } 

  public String getType() {
    return this.type.toString();
  } 

  public int getHungerLevel() {
    return this.hungerLevel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setHungerLevel(int hungerLevel) {
    this.hungerLevel = hungerLevel;
  }

  public void eat() {
    setHungerLevel(100);
  }

  public String checkFood() {
    if (this.hungerLevel > 100) {
      this.hungerLevel = 100;
      return "NOT HUNGRY!";
    }

    else if (this.hungerLevel < 50) {
      this.hungerLevel = 0;
      return "HUNGRY!";
    }

    return null;
  }
}
