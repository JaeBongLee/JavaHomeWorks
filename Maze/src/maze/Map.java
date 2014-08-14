package maze;

public class Map {
	int [][] mazeMap;
	public Map(){
		mazeMap = new int[][]
		{
			{1,0,0,0,1,0,0,0},
			{1,1,1,0,1,1,1,1},
			{0,0,1,1,1,0,1,0},
			{0,0,1,0,0,0,1,0},
			{0,1,1,0,1,1,1,1},
			{1,0,0,0,1,0,0,0},
			{0,1,0,0,1,1,1,1},
			{1,0,0,1,0,0,0,1}				
		};
	}
	public void drawMap(){
		for(int i = 0 ; i< 8;i++)
		{
			for(int j = 0 ; j < 8; j++)
			{
				System.out.print(mazeMap[i][j]+ " ");
			}
			System.out.println("");
		}
	}
	
}
