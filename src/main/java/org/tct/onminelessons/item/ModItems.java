package org.tct.onminelessons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.tct.onminelessons.OnMineLessons;

public class ModItems {
    public static final Item NEW_ITEM = registerItem("new_item", new Item(new FabricItemSettings()), ModItemGroups.NEW_GROUP); //test change (this is items group xD)
    private static Item registerItem(String id, Item item) { return Registry.register(Registries.ITEM, new Identifier(OnMineLessons.MODID, id), item); }
    private static Item registerItem(String id, Item item, ItemGroup itemGroup) {
        Item returnItem = Registry.register(Registries.ITEM, new Identifier(OnMineLessons.MODID, id), item);
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(returnItem));

        //wtferhgiehgierhg

        return returnItem;
    }
    public static void register() { OnMineLessons.LOGGER.debug("Registering items for: " + OnMineLessons.MODID); }
}
