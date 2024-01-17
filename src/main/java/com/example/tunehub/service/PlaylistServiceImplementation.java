package com.example.tunehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub.entities.Playlist;
import com.example.tunehub.repository.PlaylistRepository;
@Service
public class PlaylistServiceImplementation implements PlaylistService {

	@Autowired
	PlaylistRepository repo;
	@Override
	public void addPlaylist(Playlist playlist) {
		repo.save(playlist);
		
	}
	@Override
	public List<Playlist> fetchPlaylists() {
		return repo.findAll();
	}

}
