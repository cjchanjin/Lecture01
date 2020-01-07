package co.cjpark.classArray;

public class MainApp {
	public static Friend[] friends;		//데이터의 형태, 종류 때문에 배열 전체로 잡아줌

	
	public static void main(String[] args) {			//메인메소드에는 입력과출력 입구만 뚫어준다
		initData();
		printData();
		
//		Friend friend = new Friend();
//		friend.toString();
//		
//		Friend univer = new UnivFriend();
//		univer.toString();
//		
//		Friend company = new ComFriend();
//		company.toString();
		
	}
	
	public static void printData() { 			//어떤식으로 출력할것인가
		for(int i = 0; i<friends.length; i++)
		{
//			if(friends[i].gubun.equals("C"))
//				friends[i].toString();
		}
	}
	
	public static void initData () {		//어떤데이터를 입력할 것인가
		
	}
	
}
