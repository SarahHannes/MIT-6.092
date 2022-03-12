public class Marathon {
	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		
		int first_runner = BestRunnerIndex(times);
		System.out.println("Best runner is " + names[first_runner] + ": " + times[first_runner] + " mins.");
		
		int second_runner = SecondRunnerIndex(first_runner, times);
		System.out.println("Second best runner is " + names[second_runner] + ": " + times[second_runner] + " mins.");
		
	}
	
	public static int BestRunnerIndex(int[] times) {
		
		int lowest = 1000;
		int index = -1;
		for (int i = 0; i < times.length; i++) {
			if(times[i]<lowest) {
				lowest = times[i];
				index = i;
			}
		}
		
		return index;
	}
	

	public static int SecondRunnerIndex(int first_runner_index, int[] times) {
		
		int first_runner_time = times[first_runner_index];
		int second_runner_time = 1000;
		int second_runner_index = -1;
		
		for (int i = 0; i < times.length; i++) {
			if(times[i] > first_runner_time && times[i] <= second_runner_time) {
				second_runner_time = times[i];
				second_runner_index = i;
			}
		}

		return second_runner_index;
		
	}
	
}
