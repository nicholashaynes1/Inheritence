package inheritance.controller;

import java.util.ArrayList;
import inheritance.view.InheritanceFrame;
import inheritance.model.*;

public class InheritanceController
{
	private ArrayList<Foods> foods;
	private InheritanceFrame baseFrame;

	public InheritanceController()
	{
		
		this.foods = new ArrayList<Foods>(); 
		makeList();
		baseFrame = new InheritanceFrame(this);
		
	}

	public void start()
	{
		
	}

	private void swap(int firstLocation, int secondLocation)
	{
		Foods temp = foods.get(firstLocation);
		foods.set(firstLocation, foods.get(secondLocation));
		foods.set(secondLocation, temp);
	}

	public void insertionSort()
	{
		for (int outerLoop = 1; outerLoop < foods.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while (innerLoop > 0 && (foods.get(innerLoop - 1).compareTo(foods.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop - 1);
				innerLoop--;
			}

		}
	}
	
	private void makeList()
	{
		foods.add(new Cardio());
		foods.add(new FourMeat());
		foods.add(new FreeWeights());
		foods.add(new SHINee());
		foods.add(new Panini());
		
		
	}
	
	public void quickSort(int low, int high)
	{
		if(low<high)
		{
			int midPoint = partition(low, high);
			quickSort(low, midPoint-1);
			quickSort(midPoint+1, high);
		}
	}
	
	public String showFoodLevels()
	{
		String foodLevels = "";
		int calories = 8;
		for(Foods currentFood : foods)
		{
			foodLevels += ("this is a " + currentFood.toString() + " and has a calorie count of " + currentFood.calorieCounter(calories) + "\n");
			
		}
		return foodLevels;
	}
	
	
	private int partition(int low, int high)
	{
		int position = low;
		Foods piot = foods.get(high);

		for (int spot = low; spot < high; spot++)
		{
			if (foods.get(spot).compareTo(piot) <= 0)
			{
				swap(spot, high);
				position++;
			}
		}
		swap(position, high);
		return position;

	}
	
	public int getFoodsListSize()
	{
		return this.foods.size();
	}
	
}
