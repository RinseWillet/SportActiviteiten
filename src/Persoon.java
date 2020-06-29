import java.util.ArrayList;

// abstract classes die ten grondslag liggen aan de objecten van de atleten, de sportactiviteiten die ze doen, en de gear waarmee ze dit doen;

public abstract class Persoon {
	String naam;
	String klasse;
	int leeftijd;
	double gewicht;
	double lengte;
	

	// Arraylisten voor de objecten van activiteiten
	Fietsen rit;
	Hardlopen run;
	Zwemmen swim;
	Wandelen wandeling;
	ArrayList<Fietsen> ritten = new ArrayList<Fietsen>();
	ArrayList<Hardlopen> rondjes = new ArrayList<Hardlopen>();
	ArrayList<Zwemmen> baantjes = new ArrayList<Zwemmen>();
	ArrayList<Wandelen> hikes = new ArrayList<Wandelen>();

	// Arraylisten voor de objecten van gear
	Fiets fiets;
	Schoenen schoenen;
	Zwemkleding zwemkleding;
	ArrayList<Fiets> bikes = new ArrayList<Fiets>();
	ArrayList<Schoenen> shoes = new ArrayList<Schoenen>();
	ArrayList<Zwemkleding> swimminggear = new ArrayList<Zwemkleding>();

	// methodes om datapunten toe te voegen I - Gear
	void addFiets(String naam, String type) {
		Fiets fiets = new Fiets(naam, type);
		bikes.add(fiets);

	}

	void addSchoenen(String naam, String type) {
		Schoenen schoenen = new Schoenen(naam, type);
		shoes.add(schoenen);
	}

	void addZwemkleding(String naam) {
		Zwemkleding zwemkleding = new Zwemkleding(naam);
		swimminggear.add(zwemkleding);
	}

	// methodes om datapunten toe te voegen II - Activiteiten

	void addRit(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels,
			int dag, int maand, int jaar) {
		Fietsen rit = new Fietsen(fiets, naam, tijdsduurMinutes, afstand, tegenwind, heuvels, dag, maand, jaar);
		ritten.add(rit);
	}

	void addRun(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Hardlopen run = new Hardlopen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		rondjes.add(run);
	}

	void addSwim(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
			int jaar, boolean buiten) {
		Zwemmen swim = new Zwemmen(zwemkleding, naam, tijdsduurMinutes, afstand, dag, maand, jaar, buiten);
		baantjes.add(swim);
	}

	void addWandeling(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
			int jaar) {
		Wandelen wandeling = new Wandelen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		hikes.add(wandeling);
	}
}

//************************************************************************************************************************
//*vanaf hier de verschillende classes van de typen atleten (Allrounder, Fietser, Renner, Wandelaar, Zwemmer, Triatleet);*
//************************************************************************************************************************


class Allrounder extends Persoon {
		
	
	Allrounder(String naam, int leeftijd, double gewicht, double lengte) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
		this.klasse="Allrounder";
	}

	Allrounder(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		this.klasse="Allrounder";
	}

	// methodes om datapunten toe te voegen I - Gear
	void addFiets(String naam, String type) {
		Fiets fiets = new Fiets(naam, type);
		bikes.add(fiets);

	}

	void addSchoenen(String naam, String type) {
		Schoenen schoenen = new Schoenen(naam, type);
		shoes.add(schoenen);
	}

	void addZwemkleding(String naam) {
		Zwemkleding zwemkleding = new Zwemkleding(naam);
		swimminggear.add(zwemkleding);
	}

	// methodes om datapunten toe te voegen II - Activiteiten

	void addRit(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels,
			int dag, int maand, int jaar) {
		Fietsen rit = new Fietsen(fiets, naam, tijdsduurMinutes, afstand, tegenwind, heuvels, dag, maand, jaar);
		ritten.add(rit);
	}

	void addRun(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Hardlopen run = new Hardlopen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		rondjes.add(run);
	}

	void addSwim(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
			int jaar, boolean buiten) {
		Zwemmen swim = new Zwemmen(zwemkleding, naam, tijdsduurMinutes, afstand, dag, maand, jaar, buiten);
		baantjes.add(swim);
	}

	void addWandeling(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
			int jaar) {
		Wandelen wandeling = new Wandelen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		hikes.add(wandeling);
	}
}

class Wandelaar extends Persoon {


	
	Wandelaar(String naam, int leeftijd, double gewicht, double lengte) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
		this.klasse = "Wandelaar";
	}

	Wandelaar(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		this.klasse = "Wandelaar";
	}

	// methodes om datapunten toe te voegen I - Gear
	void addFiets() {
		System.out.println("Wandelaars fietsen niet");

	}

	void addSchoenen(String naam, String type) {
		Schoenen schoenen = new Schoenen(naam, type);
		shoes.add(schoenen);
	}

	void addZwemkleding() {
		System.out.println("Wandelaars zwemmen niet");
	}

	// methodes om datapunten toe te voegen II - Activiteiten

	void addRit() {
		System.out.println("Wandelaars fietsen niet");
	}

	void addRun() {
		System.out.println("Wandelaars rennen niet");
	}

	void addSwim() {
		System.out.println("Wandelaars zwemmen niet");
	}

	void addWandeling(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
			int jaar) {
		Wandelen wandeling = new Wandelen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		hikes.add(wandeling);
	}
}

class Zwemmer extends Persoon {
	
	Zwemmer(String naam, int leeftijd, double gewicht, double lengte) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
		this.klasse = "Zwemmer";
	}

	Zwemmer(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		this.klasse = "Zwemmer";
	}

	// methodes om datapunten toe te voegen I - Gear
	void addFiets() {
		System.out.println("Zwemmers fietsen niet");
	}

	void addSchoenen() {
		System.out.println("Zwemmers rennen en wandelen niet");
	}

	void addZwemkleding(String naam) {
		Zwemkleding zwemkleding = new Zwemkleding(naam);
		swimminggear.add(zwemkleding);
	}

	// methodes om datapunten toe te voegen II - Activiteiten

	void addRit() {
		System.out.println("Zwemmers fietsen niet");
	}

	void addRun() {
		System.out.println("Zwemmers rennen niet");
	}

	void addSwim(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
			int jaar, boolean buiten) {
		Zwemmen swim = new Zwemmen(zwemkleding, naam, tijdsduurMinutes, afstand, dag, maand, jaar, buiten);
		baantjes.add(swim);
	}

	void addWandeling() {
		System.out.println("Zwemmers wandelen niet");
	}
}

class Triatleet extends Persoon {

	Triatleet(String naam, int leeftijd, double gewicht, double lengte) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
		this.klasse = "Triatleet";
	}

	Triatleet(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		this.klasse = "Triatleet";
	}

	// methodes om datapunten toe te voegen I - Gear
	void addFiets(String naam, String type) {
		Fiets fiets = new Fiets(naam, type);
		bikes.add(fiets);

	}

	void addSchoenen(String naam, String type) {
		Schoenen schoenen = new Schoenen(naam, type);
		shoes.add(schoenen);
	}

	void addZwemkleding(String naam) {
		Zwemkleding zwemkleding = new Zwemkleding(naam);
		swimminggear.add(zwemkleding);
	}

	// methodes om datapunten toe te voegen II - Activiteiten

	void addRit(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels,
			int dag, int maand, int jaar) {
		Fietsen rit = new Fietsen(fiets, naam, tijdsduurMinutes, afstand, tegenwind, heuvels, dag, maand, jaar);
		ritten.add(rit);
	}

	void addRun(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Hardlopen run = new Hardlopen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		rondjes.add(run);
	}

	void addSwim(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
			int jaar, boolean buiten) {
		Zwemmen swim = new Zwemmen(zwemkleding, naam, tijdsduurMinutes, afstand, dag, maand, jaar, buiten);
		baantjes.add(swim);
	}

	void addWandeling() {
		System.out.println("Triatleten wandelen niet");
	}
}

class Fietser extends Persoon {
	
	Fietser(String naam, int leeftijd, double gewicht, double lengte) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
		this.klasse = "Fietser";
	}

	Fietser(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		this.klasse = "Fietser";
	}

	void addFiets(String naam, String type) {
		Fiets fiets = new Fiets(naam, type);
		bikes.add(fiets);
	}

	void addSchoenen() {
		System.out.println("Fietsers krijgen geen schoenen");
	}

	void addZwemkleding() {
		System.out.println("Fietsers krijgen geen zwemkledij");
	}

	void addRit(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels,
			int dag, int maand, int jaar) {
		Fietsen rit = new Fietsen(fiets, naam, tijdsduurMinutes, afstand, tegenwind, heuvels, dag, maand, jaar);
		ritten.add(rit);
	}

	void addRun() {
		System.out.println("Fietsers rennen niet...behalve wielrennen ;-)");
	}

	void addSwim() {
			System.out.println("Fietsers zwemmen niet");
	}

	void addWandeling() {
		System.out.println("Fietsers wandelen niet");
	}
}

class Renner extends Persoon {
		
		Renner(String naam, int leeftijd, double gewicht, double lengte) {
			this.naam = naam;
			this.leeftijd = leeftijd;
			this.gewicht = gewicht;
			this.lengte = lengte;
			this.klasse = "Hardloper";
		}

		Renner(String naam, int leeftijd) {
			this.naam = naam;
			this.leeftijd = leeftijd;
			this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
			this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
			this.klasse = "Hardloper";
		}

		void addFiets() {
			System.out.println("Renners fietsen niet");
		}

		void addSchoenen(String naam, String type) {
			Schoenen schoenen = new Schoenen(naam, type);
			shoes.add(schoenen);
		}

		void addZwemkleding() {
			System.out.println("Renners zwemmen niet");
		}

		void addRit() {
			System.out.println("Renners fietsen niet");
		}

		void addRun(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
				int jaar) {
			Hardlopen run = new Hardlopen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
			rondjes.add(run);
		}

		void addSwim() {
			System.out.println("Renners zwemmen niet");
		}

		void addWandeling() {
			System.out.println("Renners wandelen niet");
		}

	}
