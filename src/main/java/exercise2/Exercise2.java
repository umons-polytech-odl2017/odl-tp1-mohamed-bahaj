package exercise2;

public class Exercise2 {

	// Ajoutez un champ age à chaque instance de la classe Person.
	// Créez-y une méthode statique "computePopulationSize" pour retourner la taille de la population.
	// Créez-y une méthode statique "computeAveragePopulationAge" pour calculer l'âge moyen de la population.
	// Implémentez-y une méthode statique "resetPopulation" pour remettre les compteurs à zéro.

	static void createPerson(int age) {
		new Person(age);
	}

	static int computePopulationSize() {
		return Person.getInstances();
	}

	static float computeAveragePopulationAge() {
		return Person.getTotalAge();
	}

	static void resetPopulation() {
		Person.resetPopulation();
	}
}
