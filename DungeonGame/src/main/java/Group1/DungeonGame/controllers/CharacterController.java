package Group1.DungeonGame.controllers;

import Group1.DungeonGame.models.characters.Character;
import Group1.DungeonGame.repositories.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CharacterController {

    @Autowired
    CharacterRepository characterRepository;

    @GetMapping(value="/characters")
    public ResponseEntity<List<Character>> getAllCharacters() {
        return new ResponseEntity<>(characterRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/characters/{id}")
    public ResponseEntity<Optional<Character>> getCharacter(@PathVariable Long id) {
        return new ResponseEntity<>(characterRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value="/characters")
    public ResponseEntity<Character> createCharacter(@RequestBody Character character) {
        characterRepository.save(character);
        return new ResponseEntity<>(character, HttpStatus.CREATED);
    }
}
