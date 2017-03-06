import static org.junit.Assert.*;
import org.junit.*;
import jurassic_world_management.*;
import java.util.*;

public class ParkTest {

  Park park;
  Tyrannosaurus tyrannosaurus;
  Velociraptor velociraptor;
  Paddock9 paddock9;
  RaptorPaddock raptorpaddock;
  
  @Before
  public void before() {

    park = new Park("Jurassic World");
    paddock9 = new Paddock9("Paddock 9");
    raptorpaddock = new RaptorPaddock("Raptor Paddock");
    tyrannosaurus = new Tyrannosaurus();
    velociraptor = new Velociraptor("Blue");
    // velociraptor2 = new Velociraptor("Delta");
    // velociraptor3 = new Velociraptor("Echo");
    // velociraptor4 = new Velociraptor("Charlie");
  }

  @Test
  public void canGetParkName() {
    assertEquals("Jurassic World", park.getName());
  }

  @Test
  public void canGetVisitorNumbers() {
    assertEquals(0, park.getVisitorNumbers());
  }

  @Test
  public void canGetFunds() {
    assertEquals(0, park.getFunds());
  }

  @Test
  public void canGetAssetsOutOfContainment() {
    assertEquals(0, park.getAssetsOutOfContainment());
  }

  @Test
  public void canAddAssetsOutOfContainment() {
    park.addAssetsOutOfContainment(velociraptor);
    assertEquals(4, park.getAssetsOutOfContainment());
  }

  @Test
  public void canRemoveAssetsOutOfContainment() {
    park.addAssetsOutOfContainment(velociraptor);
    park.removeAssetsOutOfContainment(velociraptor);
    assertEquals(0, park.getAssetsOutOfContainment());
  }

  @Test
  public void canAddEnclosure() {
    park.addEnclosure();
    assertEquals(2, park.getNumOfEnclosures());
    assertEquals(park.getEnclosureName());
  }

  @Test
  public void canAddDinosaurToEnclosure() {
    park.addEnclosure();
    paddock9.addDinosaur(tyrannosaurus);
    assertEquals(park.getEnclosureName());
    
  }

  // @Test
  // public void canGetVisitors() {
  //   park.addEnclosure(raptorpaddock);
  //   paddock9.addDinosaur(tyrannosaurus);
  //   raptorpaddock.addDinosaur(velociraptor);
    
  //   park.calculateVisitorsAndFunds();
  //   assertEquals(13000, park.getVisitorNumbers());
  // }


  // @Test
  // public void canUpdateFunds() {
  //   park.addEnclosure(paddock9);
  //   park.addEnclosure(raptorpaddock);

  //   paddock9.addDinosaur(tyrannosaurus);
  //   raptorpaddock.addDinosaur(velociraptor);
    
  //   assertEquals(0, park.getFunds());
  //   park.calculateVisitorsAndFunds();
  //   assertEquals(13000, park.getVisitorNumbers());
  //   assertEquals(130000, park.getFunds());
  }
}
