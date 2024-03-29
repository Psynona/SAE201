import ardoise.*;

public class TestFormes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointPlan p1 = new PointPlan(6,13);
		PointPlan p2 = new PointPlan(10,17);
		PointPlan p3 = new PointPlan(14,13);
		PointPlan p4 = new PointPlan(19,13);
		PointPlan p5 = new PointPlan(22,10);
		PointPlan p6 = new PointPlan(25,13);


				// TEST DE CLASSE Triangle
				
				Triangle t1 = new Triangle();
				
				Triangle t2 = new Triangle("Triangle 2",p1, p2, p3);
				Triangle t3 = new Triangle(t2);
				
				System.out.println(t2);
				
				
				t3.setNomForme("Triangle 3");
				t3.setPoints(p4, p5, p6);
				System.out.println(t3);
				
				t2.setPoint(0, p6);
				System.out.println("La forme est de type: " + t1.typeForme());
				System.out.println(t2);
				
				t2.deplacer(1,1);
				System.out.println(t2);
				
				t3.dessiner();
				
				
				// TEST DE CLASSE Quadrilatere
				Quadrilatere q1 = new Quadrilatere();
				
				Quadrilatere q2 = new Quadrilatere("Quadrilatere 2",p1, p2);
				Quadrilatere q3 = new Quadrilatere(q2);
				
				System.out.println(q2);
				
				q3.setNomForme("Quadrilatere 3");
				q3.setPoints(p4, p5);
				System.out.println(q3);
				
				q2.setPoint(1, p3);
				System.out.println("La forme est de type: " + q1.typeForme());
				System.out.println(q2);
				
				q2.deplacer(10,10);
				System.out.println(q2);
				
				q3.dessiner();
				
				// TEST DE CLASSE Chapeau
				Chapeau c1 = new Chapeau();
				
				Chapeau c2 = new Chapeau("Chapeau 2",p1, p2, p3);
				Chapeau c3 = new Chapeau(c2);
				
				Chapeau c4 = new Chapeau(c2);
				c3.setNomForme("Chapeau 4");
				
				System.out.println(c2);
				
				
				c3.setNomForme("Chapeau 3");
				c3.setPoints(p4, p5, p6);
				System.out.println(c3);
				
				c2.setPoint(0, p6);
				System.out.println("La forme est de type: " + c1.typeForme());
				System.out.println(c2);
				
				c2.deplacer(40,40);
				System.out.println(c2);
				
				c3.dessiner();
				
				
				
				
				// TEST DE CLASSE Etoile
				System.out.println("=========================================\nCLASSE ETOILE\n=========================================");
				Etoile e1 = new Etoile();
				Etoile e2 = new Etoile(c1, c2, c3, c4, "Etoile 2");
				Etoile e3 = new Etoile(e2);
				System.out.print(" Laforme est de type: " + e1.typeForme() +"\n\n");
				e3.setNomForme("Etoile 3");
				e2.setChapeau(0, c4);
				System.out.println(e3);
				e3.deplacer(12, 2);
				System.out.println(e3);
				e2.dessiner();
				

				
				// TEST DE CLASSE Maison
				System.out.println("=========================================\nCLASSE MAISON\n=========================================");
				Maison m1 = new Maison();
				System.out.println(m1.typeForme());
				Maison m2  = new Maison(q2,q3,c2, "Maison 2");
				Maison m3 = new Maison(m2);
				
				System.out.println(m2);
				System.out.println(m3);
				m2.setCorps(q3);
				m2.setPorte(q2);
				m3.setToit(c4);
				System.out.println(m2);
				System.out.println(m3);
				
				m3.deplacer(10, 10);
				System.out.println(m3);
				
				m2.dessiner();


	} //fin du main

} // fin classe TestFormes

