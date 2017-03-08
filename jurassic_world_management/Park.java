package jurassic_world_management;
import java.util.*;

public class Park {

  String name;
  ArrayList<Dinosaur> assetsOutOfContainment;
  ArrayList<Enclosure> enclosures;
  int visitors;
  int funds;

  public Park(String name) {
    this.name = name;
    this.enclosures = new ArrayList<Enclosure>();
    this.assetsOutOfContainment = new ArrayList<Dinosaur>();
    this.visitors = 0;
    this.funds = 0;
  }

  public String getName() {
    return this.name;
  }

  public int getVisitorNumbers() {
    return this.visitors;
  }

  public int getFunds() {
    return this.funds;
  }

  public int getAssetsOutOfContainment() {
    return assetsOutOfContainment.size();
  }

  public int getNumOfEnclosures() {
    return enclosures.size();
  }

  public String setName(String name) {
    return this.name = name;
  }

  public void setVisitors(int visitors) {
    this.visitors = visitors;
  }

  public void setFunds(int funds) {
    this.funds = funds;
  }

  public void addEnclosure(Enclosure enclosure) {
    enclosures.add(enclosure);
  }

  public void removeEnclosure(Enclosure enclosure) {
    enclosures.remove(enclosure);
  }

  public void addAssetsOutOfContainment(Dinosaur dinosaur) {
    assetsOutOfContainment.add(dinosaur);
  }

  public void removeAssetsOutOfContainment(Dinosaur dinosaur) {
    assetsOutOfContainment.remove(dinosaur);
  }
}

  

  