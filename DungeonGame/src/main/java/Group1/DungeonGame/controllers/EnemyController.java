package Group1.DungeonGame.controllers;

import Group1.DungeonGame.models.enemies.Enemy;
import Group1.DungeonGame.repositories.EnemyRepository;
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
public class EnemyController {

    @Autowired
    EnemyRepository enemyRepository;

    @GetMapping(value = "/enemies")
    public ResponseEntity<List<Enemy>> getAllEnemies(){
        return new ResponseEntity<>(enemyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/enemies/{id}")
    public ResponseEntity<Optional<Enemy>> getEnemy(@PathVariable Long id) {
        return new ResponseEntity<>(enemyRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/enemies/{id}")
    public ResponseEntity<Enemy> createEnemy(@RequestBody Enemy enemy){
        enemyRepository.save(enemy);
        return new ResponseEntity<>(enemy, HttpStatus.CREATED);
    }
}
