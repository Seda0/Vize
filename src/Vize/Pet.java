package Vize;

public interface Pet {
	default void getName() {
		
	}

	default void setName() {
		String ad = null;
		System.out.println("Hayvanin Adi:" + ad);
		
		
		

	}
	default void play() {
		System.out.println("Hayvanlar oyun oynar.");
	}
	

}

