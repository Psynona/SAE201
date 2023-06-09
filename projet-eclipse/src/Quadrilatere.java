
public class Quadrilatere extends Forme implements DonneesForme {
	import java.util.ArrayList;

import ardoise.*;

    private ArrayList<PointPlan> points;

    public Quadrilatere(){}

    public Quadrilatere(Quadrilatere unQuadrilatere){
        this.points = unQuadrilatere.points;
        super(unQuadrilatere.nom);
    }

    public Quadrilatere(ArrayList<PointPlan> desPoints, String unNom){
        this.points = desPoints;
        super(unNom);
    }

    public void setPoints(PointPlan a, PointPlan b){
        if (this.points.size() == 0) {
            this.points.add(a);
            this.points.add(b);
        }
    }

    public void setPoint(int indice, PointPlan unPoint){
        this.points.set(indice, unPoint);
    }

    public PointPlan getPoint(int indice){
        return this.points.get(indice);
    }

    public String typeForme(){
        return "Q";
    }

    public void deplacer(int deplacementX, int deplacementY){
        int x = this.getPoint(0) + deplacementX;
        int y = this.getPoint(1) + deplacementY;
        this.setPoint(0, x);
        this.setPoint(1, y);
    }

    public String toString(){
        return "Cette forme est un Quadrilatère, il a pour points :" + this.points + "et est de couleur bleu.";
    }

    public ArrayList<Segment> dessiner(){
        //return a modifier car c'est une collection de segment qui doit être retournee
    	return this.points;
    }

}
