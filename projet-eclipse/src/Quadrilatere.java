import java.util.*;
import ardoise.*;

import ardoise.PointPlan;

public class Quadrilatere extends Forme {
	
	//variables spécifiques
    private ArrayList<PointPlan> points;
    
    
    //constructeurs
    
    	//vide
    public Quadrilatere(){}

    	//par copie
    public Quadrilatere(Quadrilatere unQuadrilatere){
        
    	super(unQuadrilatere.getNomForme());
    	this.points = new ArrayList<PointPlan>();
    	this.points = unQuadrilatere.getPoints();
        
    }

    	//champ a champ
    public Quadrilatere(String unNom, PointPlan p1, PointPlan p2){
    	super(unNom);
    	this.points = new ArrayList<PointPlan>();
    	this.points.add(p1);
        this.points.add(p2);
        
    }
    
    //getters setters
    
    /*
     * retourne la collection de points contenue dans la variable points
     * */
    public ArrayList<PointPlan> getPoints(){
    	return this.points;
    }
    
    /*
     * retourne le point d'indice i contenu dans  points
     * */
    public PointPlan getPoint(int i){
        return this.points.get(i);
    }
    
    /*
     * modifie les points de la collection points
     */

    public void setPoints(PointPlan a, PointPlan b){
 
        	this.points.set(0, a);
        	this.points.set(1, b);
    }

    /*
     * remplace le point d'indice i par le point unPoint
    */
    public void setPoint(int i, PointPlan unPoint){
        this.points.set(i, unPoint);
    }
    
    
    // methodes

    public String typeForme(){
    	return "Q";
    }

    
    public void deplacer(int deplacementX, int deplacementY){
        this.getPoint(0).deplacer(deplacementX, deplacementY);
    	this.getPoint(1).deplacer(deplacementX, deplacementY);
    }

    public String toString(){
    	String res = super.toString();
        return res + "Cette forme est un Quadrilatere, il a pour points :\n Point 1 = " + this.getPoint(0).toString() + "\n Point 2 = " + this.getPoint(1).toString();
    }
    

    /*
     * renvoie la liste de tous les segments 
     * qui permettent de dessiner la forme
     */
    public ArrayList<Segment> dessiner(){
    	
    	PointPlan pointDepart = this.getPoint(0);
    	PointPlan pointArrivee = pointDepart;
    	pointArrivee.deplacer(this.getPoint(1).getAbscisse(), 0);
    	Segment s1 = new Segment(pointDepart, pointArrivee);
    	
    	
    	pointDepart = pointArrivee;
    	pointArrivee = this.getPoint(1);
    	Segment s2 = new Segment(pointDepart, pointArrivee);
    	
    	
    	pointDepart = this.getPoint(0);
    	pointDepart.deplacer(0, pointArrivee.getOrdonnee());
    	Segment s3 = new Segment(pointDepart, pointArrivee);
    	
    	pointArrivee = pointDepart;
    	pointDepart = this.getPoint(0);
    	Segment s4 = new Segment(pointDepart, pointArrivee);
    	
    	ArrayList<Segment> res = new ArrayList<Segment>();
    	res.add(s1);
    	res.add(s2);
    	res.add(s3);
    	res.add(s4);
    	return res;
    }

} // fin classe Quadrilatere
