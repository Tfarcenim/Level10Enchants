package tfar.levelxenchants.mixin;

import net.minecraft.world.item.enchantment.DamageEnchantment;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import tfar.levelxenchants.DamageEnchantmentConfigs;

@Mixin(DamageEnchantment.class)
public class DamageEnchantmentMixin {


	@Shadow @Final public int type;

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMinCost(int pEnchantmentLevel) {
		return DamageEnchantmentConfigs.VALUES[type].getMinLevel(pEnchantmentLevel);
	}

	/**
	 * @author
	 * @reason
	 */
	@Overwrite
	public int getMaxCost(int pEnchantmentLevel) {
		return DamageEnchantmentConfigs.VALUES[type].getMaxLevel(pEnchantmentLevel);
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
