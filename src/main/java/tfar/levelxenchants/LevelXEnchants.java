package tfar.levelxenchants;

import com.mojang.logging.LogUtils;
import net.minecraft.core.Registry;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.ProtectionEnchantment;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import tfar.levelxenchants.mixin.ProtectionEnchantment$TypeAccess;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LevelXEnchants.MODID)
public class LevelXEnchants {

    public static final String MODID = "levelxenchants";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public LevelXEnchants() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

    }

    private void setup(final FMLCommonSetupEvent event) {
        set(ProtectionEnchantment.Type.ALL,1,5);
        set(ProtectionEnchantment.Type.FIRE,1,4);
        set(ProtectionEnchantment.Type.FALL,1,3);
        set(ProtectionEnchantment.Type.EXPLOSION,1,4);
        set(ProtectionEnchantment.Type.PROJECTILE,1,3);
    }

    private static void set(ProtectionEnchantment.Type type,int minLevel,int costPerLevel) {
        ((ProtectionEnchantment$TypeAccess)(Object) type).setMinCost(minLevel);
        ((ProtectionEnchantment$TypeAccess)(Object) type).setLevelCost(costPerLevel);
    }
}
