package tfar.levelxenchants.mixin;

import net.minecraft.world.item.enchantment.SoulSpeedEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SoulSpeedEnchantment.class)
public class SoulSpeedEnchantmentMixin {


	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMinCost(int pEnchantmentLevel) {
		return 1 + 4 * (pEnchantmentLevel - 1);
	}

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMaxCost(int pEnchantmentLevel) {
		return getMinCost(pEnchantmentLevel) + 25;
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
