import ardoise.*;
import ardoise.Forme;

public class TestArdoise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ardoise ardoise = new Ardoise();
		PointPlan p1 = new PointPlan(12,15);
		PointPlan p2 = new PointPlan(20,23);
		System.out.println(p1+"et"+p2);
		Forme t = new Triangle();
		
		ardoise.ajouterForme(t);
		
		ardoise.dessinerGraphique();
		
		ardoise.test();
		
		
	}

}

