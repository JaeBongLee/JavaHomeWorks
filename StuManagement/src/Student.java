import java.util.Comparator;
import java.util.ArrayList;


public class Student implements Comparator<Student>{
	String studentName;
	String studentNumber;
	Score score;
	
	public Student(){}
	
	public Student(String studentName,String studentNumber){
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}
	
	public String toString(){
		return "학생이름 : " + this.studentName + "점수:"+this.score;
	}
	
	public void setScore(Score score){
		this.score = score;
	}
	
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentNumber);
	}


	@Override
	public boolean equals(Object obj) {
		Student student = (Student)obj;
		return this.studentNumber.equals(student.studentNumber);
	}
	
	@Override
	public int compare(Student student1, Student student2) {
		Score s1 = student1.score;
		Score s2 = student2.score;
		return s1.compareTo(s2);	
	}
}
