package com.oopsw.model;

public class Student {
	private String studentNumber;
	private String passWord;
	private String phoneNumber;
	//혹시 데이터 중심의 클래스는 object's method overriding.
	//혹시 중복체크할게 필요하다면 equals hash code
	public Student(){}
	public Student(String studentNumber, String password){
		this(studentNumber,password,"");
	}
	public Student(String studentNumber, String password, String phoneNumber){
		this.studentNumber = studentNumber;
		this.passWord = password;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((studentNumber == null) ? 0 : studentNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (passWord == null) {
			if (other.passWord != null)
				return false;
		} else if (!passWord.equals(other.passWord))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (studentNumber == null) {
			if (other.studentNumber != null)
				return false;
		} else if (!studentNumber.equals(other.studentNumber))
			return false;
		return true;
	}
	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String toString(){
		return (studentNumber+" "+" " + phoneNumber);

	}
}
