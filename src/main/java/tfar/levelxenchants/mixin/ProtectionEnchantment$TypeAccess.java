package tfar.levelxenchants.mixin;

import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ProtectionEnchantment.Type.class)
public interface ProtectionEnchantment$TypeAccess {

    @Accessor @Mutable void setMinCost(int cost);
    @Accessor @Mutable void setLevelCost(int cost);

}
