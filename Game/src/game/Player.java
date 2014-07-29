package game;

public class Player {
	
	
	public GameLevel nowLevel;
	
	public Player(){
		this.upgradeLevel();		
	}
	
	public void upgradeLevel(){
		
		GameLevel newLevel;
		
		if(nowLevel == null){ 			
			newLevel = GameLevel1.getInstance();
		}else{
			newLevel = nowLevel.getUpperLevel();
			System.out.println("========level "+nowLevel.getLevelNumber()+" end===========\n");
			GameLevel.NowGameLevel++;
		}

		if(newLevel == null){
			System.out.println("========this is max level. could not uprgade.===========");
		}else{
			nowLevel = newLevel;
			System.out.println("========level "+nowLevel.getLevelNumber()+" start===========");
		}
	}
	public int getGameLevel(){
		return GameLevel.NowGameLevel;
	}
	public void attack(){
		this.nowLevel.play();
	}
}
