package com.kamal.adapter.audio;

import com.kamal.adapter.players.AdvancedMediaAdapter;
import com.kamal.adapter.players.MediaPlayer;
/**
 * @author Kamal Chaturvedi
 *
 */
public class AudioPlayer implements MediaPlayer{
AdvancedMediaAdapter mediaAdapter;

@Override
public void play(String audioType, String fileName) {
	if(audioType.equalsIgnoreCase("MP3")) {
		System.out.println("Playing MP3 file : "+ fileName);
	} else {
		mediaAdapter = new AdvancedMediaAdapter(audioType);
		mediaAdapter.play(audioType, fileName);
	}
}
}
