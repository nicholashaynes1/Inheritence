package inheritance.model;

import java.util.ArrayList;

public class Exercise
{
	private ArrayList<String> workouts;
	private int sets;
	private int reps;
	
	public ArrayList<String> getWorkouts()
	{
		return workouts;
	}
	public void setWorkouts(ArrayList<String> workouts)
	{
		this.workouts = workouts;
	}
	public int getSets()
	{
		return sets;
	}
	public void setSets(int sets)
	{
		this.sets = sets;
	}
	public int getReps()
	{
		return reps;
	}
	public void setReps(int reps)
	{
		this.reps = reps;
	}

}
