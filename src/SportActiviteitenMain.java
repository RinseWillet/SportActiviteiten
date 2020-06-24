import java.time.LocalDate;
import java.util.ArrayList;

public class SportActiviteitenMain {


	public static void main (String[] args) {
		
		Beginner rinse = new Beginner("Rinse", 38, 86, 1.89);
		rinse.addFiets("Kermit", "Race");
		System.out.println(rinse.bikes.get(0).naam);
		System.out.println(rinse.bikes.get(0).type);
		rinse.addFiets("Eddy", "Race");
		System.out.println(rinse.bikes.get(0).naam);
		System.out.println(rinse.bikes.get(0).type);
		System.out.println(rinse.bikes.get(1).naam);
		System.out.println(rinse.bikes.get(1).type);
	}
	
	
	
	/*
	 * Dit keer stel ik geheel geen functionele eisen vast. Ik zal alleen verzoeken om .... technische eisen.

De technische eisen zijn:
1. Je moet minstens 7 klassen hebben. 1 daarvan moet abstract zijn. Elke klasse moet zijn eigen verantwoordelijkheid hebben.
2. Er moeten in je programma minstens 2 interfaces zijn.
3. 80 % van de methoden moet een ander returntype hebben dan void.
4. 40 % van de parameters moet van een KlasseType zijn (Strings worden niet meegeteld).
5. Minstens 7 keer zal de interface of het returntype of het parametertype moeten zijn.
6. Er zal zelf een Exception-klasse gemaakt moeten worden.
7. Een Exception zal minstens 3 keer gethrowd moeten worden in je programma.
8. In je programma moet een constructor een keer worden overload.
9. In je programma moet een constructor een keer worden geredirect.
10. Je zult minstens 4 methoden moeten overriden
11. Minstens 1 overridden methode moet een Exception throwsen.
12. 1 constructor moet een exception throwen.
13. Gebruik alleen native java, en het moet een console applicatie zijn

	 * 
	 * 
	 * 
	 */
}


// abstract classes die ten grondslag liggen aan de objecten van de atleten, de sportactiviteiten die ze doen, en de gear waarmee ze dit doen;

abstract class Persoon {
	String naam;
	int leeftijd;
	int gewicht;
	double lengte;
	}

abstract class Activiteit {
	String naam;	
	int calories;
	int tijdsduurMinutes;
	double afstand;
	int dag;
	int maand;
	int jaar;
	
}

abstract class Gear {
	String naam;
	int activiteitenGebruikt;
	int totalekms;
}

//interfaces voor het basale analyseren van de activiteiten, gear en atleten

interface BMI {
	public int BMIberekenen(Beginner beginner);	
	public int BMIberekenen(Amateur amateur);
	public int BMIberekenen(Prof prof);
}

interface GearGebruik {
	public int totaalgebruikFiets(Fiets fiets, Fietsen rit);
	public int totaalgebruikSchoenen1(Schoenen schoenen, Hardlopen run);
	public int totaalgebruikSchoenen2(Schoenen schoenen, Wandelen wandeling);
	public int totaalgebruikZwemmen(Zwemkleding zwemkleding, Zwemmen swim);
}


// vanaf hier de verschillende classes van de typen atleten (Beginner, Amateur, Prof);

class Beginner extends Persoon {
	
	//Arraylisten voor de objecten van activiteiten
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
	
	
	
	
	Beginner (String naam, int leeftijd, int gewicht, double lengte){
		
	}
	
	Beginner (String naam, int leeftijd){
		this.gewicht = 70;	 //default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74;   //default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		}
	
	
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
	
	void addRit(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels, int dag, int maand, int jaar) {
		Fietsen rit = new Fietsen(fiets, naam, tijdsduurMinutes, afstand, tegenwind, heuvels, dag, maand, jaar);
		String gear = fiets.naam;
		ritten.add(rit);
	}
	
	void addRun(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Hardlopen run = new Hardlopen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		String gear = schoenen.naam;
		rondjes.add(run);
	}
	
	void addSwim(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar, boolean buiten) {
		Zwemmen swim = new Zwemmen(zwemkleding, naam, tijdsduurMinutes, afstand, dag, maand, jaar, buiten);
		String gear = zwemkleding.naam;
		baantjes.add(swim);
	}
	
	void addWandeling(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Wandelen wandeling = new Wandelen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		String gear = schoenen.naam;
		hikes.add(wandeling);
	}
	
	
}

class Amateur extends Persoon {
		
	
	Amateur (String naam, int leeftijd, int gewicht, int lengte){
		
	}
	
	Amateur (String naam, int leeftijd){
		this.gewicht = 70;	 //default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74;   //default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		}
		
	void addFiets(String naam, String type) {
		Fiets fiets = new Fiets(naam, type);
	}
	
	void addSchoenen(String naam, String type) {
		Schoenen schoenen = new Schoenen(naam, type);		
	}
	
	void addZwemkleding(String naam) {
		Zwemkleding zwemkleding = new Zwemkleding(naam);
	}
	
	void addRit(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels, int dag, int maand, int jaar) {
		Fietsen rit = new Fietsen(fiets, naam, tijdsduurMinutes, afstand, tegenwind, heuvels, dag, maand, jaar);
		String gear = fiets.naam;
	}
	
	void addRun(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Hardlopen run = new Hardlopen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		String gear = schoenen.naam;
	}
	
	void addSwim(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar, boolean buiten) {
		Zwemmen swim = new Zwemmen(zwemkleding, naam, tijdsduurMinutes, afstand, dag, maand, jaar, buiten);
		String gear = zwemkleding.naam;
	}
	
	void addWandeling(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Wandelen wandeling = new Wandelen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		String gear = schoenen.naam;
	}
	
	
}

class Prof extends Persoon {
		
	
	Prof (String naam, int leeftijd, int gewicht, int lengte){
		
	}
	
	Prof (String naam, int leeftijd){
		this.gewicht = 70;	 //default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74;   //default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		}
	
	void addFiets(String naam, String type) {
		Fiets fiets = new Fiets(naam, type);
	}
	
	void addSchoenen(String naam, String type) {
		Schoenen schoenen = new Schoenen(naam, type);		
	}
	
	void addZwemkleding(String naam) {
		Zwemkleding zwemkleding = new Zwemkleding(naam);
	}
	
	void addRit(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels, int dag, int maand, int jaar) {
		Fietsen rit = new Fietsen(fiets, naam, tijdsduurMinutes, afstand, tegenwind, heuvels, dag, maand, jaar);
		String gear = fiets.naam;
	}
	
	void addRun(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Hardlopen run = new Hardlopen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		String gear = schoenen.naam;
	}
	
	void addSwim(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar, boolean buiten) {
		Zwemmen swim = new Zwemmen(zwemkleding, naam, tijdsduurMinutes, afstand, dag, maand, jaar, buiten);
		String gear = zwemkleding.naam;
	}
	
	void addWandeling(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar) {
		Wandelen wandeling = new Wandelen(schoenen, naam, tijdsduurMinutes, afstand, dag, maand, jaar);
		String gear = schoenen.naam;
	}
	
}

// de typen activiteiten vervat in inherited objecten

class Fietsen extends Activiteit {	
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	boolean tegenwind;
	boolean heuvels;
	Fietsen (Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels, int dag, int maand, int jaar){
		
		Fiets gear=fiets;
		this.naam=naam;
		this.calories=calories;
		this.tijdsduurMinutes=tijdsduurMinutes;
		this.afstand=afstand;
		this.dag=dag;
		this.maand=maand;
		this.jaar=jaar;
		datum.of(dag,maand,jaar);
				
	}
	
}

class Hardlopen extends Activiteit {
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	Hardlopen(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar){
		datum.of(dag,maand,jaar);
		Schoenen gear=schoenen;
	}
}

class Wandelen extends Activiteit {
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	
	Wandelen(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar){
		datum.of(dag,maand,jaar);
		Schoenen gear=schoenen;
	}
}

class Zwemmen extends Activiteit {
	
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	boolean buiten;
	
	Zwemmen(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand, int jaar, boolean buiten){
	datum.of(dag,maand,jaar);
	this.buiten=buiten;
	Zwemkleding gear=zwemkleding;
	}
}


// de sportgear objecten die inherited zijn van de Gear abstract class

class Fiets extends Gear {
	String type;     // bijv mountainbike, racefiets, ligfiets, stadsfiets
	Fiets (String naam, String type){
		this.type = type;
		this.naam=naam;
		this.activiteitenGebruikt=activiteitenGebruikt;
		this.totalekms=totalekms;
	}
}

class Schoenen extends Gear {
	String type; //bijv sport of wandelschoenen
	Schoenen (String naam, String type){
		this.type=type;
		this.naam=naam;
		this.activiteitenGebruikt=activiteitenGebruikt;
		this.totalekms=totalekms;
	}
}

class Zwemkleding extends Gear {
	
	Zwemkleding (String naam){
		this.naam=naam;
		this.activiteitenGebruikt=activiteitenGebruikt;
		this.totalekms=totalekms;
	}	
}
	

