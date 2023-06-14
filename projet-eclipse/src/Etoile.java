import java.util.*;
import ardoise.*;
public class Etoile extends Forme {
    
    private ArrayList<Chapeau> chapeaux;

    public Etoile(){}

    public Etoile(Etoile uneEtoile) {
        super(uneEtoile.getNomForme());
        this.chapeaux = new ArrayList<Chapeau>();
        this.chapeaux = uneEtoile.getChapeaux();
        
    }

    public Etoile(Chapeau chap1, Chapeau chap2, Chapeau chap3, Chapeau chap4, String unNom) {
        try{
            super(unNom);
            this.chapeaux = new ArrayList<Chapeau>();
            this.chapeaux.add(chap1);
            this.chapeaux.add(chap2);
            this.chapeaux.add(chap3);
            this.chapeaux.add(chap4);
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres" + e);
        }
        
    }

    public ArrayList<Chapeau> getChapeaux(){
        return this.chapeaux;
    }

    public Chapeau getChapeau(int i){
        try{
            return this.chapeaux.get(i);
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres"+ e);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Vous avez saisi un indice trop élevé"+ e);
        }
    }

    public void setChapeau(int i, Chapeau unChapeau){
        try{
            this.chapeaux.set(i, unChapeau);
        }
        catch(IllegalStateException e) {
            System.out.println("Vous avez oublié un ou plusieurs paramètres"+ e);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Vous avez saisi un indice trop élevé"+ e);
        }
    } 

    public String typeForme() {
        return "GF";
    }

    public void deplacer(int deplacementX, int deplacementY) {
        try{
            this.getChapeau(0).deplacer(deplacementX, deplacementY);
            this.getChapeau(1).deplacer(deplacementX, deplacementY);
            this.getChapeau(2).deplacer(deplacementX, deplacementY);
            this.getChapeau(3).deplacer(deplacementX, deplacementY);
        }
        catch (NullPointerException e) {
            System.out.println("Il n'y a pas assez de segments"+ e);
        }
    }

    public String toString() {
        return "=============================================================\nNom de la forme : "+ this.getNomForme() +" \nCette forme complexe est une Etoile \nElle est composée des 4 chapeaux suivants:\n-------------------------------------\n\tChapeau 1:\n-------------------------------------\n" + this.getChapeau(0) + "\n-------------------------------------\n\tChapeau 2\n-------------------------------------\n" + this.getChapeau(1) + "\n-------------------------------------\n\tChapeau 3\n-------------------------------------\n " + this.getChapeau(2) + "\n-------------------------------------\n\tChapeau 4\n-------------------------------------\n" + this.getChapeau(3)+"\n=============================================================\n";
    }
    
    
    
     public ArrayList<Segment> dessiner(){
        try{
            ArrayList<Segment> res = new ArrayList<Segment>();
            res.add(this.getChapeau(1).dessiner().get(0));
            res.add(this.getChapeau(1).dessiner().get(1));
            res.add(this.getChapeau(0).dessiner().get(0));
            res.add(this.getChapeau(0).dessiner().get(1));
            res.add(this.getChapeau(2).dessiner().get(0));
            res.add(this.getChapeau(2).dessiner().get(1));
            res.add(this.getChapeau(3).dessiner().get(0));
            res.add(this.getChapeau(3).dessiner().get(1));
            return res;
        }
        catch (NullPointerException e) {
            System.out.println("Il n'y a pas assez de segments"+ e);
        }
     
     }
}