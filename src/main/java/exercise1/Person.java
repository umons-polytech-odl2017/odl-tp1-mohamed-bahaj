package exercise1;

class Person {
	private String name;
	private int age;
	private static int nbreInstances=0;

	public Person(String name, int age){
		System.out.println("création d'une nouvelle personne");
		this.name= name;
		this.age= age;
		nbreInstances++;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public static int getNbreInstances(){
		return nbreInstances;
	}

}
