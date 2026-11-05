package dev.rdf453.RuneCraft.Registry;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.mojang.serialization.Codec;

import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public final class RuneAttachments {
    public static final DeferredRegister<AttachmentType<?>> REGISTER =
        DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, "runecraft");

    public static final Supplier<AttachmentType<List<String>>> RUNES =
        REGISTER.register("rune_ids", () ->
            AttachmentType.<List<String>>builder(ArrayList::new)
                .serialize(Codec.STRING.listOf().fieldOf("rune_ids"))
                .build());

    private RuneAttachments() {}
}