package maze;

public class FourDirectionAlgo implements MazeAlgo{
	Map markMap = new Map();//맵을 상속받아서 초기에는 맵과 같은 모양을 가진 마크 소환!
	MazeStack stack = new MazeStack(); //스택 사용을 위해 스택도 소환
		
		//Checking 구

		protected boolean CheckLeft(Point point) {
			if(point.x > 0  && markMap.mazeMap[point.y][point.x-1] == 1){
				stack.push(point);
				markMap.mazeMap[point.y][point.x] = 7;
				point.x--;
				System.out.println("("+point.y+","+point.x+")");
				//return true;
			}
			
			return false;
		}


		protected boolean CheckUp(Point point) {
			if(point.y >0 && markMap.mazeMap[point.y-1][point.x] == 1){
				stack.push(point);
				markMap.mazeMap[point.y][point.x] = 8;
				point.y--;
				System.out.println("("+point.y+","+point.x+")");
				//return true;
			}
			
			return false;
		}


		protected boolean CheckDown(Point point) {
			if(point.y < 8 && markMap.mazeMap[point.y+1][point.x] == 1){
				stack.push(point);
				markMap.mazeMap[point.y][point.x] = 5;
				point.y++;
				System.out.println("("+point.y+","+point.x+")");
				//return true;
			}
			
			return false;
		}


		protected boolean CheckRight(Point point) {
			if(point.x < 8 && markMap.mazeMap[point.y][point.x+1] == 1){
				stack.push(point);
				markMap.mazeMap[point.y][point.x] = 3;
				point.x++;
				System.out.println("("+point.y+","+point.x+")");
				//return true;
			}
			return false;
		}


		@Override
		public void StartGame(Point point) {
			System.out.println("경로");
			while(point.x != 7 || point.y != 7){
				if(CheckRight(point)) ;
				else if(CheckDown(point));
				else if(CheckUp(point));
				else if(CheckLeft(point));
				else{
					point = (Point) stack.pop();
				}
			}
			
		}


}
