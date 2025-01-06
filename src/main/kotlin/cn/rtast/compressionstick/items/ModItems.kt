/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/5
 */


package cn.rtast.compressionstick.items

import cn.rtast.compressionstick.CompressionStick.Companion.MOD_ID
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.item.Items
import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.util.Identifier

object ModItems {
    val LEVEL_ONE_STICK = register("level_one_stick", ::Item, Item.Settings())
    val LEVEL_TWO_STICK = register("level_two_stick", ::Item, Item.Settings())
    val LEVEL_THREE_STICK = register("level_three_stick", ::Item, Item.Settings())
    val LEVEL_TOP_STICK = register("level_top_stick", ::Item, Item.Settings())
    val LEVEL_TOP_WOODEN_SWORD = register("level_top_wooden_sword", ::LevelTopWoodenSword, Item.Settings())

    fun register(path: String, factory: (Item.Settings) -> Item, settings: Item.Settings): Item {
        val registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID, path))
        return Items.register(registryKey, factory, settings)
    }

    fun customIngredients(entries: FabricItemGroupEntries) {
        entries.add(LEVEL_ONE_STICK)
        entries.add(LEVEL_TWO_STICK)
        entries.add(LEVEL_THREE_STICK)
        entries.add(LEVEL_TOP_STICK)
    }

    fun customCombat(entries: FabricItemGroupEntries) {
        entries.add(LEVEL_TOP_WOODEN_SWORD)
    }

    fun initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(::customIngredients)
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(::customCombat)
    }
}