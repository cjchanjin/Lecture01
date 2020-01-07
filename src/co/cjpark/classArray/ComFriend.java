package co.cjpark.classArray;

public class ComFriend extends Friend{
	public String dept;
	
	public ComFriend() {
		dept = "sales";
	}
	
	
	public String toString() {
		System.out.println("ComFriend [name=" + name + ", phone=" + phone + ",dept=" + dept +"]");
		return null;
	}
}
