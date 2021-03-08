package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti;
	
	public Libretto(){
		voti= new ArrayList<>();
	}

	public void add(Voto v) {
		//Posso inserire COTROLLI di vario genere
		this.voti.add(v);
	}
	
	
	public String toString() {
		
		String s="";
		for(Voto v:this.voti) {
			s=s+v.toString()+"\n";
		}
		return s;
		}
}
