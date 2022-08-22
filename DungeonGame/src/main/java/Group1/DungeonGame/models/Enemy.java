package Group1.DungeonGame.models;

import Group1.DungeonGame.models.weapons.Weapon;

public class Enemy {

    private Long id;

    private String name;

    private int maxHealth;

    private int exp;

    private int level;

    private Weapon weapon;

    public Enemy(String name, int maxHealth, int exp, int level, Weapon weapon) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.exp = exp;
        this.level = level;
        this.weapon = weapon;
    }

    public Enemy(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
