interface totaleAfstand {
	default double totalDistance(double afstand, double subtotal) {
		double activiteitentotaal = subtotal;
		activiteitentotaal = activiteitentotaal + afstand;
		return activiteitentotaal;

	};
	
	default double snelheidActiviteit(double afstand, int tijdsduurMinutes) {
		double snelheid = afstand / tijdsduurMinutes;
		return snelheid;
	};

}
