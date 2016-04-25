package inheritance.model;

import java.util.ArrayList;

public abstract class Kpop implements Foods
{

	private double numberOfMembers;
	private ArrayList<String> typesOfConcepts;
	private boolean isCatchy;
	private int calories;
	
	
	public double getNumberOfMembers() {
		return numberOfMembers;
	}
	public void setNumberOfMembers(double numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}
	public ArrayList<String> getTypesOfConcepts() {
		return typesOfConcepts;
	}
	public void setTypesOfConcepts(ArrayList<String> typesOfConcepts) {
		this.typesOfConcepts = typesOfConcepts;
	}
	public boolean isCatchy() {
		return isCatchy;
	}
	public void setCatchy(boolean isCatchy) {
		this.isCatchy = isCatchy;
	}
	
	public String toString()
	{
		String kpopDescription = "This is a Kpop object of type " + this.getClass().getName() + " and has " + getNumberOfMembers() +" members.";
		
		return kpopDescription;
	}
	
	/**
	 * if this object is before or less than the compared object return a negative number. 
	 * If this object is after/greater than the compared object return a positive.
	 * If it is the same return 0.
	 * someSoup.compareTo(otherSoup);
	 */
	public int compareTo(Kpop compared)
	{
		 int comparedValue = Integer.MIN_VALUE;
		 
		 if(compared instanceof Foods)
			{
				 if(this.calorieCounter(this.calories) < ((Foods) compared).calorieCounter(this.calories))
				 {
					 comparedValue = -1;
				 }
				 else if(this.calorieCounter(this.calories) > ((Foods) compared).calorieCounter(this.calories))
				 {
					 comparedValue = 1;
				 }
				 else
				 {
					 comparedValue = 0;
				 }
			}
			
		 
		 
		 return comparedValue;
	}
	
	
	
}
