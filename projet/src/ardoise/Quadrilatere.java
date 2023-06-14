package ardoise;

import java.util.ArrayList;

public class Quadrilatere extends Forme {
	
	private PointPlan POINT1;
	private PointPlan POINT2;
	private PointPlan POINT3;
	private PointPlan POINT4;

	public Quadrilatere() {
		
	}
	
	public Quadrilatere(String nom, PointPlan pH, PointPlan pB) {
		super(nom);
		this.POINT1=pH;
		this.POINT2= new PointPlan(pH.getAbscisse(),pB.getOrdonnee());
		this.POINT3=pB;
		this.POINT4= new PointPlan(pB.getAbscisse(),pH.getOrdonnee());
	}
	
	

	@Override
	public void deplacer(int X, int Y) {
		this.POINT1.deplacer(X,Y);
		this.POINT2.deplacer(X,Y);
		this.POINT3.deplacer(X,Y);
		this.POINT4.deplacer(X,Y);
	}

	@Override
	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> Q = new ArrayList<Segment>();
		Q.add(new Segment(this.POINT1, this.POINT2));
		Q.add(new Segment(this.POINT2, this.POINT3));
		Q.add(new Segment(this.POINT3, this.POINT4));
		Q.add(new Segment(this.POINT4, this.POINT1));
		return Q;
	}

	@Override
	public String typeForme() {
		return "Q";
	}

}
