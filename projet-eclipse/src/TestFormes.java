import ardoise.*;

public class TestFormes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				// TEST DE CLASSE Triangle
				
				//Triangle t1 = new Triangle();
				PointPlan p1 = new PointPlan(12,15);
				PointPlan p2 = new PointPlan(20,23);
				PointPlan p3 = new PointPlan(16,14);
				Triangle t2 = new Triangle("Thay",p1, p2, p3);
				Triangle t3 = new Triangle(t2);
				
				System.out.println(t2);
				System.out.println(t3);
				
				PointPlan p4 = new PointPlan(13,16);
				PointPlan p5 = new PointPlan(21,24);
				PointPlan p6 = new PointPlan(17,15);
				t3.setNomForme("Okay");
				t3.setPoints(p4, p5, p6);

				
				
				// TEST DE CLASSE Quadrilatere
				
				// TEST DE CLASSE Chapeau
				

	} //fin du main

} // fin classe TestFormes

