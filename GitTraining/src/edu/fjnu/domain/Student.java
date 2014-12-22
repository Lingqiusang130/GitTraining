/**
 * 
 */
package edu.fjnu.domain;

/**
 * @author lingqiusang
 * 
 */
public class Student {

	/** 用户名 */
	private String name;
	/** 密码 */
	private String pwd1;
	
	private String age;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String username, String password) {
		super();

		this.name = username;
		this.pwd1 = password;
	}



	public String getPwd1() {
		return pwd1;
	}

	public void setPwd1(String pwd1) {
		this.pwd1 = pwd1;
	}


	public String getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setAge(String age) {
		this.age = age;
	}





}
