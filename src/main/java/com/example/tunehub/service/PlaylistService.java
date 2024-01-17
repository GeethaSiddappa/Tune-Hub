package com.example.tunehub.service;

import java.util.List;

import com.example.tunehub.entities.Playlist;

public interface PlaylistService {

	public void addPlaylist(Playlist playlist);
	public List<Playlist>fetchPlaylists();

}
