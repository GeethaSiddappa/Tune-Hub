package com.example.tunehub.service;

import java.util.List;

import com.example.tunehub.entities.Song;

public interface SongService {

	public void addSong(Song song);
	
	public List<Song> fetchAllSongs();

	public boolean songExists(String name);
	
	public void updateSong(Song song);


}