package cn.rtast.compressionstick

import cn.rtast.compressionstick.items.ModItems
import net.fabricmc.api.ModInitializer

class CompressionStick : ModInitializer {

    companion object {
        const val MOD_ID = "compressionstick"
    }

    override fun onInitialize() {
        ModItems.initialize()
    }
}
