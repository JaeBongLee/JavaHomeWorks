package game;

public abstract class  GameLevel {
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	public abstract GameLevel getUpperLevel();
	
	public static int NowGameLevel = 1;
	
	public int getLevelNumber(){
		return NowGameLevel;
	}
	public final void play(){
	
		simpleAttack();
		turnAttack();
		flyingAttack();
		
	}
}
