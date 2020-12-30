package com;

class Eclipse {
	int rollno;
	String name;
	int marks;
	String college;
	public Eclipse(int x) {
		this.rollno=x;
	
	}
	public Eclipse(int x, int y) {
		this.rollno=x;
	marks=y;
	

}
	public Eclipse(int x, String y, int z, String f) {
		this.rollno=x;
		this.name=y;
		this.marks=z;
		this.college=f;
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
		
	}
	
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", college=" + college + "]";
	}
}
	