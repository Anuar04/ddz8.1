package players;

import general.SuperPower;

public class Medic extends Hero {

    public Medic(int health, int damage, SuperPower superPower, String name) {
        super(health, damage, superPower, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

    @Override
    protected void set(int i) {

    }
}
