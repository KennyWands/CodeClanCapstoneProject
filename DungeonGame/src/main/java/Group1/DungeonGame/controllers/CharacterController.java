package Group1.DungeonGame.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterController extends JpaRepository<Character, Long> {



}
