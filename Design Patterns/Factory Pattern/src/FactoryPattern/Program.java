package FactoryPattern;

public class Program {

	public static void main(String[] args) {
		
		Creator[] creators = new Creator[2];
		
		creators[0] = new ConcreteCreatorA();
		creators[1] = new ConcreteCreatorB();
		
		for(Creator cr : creators)
		{
			Product product = cr.FactoryMethod();
		}
	}
	
	
}

abstract class Product
{
	
}

class ConcreteProductA extends Product
{
	
}

class ConcreteProductB extends Product
{
	
}

abstract class Creator
{
	public abstract Product FactoryMethod();
}

class ConcreteCreatorA extends Creator
{
	@Override
	public Product FactoryMethod()
	{
		return new ConcreteProductA();
	}
}

class ConcreteCreatorB extends Creator
{
	@Override
	public Product FactoryMethod()
	{
		return new ConcreteProductB();
	}
}


