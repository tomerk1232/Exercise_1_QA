package exercise_1_QA.exercise_1_QA;

public class question4 {
	
	public static String Compare(double a , double b, String mod) {
		if(mod.equalsIgnoreCase("Regular")) {
			return (a >= b) ? "A" : "B";
		}
		
		else if(mod.equalsIgnoreCase("Opposite")) {
			return (-a >= -b) ? "A" : "B";
		}
		
		else if(mod.equalsIgnoreCase("Reciprocal")){
			return (1/a >= 1/b) ? "A" : "B";
		}
		return "Error";
	}
} 
