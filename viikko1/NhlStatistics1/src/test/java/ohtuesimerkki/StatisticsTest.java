
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        // luodaan Statistics-olio joka käyttää "stubia"
        stats = new Statistics(readerStub);
    }  
    
    @Test
    
    public void onListalla(){
        assertTrue(stats.search("Kurri").getName().equals("Kurri"));
    }
    
    @Test
    
    public void nullTesti(){
        assertEquals(stats.search("tyhja"), null);
    }
    
    @Test
    
    public void onTiimissa(){
        assertEquals(stats.team("PIT").get(0).getName(),"Lemieux");
    }
    
    @Test
    
    public void topScorersToimii(){
        assertEquals(stats.topScorers(1).get(0).getName(),"Gretzky");
    }
}
