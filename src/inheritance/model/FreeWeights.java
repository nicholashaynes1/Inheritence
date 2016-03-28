 package inheritance.model;

import java.util.ArrayList;

public class FreeWeights extends Exercise
{
	public FreeWeights()
	{
		this.setSets(3);
		this.setReps(18);
		
		this.setWorkouts(getFreeWeightWorkouts());
		
		
	}
	private ArrayList<String> getFreeWeightWorkouts()
	{
		ArrayList<String> workouts = new ArrayList<String>();
		
		workouts.add("Bench Press");
		workouts.add("hammer curls");
		workouts.add("Squats");
		workouts.add("Tire Rolls");
		
		return workouts;
	}
	

}
