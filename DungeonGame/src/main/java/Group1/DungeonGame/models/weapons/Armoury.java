package Group1.DungeonGame.models.weapons;

import javax.persistence.*;

@Entity
@Table(name = "weapons")
public class Armoury {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
