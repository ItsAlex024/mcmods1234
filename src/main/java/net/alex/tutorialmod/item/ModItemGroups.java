package net.alex.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static net.minecraft.text.Text.translatable;
import static net.alex.tutorialmod.TutorialMod.MOD_ID;
import static net.alex.tutorialmod.TutorialMod.LOGGER;

public class ModItemGroups {
	private static final String tabKey1 = "tab." + MOD_ID + ".tab1";

	public static ItemGroup CITRINE;

	public static void registerModItemGroups() {
		CITRINE = FabricItemGroup.builder(new Identifier(MOD_ID, "citrine"))
				.displayName(translatable(tabKey1))
				.icon(() -> new ItemStack(ModItems.CITRINE)).build();

		ItemGroupEvents.modifyEntriesEvent(CITRINE).register(entries -> {
					entries.add(ModItems.CITRINE);
					entries.add(ModItems.CITRINE2);
				}
			);

		LOGGER.debug("Registering ModTabs for " + MOD_ID);
	}

}
