package com.kamal.adapter.players;
/**
 * @author Kamal Chaturvedi
 *
 */
public class AdvancedMediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;

	public AdvancedMediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("MP4")) {
			advancedMediaPlayer = new Mp4Player();
		} else if (audioType.equalsIgnoreCase("WAV")) {
			advancedMediaPlayer = new WavPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("MP4")) {
			advancedMediaPlayer.playMp4File(fileName);
		} else if (audioType.equalsIgnoreCase("WAV")) {
			advancedMediaPlayer.playWavFile(fileName);
		}
	}

}
