package ardoise;

import ardoise.*;

public class TestArdoise {
	public static void main(String []args ){
		
		Ardoise ardoise = new Ardoise();
		
		
		PointPlan pt1 = new PointPlan(9,100);
		PointPlan pt2 = new PointPlan(20,198);		
		Forme tour = new Quadrilatere("tour", pt1, pt2);
		
		
		ardoise.dessinerGraphique();
	
		ardoise.ajouterForme(tour);
		
		
		ardoise.test();

 }
 }
