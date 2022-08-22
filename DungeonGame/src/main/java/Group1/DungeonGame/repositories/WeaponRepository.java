package Group1.DungeonGame.repositories;

import Group1.DungeonGame.models.weapons.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeaponRepository extends JpaRepository<Weapon, Long> {
}
