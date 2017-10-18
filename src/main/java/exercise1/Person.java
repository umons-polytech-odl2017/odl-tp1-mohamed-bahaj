package exercise1;

class Person {
	private String name;
	private int age;
	private static int nbreInstances=0;
	private static float average=0;

	public Person(String name, int age){
		System.out.println("création d'une nouvelle personne");
		this.name= name;
		this.age= age;
		nbreInstances++;
		average=average+age;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	static int computePopulationSize() {
		return Person.nbreInstances;
	}

	static float computeAveragePopulationAge() {
		return Person.average/Person.nbreInstances;
	}

}
