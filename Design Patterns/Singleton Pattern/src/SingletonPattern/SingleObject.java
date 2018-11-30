package SingletonPattern;

public class SingleObject {

	private static SingleObject instance = new SingleObject();
	
	private SingleObject(){}
	
	public void showMessage()
	{
		System.out.println("Hello World");
	}

	public static SingleObject getInstance() {
		return instance;
	}
	
}
