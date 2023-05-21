package com.cricketbidding.beans;

import java.sql.Timestamp;

public class Bidtable {
  private int id;
  private String name;
  private String teamname;
  private Long bidamount;
  private Timestamp bidtime;
public int getId() {
	return id;
}
public void setId(int i) {
	this.id = i;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getBidamount() {
	return bidamount;
}
public void setBidamount(Long bidamount) {
	this.bidamount = bidamount;
}
public String getTeamname() {
	return teamname;
}
public void setTeamname(String teamname) {
	this.teamname = teamname;
}
public Timestamp getBidtime() {
	return bidtime;
}
public void setBidtime(Timestamp bidtime) {
	this.bidtime = bidtime;
}
  
}
