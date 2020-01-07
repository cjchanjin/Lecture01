package co.micol.inheritance;

public class Car {
	public int chair;
	public String engine;
	
	public Car() {		//생성자
		
	}
	public void run() {
		System.out.println("달린다");
	}
	
	public void stop() {
		System.out.println("차가 멈춘다");
	}
	
	public void car() {			//캡슐화 하는것 (생성자x)
		run();
		stop();
	}
}
