package AdapterPattern;

public class VLCPlayer implements AdvancedMediaPlayer{
	public void playVlc(String fileName)
	{
		System.out.println("Playing vlc file. Name: " + fileName);
	}
	public void playMP4(String fileName)
	{
		//do nothing
	}
}
