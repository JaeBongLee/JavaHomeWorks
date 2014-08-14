package maze;

public class EightDirectionAlgo extends FourDirectionAlgo implements MazeAlgo{
	Map markMap = new Map();//맵을 상속받아서 초기에는 맵과 같은 모양을 가진 마크 소환!
	MazeStack stack = new MazeStack(); //스택 사용을 위해 스택도 소환
	//8방향 못만들겠다는요. .ㅜ
	@Override
	public void StartGame(Point point) {
		System.out.println("경로");
		while(point.x != 7 || point.y != 7){
			if(CheckRD(point)) ;
			else if(CheckRight(point));
			else if(CheckRU(point));
			else if(CheckDown(point));
			else if(CheckDL(point));
			else if(CheckLeft(point));
			else if(CheckUp(point));
			else if(CheckLU(point));
			else{
				point = (Point) stack.pop();
			}
		}

	}

	private boolean CheckRD(Point point) {
		if(point.x < 8 && point.y < 8  && markMap.mazeMap[point.y+1][point.x+1] == 1){
			stack.push(point);
			markMap.mazeMap[point.y][point.x] = 2;
			markMap.mazeMap[point.y+1][point.x] = 10;
			point.x++;
			point.y++;
			System.out.println("("+point.y+","+point.x+")");
		}
		
		return false;
	}
	
	private boolean CheckRU(Point point) {
		if(point.x <8 && point.y > 0  && markMap.mazeMap[point.y-1][point.x+1] == 1){
			stack.push(point);
			markMap.mazeMap[point.y][point.x] = 4;
			markMap.mazeMap[point.y+1][point.x] = 10;
			point.x++;
			point.y--;
			System.out.println("("+point.y+","+point.x+")");
		}
		
		return false;
	}
	
	private boolean CheckDL(Point point) {
		if(point.x > 0  && point.y<8 && markMap.mazeMap[point.y+1][point.x-1] == 1){
			stack.push(point);
			markMap.mazeMap[point.y][point.x] = 6;
			markMap.mazeMap[point.y+1][point.x] = 10;
			point.x--;
			point.y++;
			System.out.println("("+point.y+","+point.x+")");
		}
		
		return false;
	}
	
	private boolean CheckLU(Point point) {
		if(point.x > 0  &&  point.y > 0 && markMap.mazeMap[point.y-1][point.x-1] == 1){
			stack.push(point);
			markMap.mazeMap[point.y][point.x] = 9;
			markMap.mazeMap[point.y][point.x-1] = 10;
			point.x--;
			point.y--;
			System.out.println("("+point.y+","+point.x+")");

		}
		
		return false;
	}
	
}
