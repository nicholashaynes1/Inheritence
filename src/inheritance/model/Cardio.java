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

	@Override
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSpycy(ArrayList<String> ingredients)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHealthee(ArrayList<String> ingredients)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int calorieCounter(int calories)
	{
		
		return 0;
	}

	@Override
	public int delicousness(int criticRating)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
}
