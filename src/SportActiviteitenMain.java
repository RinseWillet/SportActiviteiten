import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class SportActiviteitenMain implements BMI, totaleAfstand {

	public static void main(String[] args) throws IOException {
		ArrayList<Persoon> atleten = new ArrayList<Persoon>();
		Scanner scan = new Scanner(System.in);
		
		//menu
		while (true) {
			System.out.println("Welke functie wil je testen:");
			System.out.println(" 1 - Atleet toevoegen");
			System.out.println(" 2 - contentEquals");
			System.out.println(" 3 - getBytes");
			System.out.println(" x - stop");

			String command = scan.nextLine();

			if (command.equals("x")) {
				break;
			}

			if (command.contentEquals("1")) {
				while (true) {
					System.out.println("Welk type Atleet wilt u toevoegen:");
					System.out.println(" 1 - Allrounder");
					System.out.println(" 2 - Triatleet");
					System.out.println(" 3 - Fietser");
					System.out.println(" 4 - Hardloper");
					System.out.println(" 5 - Zwemmer");
					System.out.println(" 6 - Wandelaar");
					System.out.println(" 7 - terug");

					int input = scan.nextInt();

					if (input == 7) {
						break;
					}

					if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6) {
						System.out.println("Vul hieronder de naam, leeftijd (jaar), gewicht (kg), en lengte (m)");
						System.out.println("als het gewicht en lengte niet bekend zijn, vul enkel naam en leeftijd in");
						System.out.print("naam: ");
						String naam = scan.next();
						System.out.print("leeftijd: ");
						int leeftijd = scan.nextInt();
						System.out.print("gewicht");
						double gewicht = scan.nextDouble();
						System.out.print("lengte");
						double lengte = scan.nextDouble();
						if (input == 1 && gewicht != 0.0 && lengte != 0.0) {
							Allrounder allrounder = new Allrounder(naam, leeftijd, gewicht, lengte);
							atleten.add(allrounder);
						}
						if (input == 1 && gewicht == 0.0 && lengte == 0.0) {
						Allrounder allrounder = new Allrounder(naam, leeftijd);
						atleten.add(allrounder);
						}
						if (input == 2 && gewicht != 0.0 && lengte != 0.0) {
							Triatleet triatleet = new Triatleet(naam, leeftijd, gewicht, lengte);
							atleten.add(triatleet);
						} 
						if (input == 2 && gewicht == 0.0 && lengte == 0.0) {
							Triatleet triatleet = new Triatleet(naam, leeftijd);
							atleten.add(triatleet);
						} 
						if (input == 3 && gewicht != 0.0 && lengte != 0.0) {
							Fietser fietser = new Fietser(naam, leeftijd, gewicht, lengte);
							atleten.add(fietser);
						}
						if (input == 3 && gewicht == 0.0 && lengte == 0.0) {
							Fietser fietser = new Fietser(naam, leeftijd);
							atleten.add(fietser);
						}
						if (input == 4 && gewicht != 0.0 && lengte != 0.0) {
							Renner renner = new Renner(naam, leeftijd, gewicht, lengte);
							atleten.add(renner);							
						}
						if (input == 4 && gewicht == 0.0 && lengte == 0.0) {
							Renner renner = new Renner(naam, leeftijd);
							atleten.add(renner);
						}
						if (input == 5 && gewicht != 0.0 && lengte != 0.0) {
							Zwemmer zwemmer = new Zwemmer(naam, leeftijd, gewicht, lengte);
							atleten.add(zwemmer);
						}
						if (input == 5 && gewicht == 0.0 && lengte == 0.0) {
							Zwemmer zwemmer = new Zwemmer(naam, leeftijd);
							atleten.add(zwemmer);
						}						
						if (input == 6 && gewicht != 0.0 && lengte != 0.0) {
							Wandelaar wandelaar = new Wandelaar(naam, leeftijd, gewicht, lengte);
							atleten.add(wandelaar);
						}
						if (input == 6 && gewicht == 0.0 && lengte == 0.0) {
							Wandelaar wandelaar = new Wandelaar(naam, leeftijd);
							atleten.add(wandelaar);
						}
						System.out.println("Atleet aangemaakt");
					}
		 		   
		 		   
		 		   
		 		   
		    }
		    
		    if (command.contentEquals("2")) {
		   
		    }
		    
		    if (command.contentEquals("3")) {
			    
		    }
		    		    
		}
	}
		
		for (int i=0; i<atleten.size();i++){
			System.out.println(atleten.get(i).naam);
		}
		

		Allrounder rinse = new Allrounder("Rinse", 38, 86.0, 1.89);

		// gear aan atleet toewijzen
		rinse.addFiets("Eddy", "Race");
		rinse.addFiets("Kermit", "CycloCross");
		rinse.addFiets("Red Arrow", "Ligfiets");
		rinse.addZwemkleding("Zwembroek");
		rinse.addSchoenen("Nike", "Hardloopschoen");
		rinse.addSchoenen("Kisten", "Wandelschoen");

		// activiteiten toewijzen
		rinse.addRit(rinse.bikes.get(0), "Westland", 120, 59, true, false, 22, 6, 2020);
		rinse.addRit(rinse.bikes.get(0), "Veluwe", 76, 25, true, false, 1, 2, 2020);
		rinse.addRit(rinse.bikes.get(1), "Katwijk", 220, 110, true, true, 5, 4, 2020);
		rinse.addRit(rinse.bikes.get(2), "Meijendel", 60, 27, false, true, 12, 2, 2020);

		rinse.addRun(rinse.shoes.get(0), "Rondje Park", 30, 3, 13, 5, 2020);
		rinse.addRun(rinse.shoes.get(0), "Strand", 45, 4, 2, 5, 2020);

		rinse.addWandeling(rinse.shoes.get(1), "Park", 120, 10, 1, 6, 2020);
		rinse.addWandeling(rinse.shoes.get(1), "Stad", 90, 6, 10, 6, 2020);

		System.out.println(rinse.bikes.get(0).naam);
		System.out.println(rinse.bikes.get(0).type);
		rinse.addFiets("Eddy", "Race");
		System.out.println(rinse.bikes.get(0).naam);
		System.out.println(rinse.bikes.get(0).type);
		System.out.println(rinse.bikes.get(1).naam);
		System.out.println(rinse.bikes.get(1).type);

		// bmi atleet

		Analyse analyse = new Analyse();
		System.out.println(analyse.Gezond(new BMI() {
		}, rinse.lengte, rinse.gewicht));

		// totale fietskm atleet

		System.out.println(analyse.totaalGefietst(new totaleAfstand() {
		}, rinse.ritten));

		// totale km fiets Eddy (0)
		System.out.println(analyse.fietsGebruik(new totaleAfstand() {
		}, rinse.bikes.get(0), rinse.ritten));

		// totale aantal activiteiten

		System.out.println(analyse.aantalRitten(rinse.ritten));

		// uitdraai alle fietsritten
		Uitdraai uitdraai = new Uitdraai();
		System.out.println(uitdraai.UitdraaiActiviteitenFiets(rinse));

		// aantal fietsen
		System.out.println(analyse.aantalFietsen(rinse.bikes));

		// uitdraai alle fietsen
		System.out.println(uitdraai.UitdraaiFietsen(rinse));
		
		System.out.println();

		// hoogste snelheid atleet per activiteiten-reeks
		System.out.println(analyse.topSpeedFiets(rinse.ritten));

		// gemiddelde snelheid atleet per activiteiten-reeks
		System.out.println(analyse.averageSpeedFiets(rinse.ritten));

		// wegschrijven prestaties atleet naar txt bestand "atleet" (per type activiteit
		// - naam + datum + afstand + tijdsduur + snelheid & per type activiteit
		// gemiddelde en topsnelheid)
		
		
		uitdraai.UitdraaiGegevensAtleetnaarTXTfile(rinse);
		//rinse.UitdraaiGegevensAtleetnaarTXTfile(rinse);
	
	}
}

/*
 * Dit keer stel ik geheel geen functionele eisen vast. Ik zal alleen verzoeken
 * om .... technische eisen.
 * 
 * De technische eisen zijn: 1. Je moet minstens 7 klassen hebben. 1 daarvan
 * moet abstract zijn. Elke klasse moet zijn eigen verantwoordelijkheid hebben.
 * 2. Er moeten in je programma minstens 2 interfaces zijn. 3. 80 % van de
 * methoden moet een ander returntype hebben dan void. 4. 40 % van de parameters
 * moet van een KlasseType zijn (Strings worden niet meegeteld). 5. Minstens 7
 * keer zal de interface of het returntype of het parametertype moeten zijn. 6.
 * Er zal zelf een Exception-klasse gemaakt moeten worden. 7. Een Exception zal
 * minstens 3 keer gethrowd moeten worden in je programma. 8. In je programma
 * moet een constructor een keer worden overload. 9. In je programma moet een
 * constructor een keer worden geredirect. 10. Je zult minstens 4 methoden
 * moeten overriden 11. Minstens 1 overridden methode moet een Exception
 * throwsen. 12. 1 constructor moet een exception throwen. 13. Gebruik alleen
 * native java, en het moet een console applicatie zijn
 * 
 * 
 * 
 * 
 */
