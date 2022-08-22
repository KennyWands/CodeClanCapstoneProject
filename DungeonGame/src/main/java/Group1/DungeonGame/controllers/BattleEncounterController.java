package Group1.DungeonGame.controllers;

import Group1.DungeonGame.models.encounters.BattleEncounter;
import Group1.DungeonGame.repositories.BattleEncounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BattleEncounterController {

  @Autowired
  BattleEncounterRepository encounterRepository;

  @GetMapping(value = "/encounters")
  public ResponseEntity<List<BattleEncounter>> getAllEncounters(){
    return new ResponseEntity<>(encounterRepository.findAll(), HttpStatus.OK);
  }

  @GetMapping(value = "/encounters/{id}")
  public ResponseEntity<Optional<BattleEncounter>> getSingleEncounter(@PathVariable Long id){
    return new ResponseEntity<>(encounterRepository.findById(id), HttpStatus.OK);
  }

  @GetMapping(value = "/encounters")
  public ResponseEntity<BattleEncounter> createEncounter(@RequestBody BattleEncounter encounter){
    return new ResponseEntity<>(encounter, HttpStatus.CREATED);
  }

}
