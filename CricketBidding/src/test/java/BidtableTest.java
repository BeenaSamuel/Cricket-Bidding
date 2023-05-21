import org.junit.Test;

import com.cricketbidding.beans.Bidtable;

import java.sql.Timestamp;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BidtableTest {

  @Test
  public void testBidtable() {
    Bidtable bidtable = new Bidtable();
    bidtable.setId(1);
    bidtable.setName("Player1");
    bidtable.setTeamname("Team1");
    bidtable.setBidamount(1000L);
    bidtable.setBidtime(new Timestamp(System.currentTimeMillis()));
    
    

    assertEquals(1, bidtable.getId());
    assertEquals("Player1", bidtable.getName());
    assertEquals("Team1", bidtable.getTeamname());
    assertEquals(1000L, bidtable.getBidamount().longValue());
    assertNotNull(bidtable.getBidtime());
  }
}
