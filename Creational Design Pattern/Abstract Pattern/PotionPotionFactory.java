public class ElixirPotionFactory implements PotionFactory {
    @Override
    public HealingPotion createHealingPotion() {
        return new ElixirHealingPotion();
    }

    @Override
    public InvisibilityPotion createInvisibilityPotion() {
        return new ElixirInvisibilityPotion();
    }
}

public class PotionPotionFactory implements PotionFactory {
    @Override
    public HealingPotion createHealingPotion() {
        return new PotionHealingPotion();
    }

    @Override
    public InvisibilityPotion createInvisibilityPotion() {
        return new PotionInvisibilityPotion();
    }
}
