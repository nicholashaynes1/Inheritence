package inheritance.model;

import java.util.ArrayList;

public class Cardio extends Exercise
{
	
	public Cardio()
	{
		this.setReps(0);
		this.setSets(0);
		this.setWorkouts(getCardioWorkouts());
	}

	private ArrayList<String> getCardioWorkouts()
	{
		ArrayList<String> workouts = new ArrayList<String>();
		
		workouts.add("running");
		workouts.add("high knees");
		workouts.add("HITT cardio");
		workouts.add("zumba");
		
		return workouts;
	}
	
}
