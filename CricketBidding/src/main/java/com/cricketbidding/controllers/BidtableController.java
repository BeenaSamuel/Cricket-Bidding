package com.cricketbidding.controllers;
import java.util.List;  

 




import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
   
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cricketbidding.beans.Bidtable;
import com.cricketbidding.beans.Player;
import com.cricketbidding.dao.BidtableDao;

@Controller
public class BidtableController {
 @Autowired    
    BidtableDao dao; 
    String team;
  public Long bidamount;
   Player player;
 

   public void setDao(BidtableDao dao) {
       this.dao = dao;
   }
 /*It displays a form to input data, here "command" is a reserved request attribute  
     *which is used to display object data into form  
     */    
    @RequestMapping("/player")    
    public String showform(Model m){    
        m.addAttribute("command", new Player());  
        return "player";   
    }    
    /*It saves object into database. The @ModelAttribute puts request data  
     *  into model object. You need to mention RequestMethod.POST method   
     *  because default request is GET*/    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("player") Player player) {
        ModelAndView mav = new ModelAndView("redirect:/viewplayers");

        Bidtable bidtable = new Bidtable();
        if (player.getCsk() > player.getDc()) {
            if (player.getCsk() > player.getRcb()) {
                bidtable.setBidamount(player.getCsk());
                bidtable.setTeamname("CSK");
            } else {
                bidtable.setBidamount(player.getRcb());
                bidtable.setTeamname("RCB");
            }
        } else if (player.getDc() > player.getRcb()) {
            bidtable.setBidamount(player.getDc());
            bidtable.setTeamname("DC");
        } else {
            bidtable.setBidamount(player.getRcb());
            bidtable.setTeamname("RCB");
        }

        bidtable.setName(player.getName());

        dao.save(bidtable);
        return mav;
    }


    
    /* It provides list of employees in model object */    
    @RequestMapping("/viewplayers")    
    public String viewplayers(Model m ){    
        List<Bidtable> list=dao.getPlayers();    
        m.addAttribute("list",list);  
        return "viewplayers";    
    }    
   
}
