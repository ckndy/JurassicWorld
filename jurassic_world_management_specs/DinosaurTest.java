import static org.junit.Assert.*;
import org.junit.*;
import jurassic_world_management.*;

public class DinosaurTest {

  Tyrannosaurus tyrannosaurus;
  
  Velociraptor velociraptor1;
  Velociraptor velociraptor2;
  Velociraptor velociraptor3;
  Velociraptor velociraptor4;

  Pterodactyl pterodactyl;
  
  @Before
  public void before() {

    tyrannosaurus = new Tyrannosaurus("Alan");

    velociraptor1 = new Velociraptor("Blue");
    velociraptor2 = new Velociraptor("Delta");
    velociraptor3 = new Velociraptor("Echo");
    velociraptor4 = new Velociraptor("Charlie");

    pterodactyl = new Pterodactyl("Steve");
  }

  @Test
  public void getName() {
    assertEquals("Blue", velociraptor1.getName());
  }

  @Test
  public void setName() {
    velociraptor1.setName("Blue");
    assertEquals("Blue", velociraptor1.getName());
  }

  @Test
  public void getHungerLevel() {
    assertEquals(50, velociraptor1.getHungerLevel());
  }

  @Test
  public void setHungerLevel() {
    velociraptor1.setHungerLevel(0);
    assertEquals(0, velociraptor1.getHungerLevel());
  }

  @Test
  public void canEat() {
    assertEquals(50, velociraptor1.getHungerLevel());
  }
}

