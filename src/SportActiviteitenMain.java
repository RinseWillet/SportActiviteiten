
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
	String type;
	int calories;
	int durationMinutes;
	
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