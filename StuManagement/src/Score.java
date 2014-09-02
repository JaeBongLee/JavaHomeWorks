
public class Score implements Comparable<Score>{
	String studentNumber;
	int koreanScore;
	int mathScore;
	
	public Score(String studentNumber ,int korScore , int mathScore){
		this.studentNumber = studentNumber;
		this.koreanScore = korScore;
		this.mathScore = mathScore;
	}
	
	public int getSum(){
		return this.koreanScore + this.mathScore;
	}
	
	public String toString(){
		return "  국어점수 : "+this.koreanScore + "   수학점수 : "+this.mathScore + "   총점 : "+getSum();
	}
	
public int compareTo(Score that) {
		int r = this.getSum() - that.getSum();

		if(r > 0){
			return -1; 
		}else if(r == 0){
			return 0;	
		}else {
			return 1; 
		}
	}
}
