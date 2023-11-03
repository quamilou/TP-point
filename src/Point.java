
public class Point {
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void InitialiseToi(int XInit, int YInit) {
		x = XInit;
		y = YInit;
	}

	public void DeplaceToi(int XDep, int YDep) {
		x = x + XDep;
		y = y + YDep;
	}

	public void AfficheToi() {
		System.out.println("Je suis un point de coordonnes " + x + " " + y);
	}

	
}
