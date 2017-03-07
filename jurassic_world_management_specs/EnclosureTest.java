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

    tyrannosaurus = new Tyrannosaurus();
    velociraptor = new Velociraptor();
    pterodactyl = new Pterodactyl();

    paddock9 = new Paddock9();
    raptorPaddock = new RaptorPaddock();
    aviary = new Aviary();
  }

  @Test
  public void getEnclosureName() {
    assertEquals("RaptorPaddock", raptorpaddock.getName());
  }

  @Test
  public void addCarnivore() {
   raptorpaddock.addDinosaur(velociraptor); 
 }
}



