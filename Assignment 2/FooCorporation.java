
public class FooCorporation {
	
	public static void CalculateTotalPay(double base_pay, int hour_worked) {
		
		double normal_salary = 0;

		if(base_pay >= 8.00){ // if base salary is >= 8
			
			if(hour_worked <= 40) {
				
				// calculate normal salary
				normal_salary = base_pay * hour_worked;
				// print normal salary
				System.out.println("No overtime. The total pay is $ " + normal_salary);

			}else if(hour_worked > 40 && hour_worked <= 60) {
				
				// calculate normal salary
				normal_salary = base_pay * 40;
				// calculate how many hours of overtime worked
				int overtime_hours = hour_worked - 40;
				// calculate overtime
				double overtime_salary = base_pay * 1.5 * overtime_hours;
				// calculate total salary
				double total_salary = normal_salary + overtime_salary;
				// print total salary
				System.out.println("Total overtime worked for " + overtime_hours + " hour. The total pay is $ " + total_salary);
				
			}else { // if hour worked is > 60
				System.out.println("Number of hours worked can not exceed 60 hours. Please check again.");
			}
		}else { // if base salary is less then 8
			System.out.println("Base pay should not be less than $ 8.00. Please check again.");
		}
	}

	// main method
	public static void main(String[] arguments) {
		
		System.out.println("Employee 1: ");
		CalculateTotalPay(7.5, 35);
		System.out.println("Employee 2: ");
		CalculateTotalPay(8.2, 47);
		System.out.println("Employee 3: ");
		CalculateTotalPay(10.0, 73);
	}
}
