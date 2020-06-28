import java.time.LocalDate;

//abstract classes die ten grondslag liggen aan de objecten van de atleten, de sportactiviteiten die ze doen, en de gear waarmee ze dit doen;

public abstract class Activiteit {
	String naam;
	int calories;
	int tijdsduurMinutes;
	double afstand;
	double snelheid;
	int dag;
	int maand;
	int jaar;
	LocalDate datum;
}

//de typen activiteiten vervat in inherited objecten

class Fietsen extends Activiteit {
	boolean tegenwind;
	boolean heuvels;
	Fiets gear;

	Fietsen(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels, int dag,
			int maand, int jaar) {
		gear = fiets;
		this.naam = naam;
		this.calories = calories;
		this.tijdsduurMinutes = tijdsduurMinutes;
		this.afstand = afstand;
		this.tegenwind = tegenwind;
		this.heuvels = heuvels;
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		this.datum = datum;
		datum = LocalDate.of(jaar, maand, dag);
	}
}

class Hardlopen extends Activiteit {
	Schoenen gear;

	Hardlopen(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		gear = schoenen;
		this.naam = naam;
		this.calories = calories;
		this.tijdsduurMinutes = tijdsduurMinutes;
		this.afstand = afstand;
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		this.datum = datum;
		datum = LocalDate.of(jaar, maand, dag);
	}
}

class Wandelen extends Activiteit {
	Schoenen gear;

	Wandelen(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		gear = schoenen;
		this.naam = naam;
		this.calories = calories;
		this.tijdsduurMinutes = tijdsduurMinutes;
		this.afstand = afstand;
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		this.datum = datum;
		datum = LocalDate.of(jaar, maand, dag);
	}
}

class Zwemmen extends Activiteit {
	boolean buiten;
	Zwemkleding gear;

	Zwemmen(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar,
			boolean buiten) {
		gear = zwemkleding;
		this.naam = naam;
		this.calories = calories;
		this.tijdsduurMinutes = tijdsduurMinutes;
		this.afstand = afstand;
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
		this.datum = datum;
		datum = LocalDate.of(jaar, maand, dag);
	}
}
