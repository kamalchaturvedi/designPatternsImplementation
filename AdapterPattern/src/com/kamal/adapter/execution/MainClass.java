package com.kamal.adapter.execution;

import com.kamal.adapter.audio.AudioPlayer;
/**
 * @author Kamal Chaturvedi
 *
 */
public class MainClass {
	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		player.play("Mp3", "file1.mp3");
		player.play("WAV", "file2.mp3");
		player.play("Mp4", "file3.mp3");
	}
}
