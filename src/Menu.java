import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	// ATLEET TOEVOEGEN
	void Atleetaanmaken(ArrayList<Persoon> atleten) throws InputMismatchException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Welk type Atleet wilt u toevoegen:");
			System.out.println(" 1 - Allrounder");
			System.out.println(" 2 - Triatleet");
			System.out.println(" 3 - Fietser");
			System.out.println(" 4 - Hardloper");
			System.out.println(" 5 - Zwemmer");
			System.out.println(" 6 - Wandelaar");
			System.out.println(" 7 - terug");

			int input = GetalInt();

			if (input == 7) {
				break;
			}

			// subsubmenu atleet specificeren
			if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6) {
				System.out.println("Vul hieronder de naam, leeftijd (jaar), gewicht (kg), en lengte (m)");
				System.out.println("als het gewicht en lengte niet bekend zijn, vul enkel naam en leeftijd in");
				System.out.print("naam: ");
				String naam = scan.next();

				// leeftijd in int + catch try InputMismatchException e
				System.out.print("leeftijd: ");
				int leeftijd = GetalInt();
				
				// gewicht in double + catch try InputMismatchException e
				System.out.print("gewicht: ");
				double gewicht = GetalDouble();
				
				// lengte in double + catch try InputMismatchException e
				System.out.print("lengte: ");
				double lengte = GetalDouble();
							
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
	}

	// GEAR TOEVOEGEN
	void GearToevoegen(ArrayList<Persoon> atleten) {
		while (true) {
			Scanner scan = new Scanner(System.in);

			// als er geen atleten opgenomen zijn, eerst atleten maken
			if (atleten.size() < 1) {
				System.out.println("Eerst atleten aanmaken");
				break;
			}

			// loop om atleten aanwezig in ArrayList te tonen
			System.out.println("Aan welke atleet wilt u gear toevoegen? (0 voor terug)");
			for (int i = 0; i < atleten.size(); i++) {
				System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
			}
			
			// int input voor break of atleet kiezen
			int command1 = GetalInt();
			if (command1 == 0) {
				break;
			}
			int atleetindex = command1 - 1;

			// subsubmenu type gear kiezen
			System.out.println("Welk type gear wilt u toevoegen:");
			System.out.println(" 1 - Schoenen");
			System.out.println(" 2 - Fiets");
			System.out.println(" 3 - Zwemkleding");
			System.out.println(" 4 - terug");

			int input = GetalInt();

			if (input == 4) {
				break;
			}

			// subsubsubmenu Schoenen toevoegen
			if (input == 1) {
				System.out.println("Vul hieronder de naam (bijv. Nike Air) en het type in (bijv. Wandelschoenen)");
				System.out.print("naam: ");
				String naam = scan.nextLine();
				System.out.print("type: ");
				String type = scan.nextLine();
				atleten.get(atleetindex).addSchoenen(naam, type);
			}

			// subsubsubmenu Fietsen toevoegen
			if (input == 2) {
				System.out.println(
						"Vul hieronder de naam (bijv. GazelleChampionMondial (geen spaties) en het type in (bijv. Racefiets)");
				System.out.println("naam: ");
				String naam = scan.next();
				System.out.println("type: ");			
				String type = scan.next();
				atleten.get(atleetindex).addFiets(naam, type);
			}

			// subsubsubmenu Zwemkleding toevoegen
			if (input == 3) {
				System.out.println("Vul hieronder de naam (bijv. Zwembroek of Haaienpak) in");
				System.out.print("naam: ");
				String naam = scan.nextLine();
				atleten.get(atleetindex).addZwemkleding(naam);
			}
		}
	}

	// ACTIVITEITEN TOEVOEGEN
	void ActiviteitToevoegen(ArrayList<Persoon> atleten) throws InputMismatchException {
		while (true) {
			Scanner scan = new Scanner(System.in);

			// als er geen atleten zijn aangemaakt, eerst aanmaken
			if (atleten.size() < 1) {
				System.out.println("Eerst atleten aanmaken");
				break;
			}

			// loop om atleten aanwezig in ArrayList te tonen
			System.out.println("Aan welke atleet wilt u een activiteit toevoegen? (0 voor terug)");
			for (int i = 0; i < atleten.size(); i++) {
				System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
			}
			
			// int input voor break of atleet kiezen
			int command1 = GetalInt();
			if (command1 == 0) {
				break;
			}
			int atleetindex = command1 - 1;

			// als geen van de atleten gear heeft, eerst aanmaken
			if (atleten.get(atleetindex).bikes.size() < 1 && atleten.get(atleetindex).shoes.size() < 1
					&& atleten.get(atleetindex).swimminggear.size() < 1) {
				System.out.println("Eerst gear toevoegen");
				break;
			}

			// subsubmenu type activiteit kiezen
			System.out.println("Welke activiteit wilt u toevoegen:");
			System.out.println(" 1 - Fietsen");
			System.out.println(" 2 - Hardlopen");
			System.out.println(" 3 - Wandelen");
			System.out.println(" 4 - Zwemmen");
			System.out.println(" 5 - terug");

			int input = GetalInt();

			if (input == 5) {
				break;
			}

			// subsubsubmenu Fietsrit toevoegen
			if (input == 1) {
				if (atleten.get(atleetindex).bikes.size() < 1) {
					System.out.println("eerst fiets toevoegen bij gear");
					break;
				}
				System.out.println(
						"Vul hieronder de naam, tijdsduur (in hele minuten), afstand (in kms), aanwezigheid tegenwind (j of n) en heuvels (j of n), en datum in integers (dag, maand en jaar) in");
				System.out.print("naam: ");
				String naam = scan.next();
				
				// tijdsduur in int + catch try InputMismatchException e
				System.out.print("tijdsduur: ");
				int tijdsduur = GetalInt();
								
				// afstand in double + catch try InputMismatchException e
				System.out.print("afstand: ");
				double afstand = GetalDouble();
				
				
				//boolean tegenwind invullen en converteren van string
				boolean wind;
				while (true) {
					System.out.print("tegenwind? (j/n): ");
					String tegenwind = scan.next();
					if (tegenwind.equals("j") || tegenwind.equals("J") || tegenwind.equals("ja")
							|| tegenwind.equals("Ja") || tegenwind.equals("JA") || tegenwind.equals("y")
							|| tegenwind.equals("Y")) {
						wind = true;
						break;
					} else if (tegenwind.equals("n") || tegenwind.equals("N") || tegenwind.equals("nee")
							|| tegenwind.equals("Nee") || tegenwind.equals("NEE")) {
						wind = false;
						break;
					} else {
						System.out.println("niet goed ingevuld - opnieuw");
					}
				}
				
				//boolean heuvels invullen en converteren van string
				boolean hills;
				while (true) {
					System.out.print("heuvels? (j/n): ");
					String heuvels = scan.next();
					if (heuvels.equals("j") || heuvels.equals("J") || heuvels.equals("ja") || heuvels.equals("Ja")
							|| heuvels.equals("JA") || heuvels.equals("y") || heuvels.equals("Y")) {
						hills = true;
						break;
					} else if (heuvels.equals("n") || heuvels.equals("N") || heuvels.equals("nee")
							|| heuvels.equals("Nee") || heuvels.equals("NEE")) {
						hills = false;
						break;
					} else {
						System.out.println("niet goed ingevuld - opnieuw");
					}
				}
				
				// dag in int + catch try InputMismatchException e
				System.out.print("dag: ");
				int dag = GetalInt();					
				
				// maand in int + catch try InputMismatchException e
				System.out.print("maand: ");
				int maand = GetalInt();				
								
				// jaar in maand + catch try InputMismatchException e
				System.out.print("jaar: ");
				int jaar = GetalInt();					
							
				System.out.println("Kies de fiets waarmee je de rit gereden hebt: ");
				for (int i = 0; i < atleten.get(atleetindex).bikes.size(); i++) {
					System.out.println((i + 1) + " " + atleten.get(atleetindex).bikes.get(i).naam + " - "
							+ atleten.get(atleetindex).bikes.get(i).type);
				}
				int gear = (scan.nextInt()) - 1;
								
				// toevoegen fietsrit met ingestelde variabelen
				atleten.get(atleetindex).addRit(atleten.get(atleetindex).bikes.get(gear), naam, tijdsduur, afstand,
						wind, hills, dag, maand, jaar);
				break;
			}

			// subsubsubmenu Hardlopen of Wandelen toevoegen
			if (input == 2 || input == 3) {
				if (atleten.get(atleetindex).shoes.size() < 1) {
					System.out.println("eerst schoenen toevoegen bij gear");
					break;
				}
				System.out.println(
						"Vul hieronder de naam, tijdsduur (in hele minuten), afstand (in kms), en datum in integers (dag, maand en jaar) in");
				System.out.print("naam: ");
				String naam = scan.next();
				System.out.print("tijdsduur: ");
				int tijdsduur = GetalInt();
				System.out.print("afstand: ");
				double afstand = GetalDouble();
				System.out.print("dag: ");
				int dag = GetalInt();
				System.out.print("maand: ");
				int maand = GetalInt();
				System.out.print("jaar: ");
				int jaar = GetalInt();
				System.out.println("Kies de schoenen waarmee je de activiteit gedaan hebt: ");
				for (int i = 0; i < atleten.get(atleetindex).shoes.size(); i++) {
					System.out.println((i + 1) + " " + atleten.get(atleetindex).shoes.get(i).naam + " - "
							+ atleten.get(atleetindex).shoes.get(i).type);
				}
				int gear = (scan.nextInt()) - 1;

				// toevoegen hardlopen run met ingestelde variabelen
				if (input == 2) {
					atleten.get(atleetindex).addRun(atleten.get(atleetindex).shoes.get(gear), naam, tijdsduur, afstand,
							dag, maand, jaar);
				}
				if (input == 3) {
					atleten.get(atleetindex).addWandeling(atleten.get(atleetindex).shoes.get(gear), naam, tijdsduur,
							afstand, dag, maand, jaar);
				}
				break;
			}

			// subsubsubmenu Zwemmen toevoegen
			if (input == 4) {
				
				if (atleten.get(atleetindex).swimminggear.size() < 1) {
					System.out.println("eerst zwemkleding toevoegen bij gear");
					break;
				}
				
				System.out.println(
						"Vul hieronder de naam, tijdsduur (in hele minuten), afstand (in kms), in buitenbad of open water gezwommen (j/n), en datum in integers (dag, maand en jaar) in");
				System.out.print("naam: ");
				String naam = scan.next();
				System.out.print("tijdsduur: ");
				int tijdsduur = GetalInt();
				System.out.print("afstand: ");
				double afstand = GetalDouble();
				
				
				//boolean heuvels invullen en converteren van string
				boolean outside;
				while (true) {
					System.out.print("buiten? (j/n): ");
					String buiten = scan.next();
					if (buiten.equals("j") || buiten.equals("J") || buiten.equals("ja") || buiten.equals("Ja")
							|| buiten.equals("JA") || buiten.equals("y") || buiten.equals("Y")) {
						outside = true;
						break;
					} else if (buiten.equals("n") || buiten.equals("N") || buiten.equals("nee") || buiten.equals("Nee")
							|| buiten.equals("NEE")) {
						outside = false;
						break;
					} else {
						System.out.println("niet goed ingevuld - opnieuw");						
					}
				}
								
				String buiten = scan.next();
				System.out.print("dag: ");
				int dag = GetalInt();
				System.out.print("maand: ");
				int maand = GetalInt();
				System.out.print("jaar: ");
				int jaar = GetalInt();
				
				System.out.println("Kies de zwemkleding waarmee je de rit gereden hebt: ");
				for (int i = 0; i < atleten.get(atleetindex).swimminggear.size(); i++) {
					System.out.println((i + 1) + " " + atleten.get(atleetindex).swimminggear.get(i).naam);
				}
				int gear = (GetalInt()) - 1;
				
				// toevoegen zwemmen met ingestelde variabelen
				atleten.get(atleetindex).addSwim(atleten.get(atleetindex).swimminggear.get(gear), naam, tijdsduur,
						afstand, dag, maand, jaar, outside);
				break;
			}
		}
	}

	// ANALYSE PRESTATIES ATLEET
	void AnalyseAtleet(ArrayList<Persoon> atleten) {
		while (true) {
			Scanner scan = new Scanner(System.in);

			// als er geen atleten zijn aangemaakt, eerst aanmaken
			if (atleten.size() < 1) {
				System.out.println("Er is geen data van atleten om te analyseren - eerst atleten aanmaken");
				break;
			}

			// loop om atleten aanwezig in ArrayList te tonen
			System.out.println("Van welke atleet wilt u de gegevens analyseren (0 voor terug) ? ");
			for (int i = 0; i < atleten.size(); i++) {
				System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
			}
			
			// int input voor break of atleet kiezen
			int command1 = GetalInt();
			if (command1 == 0) {
				break;
			}
			int atleetindex = command1 - 1;

			// subsubmenu type analyse kiezen
			System.out.println("Welke analyse wilt u uitvoeren?");
			System.out.println(" 1 - Gezondheid Atleet");
			System.out.println(" 2 - Gemiddelde en topsnelheden alle activiteiten");
			System.out.println(" 3 - Uitdraai activiteiten");
			System.out.println(" 4 - Uitdraai gear en gebruik");
			System.out.println(" 5 - terug");

			int input = GetalInt();
			if (input == 5) {
				break;
			}

			// genereerd de basis gegevens atleet, gezondheidsdetails, totale afstanden
			// activiteiten afgelegd
			if (input == 1) {
				Analyse analyse = new Analyse();
				System.out.println(atleten.get(atleetindex).naam + " - " + atleten.get(atleetindex).klasse);
				System.out.println(analyse.Gezond(new BMI() {
				}, atleten.get(atleetindex)));
				System.out.println("******************************************************************************");
				System.out.println("Totaal gefietst : " + analyse.totaalGefietst(new totaleAfstand() {
				}, atleten.get(atleetindex).ritten));
				System.out.println("Totaal hardgelopen : " + analyse.totaalHardgelopen(new totaleAfstand() {
				}, atleten.get(atleetindex).rondjes));
				System.out.println("Totaal gewandeld : " + analyse.totaalWandelen(new totaleAfstand() {
				}, atleten.get(atleetindex).hikes));
				System.out.println("Totaal gewandeld : " + analyse.totaalZwemmen(new totaleAfstand() {
				}, atleten.get(atleetindex).baantjes));
				System.out.println("******************************************************************************");
			}

			// genereerd de gegevens atleet, gemiddelde en topsnelheden van alle
			// activiteiten per categorie (fietsen, hardlopen, zwemmen, wandelen)
			if (input == 2) {
				Analyse analyse = new Analyse();

				System.out.println(atleten.get(atleetindex).naam + " - " + atleten.get(atleetindex).klasse);
				System.out.println("******************************************************************************");
				System.out.println(" ");
				// gemiddelde snelheid atleet per activiteiten-reeks
				System.out.println("Prestaties fietsen");
				analyse.snelheidInstellenFietsen(atleten.get(atleetindex).ritten);
				System.out.println("Aantal activiteiten: " + analyse.aantalRitten(atleten.get(atleetindex).ritten)
						+ " - gemiddelde snelheid (km/u): " + analyse.averageSpeedFiets(atleten.get(atleetindex).ritten)
						+ " - topsnelheid: " + analyse.topSpeedFiets(atleten.get(atleetindex).ritten));
				System.out.println(" ");
				System.out.println("Prestaties hardlopen");
				analyse.snelheidInstellenHardlopen(atleten.get(atleetindex).rondjes);
				System.out.println("******************************************************************************");
				System.out.println("Aantal activiteiten: " + analyse.aantalRuns(atleten.get(atleetindex).rondjes)
						+ " - gemiddelde snelheid (min/km): "
						+ analyse.averageSpeedHardlopen(atleten.get(atleetindex).rondjes) + " - topsnelheid: "
						+ analyse.topSpeedHardlopen(atleten.get(atleetindex).rondjes));
				System.out.println(" ");
				System.out.println("Prestaties zwemmen");
				analyse.snelheidInstellenZwemmen(atleten.get(atleetindex).baantjes);
				System.out.println("******************************************************************************");
				System.out.println("Aantal activiteiten: " + analyse.aantalSwims(atleten.get(atleetindex).baantjes)
						+ " - gemiddelde snelheid (min/km): "
						+ analyse.averageSpeedZwemmen(atleten.get(atleetindex).baantjes) + " - topsnelheid: "
						+ analyse.topSpeedZwemmen(atleten.get(atleetindex).baantjes));
				System.out.println(" ");
				System.out.println("Prestaties wandelen");
				analyse.snelheidInstellenWandelen(atleten.get(atleetindex).hikes);
				System.out.println("******************************************************************************");
				System.out.println("Aantal activiteiten: " + analyse.aantalHikes(atleten.get(atleetindex).hikes)
						+ " - gemiddelde snelheid (km/u): "
						+ analyse.averageSpeedWandelen(atleten.get(atleetindex).hikes) + " - topsnelheid: "
						+ analyse.topSpeedWandelen(atleten.get(atleetindex).hikes));
				System.out.println(" ");
			}

			// uitdraai van alle activiteiten per gekozen atleet (fietsen, hardlopen,
			// zwemmen, wandelingen)
			if (input == 3) {
				Uitdraai uitdraai = new Uitdraai();
				System.out.println(atleten.get(atleetindex).naam + " - " + atleten.get(atleetindex).klasse);
				System.out.println("******************************************************************************");
				System.out.println(" ");
				System.out.println("Fiets ritten:");
				System.out.println(uitdraai.UitdraaiActiviteitenFiets(atleten.get(atleetindex)));
				System.out.println("******************************************************************************");
				System.out.println(" ");
				System.out.println("Rondjes hardgelopen:");
				System.out.println(uitdraai.UitdraaiActiviteitenHardlopen(atleten.get(atleetindex)));
				System.out.println("******************************************************************************");
				System.out.println(" ");
				System.out.println("Baantjes gezwommen:");
				System.out.println(uitdraai.UitdraaiActiviteitenZwemmen(atleten.get(atleetindex)));
				System.out.println("******************************************************************************");
				System.out.println(" ");
				System.out.println("Wandelingen gewandeld:");
				System.out.println(uitdraai.UitdraaiActiviteitenWandelen(atleten.get(atleetindex)));
			}

			// uitdraai van alle gear + totaalgebruik van de gekozen atleet
			if (input == 4) {
				Uitdraai uitdraai = new Uitdraai();
				System.out.println(atleten.get(atleetindex).naam + " - " + atleten.get(atleetindex).klasse);
				System.out.println("******************************************************************************");
				System.out.println(" ");
				System.out.println("Fietsen:");
				System.out.println(uitdraai.UitdraaiFietsen(atleten.get(atleetindex)));
				System.out.println("******************************************************************************");
				System.out.println(" ");
				System.out.println("SChoenen:");
				System.out.println(uitdraai.UitdraaiSchoenen(atleten.get(atleetindex)));
				System.out.println("******************************************************************************");
				System.out.println(" ");
				System.out.println("Zwemkleding:");
				System.out.println(uitdraai.UitdraaiZwemkleding(atleten.get(atleetindex)));
				System.out.println("******************************************************************************");
				System.out.println(" ");
			}
		}
	}

	// UITDRAAI van atleetgegevens, activiteiten en gear naar TXT file met naam van
	// atleet
	void UitdraaiAtleetData(ArrayList<Persoon> atleten) throws IOException {
		while (true) {
			Scanner scan = new Scanner(System.in);

			// als er geen atleten zijn aangemaakt, eerst aanmaken
			if (atleten.size() < 1) {
				System.out.println("Er is geen data van atleten om te uitdraaien - eerst atleten aanmaken");
				break;
			}

			// loop om atleten aanwezig in ArrayList te tonen
			System.out.println("Van welke atleet wilt u de gegevens uitdraaien (0 voor terug) ? ");
			for (int i = 0; i < atleten.size(); i++) {
				System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
			}
			
			// int input voor break of atleet kiezen
			int command1 = GetalInt();
			if (command1 == 0) {
				break;
			}
			int atleetindex = command1 - 1;

			Uitdraai uitdraai = new Uitdraai();
			uitdraai.UitdraaiGegevensAtleetnaarTXTfile(atleten.get(atleetindex));
		}
	}
	
	
	int GetalInt () throws InputMismatchException {
	// Getal in int + catch try InputMismatchException e
	boolean badInput=true;
	Scanner scan = new Scanner(System.in);
	int getal = 0;				
	do {
		try {
			getal = scan.nextInt();
			if (getal > 0) {
				badInput = false;
			} else
				badInput = true;
		} catch (InputMismatchException e) {
			System.out.println("Graag een heel getal invullen.");
		}
		scan.nextLine();
	} while (badInput);
	return getal;
	}
	
	double GetalDouble() throws InputMismatchException {
		// Getal in double + catch try InputMismatchException e
		boolean badInput = true;
		Scanner scan = new Scanner(System.in);
		double getal = 0.0;
		do {
			try {
				getal = scan.nextDouble();
				if (getal > 0) {
					badInput = false;
				} else
					badInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Graag een double getal invullen, met een komma (bijv. 75,4).");
			}
			scan.nextLine();
		} while (badInput);
		return getal;
	}
}
