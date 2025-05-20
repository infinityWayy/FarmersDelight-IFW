package vectorwing.farmersdelight.common.utility;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.UnaryOperator;

public class RegistryUtils
{
	public static EnchantmentEffectComponents createEnchantmentEffectComponents(String modid) {
		return new EnchantmentEffectComponents(Registries.DATA_COMPONENT_TYPE, modid);
	}
	public static class EnchantmentEffectComponents extends DeferredRegister<DataComponentType<?>>
	{
		protected EnchantmentEffectComponents(ResourceKey<Registry<DataComponentType<?>>> dataComponentType, String namespace) {
			super(Registries.ENCHANTMENT_EFFECT_COMPONENT_TYPE, namespace);
		}

		public <D> DeferredHolder<DataComponentType<?>, DataComponentType<D>> registerComponentType(String name, UnaryOperator<DataComponentType.Builder<D>> builder) {
			return this.register(name, () -> ((DataComponentType.Builder)builder.apply(DataComponentType.builder())).build());
		}
	}
}
