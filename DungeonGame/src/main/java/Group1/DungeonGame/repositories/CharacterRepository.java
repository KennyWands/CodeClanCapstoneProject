package Group1.DungeonGame.repositories;

import Group1.DungeonGame.models.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository <Character, Long> {
}
