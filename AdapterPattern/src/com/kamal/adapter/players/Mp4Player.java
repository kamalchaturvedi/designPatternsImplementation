package com.kamal.adapter.players;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playMp4File(String fileName) {
		System.out.println("Playing Mp4 File : "+ fileName);
	}

	@Override
	public void playWavFile(String fileName) {
	}

}
