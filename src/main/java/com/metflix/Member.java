package com.metflix;

public class Member {

	private String user;
	private int    age;


	/**
	 * register を行えるようにするために、引数なしのコンストラクタは必須です！
	 */
	public Member() {
	}

	public Member(String user, int age) {
		this.user = user;
		this.age  = age;
	}


	public String getUser() {
		return this.user;
	}

	public int getAge() {
		return this.age;
	}


	public void setUser(String user) {
		this.user = user;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
