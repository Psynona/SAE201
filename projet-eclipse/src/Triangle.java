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
        try{
            return this.points.get(i);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Vous avez saisi un indice trop élevé"+ e);
            return this.points.get(0);
        }
    }
    
    /*
     * modifie les points de la collection points
     */

    public void setPoints(PointPlan a, PointPlan b, PointPlan c){
        try{
        	this.points.set(0, a);
        	this.points.set(1, b);
        	this.points.set(2, c);
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres"+ e);
            
        }
    }

    /*
     * remplace le point d'indice i par le point unPoint
    */
    public void setPoint(int i, PointPlan unPoint){
        try{
            this.points.set(i, unPoint);
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres"+ e);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Vous avez saisi un indice trop élevé"+ e);
        }
    }
    
    
    // methodes

    public String typeForme(){
        return "T";
    }

    
    public void deplacer(int deplacementX, int deplacementY){
        try {
            this.getPoint(0).deplacer(deplacementX, deplacementY);
            this.getPoint(1).deplacer(deplacementX, deplacementY);
            this.getPoint(2).deplacer(deplacementX, deplacementY);
        }
        catch (NullPointerException e) {
            System.out.println("Il n'y a pas assez de segments"+ e);
        }
    }

    public String toString(){
    	String res = super.toString();
        return res + "Nom de la forme : "+ this.getNomForme() +"\nCette forme est un Triangle, il a pour points :\n Point 1 = " + this.getPoint(0).toString() + "\n Point 2 = " + this.getPoint(1).toString() + "\n Point 3 = " + this.getPoint(2).toString();
    }
    

    /*
     * renvoie la liste de tous les segments 
     * qui permettent de dessiner la forme
     */
    public ArrayList<Segment> dessiner(){
    	try{
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
        catch (NullPointerException e) {
            System.out.println("Il n'y a pas assez de segments"+ e);
        }
    }


} // fin classe Triangle