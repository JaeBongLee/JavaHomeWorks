package game;

public class GameLevel2 extends GameLevel{

	//Singleton
	
		private static GameLevel2 instance = new GameLevel2();
		
		private GameLevel2(){};
		
		public static GameLevel2 getInstance(){
			if(instance == null)
				instance = new GameLevel2();
			return instance;
		}
		
		public GameLevel getUpperLevel(){
			return GameLevel3.getInstance();
		}
	@Override
	public void simpleAttack() {
		// TODO Auto-generated method stub
		System.out.println("메롱~ 메롱~");
	}

	@Override
	public void turnAttack() {
		// TODO Auto-generated method stub
		System.out.println("돌려차기 씡~");
	}

	@Override
	public void flyingAttack() {
		// TODO Auto-generated method stub
		System.out.println("이건 못하지");
	}

}
