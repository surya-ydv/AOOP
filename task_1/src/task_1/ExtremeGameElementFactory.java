package task_1;
public class ExtremeGameElementFactory implements GameElementFactory {
    public Weapon createWeapon() {
        return new Dagger();
    }

    public PowerUp createPowerUp() {
        return new StrengthBoost();
    }
}
