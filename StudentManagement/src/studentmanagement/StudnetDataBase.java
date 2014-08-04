 package studentmanagement;

import java.util.ArrayList;

public class StudnetDataBase {
	public static ArrayList<Student> studentData = new ArrayList<Student>();
	public void StudentDataBase(){
		addStudent(new Student("이승기",141213,"수학",95,20));
		addStudent(new Student("김수현",141518,"영어",90,100));
		addStudent(new Student("주원",141230,"수학",76,60));
		addStudent(new Student("김우빈",141255,"수학",85,89));
		addStudent(new Student("이민호",141590,"영어",90,95));		
	}
	public void addStudent(Student student){
		studentData.add(student);
	}
}
