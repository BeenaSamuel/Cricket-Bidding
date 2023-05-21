import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.cricketbidding.beans.Bidtable;
import com.cricketbidding.beans.Player;
import com.cricketbidding.controllers.BidtableController;
import com.cricketbidding.dao.BidtableDao;

public class BidtableControllerTest {

    
    private DataSource dataSource;
    private BidtableDao dao;
    private BidtableController controller;
    BidtableDao mockObject = mock(BidtableDao.class);

    @Before
    public void setUp() {
    	
        dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/cric_match", "root", "");
        dao = mock(BidtableDao.class);
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        dao.setTemplate(jdbcTemplate);
        controller = new BidtableController();
        controller.setDao(mockObject);
    }


    @Test
    public void testSave() {

        Player player = new Player();
        player.setName("John");
        player.setCsk(5000L);
        player.setDc(6000L);
        player.setRcb(4000L);       
        ModelAndView result = controller.save(player);
        
        assertEquals("redirect:/viewplayers", result.getViewName());
        Mockito.verify(mockObject, Mockito.times(1)).save(Mockito.any(Bidtable.class));
    }




    @Test
    public void testViewPlayers() {
        Model model = Mockito.mock(Model.class);
        List<Bidtable> players = new ArrayList<>();
        when(mockObject.getPlayers()).thenReturn(players);
        String result = controller.viewplayers(model);
        assertEquals("viewplayers", result);
        Mockito.verify(mockObject, Mockito.times(1)).getPlayers();
    }

}
