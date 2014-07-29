package game;

public class GameLevel1 extends GameLevel{
	
	//Singleton
	
	private static GameLevel1 instance = new GameLevel1();
	
	private GameLevel1(){};
	
	public static GameLevel1 getInstance(){
		if(instance == null)
			instance = new GameLevel1();
		return instance;
	}
	public GameLevel getUpperLevel(){
		return GameLevel2.getInstance();
	}

	@Override
	public void simpleAttack() {
		// TODO Auto-generated method stub
		System.out.println("메롱~");
	}

	@Override
	public void turnAttack() {
		// TODO Auto-generated method stub
		System.out.println("못하지롱");
	}

	@Override
	public void flyingAttack() {
		// TODO Auto-generated method stub
		System.out.println("이것도 못하지롱");
	}

}
