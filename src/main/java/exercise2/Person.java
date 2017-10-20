package exercise2;

class Person {
	private int age;
	private static int instances=0;
	private static int totalAge=0;

	public Person(int age) {
		this.age = age;
		instances++;
	}

	public static int getInstances(){
		return Person.instances;
	}

	public static int getTotalAge(){
		return (int) (Person.totalAge/Person.instances);
	}

	public static void resetPopulation(){
		Person.totalAge=0;
		Person.instances=0;
	}

}
