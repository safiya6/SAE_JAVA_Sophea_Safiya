package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Segment;
import ardoise.Quadrilatere;

class QuadrilatereTest {

	@Test
    public void nombreNegatifConstructeurChamp1() {
        try {
            PointPlan point1 = new PointPlan(-2, 2);
            PointPlan p2 = new PointPlan(4, 4);
            Forme q = new Quadrilatere("quad", point1,p2);            
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
            Forme q = new Quadrilatere("quad", point1,p2);            
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
            Forme q = new Quadrilatere("quad", point1,p2);            
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
            Forme q = new Quadrilatere("quad", point1,p2);            
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
            Forme Triangle = new Quadrilatere("quad", point1,po2);
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : " + e.toString());
        }
    }
	
	@Test
	public void constructeurVideOk() {
        try {
            Forme q = new Quadrilatere();
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
            Forme t1 = new Quadrilatere("chap", point1,po2); 
            Forme t2 = new Quadrilatere(t1);
        } 
        
        catch (Exception e) {
            System.out.println("Exception inattendue : " + e.toString());
        }
    }
	
	@Test
	public void testDeplacer() throws Exception {
	    PointPlan pointHaut = new PointPlan(2, 4);
	    PointPlan pointBas = new PointPlan(3, 5);
	    
	    PointPlan autre_point1 = new PointPlan(2, 4);
	    PointPlan autre_point2 = new PointPlan(2, 5);
	    PointPlan autre_point3 = new PointPlan(3, 5);
	    PointPlan autre_point4 = new PointPlan(3, 4);
	    
	    Forme q = new Quadrilatere("q", pointHaut, pointBas);
	    
	    int deplacementX = 2;
	    int deplacementY = 2;
	    
	    q.deplacer(deplacementX, deplacementY);
	    
	    assertEquals(deplacementX + autre_point1.getAbscisse(), ((Quadrilatere) q).getPoint1().getAbscisse());
	    assertEquals(deplacementY + autre_point1.getOrdonnee(), ((Quadrilatere) q).getPoint1().getOrdonnee());
	    
	    assertEquals(deplacementX + autre_point2.getAbscisse(), ((Quadrilatere) q).getPoint2().getAbscisse());
	    assertEquals(deplacementY + autre_point2.getOrdonnee(), ((Quadrilatere) q).getPoint2().getOrdonnee());
	    
	    assertEquals(deplacementX + autre_point3.getAbscisse(), ((Quadrilatere) q).getPoint3().getAbscisse());
	    assertEquals(deplacementY + autre_point3.getOrdonnee(), ((Quadrilatere) q).getPoint3().getOrdonnee());
	    
	    assertEquals(deplacementX + autre_point4.getAbscisse(), ((Quadrilatere) q).getPoint4().getAbscisse());
	    assertEquals(deplacementY + autre_point4.getOrdonnee(), ((Quadrilatere) q).getPoint4().getOrdonnee());
	}
	
	@Test
    public void testDessiner() throws Exception {
        PointPlan pointHaut = new PointPlan(2, 4);
        PointPlan pointBas = new PointPlan(3, 5);
        
        Forme q = new Quadrilatere("q",pointHaut, pointBas);
        
        ArrayList<Segment> segments = q.dessiner();
        
        assertEquals(4, segments.size());
        
        Segment segment1 = segments.get(0);
        assertEquals(pointHaut, segment1.getPointDepart());
        assertEquals(((Quadrilatere) q).getPoint2(), segment1.getPointArrivee());
        
        Segment segment2 = segments.get(1);
        assertEquals(((Quadrilatere) q).getPoint2(), segment2.getPointDepart());
        assertEquals(pointBas, segment2.getPointArrivee());
        
        Segment segment3 = segments.get(2);
        assertEquals(pointBas, segment3.getPointDepart());
        assertEquals(((Quadrilatere) q).getPoint4(), segment3.getPointArrivee());
        
        Segment segment4 = segments.get(3);
        assertEquals(((Quadrilatere) q).getPoint4(), segment4.getPointDepart());
        assertEquals(pointHaut, segment4.getPointArrivee());
    }
	
	@Test
	public void typeFormeRetourneQ() {
        Forme q = new Quadrilatere();
        assertEquals("Q",q.typeForme());
	}
	@Test
	public void testToString() throws Exception {
		 PointPlan pointHaut = new PointPlan(2, 4);
	     PointPlan pointBas = new PointPlan(3, 5);
	        
	     Quadrilatere quadrilatere = new Quadrilatere("q",pointHaut, pointBas);
		
		 String Q = "Je suis " + quadrilatere.getNomForme() +"\n"+
	                "mon premier point est :" +  quadrilatere.getPoint1() +"\n"+
	                "mon second point est :" +  quadrilatere.getPoint2() +"\n" +
	                "mon troisieme point est " + quadrilatere.getPoint3()+"\n"+
	                "mon quatrième point est " + quadrilatere.getPoint4();
		 assertEquals(Q, quadrilatere.toString());
	}

}
