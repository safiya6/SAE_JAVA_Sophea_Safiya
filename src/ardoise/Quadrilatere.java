package ardoise;

import java.util.ArrayList;

public class Quadrilatere extends Forme {
	
	private PointPlan POINT1;
	private PointPlan POINT2;
	private PointPlan POINT3;
	private PointPlan POINT4;

	/**
	 *Constructeur par défaut
	 */
	public Quadrilatere() {
		super("quadrilatere");
		this.POINT1 = new PointPlan(0,0);
		this.POINT2 = new PointPlan(0,0);
		this.POINT3 = new PointPlan(0,0);
		this.POINT4 = new PointPlan(0,0);
	}
	
	/**
	 *Constructeur champ à champ
	 */
	public Quadrilatere(String nom, PointPlan pH, PointPlan pB) throws Exception{
		super(nom);
		if(pH.getAbscisse()<0) {
			throw new Exception();
		}
		if(pH.getOrdonnee()<0) {
			throw new Exception();
		}
		
		if(pB.getAbscisse()<0) {
			throw new Exception();
		}
		if(pB.getOrdonnee()<0) {
			throw new Exception();
		}
		this.POINT1=pH;
		this.POINT2= new PointPlan(pH.getAbscisse(),pB.getOrdonnee());
		this.POINT3=pB;
		this.POINT4= new PointPlan(pB.getAbscisse(),pH.getOrdonnee());
	}
	
	/**
	 *Constructeur par copie
	 */
	public Quadrilatere(Forme Q) {
		this.setNomForme(Q.getNomForme());
		this.setPoint1(((Quadrilatere) Q).getPoint1());
		this.setPoint2(((Quadrilatere) Q).getPoint2());
		this.setPoint3(((Quadrilatere) Q).getPoint3());
		this.setPoint4(((Quadrilatere) Q).getPoint4()); 
	}
		
	public PointPlan getPoint1() {
		return this.POINT1;
	}
	
	public PointPlan getPoint2() {
		return this.POINT2;
	}
	
	public PointPlan getPoint3() {
		return this.POINT3;
	}
	
	public PointPlan getPoint4() {
		return this.POINT4;
	}
	
	public void setPoint1(PointPlan p) {
		this.POINT1=p;
	}
	
	public void setPoint2(PointPlan p) {
		this.POINT2=p;
	}
	
	public void setPoint3(PointPlan p) {
		this.POINT3=p;
	}	
	
	public void setPoint4(PointPlan p) {
		this.POINT4=p;
	}	

	/**
	 *Un quadrilatere doit-etre capable de se deplacer
	 *<br>Deplace le quadrilatere de deplacementX et de deplacementY
	 *
	 *@param deplacementX  - (int) : nombre de point(s) de deplacement en abscisse.
	 *@param deplacementY  - (int) : nombre de point(s) de deplacement en ordonnée.
	 */
	@Override
	public void deplacer(int X, int Y) {
		this.POINT1.deplacer(X,Y);
		this.POINT2.deplacer(X,Y);
		this.POINT3.deplacer(X,Y);
		this.POINT4.deplacer(X,Y);
	}

	
	/**
	 * Dessine le quadrilatere en renvoyant la liste des segments qui le compose.
	 *
	 * @return La liste des segments qui composent le quadrilatere.
	 */
	@Override
	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> Q = new ArrayList<Segment>();
		Q.add(new Segment(this.POINT1, this.POINT2));
		Q.add(new Segment(this.POINT2, this.POINT3));
		Q.add(new Segment(this.POINT3, this.POINT4));
		Q.add(new Segment(this.POINT4, this.POINT1));
		return Q;
	}

	
	/**
	 * Renvoie le type de la forme quadrilatere qui est Q
	 *
	 * @return (String) : chaine de caracteres donnant le type Q
	 */
	@Override
	public String typeForme() {
		return "Q";
	}

	public String toString() {
        return "Je suis " + super.getNomForme() +"\n"+
                "mon premier point est :" +  getPoint1() +"\n"+
                "mon second point est :" +  getPoint2() +"\n" +
                "mon troisieme point est " + getPoint3()+"\n"+
                "mon quatrième point est " + getPoint4();

    }
	
}
