package ardoise;
import java.util.Timer;
import java.util.TimerTask;

import ardoise.*;
import java.util.ArrayList;

public class TestArdoise {
	public static void main(String []args ) throws Exception{
		
		Ardoise ardoise = new Ardoise();
		
		/*creation de la tour*/
		PointPlan pt1 = new PointPlan(9,100);
		PointPlan pt2 = new PointPlan(20,198);		
		Forme tour = new Quadrilatere("tour", pt1, pt2);
		
		
		/*creation des montagnes*/
		PointPlan pm1 = new PointPlan(3,14);
		PointPlan pm2 = new PointPlan(43,3);
		PointPlan pm3 = new PointPlan(112,14);
		Forme montagne1 = new Triangle("montagne 1", pm1, pm2, pm3);
		
		PointPlan pm4 = new PointPlan(152,7);
		PointPlan pm5 = new PointPlan(166,3);
		PointPlan pm6 = new PointPlan(172,7);
		Forme montagne2 = new Triangle("montagne 2", pm4, pm5, pm6);
		
		
		/*creation des oiseaux*/
		PointPlan po1 = new PointPlan(133,30);
		PointPlan po2 = new PointPlan(136,32);
		PointPlan po3 = new PointPlan(138,30);
		Forme oiseau2 = new Chapeau("oiseau 2", po1, po2, po3);
		
		PointPlan po4 = new PointPlan(142,14);
		PointPlan po5 = new PointPlan(144,17);
		PointPlan po6 = new PointPlan(146,14);
		Forme oiseau3 = new Chapeau("oiseau 3", po4, po5, po6);	
		
		PointPlan po7 = new PointPlan(118,13);
		PointPlan po8 = new PointPlan(123,20);
		PointPlan po9 = new PointPlan(128,13);
		Forme oiseau1 = new Chapeau("oiseau 1", po7, po8, po9);
		
		
		/*creation de l'etoile*/
		PointPlan pb1 = new PointPlan(170,52);
		PointPlan pb2= new PointPlan(173,45);
		PointPlan pb3= new PointPlan(177,52);
		Forme branche1 = new Chapeau("branche1",pb1,pb2,pb3);
		
		PointPlan pb4 = new PointPlan(177,52);
		PointPlan pb5= new PointPlan(184,57);
		PointPlan pb6= new PointPlan(177,60);
		Forme branche2 = new Chapeau("branche1",pb4,pb5,pb6);
		
		PointPlan pb7 = new PointPlan(177,60);
		PointPlan pb8= new PointPlan(174,66);
		PointPlan pb9= new PointPlan(170,60);
		Forme branche3 = new Chapeau("branche1",pb7,pb8,pb9);
		
		PointPlan pb10 = new PointPlan(170,60);
		PointPlan pb11= new PointPlan(164,57);
		PointPlan pb12= new PointPlan(170,52);
		Forme branche4 = new Chapeau("branche1",pb10,pb11,pb12);
		
		ArrayList<Forme> desEtoiles = new ArrayList<Forme>();
		desEtoiles.add(branche1);
		desEtoiles.add(branche2);
		desEtoiles.add(branche3);
		desEtoiles.add(branche4);
		
		Forme Etoile = new FusionForme("etoiles",desEtoiles);
		
		
		/*creation de la maison*/
		PointPlan pma1 = new PointPlan(80,140);
		PointPlan pma2 = new PointPlan(180,198);		
		Forme CorpMaison = new Quadrilatere("CorpMaison", pma1, pma2);
		
		PointPlan pma3 = new PointPlan(120,170);
		PointPlan pma4 = new PointPlan(140,198);	
		Forme PorteMaison = new Quadrilatere("PorteMaison", pma3, pma4);
		
		PointPlan pma5 = new PointPlan(80,140);
		PointPlan pma6 = new PointPlan(130,100);	
		PointPlan pma7 = new PointPlan(180,140);	
		Forme ToitMaison = new Chapeau("PorteMaison", pma5, pma6,pma7);
		
		ArrayList<Forme> Maisons = new ArrayList<Forme>();
		Maisons.add(PorteMaison);
		Maisons.add(ToitMaison);
		Maisons.add(CorpMaison);
		Forme Maison = new FusionForme("Maison",Maisons);
	
		/*Les formes sont toutes dessinées*/
		ardoise.dessinerGraphique();
		
		
		/*Les formes sont ajoutés à l'ardoise*/
		ardoise.ajouterForme(tour);
		ardoise.ajouterForme(montagne1);
		ardoise.ajouterForme(montagne2);
		ardoise.ajouterForme(oiseau2);
		ardoise.ajouterForme(oiseau3);
		ardoise.ajouterForme(oiseau1);
		ardoise.ajouterForme(Etoile);
		ardoise.ajouterForme(Maison);
		
		/*1.4 les oiseaux se deplacent de +10 en abscisse et +20 en ordonnee */
		Timer timer = new Timer();

		TimerTask task = new TimerTask() {
		    public void run() {
		        ardoise.deplacer("C", 10, 20);
		    }
		};

		timer.schedule(task, 1000, 100); 
		Thread.sleep(5000);
		timer.cancel();
		
		
		/*Exemple qui est fourni sur la plateforme, les oiseaus, la tour, l'etoile et la maison se déplacent vers la droite*/
		/* Timer timer = new Timer();

		TimerTask task = new TimerTask() {
		    public void run() {
		        ardoise.deplacer("C", 5, 0);
		        ardoise.deplacer("Q", 5, 0);
		        ardoise.deplacer("GF", 5, 0);
		    }
		};

		timer.schedule(task, 1000, 100); 
		Thread.sleep(6000);
		timer.cancel();*/
		
		//ardoise.test();

	}
	
}
