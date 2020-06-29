import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uitdraai {
	// methodes alle typen Atleten
	// Fietsen
	String UitdraaiActiviteitenFiets(Persoon persoon) {
		Analyse analyse = new Analyse();
		analyse.snelheidInstellenFietsen(persoon.ritten);
		String uitdraai = "";
		for (Fietsen rit : persoon.ritten) {
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
	String UitdraaiActiviteitenHardlopen(Persoon persoon) {
		Analyse analyse = new Analyse();
		analyse.snelheidInstellenHardlopen(persoon.rondjes);
		String uitdraai = "";
		for (Hardlopen run : persoon.rondjes) {
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
	String UitdraaiActiviteitenWandelen(Persoon persoon) {
		Analyse analyse = new Analyse();
		analyse.snelheidInstellenWandelen(persoon.hikes);
		String uitdraai = "";
		for (Wandelen walk : persoon.hikes) {
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
	String UitdraaiActiviteitenZwemmen(Persoon persoon) {
		Analyse analyse = new Analyse();
		analyse.snelheidInstellenZwemmen(persoon.baantjes);
		String uitdraai = "";
		for (Zwemmen swim : persoon.baantjes) {
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
	String UitdraaiFietsen(Persoon persoon) {
		Analyse analyse = new Analyse();
		analyse.fietsGebruikInstellen(persoon.ritten);
		String uitdraai = "";
		for (Fiets bike : persoon.bikes) {
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
	String UitdraaiSchoenen(Persoon persoon) {
		Analyse analyse = new Analyse();
		analyse.hardloopschoenGebruikInstellen(persoon.rondjes);
		analyse.wandelschoenGebruikInstellen(persoon.hikes);
		String uitdraai = "";
		for (Schoenen schoen : persoon.shoes) {
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
	String UitdraaiZwemkleding(Persoon persoon) {
		Analyse analyse = new Analyse();
		analyse.zwemkledingGebruikInstellen(persoon.baantjes);
		String uitdraai = "";
		for (Zwemkleding blub : persoon.swimminggear) {
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

	// persoon
	void UitdraaiGegevensAtleetnaarTXTfile(Persoon persoon) throws IOException {
		Analyse analyse = new Analyse();
		Uitdraai uitdraai = new Uitdraai();
		FileWriter filewriter = new FileWriter("persoon - " + persoon.naam + ".txt", true);
		PrintWriter printWriter = new PrintWriter(filewriter);
		printWriter.println("Gegevens Atleet");
		printWriter.println("================");
		printWriter.println("naam: " + persoon.naam);
		printWriter.println("lengte: " + persoon.lengte);
		printWriter.println("gewicht: " + persoon.gewicht);
		printWriter.println(analyse.Gezond(new BMI() {
		}, persoon));
		printWriter.println(" ");
		printWriter.println("Fiets Activiteiten");
		printWriter.println("==================");
		printWriter.println(uitdraai.UitdraaiActiviteitenFiets(persoon));
		printWriter.println("==================");
		printWriter.println("Gemiddelde snelheid (km/u): " + analyse.averageSpeedFiets(persoon.ritten));
		printWriter.println("Top snelheid (km/u): " + analyse.topSpeedFiets(persoon.ritten));
		printWriter.println(" ");
		printWriter.println("Fietsen in gebruik: ");
		printWriter.println(uitdraai.UitdraaiFietsen(persoon));
		printWriter.println(" ");
		printWriter.println("Hardloop Activiteiten");
		printWriter.println("==================");
		printWriter.println(uitdraai.UitdraaiActiviteitenHardlopen(persoon));
		printWriter.println("==================");
		printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedHardlopen(persoon.rondjes));
		printWriter.println("Top snelheid (min / km): " + analyse.topSpeedHardlopen(persoon.rondjes));
		printWriter.println(" ");
		printWriter.println("Wandel Activiteiten");
		printWriter.println("==================");
		printWriter.println(uitdraai.UitdraaiActiviteitenWandelen(persoon));
		printWriter.println("==================");
		printWriter.println("Gemiddelde snelheid (km/u): " + analyse.averageSpeedWandelen(persoon.hikes));
		printWriter.println("Top snelheid (km/u): " + analyse.topSpeedWandelen(persoon.hikes));
		printWriter.println(" ");
		printWriter.println("Schoenen in gebruik: ");
		printWriter.println(uitdraai.UitdraaiSchoenen(persoon));
		printWriter.println(" ");
		printWriter.println("Zwem Activiteiten");
		printWriter.println("==================");
		printWriter.println(uitdraai.UitdraaiActiviteitenZwemmen(persoon));
		printWriter.println("==================");
		printWriter.println("Gemiddelde snelheid (min / km): " + analyse.averageSpeedZwemmen(persoon.baantjes));
		printWriter.println("Top snelheid (min / km): " + analyse.topSpeedZwemmen(persoon.baantjes));
		printWriter.println(" ");
		printWriter.println("Zwemkleding in gebruik: ");
		printWriter.println(uitdraai.UitdraaiZwemkleding(persoon));
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
