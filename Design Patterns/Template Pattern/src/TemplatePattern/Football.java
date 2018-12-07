package TemplatePattern;

public class Football extends Game{

	@Override
	void endPlay()
	{
		System.out.println("Football Game Finished!");
	}
	
	@Override
	void initialize(){
		System.out.println("Football Game initialized! Start playing.");
	}
	
	@Override
	void startPlay()
	{
		System.out.println("Football Game started. Enjoy the game!");
	}
	
}
