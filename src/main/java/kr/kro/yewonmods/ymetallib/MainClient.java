package kr.kro.yewonmods.ymetallib;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

import static kr.kro.yewonmods.ymetallib.Main.*;

public class MainClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("ymetallib:block/sulfuric_acid_still"));
            registry.register(new Identifier("ymetallib:block/sulfuric_acid_flowing"));
        });

        FluidRenderHandlerRegistry.INSTANCE.register(SULFURIC_ACID_STILL, SULFURIC_ACID_FLOWING, new SimpleFluidRenderHandler(
                new Identifier("ymetallib:block/sulfuric_acid_still"),
                new Identifier("ymetallib:block/sulfuric_acid_flowing"),
                0x999900
        ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), SULFURIC_ACID_STILL, SULFURIC_ACID_FLOWING);
    }
}
