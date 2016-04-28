package inheritance.model;

import java.util.ArrayList;

public class SHINee extends Kpop 
{

	public SHINee()
	{
		this.setNumberOfMembers(5.0);
		this.setTypesOfConcepts(getSHINeeConcepts());
		this.setCatchy(true);
	}

	private ArrayList<String> getSHINeeConcepts()
	{
		ArrayList<String> concepts = new ArrayList<String>();
		
		concepts.add("Retro");
		concepts.add("Futuristic");
		concepts.add("Illusions");
		
		return concepts;
		
	}
	
	@Override
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		return false;
	}
	
	@Override
	public boolean isSpycy(ArrayList<String> ingredients)
	{
		return true;
	}
	
	@Override
	public boolean isHealthee(ArrayList<String> ingredients)
	{
		return false;
	}
	
	@Override
	public int calorieCounter(int calories)
	{
		return 400;
	}
	
	@Override
	public int delicousness(int criticRating)
	{
		return 100;
	}

	@Override
	public int compareTo(Object thing)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
