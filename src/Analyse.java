import java.util.ArrayList;

public class Analyse implements totaleAfstand {
	
// Checken of BMI atleet gezond is
	
		String Gezond(BMI bmi, double lengte, double gewicht) {
			double BMI = bmi.BMIberekenen(lengte, gewicht);
			String status = " ";
			if (BMI >= 18.5 && BMI <= 25.0) {
				status = "Gezond";
			} else if (BMI < 18.5) {
				status = "Ondergewicht";
			} else if (BMI > 25.0) {
				status = "Overgewicht";
			}
			return "lengte: " + lengte + " gewicht: " + gewicht + " BMI: " + BMI + " Status: " + status;
		}
		
//Afstanden afgelegd atleet met activiteiten
		
		// Afstand atleet afgelegd met fietsen

		double totaalGefietst (totaleAfstand param, ArrayList<Fietsen> totalfiets) {
			double fietstotaal = 0;
			for (int counter = 0; counter < totalfiets.size(); counter++) {
				fietstotaal=param.totalDistance(totalfiets.get(counter).afstand, fietstotaal);
			}
			return fietstotaal;

		}
		
		// Afstand atleet afgelegd met hardlopen
		
		double totaalHardgelopen (totaleAfstand param, ArrayList<Hardlopen> totalhardlopen) {
			double hardlopentotaal = 0;
			for (int counter = 0; counter < totalhardlopen.size(); counter++) {
				hardlopentotaal=param.totalDistance(totalhardlopen.get(counter).afstand, hardlopentotaal);
			}
			return hardlopentotaal;

		}
		
		// Afstand atleet afgelegd met wandelen
		
		double totaalWandelen (totaleAfstand param, ArrayList<Wandelen> wanderlust) {
			double wandelentotaal = 0;
			for (int counter = 0; counter < wanderlust.size(); counter++) {
				wandelentotaal=param.totalDistance(wanderlust.get(counter).afstand, wandelentotaal);
			}
			return wandelentotaal;

		}		
				
		// Afstand atleet afgelegd met zwemmen
		
		double totaalZwemmen (totaleAfstand param, ArrayList<Zwemmen> sinkOrSwim) {
			double zwemmentotaal = 0;
			for (int counter = 0; counter < sinkOrSwim.size(); counter++) {
				zwemmentotaal=param.totalDistance(sinkOrSwim.get(counter).afstand, zwemmentotaal);
			}
			return zwemmentotaal;

		}

//Snelheden per activiteit instellen
		
		//Fietsen in km/u
		double ritSnelheid(totaleAfstand param, Fietsen rit) {
			double snelheid = param.snelheidActiviteit(rit.afstand, rit.tijdsduurMinutes);
			snelheid = snelheid * 60;
			return snelheid;
		}
		
		//Wandelen in km/u
		double wandelingSnelheid(totaleAfstand param, Wandelen wandeling) {
			double snelheid = param.snelheidActiviteit(wandeling.afstand, wandeling.tijdsduurMinutes);
			snelheid = snelheid * 60;
			return snelheid;
		}
		
		// Hardlopen in min / km
		double rennenSnelheid(totaleAfstand param, Hardlopen run) {
			double snelheid = param.snelheidActiviteit(run.afstand, run.tijdsduurMinutes);
			snelheid = 1 / snelheid;
			return snelheid;	// dit is nog niet omgezet naar hele seconden. 4.5 is dus 4 min 30 seconden per km.	
		}
		
		// Zwemmen in min / km
		double zwemmenSnelheid(totaleAfstand param, Zwemmen swim) {
			double snelheid = param.snelheidActiviteit(swim.afstand, swim.tijdsduurMinutes);
			snelheid = 1 / snelheid;
			return snelheid;	// dit is nog niet omgezet naar hele seconden. 4.5 is dus 4 min 30 seconden per km.	
		}
		
//Snelheden aan ArrayLists activiteiten toevoegen
		
		//Fietsen
		
		void snelheidInstellenFietsen(ArrayList<Fietsen> ritten) {
			Analyse analyse = new Analyse();
			double snelheid = 0;
			for (int counter = 0; counter < ritten.size(); counter++) {
				snelheid = analyse.ritSnelheid(new totaleAfstand() {
				}, ritten.get(counter));
				ritten.get(counter).snelheid = snelheid;

			}
		}
		
		//Wandelen
		
		void snelheidInstellenWandelen(ArrayList<Wandelen> wandelingen) {
			Analyse analyse = new Analyse();
			double snelheid = 0;
			for (int counter = 0; counter < wandelingen.size(); counter++) {
				snelheid = analyse.wandelingSnelheid(new totaleAfstand() {
				}, wandelingen.get(counter));
				wandelingen.get(counter).snelheid = snelheid;

			}
		}
		
		// Hardlopen
		
		void snelheidInstellenHardlopen(ArrayList<Hardlopen> running) {
			Analyse analyse = new Analyse();
			double snelheid = 0;
			for (int counter = 0; counter < running.size(); counter++) {
				snelheid = analyse.rennenSnelheid(new totaleAfstand() {
				}, running.get(counter));
				running.get(counter).snelheid = snelheid;

			}
		}
		
		
		//Zwemmen
		
		void snelheidInstellenZwemmen(ArrayList<Zwemmen> swimming) {
			Analyse analyse = new Analyse();
			double snelheid = 0;
			for (int counter = 0; counter < swimming.size(); counter++) {
				snelheid = analyse.zwemmenSnelheid(new totaleAfstand() {
				}, swimming.get(counter));
				swimming.get(counter).snelheid = snelheid;

			}
		}
		
	
//Gear
		
		// Totaalgebruik per fiets
		
		int fietsGebruik(totaleAfstand param, Fiets fiets, ArrayList<Fietsen> totalfiets) {
			int totaalgebruik = 0;
			for (int counter = 0; counter < totalfiets.size(); counter++) {
				if (totalfiets.get(counter).gear == fiets) {
					totaalgebruik=(int)param.totalDistance(totalfiets.get(counter).afstand, totaalgebruik);
				}
			}
			fiets.totalekms = totaalgebruik;
			return totaalgebruik;
		}
		
		// Totaalgebruik per hardloopschoen
		
		int hardloopSchoenGebruik(totaleAfstand param, Schoenen schoen, ArrayList<Hardlopen> totalRuns) {
			int totaalgebruik = 0;
			for (int counter = 0; counter < totalRuns.size(); counter++) {
				if (totalRuns.get(counter).gear == schoen) {
					totaalgebruik=(int)param.totalDistance(totalRuns.get(counter).afstand, totaalgebruik);
				}
			}
			schoen.totalekms = totaalgebruik;
			return totaalgebruik;
		}
	
		// Totaalgebruik per wandelschoen
		
				int wandelSchoenGebruik(totaleAfstand param, Schoenen schoen, ArrayList<Wandelen> wandelingen) {
					int totaalgebruik = 0;
					for (int counter = 0; counter < wandelingen.size(); counter++) {
						if (wandelingen.get(counter).gear == schoen) {
							totaalgebruik=(int)param.totalDistance(wandelingen.get(counter).afstand, totaalgebruik);
						}
					}
					schoen.totalekms = totaalgebruik;
					return totaalgebruik;
				}
				
		// Totaalgebruik per zwemkledingartikel
				
				int zwemkledingGebruik(totaleAfstand param, Zwemkleding zwemkleding, ArrayList<Zwemmen> swims) {
					int totaalgebruik = 0;
					for (int counter = 0; counter < swims.size(); counter++) {
						if (swims.get(counter).gear == zwemkleding) {
							totaalgebruik=(int)param.totalDistance(swims.get(counter).afstand, totaalgebruik);
						}
					}
					zwemkleding.totalekms = totaalgebruik;
					return totaalgebruik;
				}
	
}
