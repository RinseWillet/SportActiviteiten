import java.time.LocalDate;


public class SportActiviteitenMain {

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
	
		
	Beginner (String naam, int leeftijd, int gewicht, int lengte){
		
	}
	
	Beginner (String naam, int leeftijd){
		gewicht = 70;	 //default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		lengte = 1.74;   //default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		}
	
}

class Amateur extends Persoon {
		
	
	Amateur (String naam, int leeftijd, int gewicht, int lengte){
		
	}
	
	Amateur (String naam, int leeftijd){
		gewicht = 70;	 //default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		lengte = 1.74;   //default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		}
	
}

class Prof extends Persoon {
		
	
	Prof (String naam, int leeftijd, int gewicht, int lengte){
		
	}
	
	Prof (String naam, int leeftijd){
		gewicht = 70;	 //default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		lengte = 1.74;   //default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
		}
	
}

class Fietsen extends Activiteit {	
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	boolean tegenwind;
	boolean heuvels;
}

class Hardlopen extends Activiteit {
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	
}

class Wandelen extends Activiteit {
	LocalDate datum = LocalDate.of(dag, maand, jaar);
}

class Zwemmen extends Activiteit {
	LocalDate datum = LocalDate.of(dag, maand, jaar);
	boolean buiten;
}

class Fiets extends Gear {
	String type;     // bijv mountainbike, racefiets, ligfiets, stadsfiets
	
}

class Schoenen extends Gear {
	String type; //bijv sport of wandelschoenen
}

class Zwemkleding extends Gear {
	
}
