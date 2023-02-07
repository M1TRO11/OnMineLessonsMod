package org.tct.onminelessons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.tct.onminelessons.OnMineLessons;

public class ModItemGroups {

    public static final ItemGroup NEW_GROUP = FabricItemGroup.builder(new Identifier(OnMineLessons.MODID, "new_group")).icon(() -> new ItemStack(ModItems.NEW_ITEM)).build();

}
