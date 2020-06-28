// abstract classes die ten grondslag liggen aan de objecten van de atleten, de sportactiviteiten die ze doen, en de gear waarmee ze dit doen;

public abstract class Gear {
	String naam;
	int activiteitenGebruikt;
	int totalekms;
}

//de sportgear objecten die inherited zijn van de Gear abstract class

class Fiets extends Gear implements totaleAfstand {
	String type; // bijv mountainbike, racefiets, ligfiets, stadsfiets

	Fiets(String naam, String type) {
		this.type = type;
		this.naam = naam;
		this.activiteitenGebruikt = activiteitenGebruikt;
		this.totalekms = totalekms;
	}
}

class Schoenen extends Gear {
	String type; // bijv sport of wandelschoenen

	Schoenen(String naam, String type) {
		this.type = type;
		this.naam = naam;
		this.activiteitenGebruikt = activiteitenGebruikt;
		this.totalekms = totalekms;
	}
}

class Zwemkleding extends Gear {

	Zwemkleding(String naam) {
		this.naam = naam;
		this.activiteitenGebruikt = activiteitenGebruikt;
		this.totalekms = totalekms;
	}
}