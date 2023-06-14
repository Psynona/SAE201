import ardoise.*;
import ardoise.Forme;

public class TestArdoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ardoise ardoise = new Ardoise();
		
		PointPlan p1 = new PointPlan(6,13);
		PointPlan p2 = new PointPlan(10,17);
		PointPlan p3 = new PointPlan(14,13);
		PointPlan p4 = new PointPlan(19,13);
		PointPlan p5 = new PointPlan(22,10);
		PointPlan p6 = new PointPlan(25,13);
		
		PointPlan p7 = new PointPlan(27,9);
		PointPlan p8 = new PointPlan(31,5);
		PointPlan p9 = new PointPlan(27,1);
		PointPlan p10 = new PointPlan(23, 5);
		PointPlan p11 = new PointPlan(9,8);
		PointPlan p12 = new PointPlan(14,3);
		PointPlan p13 = new PointPlan(12,3);
		PointPlan p14 = new PointPlan(26, 6);
		PointPlan p15 = new PointPlan(28,6);
		PointPlan p16 = new PointPlan(28,3);
		PointPlan p17 = new PointPlan(26,3);
		
		Chapeau c1 = new Chapeau("Chapeau 1", p7, p14, p10);
		Chapeau c2 = new Chapeau("Chapeau 2", p7, p15, p8);
		Chapeau c3 = new Chapeau("Chapeau 3", p8, p16, p9);
		Chapeau c4 = new Chapeau("Chapeau 4", p10, p17, p9);

		
		
		System.out.println(p1+"et"+p2);
		Chapeau c0 = new Chapeau("Toit",p1,p2,p3);
		ardoise.ajouterForme(c);
		
		Triangle t = new Triangle("Triangle", p4, p5, p6);
		ardoise.ajouterForme(t);
		
		Etoile e = new Etoile(c1,c2,c3,c4, "Etoile");
		ardoise.ajouterForme(e);
		
		Quadrilatere corps = new Quadrilatere("Corps Maison", p1, p12);
		Quadrilatere porte = new Quadrilatere("Porte Maison", p11, p13);
		
		Maison m = new Maison(corps, porte, toit, "Maison");
		ardoise.ajouterForme(m);		
		
		ardoise.dessinerGraphique();

		
		
		
		
		ardoise.test();
		
		
	}

}

