package Group1.DungeonGame.controllers;

import Group1.DungeonGame.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {
   @Autowired
    CharacterRepository characterRepository;
    @GetMapping(value ="/characters")
    public ResponseEntity<List<Character>>  getAllCharacters(){
        return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
    }


}
