package tfar.levelxenchants;

public enum DamageEnchantmentConfigs {
    SHARPNESS(1, 10, 5),
    UNDEAD(2, 10, 4),
    ARTHROPODS(2, 10, 4);

    public static final DamageEnchantmentConfigs[] VALUES = values();
    public final int minCost;
    public final int levelSpan;
    public final int costPerLevel;
    DamageEnchantmentConfigs(int minCost, int levelSpan, int costPerLevel) {
        this.minCost = minCost;
        this.levelSpan = levelSpan;
        this.costPerLevel = costPerLevel;
    }

    public int getMinLevel(int level) {
        return minCost + (level - 1) * costPerLevel;
    }

    public int getMaxLevel(int level) {
        return getMinLevel(level) + levelSpan;
    }
}
