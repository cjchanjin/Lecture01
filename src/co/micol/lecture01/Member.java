package co.micol.lecture01;

import java.util.Date;

public class Member {
	String id;				//public, private 이런거 생략하면 protected. (public>protected>default>private)
	String name;
	Date eDate;
	String addr;
	public String tel;
	
	
	private int age;
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public String toString() {
		age = 18;
		System.out.println("id : " + id + "나이 : "+ age);
		return null;
	}
	
	public void toPrint() {
		System.out.print("name : " + name + "eDate : " + eDate + "addr : " + addr + "tel : " + tel);
		System.out.println("=========================");
	}
	
}
