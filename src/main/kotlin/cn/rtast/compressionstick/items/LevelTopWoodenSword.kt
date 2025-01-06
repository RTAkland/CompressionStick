/*
 * Copyright © 2025 RTAkland
 * Author: RTAkland
 * Date: 2025/1/5
 */


package cn.rtast.compressionstick.items

import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.damage.DamageSource
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolMaterial
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand

class LevelTopWoodenSword(settings: Settings) : SwordItem(ToolMaterial.WOOD, 114514f, 1000000f, settings) {
    override fun useOnEntity(stack: ItemStack, user: PlayerEntity, entity: LivingEntity, hand: Hand): ActionResult {
        entity.jump()
        entity.bodyYaw = 0f
        return ActionResult.PASS
    }

    override fun getBonusAttackDamage(target: Entity, baseAttackDamage: Float, damageSource: DamageSource): Float {
        return 114514f
    }
}