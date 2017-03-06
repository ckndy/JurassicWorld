import static org.junit.Assert.*;
import org.junit.*;
import jurassic_world_management.*;
import java.util.*;

public class EnclosureTest {

  Tyrannosaurus tyrannosaurus;
  Velociraptor velociraptor;
  Paddock9 paddock9;
  RaptorPaddock raptorPaddock;
  
  @Before
  public void before() {

    tyrannosaurus = new Tyrannosaurus();
    velociraptor = new Velociraptor();
    paddock9 = new Paddock9();
    raptorPaddock = new RaptorPaddock();
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



