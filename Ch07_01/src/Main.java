
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(10, 20, 11, 21, 12, 22);
		Rectangle rect = new Rectangle(20, 30, 100, 200);
		Circle cir = new Circle(30, 40, 300);
		Geometry [] geos = new Geometry[3];
		geos[0] = tri;
		geos[1] = rect;
		geos[2] = cir;
			for(Geometry geo : geos)
				geo.draw();
	}

}
