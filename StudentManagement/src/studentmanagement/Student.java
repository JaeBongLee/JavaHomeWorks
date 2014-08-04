package studentmanagement;

import java.util.HashMap;

public class Student {
	public String name;
	public int studentNumber;
	public String major;
	public int englishScore;
	public int mathScore;
	public HashMap<String,Integer> report;
	
	
	public Student(){};
	
	public Student(String name,int studentNumber, String major, int englishScore, int mathScore){
		this.name =name;
		this.studentNumber = studentNumber;
		this.major = major;
		
		report = new HashMap<String,Integer>();
		report.put("영어", new Integer(englishScore));
		report.put("수학", new Integer(mathScore));
		}
	
	public String getMajor(){
		return this.major;
	}
	
	public int getEnglishScore(){
		return this.englishScore;
	}
	
	public int getMathScore(){
		return this.mathScore;
	}
}
