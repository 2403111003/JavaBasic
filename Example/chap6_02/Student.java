package chap6_02;

public class Student extends Person{
	int class_Num;
	Student(String name,int age, int class_Num) {
		super(name,age);
		this.class_Num = class_Num;
	}
	String show(){
		return ("학생[이름 : "+name+", 나이 : "+age+", 학번 : "+class_Num+"]");
	}
	int getStudentNum(int studentNum) {
		return studentNum;
	}
	void setstudentNum() {
		this.class_Num = class_Num;
	}
}
