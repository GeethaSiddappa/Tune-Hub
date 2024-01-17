package com.example.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub.entities.Playlist;
import com.example.tunehub.entities.Song;

public interface PlaylistRepository extends JpaRepository<Playlist,Integer>{

}
