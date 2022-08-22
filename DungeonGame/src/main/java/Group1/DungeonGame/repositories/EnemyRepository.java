package Group1.DungeonGame.repositories;

import Group1.DungeonGame.models.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnemyRepository extends JpaRepository<Enemy, Long> {
}
