package com.example.spotify.Repositories;

import com.example.spotify.Entities.Playlist;
import com.example.spotify.Entities.Song;
import com.example.spotify.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
    List<Playlist> findByName(String name);
    List<Playlist> findByUser(Users user);
    List<Playlist> findBySong(Song song);
    List<Playlist> findBySongAndUser(Song song, Users user);
    List<Playlist> findByUserAndName(Users user, String name);
    List<Playlist> findBySongAndName(Song song, String name);
    List<Playlist> findBySongAndUserAndName(Song song, Users user, String name);
}
