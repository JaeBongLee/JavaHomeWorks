package maze;

public class PointDirectionInfo extends Point{
	public String direction;
	
	public PointDirectionInfo(){
		this.direction=null;
	}
	public PointDirectionInfo(int x, int y, String direction){
		this.x = x;
		this.y = y;
		this.direction =direction;
	}
}
