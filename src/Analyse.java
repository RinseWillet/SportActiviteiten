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
		
		String Gezond(BMI bmi, Persoon allrounder) {
			double BMI = bmi.BMIberekenen(allrounder.lengte, allrounder.gewicht);
			String status = " ";
			if (BMI >= 18.5 && BMI <= 25.0) {
				status = "Gezond";
			} else if (BMI < 18.5) {
				status = "Ondergewicht";
			} else if (BMI > 25.0) {
				status = "Overgewicht";
			}
			return "BMI: " + BMI + " Status: " + status;
		}
		
// tellen aantal activiteiten per activiteitcategorie
		
		//fietsen
		int aantalRitten (ArrayList<Fietsen> ritten) {
			int aantal = ritten.size();
			return aantal;						
		}
		
		//hardlopen
		int aantalRuns (ArrayList<Hardlopen> runs) {
			int aantal = runs.size();
			return aantal;
		}
		
		//wandelen
		int aantalHikes (ArrayList<Wandelen> hikes) {
			int aantal = hikes.size();
			return aantal;
		}
		
		//zwemmen
		int aantalSwims (ArrayList<Zwemmen> swims) {
			int aantal = swims.size();
			return aantal;
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

//Snelheden per activiteit berekenen
		
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
		
		
// Gemiddelde snelheid berekenen per activiteitenreeks

		// Fietsen
		double averageSpeedFiets(ArrayList<Fietsen> ritten) {
			double totaal = 0;
			for (int counter = 0; counter < ritten.size(); counter++) {
				totaal = totaal + ritten.get(counter).snelheid;
			}
			totaal = totaal / aantalRitten(ritten);
			return totaal;
		}

		// Hardlopen
		double averageSpeedHardlopen(ArrayList<Hardlopen> runs) {
			double totaal = 0;
			for (int counter = 0; counter < runs.size(); counter++) {
				totaal = totaal + runs.get(counter).snelheid;
			}
			totaal = totaal / aantalRuns(runs);
			return totaal;
		}

		// Wandelen
		double averageSpeedWandelen(ArrayList<Wandelen> wandelen) {
			double totaal = 0;
			for (int counter = 0; counter < wandelen.size(); counter++) {
				totaal = totaal + wandelen.get(counter).snelheid;
			}
			totaal = totaal / aantalHikes(wandelen);
			return totaal;
		}

		// Zwemmen
		double averageSpeedZwemmen(ArrayList<Zwemmen> swims) {
			double totaal = 0;
			for (int counter = 0; counter < swims.size(); counter++) {
				totaal = totaal + swims.get(counter).snelheid;
			}
			totaal = totaal / aantalSwims(swims);
			return totaal;
		}	
		
// Hoogste snelheid berekenen per activiteitenreeks

		// Fietsen
		double topSpeedFiets(ArrayList<Fietsen> ritten) {
			double topsnelheid = 0;
			for (int counter = 0; counter < ritten.size(); counter++) {
				if (topsnelheid < ritten.get(counter).snelheid) {
					topsnelheid = ritten.get(counter).snelheid;
				}
			}
			return topsnelheid;
		}

		// Hardlopen
		double topSpeedHardlopen(ArrayList<Hardlopen> runs) {
			double topsnelheid = 100;
			for (int counter = 0; counter < runs.size(); counter++) {
				if (topsnelheid > runs.get(counter).snelheid) {
					topsnelheid = runs.get(counter).snelheid;
				}
			}
			return topsnelheid;
		}

		// Wandelen
		double topSpeedWandelen(ArrayList<Wandelen> wandelen) {
			double topsnelheid = 0;
			for (int counter = 0; counter < wandelen.size(); counter++) {
				if (topsnelheid < wandelen.get(counter).snelheid) {
					topsnelheid = wandelen.get(counter).snelheid;
				}
			}
			return topsnelheid;
		}

		// Zwemmen
		double topSpeedZwemmen(ArrayList<Zwemmen> swims) {
			double topsnelheid = 100;
			for (int counter = 0; counter < swims.size(); counter++) {
				if (topsnelheid > swims.get(counter).snelheid) {
					topsnelheid = swims.get(counter).snelheid;
				}
			}
			return topsnelheid;
		}
		
//Gear methodes
		
		// aantal van gear per categorie per atleet

		// aantal fietsen
		int aantalFietsen(ArrayList<Fiets> bikes) {
			int aantal = bikes.size();
			return aantal;
		}

		// aantal schoenen
		int aantalSchoenen(ArrayList<Schoenen> shoes) {
			int aantal = shoes.size();
			return aantal;
		}

		// aantal zwemkleding
		int aantalZwemkleding(ArrayList<Zwemkleding> swimgear) {
			int aantal = swimgear.size();
			return aantal;
		}
	
		// totaalgebruik Gear

		// Totaalgebruik per fiets

		int fietsGebruik(totaleAfstand param, Fiets fiets, ArrayList<Fietsen> totalfiets) {
			int totaalgebruik = 0;
			for (int counter = 0; counter < totalfiets.size(); counter++) {
				if (totalfiets.get(counter).gear == fiets) {
					totaalgebruik = (int) param.totalDistance(totalfiets.get(counter).afstand, totaalgebruik);
				}
			}
			return totaalgebruik;
		}

		// Totaalgebruik fietsen instellen in ArrayList
		void fietsGebruikInstellen(ArrayList<Fietsen> totalfiets) {
			Analyse analyse = new Analyse();
			for (int counter = 0; counter < totalfiets.size(); counter++) {
				totalfiets.get(counter).gear.totalekms = analyse.fietsGebruik(new totaleAfstand() {
				}, totalfiets.get(counter).gear, totalfiets);
			}
		}

		// Totaalgebruik per hardloopschoen

		int hardloopSchoenGebruik(totaleAfstand param, Schoenen schoen, ArrayList<Hardlopen> totalRuns) {
			int totaalgebruik = 0;
			for (int counter = 0; counter < totalRuns.size(); counter++) {
				if (totalRuns.get(counter).gear == schoen) {
					totaalgebruik = (int) param.totalDistance(totalRuns.get(counter).afstand, totaalgebruik);
				}
			}
			
			return totaalgebruik;
		}
		
		// Totaalgebruik hardloopschoenen instellen in ArrayList
		
		void hardloopschoenGebruikInstellen(ArrayList<Hardlopen> totalruns) {
			Analyse analyse = new Analyse();
			for (int counter = 0; counter < totalruns.size(); counter++) {
				totalruns.get(counter).gear.totalekms = analyse.hardloopSchoenGebruik(new totaleAfstand() {
				}, totalruns.get(counter).gear, totalruns);
			}
		}
		
		// Totaalgebruik per wandelschoen

		int wandelSchoenGebruik(totaleAfstand param, Schoenen schoen, ArrayList<Wandelen> wandelingen) {
			int totaalgebruik = 0;
			for (int counter = 0; counter < wandelingen.size(); counter++) {
				if (wandelingen.get(counter).gear == schoen) {
					totaalgebruik = (int) param.totalDistance(wandelingen.get(counter).afstand, totaalgebruik);
				}
			}
			
			return totaalgebruik;
		}
		
		// Totaalgebruik wandelschoenen instellen in ArrayList
		
		void wandelschoenGebruikInstellen(ArrayList<Wandelen> wandelingen) {
			Analyse analyse = new Analyse();
			for (int counter = 0; counter < wandelingen.size(); counter++) {
				wandelingen.get(counter).gear.totalekms = analyse.wandelSchoenGebruik(new totaleAfstand() {
				}, wandelingen.get(counter).gear, wandelingen);
			}
		}

		// Totaalgebruik per zwemkledingartikel

		int zwemkledingGebruik(totaleAfstand param, Zwemkleding zwemkleding, ArrayList<Zwemmen> swims) {
			int totaalgebruik = 0;
			for (int counter = 0; counter < swims.size(); counter++) {
				if (swims.get(counter).gear == zwemkleding) {
					totaalgebruik = (int) param.totalDistance(swims.get(counter).afstand, totaalgebruik);
				}
			}
			
			return totaalgebruik;
		}
		
		// Totaalgebruik zwemkleding instellen in ArrayList
		
				void zwemkledingGebruikInstellen(ArrayList<Zwemmen> swims) {
					Analyse analyse = new Analyse();
					for (int counter = 0; counter < swims.size(); counter++) {
						swims.get(counter).gear.totalekms = analyse.zwemkledingGebruik(new totaleAfstand() {
						}, swims.get(counter).gear, swims);
					}
				}
	}


