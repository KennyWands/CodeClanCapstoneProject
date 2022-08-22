package Group1.DungeonGame.repositories;

import Group1.DungeonGame.models.encounters.Encounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncounterRepository extends JpaRepository<Encounter, Long> {
}
