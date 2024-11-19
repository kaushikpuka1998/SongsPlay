package com.example.spotify.Repositories;

import com.example.spotify.Entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    List<Song> findByName(String name);
    List<Song> findByArtist(String artist);
    List<Song> findByAlbum(String album);
    List<Song> findByGenre(String genre);
    List<Song> findBySongLink(String songLink);
}
