import org.junit.Test;

import com.cricketbidding.beans.Player;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

  @Test
  public void testPlayer() {
    Player player = new Player();
    player.setId(1L);
    player.setName("Virat Kohli");
    player.setRcb(100L);
    player.setCsk(50L);
    player.setDc(75L);

    assertEquals(1L, player.getId().longValue());
    assertEquals("Virat Kohli", player.getName());
    assertEquals(100L, player.getRcb().longValue());
    assertEquals(50L, player.getCsk().longValue());
    assertEquals(75L, player.getDc().longValue());
  }
}
