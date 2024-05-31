public class ElixirHealingPotion implements HealingPotion {
    @Override
    public void drink() {
        System.out.println("You feel healed. (Elixir Healing Potion)");
    }
}

public class ElixirInvisibilityPotion implements InvisibilityPotion {
    @Override
    public void drink() {
        System.out.println("You become invisible. (Elixir Invisibility Potion)");
    }
}

public class PotionHealingPotion implements HealingPotion {
    @Override
    public void drink() {
        System.out.println("You feel healed. (Potion Healing Potion)");
    }
}

public class PotionInvisibilityPotion implements InvisibilityPotion {
    @Override
    public void drink() {
        System.out.println("You become invisible. (Potion Invisibility Potion)");
    }
}
