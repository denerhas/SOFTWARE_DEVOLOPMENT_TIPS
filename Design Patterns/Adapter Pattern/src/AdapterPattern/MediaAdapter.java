package AdapterPattern;

public class MediaAdapter implements MediaPlayer
{
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc"))
			advancedMusicPlayer = new VLCPlayer();
		else if(audioType.equalsIgnoreCase("mp4"))
			advancedMusicPlayer = new MP4Player();
	}
	
	@Override
	public void play(String audioType, String fileName)
	{
		if(audioType.equalsIgnoreCase("vlc"))
			advancedMusicPlayer.playVlc(fileName);
		else if(audioType.equalsIgnoreCase("mp4"))
			advancedMusicPlayer.playMP4(fileName);
	}
}
