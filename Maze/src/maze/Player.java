package maze;

public class Player {
	public static void main(String argsp[]){
		Map map = new Map();
		Player player = new Player();
		System.out.println("미로 모양");
		map.drawMap();
		player.StartGame(new FourDirectionAlgo());//얘만 바꿔주면 정책변경 가능
		
	}
	
	public void StartGame(MazeAlgo algo){
		algo.StartGame(new Point());
	}
}
