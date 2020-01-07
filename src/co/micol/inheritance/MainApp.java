package co.micol.inheritance;

public class MainApp {

	public static void main(String[] args) {
		Car bus = new Bus();
		bus.car();
//		bus.speed();    부모상속 받아서 만든거에는 speed가 없다
		
		Bus bus1 = new Bus();
		bus1.car();
		bus1.speed();   //나를 가지고 생성한 인스턴스에는 speed 있다.
		
		Car taxi = new Taxi();
		taxi.car();
		
	}

}
