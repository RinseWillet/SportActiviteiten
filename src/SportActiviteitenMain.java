import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;


public class SportActiviteitenMain implements BMI, totaleAfstand {

	public static void main(String[] args) throws IOException {

		// atleet aanmaken
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

// abstract classes die ten grondslag liggen aan de objecten van de atleten, de sportactiviteiten die ze doen, en de gear waarmee ze dit doen;

abstract class Persoon {
	String naam;
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

abstract class Activiteit {
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

abstract class Gear {
	String naam;
	int activiteitenGebruikt;
	int totalekms;
}

// vanaf hier de verschillende classes van de typen atleten (Allrounder, Fietser, Renner, Wandelaar, Zwemmer, Triatleet);

class Allrounder extends Persoon {

	Allrounder(String naam, int leeftijd, double gewicht, double lengte) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
	}

	Allrounder(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
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
	}

	Wandelaar(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
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
	}

	Zwemmer(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
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
	}

	Triatleet(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
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
	}

	Fietser(String naam, int leeftijd) {
		this.naam = naam;
		this.leeftijd = leeftijd;
		this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
		this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
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
		}

		Renner(String naam, int leeftijd) {
			this.naam = naam;
			this.leeftijd = leeftijd;
			this.gewicht = 70; // default gewicht (gemiddelde vrouwen (72 kg) en mannen (85 kg) cf cbs 2018)
			this.lengte = 1.74; // default lengte (gemiddelde vrouwen (1.67) en mannen (1.81) cf. cbs 2018)
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

	
// methodes alle typen Atleten

	class Uitdraai {

		// Uitdraai van activiteiten atleet

		// Fietsen
		String UitdraaiActiviteitenFiets(Allrounder Allrounder) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenFietsen(Allrounder.ritten);
			String uitdraai = "";
			for (Fietsen rit : Allrounder.ritten) {
				uitdraai = uitdraai + ("naam: " + rit.naam + " - datum : " + rit.datum + " - afstand: " + rit.afstand
						+ " - tijdsduur: " + rit.tijdsduurMinutes + " - snelheid: " + rit.snelheid + " - tegenwind: "
						+ rit.tegenwind + " - heuvels: " + rit.heuvels) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiActiviteitenFiets(Fietser fietser) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenFietsen(fietser.ritten);
			String uitdraai = "";
			for (Fietsen rit : fietser.ritten) {
				uitdraai = uitdraai + ("naam: " + rit.naam + " - datum : " + rit.datum + " - afstand: " + rit.afstand
						+ " - tijdsduur: " + rit.tijdsduurMinutes + " - snelheid: " + rit.snelheid + " - tegenwind: "
						+ rit.tegenwind + " - heuvels: " + rit.heuvels) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiActiviteitenFiets(Triatleet triatleet) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenFietsen(triatleet.ritten);
			String uitdraai = "";
			for (Fietsen rit : triatleet.ritten) {
				uitdraai = uitdraai + ("naam: " + rit.naam + " - datum : " + rit.datum + " - afstand: " + rit.afstand
						+ " - tijdsduur: " + rit.tijdsduurMinutes + " - snelheid: " + rit.snelheid + " - tegenwind: "
						+ rit.tegenwind + " - heuvels: " + rit.heuvels) + "\n";
			}
			return uitdraai;
		}

		// Hardlopen
		String UitdraaiActiviteitenHardlopen(Allrounder Allrounder) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenHardlopen(Allrounder.rondjes);
			String uitdraai = "";
			for (Hardlopen run : Allrounder.rondjes) {
				uitdraai = uitdraai + ("naam: " + run.naam + " - datum : " + run.datum + " - afstand: " + run.afstand
						+ " - tijdsduur: " + run.tijdsduurMinutes + " - snelheid: " + run.snelheid) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiActiviteitenHardlopen(Renner renner) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenHardlopen(renner.rondjes);
			String uitdraai = "";
			for (Hardlopen run : renner.rondjes) {
				uitdraai = uitdraai + ("naam: " + run.naam + " - datum : " + run.datum + " - afstand: " + run.afstand
						+ " - tijdsduur: " + run.tijdsduurMinutes + " - snelheid: " + run.snelheid) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiActiviteitenHardlopen(Triatleet triatleet) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenHardlopen(triatleet.rondjes);
			String uitdraai = "";
			for (Hardlopen run : triatleet.rondjes) {
				uitdraai = uitdraai + ("naam: " + run.naam + " - datum : " + run.datum + " - afstand: " + run.afstand
						+ " - tijdsduur: " + run.tijdsduurMinutes + " - snelheid: " + run.snelheid) + "\n";
			}
			return uitdraai;
		}

		// Wandelen
		String UitdraaiActiviteitenWandelen(Allrounder Allrounder) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenWandelen(Allrounder.hikes);
			String uitdraai = "";
			for (Wandelen walk : Allrounder.hikes) {
				uitdraai = uitdraai + ("naam: " + walk.naam + " - datum : " + walk.datum + " - afstand: " + walk.afstand
						+ " - tijdsduur: " + walk.tijdsduurMinutes + " - snelheid: " + walk.snelheid) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiActiviteitenWandelen(Wandelaar wandelaar) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenWandelen(wandelaar.hikes);
			String uitdraai = "";
			for (Wandelen walk : wandelaar.hikes) {
				uitdraai = uitdraai + ("naam: " + walk.naam + " - datum : " + walk.datum + " - afstand: " + walk.afstand
						+ " - tijdsduur: " + walk.tijdsduurMinutes + " - snelheid: " + walk.snelheid) + "\n";
			}
			return uitdraai;
		}

		// Zwemmen
		String UitdraaiActiviteitenZwemmen(Allrounder Allrounder) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenZwemmen(Allrounder.baantjes);
			String uitdraai = "";
			for (Zwemmen swim : Allrounder.baantjes) {
				uitdraai = uitdraai + ("naam: " + swim.naam + " - datum : " + swim.datum + " - afstand: " + swim.afstand
						+ " - tijdsduur: " + swim.tijdsduurMinutes + " - snelheid: " + swim.snelheid) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiActiviteitenZwemmen(Triatleet triatleet) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenZwemmen(triatleet.baantjes);
			String uitdraai = "";
			for (Zwemmen swim : triatleet.baantjes) {
				uitdraai = uitdraai + ("naam: " + swim.naam + " - datum : " + swim.datum + " - afstand: " + swim.afstand
						+ " - tijdsduur: " + swim.tijdsduurMinutes + " - snelheid: " + swim.snelheid) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiActiviteitenZwemmen(Zwemmer zwemmer) {
			Analyse analyse = new Analyse();
			analyse.snelheidInstellenZwemmen(zwemmer.baantjes);
			String uitdraai = "";
			for (Zwemmen swim : zwemmer.baantjes) {
				uitdraai = uitdraai + ("naam: " + swim.naam + " - datum : " + swim.datum + " - afstand: " + swim.afstand
						+ " - tijdsduur: " + swim.tijdsduurMinutes + " - snelheid: " + swim.snelheid) + "\n";
			}
			return uitdraai;
		}

// Uitdraai van alle gear per Atleet

	// Uitdraai gear atleet

		// Fietsen
		String UitdraaiFietsen(Allrounder Allrounder) {
			Analyse analyse = new Analyse();
			analyse.fietsGebruikInstellen(Allrounder.ritten);
			String uitdraai = "";
			for (Fiets bike : Allrounder.bikes) {
				uitdraai = uitdraai + ("Naam fiets: " + bike.naam + " - Type: " + bike.type + " - Kilometers gebruikt: "
						+ bike.totalekms) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiFietsen(Fietser fietser) {
			Analyse analyse = new Analyse();
			analyse.fietsGebruikInstellen(fietser.ritten);
			String uitdraai = "";
			for (Fiets bike : fietser.bikes) {
				uitdraai = uitdraai + ("Naam fiets: " + bike.naam + " - Type: " + bike.type + " - Kilometers gebruikt: "
						+ bike.totalekms) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiFietsen(Triatleet triatleet) {
			Analyse analyse = new Analyse();
			analyse.fietsGebruikInstellen(triatleet.ritten);
			String uitdraai = "";
			for (Fiets bike : triatleet.bikes) {
				uitdraai = uitdraai + ("Naam fiets: " + bike.naam + " - Type: " + bike.type + " - Kilometers gebruikt: "
						+ bike.totalekms) + "\n";
			}
			return uitdraai;
		}

		// Schoenen
		String UitdraaiSchoenen(Allrounder Allrounder) {
			Analyse analyse = new Analyse();
			analyse.hardloopschoenGebruikInstellen(Allrounder.rondjes);
			analyse.wandelschoenGebruikInstellen(Allrounder.hikes);
			String uitdraai = "";
			for (Schoenen schoen : Allrounder.shoes) {
				uitdraai = uitdraai + ("Naam schoenen: " + schoen.naam + " - Type: " + schoen.type
						+ " - Kilometers gebruikt: " + schoen.totalekms) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiSchoenen(Wandelaar wandelaar) {
			Analyse analyse = new Analyse();
			analyse.hardloopschoenGebruikInstellen(wandelaar.rondjes);
			analyse.wandelschoenGebruikInstellen(wandelaar.hikes);
			String uitdraai = "";
			for (Schoenen schoen : wandelaar.shoes) {
				uitdraai = uitdraai + ("Naam schoenen: " + schoen.naam + " - Type: " + schoen.type
						+ " - Kilometers gebruikt: " + schoen.totalekms) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiSchoenen(Renner renner) {
			Analyse analyse = new Analyse();
			analyse.hardloopschoenGebruikInstellen(renner.rondjes);
			analyse.wandelschoenGebruikInstellen(renner.hikes);
			String uitdraai = "";
			for (Schoenen schoen : renner.shoes) {
				uitdraai = uitdraai + ("Naam schoenen: " + schoen.naam + " - Type: " + schoen.type
						+ " - Kilometers gebruikt: " + schoen.totalekms) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiSchoenen(Triatleet triatleet) {
			Analyse analyse = new Analyse();
			analyse.hardloopschoenGebruikInstellen(triatleet.rondjes);
			analyse.wandelschoenGebruikInstellen(triatleet.hikes);
			String uitdraai = "";
			for (Schoenen schoen : triatleet.shoes) {
				uitdraai = uitdraai + ("Naam schoenen: " + schoen.naam + " - Type: " + schoen.type
						+ " - Kilometers gebruikt: " + schoen.totalekms) + "\n";
			}
			return uitdraai;
		}

		// Zwemkleding
		String UitdraaiZwemkleding(Allrounder Allrounder) {
			Analyse analyse = new Analyse();
			analyse.zwemkledingGebruikInstellen(Allrounder.baantjes);
			String uitdraai = "";
			for (Zwemkleding blub : Allrounder.swimminggear) {
				uitdraai = uitdraai + ("Naam item: " + blub.naam + " - Kilometers gebruikt: " + blub.totalekms) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiZwemkleding(Zwemmer zwemmer) {
			Analyse analyse = new Analyse();
			analyse.zwemkledingGebruikInstellen(zwemmer.baantjes);
			String uitdraai = "";
			for (Zwemkleding blub : zwemmer.swimminggear) {
				uitdraai = uitdraai + ("Naam item: " + blub.naam + " - Kilometers gebruikt: " + blub.totalekms) + "\n";
			}
			return uitdraai;
		}

		String UitdraaiZwemkleding(Triatleet triatleet) {
			Analyse analyse = new Analyse();
			analyse.zwemkledingGebruikInstellen(triatleet.baantjes);
			String uitdraai = "";
			for (Zwemkleding blub : triatleet.swimminggear) {
				uitdraai = uitdraai + ("Naam item: " + blub.naam + " - Kilometers gebruikt: " + blub.totalekms) + "\n";
			}
			return uitdraai;
		}

// methode om gegevens naar txt bestand te schrijven

	// Allrounder
		void UitdraaiGegevensAtleetnaarTXTfile(Allrounder Allrounder) throws IOException {
			Analyse analyse = new Analyse();
			Uitdraai uitdraai = new Uitdraai();
			FileWriter filewriter = new FileWriter("Allrounder - " + Allrounder.naam + ".txt", true);
			PrintWriter printWriter = new PrintWriter(filewriter);
			printWriter.println("Gegevens Atleet");
			printWriter.println("================");
			printWriter.println("naam: " + Allrounder.naam);
			printWriter.println("lengte: " + Allrounder.lengte);
			printWriter.println("gewicht: " + Allrounder.gewicht);
			printWriter.println(analyse.Gezond(new BMI() {}, Allrounder));
			printWriter.println(" ");
			printWriter.println("Fiets Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenFiets(Allrounder));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (km/u): " + analyse.averageSpeedFiets(Allrounder.ritten));
			printWriter.println("Top snelheid (km/u): " + analyse.topSpeedFiets(Allrounder.ritten));
			printWriter.println(" ");
			printWriter.println("Fietsen in gebruik: ");
			printWriter.println(uitdraai.UitdraaiFietsen(Allrounder));
			printWriter.println(" ");
			printWriter.println("Hardloop Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenHardlopen(Allrounder));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedHardlopen(Allrounder.rondjes));
			printWriter.println("Top snelheid (min / km): " + analyse.topSpeedHardlopen(Allrounder.rondjes));
			printWriter.println(" ");
			printWriter.println("Wandel Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenWandelen(Allrounder));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (km/u): " + analyse.averageSpeedWandelen(Allrounder.hikes));
			printWriter.println("Top snelheid (km/u): " + analyse.topSpeedWandelen(Allrounder.hikes));
			printWriter.println(" ");
			printWriter.println("Schoenen in gebruik: ");
			printWriter.println(uitdraai.UitdraaiSchoenen(Allrounder));
			printWriter.println(" ");
			printWriter.println("Zwem Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenZwemmen(Allrounder));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedZwemmen(Allrounder.baantjes));
			printWriter.println("Top snelheid (min / km): " + analyse.topSpeedZwemmen(Allrounder.baantjes));
			printWriter.println(" ");
			printWriter.println("Zwemkleding in gebruik: ");
			printWriter.println(uitdraai.UitdraaiZwemkleding(Allrounder));
			printWriter.println(" ");
			printWriter.close();
		}

		// Zwemmer
		void UitdraaiGegevensAtleetnaarTXTfile(Zwemmer zwemmer) throws IOException {
			Analyse analyse = new Analyse();
			Uitdraai uitdraai = new Uitdraai();
			FileWriter filewriter = new FileWriter("Zwemmer - " + zwemmer.naam + ".txt", true);
			PrintWriter printWriter = new PrintWriter(filewriter);
			printWriter.println("Gegevens Atleet");
			printWriter.println("================");
			printWriter.println("naam: " + zwemmer.naam);
			printWriter.println("lengte: " + zwemmer.lengte);
			printWriter.println("gewicht: " + zwemmer.gewicht);
			printWriter.println(analyse.Gezond(new BMI(){}, zwemmer));
			printWriter.println(" ");
			printWriter.println("Zwem Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenZwemmen(zwemmer));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedZwemmen(zwemmer.baantjes));
			printWriter.println("Top snelheid (min / km): " + analyse.topSpeedZwemmen(zwemmer.baantjes));
			printWriter.println(" ");
			printWriter.println("Zwemkleding in gebruik: ");
			printWriter.println(uitdraai.UitdraaiZwemkleding(zwemmer));
			printWriter.println(" ");
			printWriter.close();
		}

		// Wandelaar
		void UitdraaiGegevensAtleetnaarTXTfile(Wandelaar wandelaar) throws IOException {
			Analyse analyse = new Analyse();
			Uitdraai uitdraai = new Uitdraai();
			FileWriter filewriter = new FileWriter("Wandelaar - " + wandelaar.naam + ".txt", true);
			PrintWriter printWriter = new PrintWriter(filewriter);
			printWriter.println("Gegevens Atleet");
			printWriter.println("================");
			printWriter.println("naam: " + wandelaar.naam);
			printWriter.println("lengte: " + wandelaar.lengte);
			printWriter.println("gewicht: " + wandelaar.gewicht);
			printWriter.println(analyse.Gezond(new BMI() {}, wandelaar));
			printWriter.println(" ");
			printWriter.println("Wandel Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenWandelen(wandelaar));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (km/u): " + analyse.averageSpeedWandelen(wandelaar.hikes));
			printWriter.println("Top snelheid (km/u): " + analyse.topSpeedWandelen(wandelaar.hikes));
			printWriter.println(" ");
			printWriter.println("Schoenen in gebruik: ");
			printWriter.println(uitdraai.UitdraaiSchoenen(wandelaar));
			printWriter.println(" ");
			printWriter.close();
		}

		// Renner
		void UitdraaiGegevensAtleetnaarTXTfile(Renner renner) throws IOException {
			Analyse analyse = new Analyse();
			Uitdraai uitdraai = new Uitdraai();
			FileWriter filewriter = new FileWriter("Renner - " + renner.naam + ".txt", true);
			PrintWriter printWriter = new PrintWriter(filewriter);
			printWriter.println("Gegevens Atleet");
			printWriter.println("================");
			printWriter.println("naam: " + renner.naam);
			printWriter.println("lengte: " + renner.lengte);
			printWriter.println("gewicht: " + renner.gewicht);
			printWriter.println(analyse.Gezond(new BMI() {}, renner));
			printWriter.println(" ");
			printWriter.println("Hardloop Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenHardlopen(renner));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedHardlopen(renner.rondjes));
			printWriter.println("Top snelheid (min / km): " + analyse.topSpeedHardlopen(renner.rondjes));
			printWriter.println(" ");
			printWriter.close();
		}

		// Triatleet
		void UitdraaiGegevensAtleetnaarTXTfile(Triatleet triatleet) throws IOException {
			Analyse analyse = new Analyse();
			Uitdraai uitdraai = new Uitdraai();
			FileWriter filewriter = new FileWriter("Triatleet - " + triatleet.naam + ".txt", true);
			PrintWriter printWriter = new PrintWriter(filewriter);
			printWriter.println("Gegevens Atleet");
			printWriter.println("================");
			printWriter.println("naam: " + triatleet.naam);
			printWriter.println("lengte: " + triatleet.lengte);
			printWriter.println("gewicht: " + triatleet.gewicht);
			printWriter.println(analyse.Gezond(new BMI() {}, triatleet));
			printWriter.println(" ");
			printWriter.println("Fiets Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenFiets(triatleet));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (km/u): " + analyse.averageSpeedFiets(triatleet.ritten));
			printWriter.println("Top snelheid (km/u): " + analyse.topSpeedFiets(triatleet.ritten));
			printWriter.println(" ");
			printWriter.println("Fietsen in gebruik: ");
			printWriter.println(uitdraai.UitdraaiFietsen(triatleet));
			printWriter.println(" ");
			printWriter.println("Hardloop Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenHardlopen(triatleet));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedHardlopen(triatleet.rondjes));
			printWriter.println("Top snelheid (min / km): " + analyse.topSpeedHardlopen(triatleet.rondjes));
			printWriter.println(" ");
			printWriter.println("Zwem Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenZwemmen(triatleet));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedZwemmen(triatleet.baantjes));
			printWriter.println("Top snelheid (min / km): " + analyse.topSpeedZwemmen(triatleet.baantjes));
			printWriter.println(" ");
			printWriter.println("Zwemkleding in gebruik: ");
			printWriter.println(uitdraai.UitdraaiZwemkleding(triatleet));
			printWriter.println(" ");
			printWriter.close();
		}

		// Fietser
		void UitdraaiGegevensAtleetnaarTXTfile(Fietser fietser) throws IOException {
			Analyse analyse = new Analyse();
			Uitdraai uitdraai = new Uitdraai();
			FileWriter filewriter = new FileWriter("Fietser - " + fietser.naam + ".txt", true);
			PrintWriter printWriter = new PrintWriter(filewriter);
			printWriter.println("Gegevens Atleet");
			printWriter.println("================");
			printWriter.println("naam: " + fietser.naam);
			printWriter.println("lengte: " + fietser.lengte);
			printWriter.println("gewicht: " + fietser.gewicht);
			printWriter.println(analyse.Gezond(new BMI() {}, fietser));
			printWriter.println(" ");
			printWriter.println("Fiets Activiteiten");
			printWriter.println("==================");
			printWriter.println(uitdraai.UitdraaiActiviteitenFiets(fietser));
			printWriter.println("==================");
			printWriter.println("Gemiddelde snelheid (km/u): " + analyse.averageSpeedFiets(fietser.ritten));
			printWriter.println("Top snelheid (km/u): " + analyse.topSpeedFiets(fietser.ritten));
			printWriter.println(" ");
			printWriter.println("Fietsen in gebruik: ");
			printWriter.println(uitdraai.UitdraaiFietsen(fietser));
			printWriter.println(" ");
			printWriter.close();
		}

	}

// de typen activiteiten vervat in inherited objecten

			class Fietsen extends Activiteit {
				boolean tegenwind;
				boolean heuvels;
				Fiets gear;

				Fietsen(Fiets fiets, String naam, int tijdsduurMinutes, double afstand, boolean tegenwind,
						boolean heuvels, int dag, int maand, int jaar) {
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

				Hardlopen(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
						int jaar) {
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

				Wandelen(Schoenen schoenen, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
						int jaar) {
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

				Zwemmen(Zwemkleding zwemkleding, String naam, int tijdsduurMinutes, double afstand, int dag, int maand,
						int jaar, boolean buiten) {
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

// de sportgear objecten die inherited zijn van de Gear abstract class

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
