package Vize;

public class Fish extends Animal implements Pet {

	protected Fish(int legs) {
		super(legs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		this.getName();
	}
	public void setName() {
		this.setName();
	}
	
	public void play() {
		
		System.out.println("Baliklar Suda Oyun Oynar.");
	}
	public void Walk() {
		System.out.println("Baliklar yurumez,suda yüzer.");
	}
	public void eat() {
		System.out.println("Baliklar yem yer.");
	}
	

	
}
