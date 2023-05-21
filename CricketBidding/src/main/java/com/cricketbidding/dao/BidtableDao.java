package com.cricketbidding.dao;
import java.sql.ResultSet;   


 

import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.cricketbidding.beans.Bidtable;
import com.cricketbidding.beans.Player;


public class BidtableDao {
JdbcTemplate template; 
Bidtable bidtable;
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(Bidtable b){    
    String sql="insert into bidtable(name,teamname,bidamount) values('"+b.getName()+"','"+b.getTeamname()+"',"+b.getBidamount()+")";    
    return template.update(sql);    
}    
   
   
public Player getPlayerById(int id){    
    String sql="select * from player where id=?";   
    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Player>(Player.class));    
}    
public List<Bidtable> getPlayers(){    
    return template.query("select * from bidtable ",new RowMapper<Bidtable>(){    
        public Bidtable mapRow(ResultSet rs, int row) throws SQLException {    
        	Bidtable bi=new Bidtable();    
            bi.setId(rs.getInt(1));    
            bi.setName(rs.getString(2)); 
            bi.setTeamname(rs.getString(3));
            bi.setBidamount(rs.getLong(4)); 
            bi.setBidtime(rs.getTimestamp(5));
            return bi;    
        }    
    });    
} 
}
