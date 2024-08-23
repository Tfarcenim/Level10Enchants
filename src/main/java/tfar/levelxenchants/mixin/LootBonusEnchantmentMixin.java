package tfar.levelxenchants.mixin;

import net.minecraft.world.item.enchantment.LootBonusEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LootBonusEnchantment.class)
public class LootBonusEnchantmentMixin {


	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMinCost(int pEnchantmentLevel) {
		return 5 + 5 * (pEnchantmentLevel - 1);//note, defaults are 15 and 9
	}

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMaxLevel() {
		return 10;
	}
}
