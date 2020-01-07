package co.micol.mainapp;

import java.util.Date;

import co.micol.lecture01.Member;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
//		Date date = new Date();
		
//		member.id = "micol";
//		member.name = "홍길동";
//		member.eDate = date;
//		member.addr = "대구광역시";
//		member.tel = "010-1111-1111";
		member.setAge(18);
	
		member.toString();
		member.toPrint();
	}

}
