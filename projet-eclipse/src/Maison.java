import java.util.*;
import ardoise.*;

public class Maison extends Forme {
    
    //variables 
    private Quadrilatere corps;
    private Quadrilatere porte;
    private Chapeau toit;


    public Maison(){}

    public Maison(Maison uneMaison) {
        super(uneMaison.getNomForme());
        this.corps = uneMaison.getCorps();
        this.porte = uneMaison.getPorte();
        this.toit = uneMaison.getToit();
    }

    public Maison(Quadrilatere unCorps, Quadrilatere unePorte, Chapeau unToit, String unNom) {
        super(unNom);
        this.corps = unCorps;
        this.porte = unePorte;
        this.toit = unToit;
    }

    public Quadrilatere getCorps(){
        return this.corps;
    }

    public Quadrilatere getPorte() {
        return this.porte;
    }

    public Chapeau getToit() {
        return this.toit;
    }

    public void setCorps(Quadrilatere unCorps) {
        try{
            this.corps = unCorps;
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres"+ e);
        }
    }

    public void setPorte(Quadrilatere unePorte) {
        try{
            this.porte = unePorte;
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres"+ e);
        }
    }

    public void setToit(Chapeau unToit) {
        try{
            this.toit = unToit;
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres"+ e);
        }
    }

    public String typeForme() {
        return "GF";
    }

    public void deplacer(int deplacementX, int deplacementY) {
        try{
            this.corps.deplacer(deplacementX, deplacementY);
            this.porte.deplacer(deplacementX, deplacementY);
            this.toit.deplacer(deplacementX, deplacementY);
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres" + e);
        }
    }
    
    public String toString() {
        return "=============================================================\nNom de la forme : "+ this.getNomForme() +" \nCette forme complexe est une Maison composée de 2 Quadrilatères et 1 Chapeau.\nVoici ses composants :\n-------------------------------------\nCorps\n-------------------------------------\n" + this.getCorps() + "\n-------------------------------------\nPorte\n-------------------------------------\n" + this.getPorte() + "\n-------------------------------------\nToit\n-------------------------------------\n" + this.getToit()+"\n=============================================================\n";
    }

    public ArrayList<Segment> dessiner(){
        try{
            ArrayList<Segment> res = new ArrayList<Segment>();
            
            res.add(this.getPorte().dessiner().get(0));
            res.add(this.getPorte().dessiner().get(1));
            res.add(this.getPorte().dessiner().get(2));
            res.add(this.getPorte().dessiner().get(3));

            res.add(this.getCorps().dessiner().get(0));
            res.add(this.getCorps().dessiner().get(1));
            res.add(this.getCorps().dessiner().get(2));
            res.add(this.getCorps().dessiner().get(3));
            
            res.add(this.getToit().dessiner().get(0));
            res.add(this.getToit().dessiner().get(1));
            return res;
        }
        catch (NullPointerException e) {
            System.out.println("Il n'y a pas assez de segments"+ e);
        }

    }
} // fin classe Maison