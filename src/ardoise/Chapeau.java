package ardoise;

import java.util.ArrayList;

/**
 * Classe Chapeau
 * <br>Modelise un chapeau compose de 3 PointPlan
 * <br>Un chapeau est composee de 3 PointPlan relie avec 2 segments
 */
public class Chapeau extends Forme {
	
	private PointPlan POINT1;
	private PointPlan POINT2;
	private PointPlan POINT3;

	/**
	 *Constructeur par defaut, met tous les points a 0 et le nom par defaut est chapeau
	 */
	public Chapeau() {
		super("chapeau");
		this.POINT1 = new PointPlan(0,0);
		this.POINT2 = new PointPlan(0,0);
		this.POINT3 = new PointPlan(0,0);
	}
	
	/**
	 *Constructeur champ a champ
	 */
	public Chapeau(String nom, PointPlan p1, PointPlan p2, PointPlan p3) {
		super(nom);
		this.POINT1=p1;
		this.POINT2=p2;
		this.POINT3=p3;
	}
	
	/**
	 *Constructeur par copie
	 */
	public Chapeau(Forme C)  {
		this.setPoint1(((Chapeau )C).getPoint1());
		this.setPoint2(((Chapeau )C).getPoint2());
		this.setPoint3(((Chapeau )C).getPoint3());
		
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
	 *Un chapeau doit-etre capable de se deplacer
	 *<br>Deplace le chapeau de deplacementX et de deplacementY
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
	 * Dessine le chapeau en renvoyant la liste des segments qui le compose.
	 *
	 * @return La liste des segments qui composent le chapeau.
	 */
	@Override
	public ArrayList<Segment> dessiner() {
		ArrayList<Segment> C = new ArrayList<Segment>();
		C.add(new Segment(this.POINT1, this.POINT2));
		C.add(new Segment(this.POINT2, this.POINT3));
		return C;
	}

	/**
	 * Renvoie le type de la forme chapeau qui est C
	 *
	 * @return (String) : chaine de caracteres donnant le type C
	 */
	@Override
	public String typeForme() {
		return "C";
	}

}
