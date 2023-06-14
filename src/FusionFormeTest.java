package Test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import ardoise.FusionForme;
import ardoise.Chapeau;
import ardoise.Forme;
import ardoise.PointPlan;
import ardoise.Quadrilatere;
import ardoise.Segment;
import ardoise.Chapeau;

class FusionFormeTest {

	@Test
	void testConstructeurChamp() throws Exception {
		
		PointPlan p1 = new PointPlan(177,60);
		PointPlan p2= new PointPlan(174,66);
		PointPlan p3= new PointPlan(170,60);
		Forme branche1 = new Chapeau("branche1",p1,p2,p3);
		
		PointPlan p4 = new PointPlan(170,60);
		PointPlan p5= new PointPlan(164,57);
		PointPlan p6= new PointPlan(170,52);
		Forme branche2 = new Chapeau("branche1",p4,p5,p6);
		
		ArrayList<Forme> desBranches = new ArrayList<Forme>();
		desBranches.add(branche1);
		desBranches.add(branche2);
		
		assertEquals(desBranches.get(0),branche1);
		assertEquals(desBranches.get(1),branche2);
		FusionForme f = new FusionForme("desBranches", desBranches);
		
	

	}
	
	@Test
	public void testDeplacer() throws Exception {
        // Création des formes à fusionner
		PointPlan p1 = new PointPlan(177,60);
		PointPlan p2= new PointPlan(174,66);
		PointPlan p3= new PointPlan(170,60);
		Forme branche1 = new Chapeau("branche1",p1,p2,p3);
		
		PointPlan p4 = new PointPlan(170,60);
		PointPlan p5= new PointPlan(164,57);
		PointPlan p6= new PointPlan(170,52);
		Forme branche2 = new Chapeau("branche1",p4,p5,p6);

        // Création de la fusion des formes
        ArrayList<Forme> desBranches = new ArrayList<Forme>();
        desBranches.add(branche1);
        desBranches.add(branche2);
        FusionForme Branches = new FusionForme("Branches", desBranches);

        // Déplacement de la fusion
        Branches.deplacer(2, 3);

        // Vérification du déplacement des formes contenues dans la fusion
        assertEquals(179, ((Chapeau) branche1).getPoint1().getAbscisse());
        assertEquals(63, ((Chapeau) branche1).getPoint1().getOrdonnee());
        assertEquals(176, ((Chapeau) branche1).getPoint2().getAbscisse());
        assertEquals(69, ((Chapeau) branche1).getPoint2().getOrdonnee());
        assertEquals(172, ((Chapeau) branche1).getPoint3().getAbscisse());
        assertEquals(63, ((Chapeau) branche1).getPoint3().getOrdonnee());
        
        assertEquals(172, ((Chapeau) branche2).getPoint1().getAbscisse());
        assertEquals(63, ((Chapeau) branche2).getPoint1().getOrdonnee());
        assertEquals(166, ((Chapeau) branche2).getPoint2().getAbscisse());
        assertEquals(60, ((Chapeau) branche2).getPoint2().getOrdonnee());
        assertEquals(172, ((Chapeau) branche2).getPoint3().getAbscisse());
        assertEquals(55, ((Chapeau) branche2).getPoint3().getOrdonnee());
        

       
    }
	@Test
	
	public void testDessiner() throws Exception{
		PointPlan p1 = new PointPlan(177,60);
		PointPlan p2= new PointPlan(174,66);
		PointPlan p3= new PointPlan(170,60);
		Forme branche1 = new Chapeau("branche1",p1,p2,p3);
		ArrayList<Forme> desBranches = new ArrayList<Forme>();
        desBranches.add(branche1);
		
		FusionForme Branches = new FusionForme("Branches", desBranches);
        
        ArrayList<Segment> segments = Branches.dessiner();
        
        Segment segment1 = segments.get(0);
        assertEquals(p1, segment1.getPointDepart());
        assertEquals(p2, segment1.getPointArrivee());
        
        Segment segment2 = segments.get(1);
        assertEquals(p2, segment2.getPointDepart());
        assertEquals(p3, segment2.getPointArrivee());
        
        
        
        
    }
	 @Test
	public void typeFormeRetourneGF() {
		FusionForme Branches = new FusionForme();
        assertEquals("GF",Branches.typeForme());
    }
	 
	 @Test 
	 public void  testGetFormes() {
		 FusionForme Branches = new FusionForme();
		 ArrayList<Forme> F =new ArrayList<Forme>();
		 
		 assertEquals(F,Branches.getForme());
	 }
	  
	 @Test
	 public void testToString() throws Exception  {
		 PointPlan p1 = new PointPlan(177,60);
		 PointPlan p2= new PointPlan(174,66);
		 PointPlan p3= new PointPlan(170,60);
		 Chapeau branche1 = new Chapeau("branche1",p1,p2,p3);
		 
		 PointPlan p4 = new PointPlan(170,60);
		 PointPlan p5= new PointPlan(164,57);
	   	 PointPlan p6= new PointPlan(170,52);
	   	 Chapeau branche2 = new Chapeau("branche1",p4,p5,p6);
	   	 
		 ArrayList<Forme> desBranches = new ArrayList<Forme>();
	     desBranches.add(branche1);
	     desBranches.add(branche2);
	     
	     
	     FusionForme Branches = new FusionForme("Branches", desBranches);
	     
	     
	     
	     String B = "Je suis " + branche1.getNomForme() +"\n"+
	                "mon premier point est :" +    branche1.getPoint1() +"\n"+
	                "mon second point est :" +   branche1.getPoint2() +"\n" +
	                "mon troisieme point est " +  branche1.getPoint3() +"\n"+
	                "Je suis " + ((Chapeau) branche2).getNomForme()+"\n"+
	    		    "mon premier point est :" +   ((Chapeau) branche2).getPoint1() +"\n"+
	                "mon second point est :" +  ((Chapeau) branche2).getPoint2() +"\n" +
	                "mon troisieme point est " + ((Chapeau) branche2).getPoint3()+ "\n";
	     
	     assertEquals(B,Branches.toString());


	    }
		
	}
	
	


	


