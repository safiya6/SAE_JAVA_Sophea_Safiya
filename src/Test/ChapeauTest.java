package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import ardoise.Chapeau;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;
import ardoise.Triangle;

public class ChapeauTest {

	@Test
    public void nombreNegatifConstructeurChamp1() {
        try {
            PointPlan po1 = new PointPlan(-2, 2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme c = new Chapeau("chap", po1,po2,po3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
	public void nombreNegatifConstructeurChamp2() {
        try {
            PointPlan po1 = new PointPlan(2, -2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme c = new Chapeau("chap", po1,po2,po3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	@Test
	public void nombreNegatifConstructeurChamp3() {
        try {
            PointPlan po1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(-4, 4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme c = new Chapeau("chap", po1,po2,po3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
	public void nombreNegatifConstructeurChamp4() {
        try {
            PointPlan po1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(4, -4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme c = new Chapeau("chap", po1,po2,po3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	@Test
	
	public void nombreNegatifConstructeurChamp5() {
        try {
            PointPlan po1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(-6, 6);
            Forme c = new Chapeau("chap", po1,po2,po3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
	public void nombreNegatifConstructeurChamp6() {
        try {
            PointPlan po1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(6, -6);
            Forme c = new Chapeau("chap", po1,po2,po3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
	public void nombrePositifConstructeurChamp() {
        try {
            PointPlan po1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme c = new Chapeau("chap", po1,po2,po3);
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : " + e.toString());
        }
    }
	
	@Test
	public void constructeurVideOk() {
        try {
            Forme c = new Chapeau();
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : " + e.toString());
        }
    }
	
	@Test
	public void constructeurCopieOk() {
        try {
        	PointPlan po1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme c1 = new Chapeau("chap", po1,po2,po3); 
            Forme c2 = new Chapeau(c1);
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : " + e.toString());
        }
    }
	
	@Test
    public void testDeplacer() throws Exception {
        PointPlan point1 = new PointPlan(0, 0);
        PointPlan point2 = new PointPlan(1, 1);
        PointPlan point3 = new PointPlan(2, 2);
        
        PointPlan autre_point1 = new PointPlan(0, 0);
        PointPlan autre_point2 = new PointPlan(1, 1);
        PointPlan autre_point3 = new PointPlan(2, 2);
        
        Forme maClasse = new Chapeau("c",point1, point2, point3);
        
        int deplacementX = 3;
        int deplacementY = 4;
        
        maClasse.deplacer(deplacementX, deplacementY);
        
        assertEquals(deplacementX + autre_point1.getAbscisse(), point1.getAbscisse());
        assertEquals(deplacementY + autre_point1.getOrdonnee(), point1.getOrdonnee());
        
        assertEquals(deplacementX + autre_point2.getAbscisse(), point2.getAbscisse());
        assertEquals(deplacementY + autre_point2.getOrdonnee(), point2.getOrdonnee());
        
        assertEquals(deplacementX + autre_point3.getAbscisse(), point3.getAbscisse());
        assertEquals(deplacementY + autre_point3.getOrdonnee(), point3.getOrdonnee());
    }
	
	@Test
    public void testDessiner() throws Exception {
        PointPlan point1 = new PointPlan(0, 0);
        PointPlan point2 = new PointPlan(1, 1);
        PointPlan point3 = new PointPlan(2, 2);
        
        Forme chapeau = new Chapeau("c",point1, point2, point3);
        
        ArrayList<Segment> segments = chapeau.dessiner();
        
        assertEquals(2, segments.size());
        
        Segment segment1 = segments.get(0);
        assertEquals(point1, segment1.getPointDepart());
        assertEquals(point2, segment1.getPointArrivee());
        
        Segment segment2 = segments.get(1);
        assertEquals(point2, segment2.getPointDepart());
        assertEquals(point3, segment2.getPointArrivee());
    }
	
	@Test
	public void typeFormeRetourneC() {
        Forme chapeau = new Chapeau();
        assertEquals("C",chapeau.typeForme());
    }
	
	/*@Test
	public void resteDansArdoise() throws Exception {
	PointPlan po1 = new PointPlan(2, 2);
	PointPlan po2 = new PointPlan(4, 400);
	PointPlan po3 = new PointPlan(6, 6);
	Forme oiseau2 = new Chapeau("oiseau 2", po1, po2, po3);
	int Y = 60;
	int X = 60;

	int po1Abscisse = po1.getAbscisse() + X;
	int po2Abscisse = po2.getAbscisse() + X;
	int po3Abscisse = po3.getAbscisse() + X;

	int po1Ordonnee = po1.getOrdonnee() + Y;
	int po2Ordonnee = po2.getOrdonnee() + Y;
	int po3Ordonnee = po3.getOrdonnee() + Y;

	assertTrue(po1Abscisse < 600, "La coordonnée x de po1 dépasse la limite de l'ardoise.");
	assertTrue(po2Abscisse < 600, "La coordonnée x de po2 dépasse la limite de l'ardoise.");
	assertTrue(po3Abscisse < 600, "La coordonnée x de po3 dépasse la limite de l'ardoise.");

	assertTrue(po1Ordonnee < 600, "La coordonnée y de po1 dépasse la limite de l'ardoise.");
	assertTrue(po2Ordonnee < 600, "La coordonnée y de po2 dépasse la limite de l'ardoise.");
	assertTrue(po3Ordonnee < 600, "La coordonnée y de po3 dépasse la limite de l'ardoise.");

	oiseau2.deplacer(X, Y);
	
	}*/
	
	@Test
	public void testToString() throws Exception {
        PointPlan po1 = new PointPlan(1, 2);
        PointPlan po2 = new PointPlan(3, 4);
        PointPlan po3 = new PointPlan(5, 6);
        Chapeau chapeau = new Chapeau("Chapeau", po1, po2, po3);

        String C = "Je suis " + chapeau.getNomForme() +"\n"+
                "mon premier point est :" +   chapeau.getPoint1() +"\n"+
                "mon second point est :" +  chapeau.getPoint2() +"\n" +
                "mon troisieme point est " + chapeau.getPoint3();

        assertEquals(C, chapeau.toString());
    }
	
}


