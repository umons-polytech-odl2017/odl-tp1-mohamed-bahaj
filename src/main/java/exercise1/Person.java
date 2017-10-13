package exercise1;

class Person {
	String name;
	int age;

	public Person(String n, int a){
		this.name=n;
		this.age=a;
	}

	public Person(){
		this.name=null;
		this.age=0;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

}
