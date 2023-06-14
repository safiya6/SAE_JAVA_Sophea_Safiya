package ardoise;

import java.util.ArrayList;
/**
 * Classe Triangle
 * <br>Modelise un triangle compose de 3 PointPlan
 * <br>Un triangle est composee de 3 PointPlan relie entre eux avec 3 segments
 */
public class Triangle extends Forme {
	
	private PointPlan POINT1;
	private PointPlan POINT2;
	private PointPlan POINT3;

	/**
	 *Constructeur par defaut, met tous les points a 0 et le nom par defaut est triangle
	 */
	public Triangle() {
		super("triangle");
		this.POINT1 = new PointPlan(0,0);
		this.POINT2 = new PointPlan(0,0);
		this.POINT3 = new PointPlan(0,0);
	}
	
	/**
	 *Constructeur champ a champ
	 */
	public Triangle(String nom, PointPlan p1, PointPlan p2, PointPlan p3) {
		super(nom);
		this.POINT1=p1;
		this.POINT2=p2;
		this.POINT3=p3;
	}
	
	/**
	 *Constructeur par copie
	 */
	public Triangle(Triangle T) {
		this.setPoint1(T.getPoint1());
		this.setPoint2(T.getPoint2());
		this.setPoint3(T.getPoint3());
		
	}
	
	public Triangle(Forme T)  {
		this.setPoint1(((Triangle)T).getPoint1());
		this.setPoint2(((Triangle)T).getPoint2());
		this.setPoint3(((Triangle)T).getPoint3());
		
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
	
	public void setPoint1(PointPlan p) {
		this.POINT1=p;
	}
	
	public void setPoint2(PointPlan p) {
		this.POINT2=p;
	}
	
	public void setPoint3(PointPlan p) {
		this.POINT3=p;
	}

	/**
	 *Un triangle doit-etre capable de se deplacer
	 *<br>Deplace le triangle de deplacementX et de deplacementY
	 *
	 *@param deplacementX  - (int) : nombre de point(s) de deplacement en abscisse.
	 *@param deplacementY  - (int) : nombre de point(s) de deplacement en ordonnée.
	 */
	@Override
	public void deplacer(int x, int y) {
		this.POINT1.deplacer(x,y);
		this.POINT2.deplacer(x,y);
		this.POINT3.deplacer(x,y);
		
	}

	
	/**
	 * Dessine le triangle en renvoyant la liste des segments qui le compose.
	 *
	 * @return La liste des segments qui composent le triangle.
	 */
	@Override
	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> T = new ArrayList<Segment>();
		T.add(new Segment(this.POINT1, this.POINT2));
		T.add(new Segment(this.POINT2, this.POINT3));
		T.add(new Segment(this.POINT3, this.POINT1));
		return T;
	}

	/**
	 * Renvoie le type de la forme triangle qui est T
	 *
	 * @return (String) : chaine de caracteres donnant le type T
	 */
	@Override
	public String typeForme() {
		return "T";
	}

}
