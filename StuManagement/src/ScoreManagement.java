import java.util.Iterator;
import java.util.TreeMap;


public class ScoreManagement {
	TreeMap scoreMap = new TreeMap(new Student());
	
	public void addScore(Student student, Score score){
			student.setScore(score);
			scoreMap.put(student , score);
	}

	public void displayAllScore(){
			
			Iterator<Student> ir = scoreMap.keySet().iterator();
			
			while(ir.hasNext()){
				System.out.println(ir.next());
			}
		}

}


