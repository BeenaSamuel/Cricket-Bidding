package com.cricketbidding.beans;



public class Player {
	private Long id;    
	private String name;
	
	private Long rcb;
	public Long getRcb() {
		return rcb;
	}
	public void setRcb(Long rcb) {
		this.rcb = rcb;
	}
	private Long csk;
	
	private Long dc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCsk() {
		return csk;
	}
	public void setCsk(Long csk) {
		this.csk = csk;
	}
	
	public Long getDc() {
		return dc;
	}
	public void setDc(Long dc) {
		this.dc = dc;
	}

    
  
    
}
