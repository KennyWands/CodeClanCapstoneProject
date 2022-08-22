package Group1.DungeonGame.repositories;

import Group1.DungeonGame.models.encounters.BattleEncounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattleEncounterRepository extends JpaRepository<BattleEncounter, Long> {
}
