import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uitdraai {
	// methodes alle typen Atleten
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
		printWriter.println(analyse.Gezond(new BMI() {
		}, Allrounder));
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
		printWriter.println(analyse.Gezond(new BMI() {
		}, zwemmer));
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
		printWriter.println(analyse.Gezond(new BMI() {
		}, wandelaar));
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
		printWriter.println(analyse.Gezond(new BMI() {
		}, triatleet));
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
		printWriter.println(analyse.Gezond(new BMI() {
		}, fietser));
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
