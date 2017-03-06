package jurassic_world_management;

public abstract class Dinosaur {

  String name;
  DinosaurType type;
  int foodLevel;
  
  public Dinosaur(String name) {
    this.name = name;
    this.type = type;
    this.foodLevel = 10;
  }

  public String getName() {
    return this.name;
  } 

  public String getType() {
    return this.type.toString();
  } 

  public int getFoodLevel() {
    return this.foodLevel;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFoodLevel(int foodLevel) {
    this.foodLevel = foodLevel;
  }

  public void eat() {
    setFoodLevel(100);
  }

  public String checkFood() {
    if (this.foodLevel > 100) {
      this.foodLevel = 100;
      return "NOT HUNGRY!";
    }

    else if (this.foodLevel < 50) {
      this.foodLevel = 0;
      return "HUNGRY!";
    }

    return null;
  }
}
