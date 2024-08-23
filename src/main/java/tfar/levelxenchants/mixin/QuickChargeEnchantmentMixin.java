package tfar.levelxenchants.mixin;

import net.minecraft.world.item.enchantment.QuickChargeEnchantment;
import net.minecraft.world.item.enchantment.TridentImpalerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(QuickChargeEnchantment.class)
public class QuickChargeEnchantmentMixin {


	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMinCost(int pEnchantmentLevel) {
		return 1 + 9 * (pEnchantmentLevel - 1);
	}

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMaxCost(int pEnchantmentLevel) {
		return getMinCost(pEnchantmentLevel) + 40;
	}

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMaxLevel() {
		return 5;
	}
}
