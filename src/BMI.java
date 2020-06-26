public interface BMI {
	default double BMIberekenen(double lengte, double gewicht) {
		double bmi = gewicht / Math.pow(lengte, 2);
		return bmi;
	};
}
