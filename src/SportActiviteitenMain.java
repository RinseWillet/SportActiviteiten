import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class SportActiviteitenMain implements BMI, totaleAfstand {

	public static void main(String[] args) throws IOException {
		ArrayList<Persoon> atleten = new ArrayList<Persoon>();
		Scanner scan = new Scanner(System.in);

//MAIN MENU
		while (true) {
			System.out.println("Maak een keuze:");
			System.out.println(" 1 - Atleet toevoegen");
			System.out.println(" 2 - Gear toevoegen");
			System.out.println(" 3 - Activiteit toevoegen");
			System.out.println(" 4 - Analyse Atleet");
			System.out.println(" 5 - Uitdraai gegevens atleet naar TXT bestand");
			System.out.println(" x - stop");

			String command = scan.nextLine();

			if (command.equals("x")) {
				break;
			}

// ATLEET TOEVOEGEN
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

					// subsubmenu atleet specificeren
					if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6) {
						System.out.println("Vul hieronder de naam, leeftijd (jaar), gewicht (kg), en lengte (m)");
						System.out.println("als het gewicht en lengte niet bekend zijn, vul enkel naam en leeftijd in");
						System.out.print("naam: ");
						String naam = scan.next();
						System.out.print("leeftijd: ");
						int leeftijd = scan.nextInt();
						System.out.print("gewicht: ");
						double gewicht = scan.nextDouble();
						System.out.print("lengte: ");
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
			}

//GEAR AAN ATLEET TOEVOEGEN
			if (command.contentEquals("2")) {
				while (true) {

					// als er geen atleten opgenomen zijn, eerst atleten maken
					if (atleten.size() < 1) {
						System.out.println("Eerst atleten aanmaken");
						break;
					}

					// loop om atleten aanwezig in ArrayList te tonen
					System.out.println("Aan welke atleet wilt u gear toevoegen? (x voor terug)");
					for (int i = 0; i < atleten.size(); i++) {
						System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
					}
					String command1 = scan.next();

					if (command1.equals("x")) {
						break;
					}

					int atleetindex = (Integer.parseInt(command1)) - 1;

					// subsubmenu type gear kiezen
					System.out.println("Welk type gear wilt u toevoegen:");
					System.out.println(" 1 - Schoenen");
					System.out.println(" 2 - Fiets");
					System.out.println(" 3 - Zwemkleding");
					System.out.println(" 4 - terug");

					int input = scan.nextInt();

					if (input == 4) {
						break;
					}

					// subsubsubmenu Schoenen toevoegen
					if (input == 1) {
						System.out.println(
								"Vul hieronder de naam (bijv. Nike Air) en het type in (bijv. Wandelschoenen)");
						System.out.print("naam: ");
						String naam = scan.next();
						System.out.print("type: ");
						String type = scan.next();
						atleten.get(atleetindex).addSchoenen(naam, type);
					}

					// subsubsubmenu Fietsen toevoegen
					if (input == 2) {
						System.out.println(
								"Vul hieronder de naam (bijv. Gazelle Champion Mondial) en het type in (bijv. Racefiets)");
						System.out.print("naam: ");
						String naam = scan.next();
						System.out.print("type: ");
						String type = scan.next();
						atleten.get(atleetindex).addFiets(naam, type);
					}

					// subsubsubmenu Zwemkleding toevoegen
					if (input == 3) {
						System.out.println("Vul hieronder de naam (bijv. Zwembroek of Haaienpak) in");
						System.out.print("naam: ");
						String naam = scan.next();
						atleten.get(atleetindex).addZwemkleding(naam);
					}
				}
			}

//ACTIVITEITEN TOEVOEGEN
			if (command.contentEquals("3")) {
				while (true) {

					// als er geen atleten zijn aangemaakt, eerst aanmaken
					if (atleten.size() < 1) {
						System.out.println("Eerst atleten aanmaken");
						break;
					}

					// loop om atleten aanwezig in ArrayList te tonen
					System.out.println("Aan welke atleet wilt u een activiteit toevoegen? (x voor terug)");
					for (int i = 0; i < atleten.size(); i++) {
						System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
					}
					String command1 = scan.next();

					if (command1.equals("x")) {
						break;
					}

					int atleetindex = (Integer.parseInt(command1)) - 1;

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

					int input = scan.nextInt();

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
						System.out.print("tijdsduur: ");
						int tijdsduur = scan.nextInt();
						System.out.print("afstand: ");
						double afstand = scan.nextDouble();
						System.out.print("tegenwind? (j/n): ");
						String tegenwind = scan.next();
						System.out.print("heuvels? (j/n): ");
						String heuvels = scan.next();
						System.out.print("dag: ");
						int dag = scan.nextInt();
						System.out.print("maand: ");
						int maand = scan.nextInt();
						System.out.print("jaar: ");
						int jaar = scan.nextInt();
						System.out.println("Kies de fiets waarmee je de rit gereden hebt: ");
						for (int i = 0; i < atleten.get(atleetindex).bikes.size(); i++) {
							System.out.println((i + 1) + " " + atleten.get(atleetindex).bikes.get(i).naam + " - "
									+ atleten.get(atleetindex).bikes.get(i).type);
						}
						int gear = (scan.nextInt()) - 1;
						boolean wind;

						// omzetten naar boolean
						if (tegenwind.equals("j") || tegenwind.equals("J") || tegenwind.equals("ja")
								|| tegenwind.equals("Ja") || tegenwind.equals("JA") || tegenwind.equals("y")
								|| tegenwind.equals("Y")) {
							wind = true;
						} else if (tegenwind.equals("n") || tegenwind.equals("N") || tegenwind.equals("nee")
								|| tegenwind.equals("Nee") || tegenwind.equals("NEE")) {
							wind = false;
						} else {
							System.out.println("niet goed ingevuld - opnieuw");
							break;
						}

						boolean hills;

						if (heuvels.equals("j") || heuvels.equals("J") || heuvels.equals("ja") || heuvels.equals("Ja")
								|| heuvels.equals("JA") || heuvels.equals("y") || heuvels.equals("Y")) {
							hills = true;
						} else if (heuvels.equals("n") || heuvels.equals("N") || heuvels.equals("nee")
								|| heuvels.equals("Nee") || heuvels.equals("NEE")) {
							hills = false;
						} else {
							System.out.println("niet goed ingevuld - opnieuw");
							break;
						}

						// toevoegen fietsrit met ingestelde variabelen
						atleten.get(atleetindex).addRit(atleten.get(atleetindex).bikes.get(gear), naam, tijdsduur,
								afstand, wind, hills, dag, maand, jaar);
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
						int tijdsduur = scan.nextInt();
						System.out.print("afstand: ");
						double afstand = scan.nextDouble();
						System.out.print("dag: ");
						int dag = scan.nextInt();
						System.out.print("maand: ");
						int maand = scan.nextInt();
						System.out.print("jaar: ");
						int jaar = scan.nextInt();
						System.out.println("Kies de schoenen waarmee je de activiteit gedaan hebt: ");
						for (int i = 0; i < atleten.get(atleetindex).shoes.size(); i++) {
							System.out.println((i + 1) + " " + atleten.get(atleetindex).shoes.get(i).naam + " - "
									+ atleten.get(atleetindex).shoes.get(i).type);
						}
						int gear = (scan.nextInt()) - 1;

						// toevoegen hardlopen run met ingestelde variabelen
						if (input == 2) {
							atleten.get(atleetindex).addRun(atleten.get(atleetindex).shoes.get(gear), naam, tijdsduur,
									afstand, dag, maand, jaar);
						}
						if (input == 3) {
							atleten.get(atleetindex).addWandeling(atleten.get(atleetindex).shoes.get(gear), naam,
									tijdsduur, afstand, dag, maand, jaar);
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
						int tijdsduur = scan.nextInt();
						System.out.print("afstand: ");
						double afstand = scan.nextDouble();
						System.out.print("buiten? (j/n): ");
						String buiten = scan.next();
						System.out.print("dag: ");
						int dag = scan.nextInt();
						System.out.print("maand: ");
						int maand = scan.nextInt();
						System.out.print("jaar: ");
						int jaar = scan.nextInt();
						System.out.println("Kies de zwemkleding waarmee je de rit gereden hebt: ");
						for (int i = 0; i < atleten.get(atleetindex).swimminggear.size(); i++) {
							System.out.println((i + 1) + " " + atleten.get(atleetindex).swimminggear.get(i).naam);
						}
						int gear = (scan.nextInt()) - 1;
						boolean outside;

						// omzetten naar boolean
						if (buiten.equals("j") || buiten.equals("J") || buiten.equals("ja") || buiten.equals("Ja")
								|| buiten.equals("JA") || buiten.equals("y") || buiten.equals("Y")) {
							outside = true;
						} else if (buiten.equals("n") || buiten.equals("N") || buiten.equals("nee")
								|| buiten.equals("Nee") || buiten.equals("NEE")) {
							outside = false;
						} else {
							System.out.println("niet goed ingevuld - opnieuw");
							break;
						}

						// toevoegen zwemmen met ingestelde variabelen
						atleten.get(atleetindex).addSwim(atleten.get(atleetindex).swimminggear.get(gear), naam,
								tijdsduur, afstand, dag, maand, jaar, outside);
						break;
					}
				}
			}

//ANALYSE PRESTATIES ATLEET
			if (command.contentEquals("4")) {
				while (true) {
					// als er geen atleten zijn aangemaakt, eerst aanmaken
					if (atleten.size() < 1) {
						System.out.println("Er is geen data van atleten om te analyseren - eerst atleten aanmaken");
						break;
					}

					// loop om atleten aanwezig in ArrayList te tonen
					System.out.println("Van welke atleet wilt u de gegevens analyseren (x voor terug) ? ");
					for (int i = 0; i < atleten.size(); i++) {
						System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
					}
					String command1 = scan.next();

					if (command1.equals("x")) {
						break;
					}
					int atleetindex = (Integer.parseInt(command1)) - 1;

					// subsubmenu type analyse kiezen
					System.out.println("Welke analyse wilt u uitvoeren?");
					System.out.println(" 1 - Gezondheid Atleet");
					System.out.println(" 2 - Gemiddelde en topsnelheden alle activiteiten");
					System.out.println(" 3 - Uitdraai activiteiten");
					System.out.println(" 4 - Uitdraai gear en gebruik");
					System.out.println(" 5 - terug");

					int input = scan.nextInt();

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
						System.out.println(
								"******************************************************************************");
						System.out.println("Totaal gefietst : " + analyse.totaalGefietst(new totaleAfstand() {
						}, atleten.get(atleetindex).ritten));
						System.out.println("Totaal hardgelopen : " + analyse.totaalHardgelopen(new totaleAfstand() {
						}, atleten.get(atleetindex).rondjes));
						System.out.println("Totaal gewandeld : " + analyse.totaalWandelen(new totaleAfstand() {
						}, atleten.get(atleetindex).hikes));
						System.out.println("Totaal gewandeld : " + analyse.totaalZwemmen(new totaleAfstand() {
						}, atleten.get(atleetindex).baantjes));
						System.out.println(
								"******************************************************************************");
					}

					// genereerd de gegevens atleet, gemiddelde en topsnelheden van alle
					// activiteiten per categorie (fietsen, hardlopen, zwemmen, wandelen)
					if (input == 2) {
						Analyse analyse = new Analyse();

						System.out.println(atleten.get(atleetindex).naam + " - " + atleten.get(atleetindex).klasse);
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						// gemiddelde snelheid atleet per activiteiten-reeks
						System.out.println("Prestaties fietsen");
						analyse.snelheidInstellenFietsen(atleten.get(atleetindex).ritten);
						System.out
								.println("Aantal activiteiten: " + analyse.aantalRitten(atleten.get(atleetindex).ritten)
										+ " - gemiddelde snelheid (km/u): "
										+ analyse.averageSpeedFiets(atleten.get(atleetindex).ritten)
										+ " - topsnelheid: " + analyse.topSpeedFiets(atleten.get(atleetindex).ritten));
						System.out.println(" ");
						System.out.println("Prestaties hardlopen");
						analyse.snelheidInstellenHardlopen(atleten.get(atleetindex).rondjes);
						System.out.println(
								"******************************************************************************");
						System.out.println("Aantal activiteiten: "
								+ analyse.aantalRuns(atleten.get(atleetindex).rondjes)
								+ " - gemiddelde snelheid (min/km): "
								+ analyse.averageSpeedHardlopen(atleten.get(atleetindex).rondjes) + " - topsnelheid: "
								+ analyse.topSpeedHardlopen(atleten.get(atleetindex).rondjes));
						System.out.println(" ");
						System.out.println("Prestaties zwemmen");
						analyse.snelheidInstellenZwemmen(atleten.get(atleetindex).baantjes);
						System.out.println(
								"******************************************************************************");
						System.out.println("Aantal activiteiten: "
								+ analyse.aantalSwims(atleten.get(atleetindex).baantjes)
								+ " - gemiddelde snelheid (min/km): "
								+ analyse.averageSpeedZwemmen(atleten.get(atleetindex).baantjes) + " - topsnelheid: "
								+ analyse.topSpeedZwemmen(atleten.get(atleetindex).baantjes));
						System.out.println(" ");
						System.out.println("Prestaties wandelen");
						analyse.snelheidInstellenWandelen(atleten.get(atleetindex).hikes);
						System.out.println(
								"******************************************************************************");
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
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						System.out.println("Fiets ritten:");
						System.out.println(uitdraai.UitdraaiActiviteitenFiets(atleten.get(atleetindex)));
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						System.out.println("Rondjes hardgelopen:");
						System.out.println(uitdraai.UitdraaiActiviteitenHardlopen(atleten.get(atleetindex)));
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						System.out.println("Baantjes gezwommen:");
						System.out.println(uitdraai.UitdraaiActiviteitenZwemmen(atleten.get(atleetindex)));
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						System.out.println("Wandelingen gewandeld:");
						System.out.println(uitdraai.UitdraaiActiviteitenWandelen(atleten.get(atleetindex)));
					}

					// uitdraai van alle gear + totaalgebruik van de gekozen atleet
					if (input == 4) {
						Uitdraai uitdraai = new Uitdraai();
						System.out.println(atleten.get(atleetindex).naam + " - " + atleten.get(atleetindex).klasse);
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						System.out.println("Fietsen:");
						System.out.println(uitdraai.UitdraaiFietsen(atleten.get(atleetindex)));
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						System.out.println("SChoenen:");
						System.out.println(uitdraai.UitdraaiSchoenen(atleten.get(atleetindex)));
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
						System.out.println("Zwemkleding:");
						System.out.println(uitdraai.UitdraaiZwemkleding(atleten.get(atleetindex)));
						System.out.println(
								"******************************************************************************");
						System.out.println(" ");
					}
				}
			}

//UITDRAAI van atleetgegevens, activiteiten en gear naar TXT file met naam van atleet
			if (command.contentEquals("5")) {
				while (true) {

					// als er geen atleten zijn aangemaakt, eerst aanmaken
					if (atleten.size() < 1) {
						System.out.println("Er is geen data van atleten om te uitdraaien - eerst atleten aanmaken");
						break;
					}

					// loop om atleten aanwezig in ArrayList te tonen
					System.out.println("Van welke atleet wilt u de gegevens uitdraaien (x voor terug) ? ");
					for (int i = 0; i < atleten.size(); i++) {
						System.out.println((i + 1) + " " + atleten.get(i).naam + " - " + atleten.get(i).klasse);
					}
					String command1 = scan.next();

					if (command1.equals("x")) {
						break;
					}
					int atleetindex = (Integer.parseInt(command1)) - 1;

					Uitdraai uitdraai = new Uitdraai();
					uitdraai.UitdraaiGegevensAtleetnaarTXTfile(atleten.get(atleetindex));

				}

			}

		}
	}
}

/*
 * 
 * 
 * 
 * Allrounder rinse = new Allrounder("Rinse", 38, 86.0, 1.89);
 * 
 * // gear aan atleet toewijzen rinse.addFiets("Eddy", "Race");
 * rinse.addFiets("Kermit", "CycloCross"); rinse.addFiets("Red Arrow",
 * "Ligfiets"); rinse.addZwemkleding("Zwembroek"); rinse.addSchoenen("Nike",
 * "Hardloopschoen"); rinse.addSchoenen("Kisten", "Wandelschoen");
 * 
 * // activiteiten toewijzen rinse.addRit(rinse.bikes.get(0), "Westland", 120,
 * 59, true, false, 22, 6, 2020); rinse.addRit(rinse.bikes.get(0), "Veluwe", 76,
 * 25, true, false, 1, 2, 2020); rinse.addRit(rinse.bikes.get(1), "Katwijk",
 * 220, 110, true, true, 5, 4, 2020); rinse.addRit(rinse.bikes.get(2),
 * "Meijendel", 60, 27, false, true, 12, 2, 2020);
 * 
 * rinse.addRun(rinse.shoes.get(0), "Rondje Park", 30, 3, 13, 5, 2020);
 * rinse.addRun(rinse.shoes.get(0), "Strand", 45, 4, 2, 5, 2020);
 * 
 * rinse.addWandeling(rinse.shoes.get(1), "Park", 120, 10, 1, 6, 2020);
 * rinse.addWandeling(rinse.shoes.get(1), "Stad", 90, 6, 10, 6, 2020);
 * 
 * System.out.println(rinse.bikes.get(0).naam);
 * System.out.println(rinse.bikes.get(0).type); rinse.addFiets("Eddy", "Race");
 * System.out.println(rinse.bikes.get(0).naam);
 * System.out.println(rinse.bikes.get(0).type);
 * System.out.println(rinse.bikes.get(1).naam);
 * System.out.println(rinse.bikes.get(1).type);
 * 
 * // bmi atleet
 * 
 * Analyse analyse = new Analyse(); System.out.println(analyse.Gezond(new BMI()
 * { }, rinse.lengte, rinse.gewicht));
 * 
 * // totale fietskm atleet
 * 
 * System.out.println(analyse.totaalGefietst(new totaleAfstand() { },
 * rinse.ritten));
 * 
 * // totale km fiets Eddy (0) System.out.println(analyse.fietsGebruik(new
 * totaleAfstand() { }, rinse.bikes.get(0), rinse.ritten));
 * 
 * // totale aantal activiteiten
 * 
 * System.out.println(analyse.aantalRitten(rinse.ritten));
 * 
 * // uitdraai alle fietsritten Uitdraai uitdraai = new Uitdraai();
 * System.out.println(uitdraai.UitdraaiActiviteitenFiets(rinse));
 * 
 * // aantal fietsen System.out.println(analyse.aantalFietsen(rinse.bikes));
 * 
 * // uitdraai alle fietsen System.out.println(uitdraai.UitdraaiFietsen(rinse));
 * 
 * System.out.println();
 * 
 * // hoogste snelheid atleet per activiteiten-reeks
 * System.out.println(analyse.topSpeedFiets(rinse.ritten));
 * 
 * // gemiddelde snelheid atleet per activiteiten-reeks
 * System.out.println(analyse.averageSpeedFiets(rinse.ritten));
 * 
 * // wegschrijven prestaties atleet naar txt bestand "atleet" (per type
 * activiteit // - naam + datum + afstand + tijdsduur + snelheid & per type
 * activiteit // gemiddelde en topsnelheid)
 * 
 * 
 * uitdraai.UitdraaiGegevensAtleetnaarTXTfile(rinse);
 * //rinse.UitdraaiGegevensAtleetnaarTXTfile(rinse);
 * 
 * 
 * 
 * /* Dit keer stel ik geheel geen functionele eisen vast. Ik zal alleen
 * verzoeken om .... technische eisen.
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
