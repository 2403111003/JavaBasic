package chap6_02;

public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.age = age;
		this.name = name;
	}
	String show() {
		return ("사람[이름 : "+name+", 나이 : "+age+"]");
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age = age;
	}
}
