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
    	super(unNom);
    	this.chapeaux = new ArrayList<Chapeau>();
        this.chapeaux.add(chap1);
        this.chapeaux.add(chap2);
        this.chapeaux.add(chap3);
        this.chapeaux.add(chap4);
        
    }

    public ArrayList<Chapeau> getChapeaux(){
        return this.chapeaux;
    }

    public Chapeau getChapeau(int i){
        return this.chapeaux.get(i);
    }

    public void setChapeau(int i, Chapeau unChapeau){
        this.chapeaux.set(i, unChapeau);
    } 

    public String typeForme() {
        return "GF";
    }
    
    public void deplacer(int deplacementX, int deplacementY) {
        this.getChapeau(0).deplacer(deplacementX, deplacementY);
        this.getChapeau(1).deplacer(deplacementX, deplacementY);
        this.getChapeau(2).deplacer(deplacementX, deplacementY);
        this.getChapeau(3).deplacer(deplacementX, deplacementY);
    }

    public String toString() {
        return "=============================================================\nNom de la forme : "+ this.getNomForme() +" \nCette forme complexe est une Etoile \nElle est composée des 4 chapeaux suivants:\n-------------------------------------\n\tChapeau 1:\n-------------------------------------\n" + this.getChapeau(0) + "\n-------------------------------------\n\tChapeau 2\n-------------------------------------\n" + this.getChapeau(1) + "\n-------------------------------------\n\tChapeau 3\n-------------------------------------\n " + this.getChapeau(2) + "\n-------------------------------------\n\tChapeau 4\n-------------------------------------\n" + this.getChapeau(3)+"\n=============================================================\n";
    }
    
    
    
     public ArrayList<Segment> dessiner(){
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
}
