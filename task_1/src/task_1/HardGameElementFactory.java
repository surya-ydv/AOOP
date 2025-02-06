package task_1;

public class HardGameElementFactory implements GameElementFactory {
    public Weapon createWeapon() {
        return new MagicWand();
    }

    public PowerUp createPowerUp() {
        return new SpeedBoost();
    }
}
