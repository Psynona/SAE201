import java.util.ArrayList;

import ardoise.Segment;

public abstract class Forme {
	// variables
	private String nomForme;
	
	// constructeurs
	public Forme() {}
	public Forme(String unNomForme) {
		this.nomForme = unNomForme;
	}
	public Forme(Forme uneForme) {
		this.nomForme = uneForme.getNomForme();
	}
	// getters setters
	public String getNomForme() {
		return this.nomForme;
	}
	
	public void setNomForme(String newNomForme) {
		this.nomForme = newNomForme;
	}
	
	// methodes
	public abstract void deplacer(int deplacementX, int deplacementY);
	
	public abstract ArrayList<Segment> dessiner();
	
	public String toString() {
		return "Nom de la forme : " + this.nomForme + "\n";
	}
	public abstract String typeForme();
} // fin classe Forme
