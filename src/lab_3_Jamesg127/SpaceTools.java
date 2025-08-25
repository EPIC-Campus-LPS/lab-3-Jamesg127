package lab_3_Jamesg127;

	public class SpaceTools{
		public static double travelTime(Planet p, double speed) {
			double distSun = p.getDistanceFromSun();
			return distSun / speed;
		 
		}
		public static Planet compareDistance(Planet a, Planet b) {
			if (a.getDistanceFromSun() < b.getDistanceFromSun()) {
				return a;
			}
			else {
				return b;
			}
		}
		public static String abbreviation(Planet p) {
		 String name = p.getName();
		 return name.substring(0, 3).toUpperCase();
		}
		public static double orbitTime(Planet p) {
			double rad = p.getDistanceFromSun();
			double dia = rad * 2;
			double circ = dia * 3.14;
			return circ / 100000;
		}
		public static double orbitTime(Planet p, double speed) {
			double rad = p.getDistanceFromSun();
			double dia = rad * 2;
			double circ = dia * 3.14;
			return circ / speed;
		}
	}
