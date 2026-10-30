package dev.rdf453.RuneCraft.Archery;

import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryAnsuz;
import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryFehu;
import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryGebo;
import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryKenaz;
import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryRaidho;
import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryThurisaz;
import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryUruz;
import dev.rdf453.RuneCraft.Archery.Rune.FreyjaAettir.ArcheryWunjo;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcheryAlgiz;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcheryEihwaz;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcheryHagalaz;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcheryIsa;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcheryJera;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcheryNauthiz;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcheryPerthro;
import dev.rdf453.RuneCraft.Archery.Rune.HeimdallAettir.ArcherySowilo;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryBerkano;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryDagaz;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryEhwaz;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryIngwaz;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryLaguz;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryMannaz;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryOthala;
import dev.rdf453.RuneCraft.Archery.Rune.TyrAettir.ArcheryTiwaz;
import dev.rdf453.RuneCraft.Registry.RuneRegistry;

public class ArcheryRunes {
    private ArcheryRunes() {}

    public static void registerAll() {
        RuneRegistry.register(
            new ArcheryAlgiz(),
            new ArcheryAnsuz(),
            new ArcheryBerkano(),
            new ArcheryDagaz(),
            new ArcheryEhwaz(),
            new ArcheryGebo(),
            new ArcheryEihwaz(),
            new ArcheryHagalaz(),
            new ArcheryFehu(),
            new ArcheryIngwaz(),
            new ArcheryThurisaz(),
            new ArcheryIsa(),
            new ArcheryJera(),
            new ArcheryKenaz(),
            new ArcheryLaguz(),
            new ArcheryMannaz(),
            new ArcheryNauthiz(),
            new ArcheryOthala(),
            new ArcheryPerthro(),
            new ArcheryRaidho(),
            new ArcherySowilo(),
            new ArcheryTiwaz(),
            new ArcheryUruz(),
            new ArcheryWunjo()
            
        );
    }
}
