import java.time.LocalDate;


public class SportActiviteitenMain {


	public static void main (String[] args) {
		
		Beginner rinse = new Beginner("Rinse", 38, 86, 1.89);
		rinse.addFiets("Kermit", "Race");
		rinse.addRit(fiets, "Den Haag", 120, 60, trueheuvels, dag, maand, jaar);
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

class Beginner extends Persoon {
	
		
	Beginner (String naam, int leeftijd, int gewicht, double lengte){
		
	}
	
	Beginner (String naam, int leeftijd){
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

class Fietsen extends Activiteit {	
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	boolean tegenwind;
	boolean heuvels;
	Fietsen (Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind, boolean heuvels, int dag, int maand, int jaar){
		datum.of(dag,maand,jaar);
		Fiets gear=fiets;
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

class Fiets extends Gear {
	String type;     // bijv mountainbike, racefiets, ligfiets, stadsfiets
	Fiets (String naam, String type){
		this.type = type;
	}
}

class Schoenen extends Gear {
	String type; //bijv sport of wandelschoenen
	Schoenen (String naam, String type){
		this.type=type;
	}
}

class Zwemkleding extends Gear {
	
	Zwemkleding (String naam){
	}	
}
	

