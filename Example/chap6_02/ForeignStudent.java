package chap6_02;

public class ForeignStudent extends Student{
	String country;
	ForeignStudent(String name,int age,int class_Num,String country){
		super(name,age,class_Num);
		this.country = country;
	}
	String getCountry() {
		return country;
	}
	void setCountry(String country) {
		this.country = country;
	}
	String show(){
		return ("외국학생[이름 : "+name+", 나이 : "+age+", 학번 : "+class_Num+", 국적 : "+country+"]");
	}
}
