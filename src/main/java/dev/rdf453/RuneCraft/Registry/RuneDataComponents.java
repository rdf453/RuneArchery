package dev.rdf453.RuneCraft.Registry;

import java.util.List;
import java.util.function.Supplier;

import com.mojang.serialization.Codec;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.animal.fish.Cod;
import net.neoforged.neoforge.registries.DeferredRegister;

public class RuneDataComponents {
    public static final DeferredRegister.DataComponents REGISTER =
        DeferredRegister.createDataComponents(
            Registries.DATA_COMPONENT_TYPE,"runecraft");

    
    public static final Supplier<DataComponentType<List<String>>> RUNES = 
        REGISTER.registerComponentType(
            "rune_ids",
            builder -> builder.persistent(Codec.STRING.listOf()));        

    public static final Supplier<DataComponentType<Integer>> MAX_RUNE = 
            REGISTER.registerComponentType(
                "maximum_rune", 
            builder -> builder.persistent(Codec.INT));

    private RuneDataComponents() {}        
}
