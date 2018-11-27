package BuilderPattern;

import java.util.ArrayList;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		
	}
	
	public interface Item {
		public String name();
		public Packing packing();
		public float price();
	}
	
	public interface Packing{
		public String pack();
	}
	
	public class Wrapper implements Packing {
		@Override
		public String pack()
		{
			return "Wrapper";
		}
	}
	
	public class Bottle implements Packing 
	{
		@Override
		public String pack()
		{
			return "Bottle";
		}
	}
	
	public abstract class Burger implements Item
	{
		@Override
		public Packing packing() 
		{
		   return new Wrapper();
		}
		
		@Override
		public abstract float price();
	}
	
	public abstract class ColdDrink implements Item
	{
		@Override
		public Packing packing() 
		{
		   return new Bottle();
		}
		
		@Override
		public abstract float price();
	}
	
	public class VegBurger extends Burger
	{
		@Override
		public float price()
		{
			return 25.0f;
		}
		
		@Override
		public String name()
		{
			return "Veg Burger";
		}
	}
	
	public class ChickenBurger extends Burger 
	{
		@Override
		public float price()
		{
			return 50.5f;
		}
		
		@Override
		public String name()
		{
			return "Chicken Burger";
		}
	}
	
	public class Coke extends ColdDrink
	{
		@Override
		public float price()
		{
			return 30.0f;
		}
		
		@Override
		public String name()
		{
			return "Coke";
		}
	}
	
	public class Pepsi extends ColdDrink
	{
		@Override
		public float price()
		{
			return 35.0f;
		}
		
		@Override
		public String name()
		{
			return "Pepsi";
		}
	}
	
	public class Meal
	{
		private List<Item> items = new ArrayList<Item>();
		
		public void addItem(Item item)
		{
			items.add(item);
		}
		
		public float getCost()
		{
			float cost = 0.0f;
			
			for(Item item : items)
			{
				cost += item.price();
			}
			
			return cost;
		}
		
		public void showItems()
		{
			for(Item item : items)
			{
				 System.out.print("Item : " + item.name());
		         System.out.print(", Packing : " + item.packing().pack());
		         System.out.println(", Price : " + item.price());
			}
		}
	}
	
	public class MealBuilder {

	   public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
	}
}
