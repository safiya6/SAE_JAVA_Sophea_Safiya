package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ardoise.Triangle;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;

class TriangleTest {

	@Test
    public void nombreNegatifConstructeurChamp1() {
        try {
            PointPlan point1 = new PointPlan(-2, 2);
            PointPlan p2 = new PointPlan(4, 4);
            PointPlan p3 = new PointPlan(6, 6);
            Forme t = new Triangle("trig", point1,p2,p3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
    public void nombreNegatifConstructeurChamp2() {
        try {
            PointPlan point1 = new PointPlan(2, -2);
            PointPlan p2 = new PointPlan(4, 4);
            PointPlan p3 = new PointPlan(6, 6);
            Forme t = new Triangle("trig", point1,p2,p3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }

	@Test
    public void nombreNegatifConstructeurChamp3() {
        try {
            PointPlan point1 = new PointPlan(2, 2);
            PointPlan p2 = new PointPlan(-4, 4);
            PointPlan p3 = new PointPlan(6, 6);
            Forme t = new Triangle("trig", point1,p2,p3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
    public void nombreNegatifConstructeurChamp4() {
        try {
            PointPlan point1 = new PointPlan(2, 2);
            PointPlan p2 = new PointPlan(4, -4);
            PointPlan p3 = new PointPlan(6, 6);
            Forme t = new Triangle("trig", point1,p2,p3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	

	@Test
    public void nombreNegatifConstructeurChamp5() {
        try {
            PointPlan point1 = new PointPlan(2, 2);
            PointPlan p2 = new PointPlan(4, 4);
            PointPlan p3 = new PointPlan(-6, 6);
            Forme t = new Triangle("trig", point1,p2,p3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
    public void nombreNegatifConstructeurChamp6() {
        try {
            PointPlan point1 = new PointPlan(2, 2);
            PointPlan p2 = new PointPlan(4, 4);
            PointPlan p3 = new PointPlan(6, -6);
            Forme t = new Triangle("trig", point1,p2,p3);            
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : nombre négatif " + e.toString());
        }
    }
	
	@Test
	public void nombrePositifConstructeurChamp() {
        try {
            PointPlan point1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme Triangle = new Triangle("trig", point1,po2,po3);
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : " + e.toString());
        }
    }
	
	@Test
	public void constructeurVideOk() {
        try {
            Forme t = new Triangle();
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : " + e.toString());
        }
    }
	
	@Test
	public void constructeurCopieOk() {
        try {
        	PointPlan point1 = new PointPlan(2, 2);
            PointPlan po2 = new PointPlan(4, 4);
            PointPlan po3 = new PointPlan(6, 6);
            Forme t1 = new Triangle("chap", point1,po2,po3); 
            Forme t2 = new Triangle(t1);
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
        
        Forme maClasse = new Triangle("c",point1, point2, point3);
        
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
        
        Forme triangle = new Triangle("c",point1, point2, point3);
        
        ArrayList<Segment> segments = triangle.dessiner();
        
        assertEquals(3, segments.size());
        
        Segment segment1 = segments.get(0);
        assertEquals(point1, segment1.getPointDepart());
        assertEquals(point2, segment1.getPointArrivee());
        
        Segment segment2 = segments.get(1);
        assertEquals(point2, segment2.getPointDepart());
        assertEquals(point3, segment2.getPointArrivee());
        
        Segment segment3 = segments.get(2);
        assertEquals(point3, segment3.getPointDepart());
        assertEquals(point1, segment3.getPointArrivee());
    }
	
	@Test
	public void typeFormeRetourneC() {
        Forme triangle = new Triangle();
        assertEquals("T",triangle.typeForme());
    }

	 @Test
	    public void testToString() throws Exception {
	        PointPlan po1 = new PointPlan(1, 2);
	        PointPlan po2 = new PointPlan(3, 4);
	        PointPlan po3 = new PointPlan(5, 6);
	        Triangle triangle = new Triangle("triangle", po1, po2, po3);

	        String T = "Je suis " + triangle.getNomForme() +"\n"+
	                "mon premier point est :" +  triangle.getPoint1() +"\n"+
	                "mon second point est :" +  triangle.getPoint2() +"\n" +
	                "mon troisieme point est " + triangle.getPoint3();

	        assertEquals(T, triangle.toString());
	    }
	}
