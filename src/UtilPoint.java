
public class UtilPoint {

	public static void main(String[] args) {
		Point UnPoint[] = new Point[10];

		// b
		System.out.println("\nb)");
		for (int i = 0; i < UnPoint.length; i++) {
			UnPoint[i] = new Point(i + 1, i + 1);
			UnPoint[i].AfficheToi();
		}

		// c)
		System.out.println("\nc)");
		for (int i = 0; i < UnPoint.length; i++) {
			UnPoint[i].AfficheToi();
		}

		// d)
		for (int i = 0; i < UnPoint.length; i++) {
			UnPoint[i].InitialiseToi((i + 1) % 10 + 1, (i + 1) % 10 + 1);
		}

		// e)
		System.out.println("\ne)");
		for (Point point : UnPoint) {
			point.AfficheToi();
		}
//		UnPoint.InitialiseToi(5, 5);
//		UnPoint.AfficheToi();
//		UnPoint.DeplaceToi(2, 1);
//		UnPoint.AfficheToi();
	}

}
