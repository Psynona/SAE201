import ardoise.*;
import java.util.*;

public class TestArdoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ardoise ardoise = new Ardoise();
		
		ardoise.test();
		
		/*
		 * Tester la classe Quadrilatere
		 */
		Quadrilatere q1 = new Quadrilatere();
		PointPlan p1 = new PointPlan(10,10);
		PointPlan p2 = new PointPlan(40,50);
		Forme q2 = new Quadrilatere("Rectangle",p1,p2);
		
		ardoise.ajouterForme(q2);
		

		/*
		 * Tester la classe Triangle
		 */
		
		
		/*
		 * Tester la classe Chapeau
		 */
		
		
	}

}
