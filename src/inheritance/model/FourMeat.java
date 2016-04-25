package inheritance.model;

import java.util.ArrayList;

public class FourMeat extends Pizza
{
	public FourMeat()
	{
		super();
		this.setToppings(fourMeatToppings());
	}
	
	public int calorieCounter(int calories)
	{
		return calories * 10;
	}
	
	public boolean isSpycy(ArrayList<String> ingredients)
	{
		for(String ingredient : ingredients)
		{
			for(String topping : getToppings())
			{
				if(ingredient.equalsIgnoreCase(topping))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isHealthee(ArrayList<String> ingredients)
	{
		return false;
	}
	
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		return true;
	}
	
	public int delicousness(int criticRating)
	{
		return criticRating * 2;
	}
	
	private ArrayList<String> fourMeatToppings()
	{
		ArrayList<String> toppings = new ArrayList<String>();
		
		toppings.add("Bacon");
		toppings.add("Italian Sausage");
		toppings.add("Pepperoni");
		toppings.add("Ham");
		
		return toppings;
	}
}
