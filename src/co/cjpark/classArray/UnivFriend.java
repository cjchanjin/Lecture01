package co.cjpark.classArray;

public class UnivFriend extends Friend {
	public String major;

	public UnivFriend () {
		major = "history";
	}
	
	
	@Override
	public String toString() {
		System.out.println("UnivFriend [name=" + name + ", phone=" + phone + ",major=" + major +"]");
		return null;
	}
	
	
}
