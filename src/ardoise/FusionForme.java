package ardoise;

import java.util.ArrayList;

public class FusionForme extends Forme {
    private ArrayList<Forme> Formes;
    
    /**
   	 *Constructeur par defaut
   	 */
    public FusionForme (){
        this.Formes = new ArrayList<Forme>();

    }
    
    /**
	 *Constructeur champ a champ
	 */

    public FusionForme(String nom ,ArrayList<Forme>  desFormes) {
        super(nom);
        this.Formes=desFormes ;
    }
    
    /**
	 *Une forme doit-etre capable de se deplacer
	 *<br>Deplace la forme de deplacementX et de deplacementY
	 *
	 *@param deplacementX  - (int) : nombre de point(s) de deplacement en abscisse.
	 *@param deplacementY  - (int) : nombre de point(s) de deplacement en ordonnée.
	 */

    @Override
    public void deplacer(int X, int Y) {
        for(Forme f : this.Formes) {
         f.deplacer(X,Y);
        }
    }

    /**
	 * Dessine la forme en renvoyant la liste des segments qui la compose.
	 *
	 * @return La liste des segments des formes qui composent la forme.
	 */
    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> A = new ArrayList<Segment>();

        for(Forme f : this.Formes) {
             A.addAll(f.dessiner());
        }

        return A;

    }

    /**
	 * Renvoie le type de la forme chapeau qui est GF
	 *
	 * @return (String) : chaine de caracteres donnant le type GF
	 */
    @Override
    public String typeForme() {
        return "GF";
    }


    public ArrayList<Forme> getForme() {
        return this.Formes;
    }

   public String toString() {
       String str = "";
       for(Forme f : this.Formes) {
            str += f.toString()+ "\n";
        }
       return str;

   }




}
