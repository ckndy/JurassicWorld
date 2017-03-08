import static org.junit.Assert.*;
import org.junit.*;
import jurassic_world_management.*;
import java.util.*;

public class EnclosureTest {

  Tyrannosaurus tyrannosaurus;
  Velociraptor velociraptor;
  Pterodactyl pterodactyl;
  
  Paddock9 paddock9;
  RaptorPaddock raptorPaddock;
  Aviary aviary;
  
  @Before
  public void before() {

    tyrannosaurus = new Tyrannosaurus("Alan");

    velociraptor = new Velociraptor("Blue");
    velociraptor = new Velociraptor("Delta");
    velociraptor = new Velociraptor("Echo");
    velociraptor = new Velociraptor("Charlie");

    pterodactyl = new Pterodactyl("Steve");

    paddock9 = new Paddock9("T-Rex Paddock");
    raptorPaddock = new RaptorPaddock("Raptor Paddock");
    aviary = new Aviary("Dactyl Cage");
  }

  @Test
  public void getEnclosureName() {
    assertEquals("Raptor Paddock", raptorPaddock.getName());
  }

  @Test
  public void addCarnivore() {
   raptorPaddock.addDinosaur(velociraptor); 
 }
}



