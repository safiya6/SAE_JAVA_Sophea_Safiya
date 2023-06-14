package ardoise;

import java.util.ArrayList;

public class FusionForme extends Forme {
	private ArrayList<Forme> Formes;
	
	public FormeComposee() {
	}
	
	
	public FusionForme (String nom ,ArrayList<Forme>  desFormes) {
		super(nom);
		this.Formes=desFormes ;
	}



	@Override
	public void deplacer(int arg0, int arg1) {
		// TODO Auto-generated method stub
		for(Forme f : this.Formes) {
		 f.deplacer(arg0,arg1);
			
		}
	
		
		
		
	}


	@Override
	public ArrayList<Segment> dessiner() {
		// TODO Auto-generated method stub
		ArrayList<Segment> A = new ArrayList<Segment>();
		
		for(Forme f : this.Formes) {
			 A.addAll(f.dessiner());
			
		}
	
		return A;
		
	}


	@Override
	public String typeForme() {
		// TODO Auto-generated method stub
		return "GF";
	}


	public ArrayList<Forme> getForme() {
		return this.Formes;
	}






}
