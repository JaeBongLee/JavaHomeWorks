package maze;

public class Point {
	public int x;
	public int y;
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	public void gotoPoint(int x,int y){
		this.x = x;
		this.y = y;
	}
}
