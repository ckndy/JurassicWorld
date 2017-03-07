import static org.junit.Assert.*;
import org.junit.*;
import jurassic_world_management.*;

public class DinosaurTest {

  Tyrannosaurus tyrannosaurus;
  Velociraptor velociraptor;

  Pterodactyl pterodactyl;
  
  @Before
  public void before() {

    tyrannosaurus = new Tyrannosaurus();
    velociraptor = new Velociraptor("Blue");
    // velociraptor2 = new Velociraptor("Delta");
    // velociraptor3 = new Velociraptor("Echo");
    // velociraptor4 = new Velociraptor("Charlie");
    pterodactyl = new Pterodactyl();
  }

  @Test
  public void getName() {
    assertEquals(velociraptor.getName());
  }

  @Test
  public void getHungerLevel() {
    assertEquals(50, velociraptor.getHungerLevel());
  }

  @Test
  public void setName() {
    velociraptor.setName("Blue");
    assertEquals("Blue", velociraptor.getName());
  }

  @Test
  public void setHungerLevel() {
    velociraptor.setHungerLevel(0);
    assertEquals(0, velociraptor.getHungerLevel());
  }

  @Test
  public void canEat() {
    assertEquals(50, velociraptor.getHungerLevel());
  }
}

 