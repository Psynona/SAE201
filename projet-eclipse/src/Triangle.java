import java.util.*;
import ardoise.*;

public class Triangle extends Forme {
	

	//variables spécifiques
    private ArrayList<PointPlan> points;
    
    
    //constructeurs
    
    	//vide
    public Triangle(){}

    	//par copie
    public Triangle(Triangle unTriangle){
        
    	super(unTriangle.getNomForme());
    	this.points = new ArrayList<PointPlan>();
    	this.points = unTriangle.getPoints();
        
    }

    	//champ a champ
    public Triangle(String unNom, PointPlan p1, PointPlan p2, PointPlan p3){
    	super(unNom);
    	this.points = new ArrayList<PointPlan>();
    	this.points.add(p1);
        this.points.add(p2);
        this.points.add(p3);
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

    public void setPoints(PointPlan a, PointPlan b, PointPlan c){
        
    	if (this.points.size() == 0) {
            this.points.add(a);
            this.points.add(b);
            this.points.add(c);
        }
        
        else {
        	this.points.set(0, a);
        	this.points.set(1, b);
        	this.points.set(2, c);
        }
    }

    /*
     * remplace le point d'indice i par le point unPoint
    */
    public void setPoint(int i, PointPlan unPoint){
        this.points.set(i, unPoint);
    }
    
    
    // methodes

    public String typeForme(){
        return "T";
    }

    
    public void deplacer(int deplacementX, int deplacementY){
        this.getPoint(0).deplacer(deplacementX, deplacementY);
    	this.getPoint(1).deplacer(deplacementX, deplacementY);
    	this.getPoint(2).deplacer(deplacementX, deplacementY);

    }

    public String toString(){
    	String res = super.toString();
        return res + "Cette forme est un Triangle, il a pour points :\n Point 1 = " + this.getPoint(0).toString() + "\n Point 2 = " + this.getPoint(1).toString() + "\n Point 3 = " + this.getPoint(2).toString();
    }
    

    /*
     * renvoie la liste de tous les segments 
     * qui permettent de dessiner la forme
     */
    public ArrayList<Segment> dessiner(){
    	
    	PointPlan pointDepart = this.getPoint(0);
    	PointPlan pointArrivee = this.getPoint(1);
    	Segment s1 = new Segment(pointDepart, pointArrivee);
    	
    	
    	pointDepart = pointArrivee;
    	pointArrivee = this.getPoint(2);
    	Segment s2 = new Segment(pointDepart, pointArrivee);
    	
    	pointDepart = this.getPoint(0);
    	Segment s3 = new Segment(pointDepart, pointArrivee);
    	
    	
    	ArrayList<Segment> res = new ArrayList<Segment>();
    	res.add(s1);
    	res.add(s2);
    	res.add(s3);
    	return res;
    }


} // fin classe Triangle
