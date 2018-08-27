package com.kamal.adapter.players;

public class WavPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMp4File(String fileName) {
		
	}

	@Override
	public void playWavFile(String fileName) {
		System.out.println("Playing WAV file : "+ fileName);
	}

}
