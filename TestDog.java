
public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Author : Precious Sani
		 * Date: 08/22/2023
		 */
		
		Dog bigDog = new Dog();
		bigDog.setAge(6);
		bigDog.setName("Ginger");
		bigDog.setBreed("Akita");
		bigDog.setShotStatus("Up to date");
		
		System.out.println("The name of the big dog is " + bigDog.getName());
		System.out.println("The breed of the big dog is " + bigDog.getBreed());
		System.out.println("The age of the big dog is " + bigDog.getAge());
		System.out.println("The shot status is " + bigDog.getShotStatus());
		
		System.out.println();
		
		
		Dog mediumDog = new Dog();
		mediumDog.setAge(6);
		mediumDog.setName("Bowser");
		mediumDog.setBreed("Retriever");
		mediumDog.setShotStatus("Up to date");
		
		System.out.println("The name of the medium dog is " + mediumDog.getName());
		System.out.println("The breed of the medium dog is " + mediumDog.getBreed());
		System.out.println("The age of the medium dog is " + mediumDog.getAge());
		System.out.println("The shot status is " + mediumDog.getShotStatus());

	}

}
