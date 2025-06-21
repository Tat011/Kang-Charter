package data.scripts.world;

import com.fs.starfarer.api.campaign.FactionAPI;
import com.fs.starfarer.api.campaign.SectorAPI;
import com.fs.starfarer.api.campaign.SectorGeneratorPlugin;

import com.fs.starfarer.api.impl.campaign.ids.Factions;
import com.fs.starfarer.api.impl.campaign.shared.SharedData;

import data.scripts.world.systems.Norlem;

public class KangGen implements SectorGeneratorPlugin {
    @Override
    public void generate(SectorAPI sector) {
        SharedData.getData().getPersonBountyEventData().addParticipatingFaction("kangcharter");

        new Norlem().generate(sector);

        FactionAPI kangcharter = sector.getFaction("kangcharter");
//Relationships
        kangcharter.setRelationship(Factions.HEGEMONY, -0.7f);
        kangcharter.setRelationship(Factions.PERSEAN, -0.3f);
        kangcharter.setRelationship(Factions.DIKTAT, -0.7f);
        kangcharter.setRelationship(Factions.LIONS_GUARD, -0.8f);
        kangcharter.setRelationship(Factions.TRITACHYON, -1f);
        kangcharter.setRelationship(Factions.LUDDIC_CHURCH, -0.3f);
        kangcharter.setRelationship(Factions.KOL, -0.4f);
        kangcharter.setRelationship(Factions.LUDDIC_PATH, -1f);
        kangcharter.setRelationship(Factions.INDEPENDENT, -0.25f);
        kangcharter.setRelationship(Factions.PIRATES, -0.2f);
        kangcharter.setRelationship(Factions.PLAYER, -0.3f);

        kangcharter.setRelationship(Factions.DERELICT, -0.55f);
        kangcharter.setRelationship(Factions.REMNANTS, -0.6f);
        kangcharter.setRelationship(Factions.OMEGA, -0.65f);
        kangcharter.setRelationship(Factions.THREAT, -1f);
        kangcharter.setRelationship(Factions.DWELLER, -1f);
//Color factions
        kangcharter.setRelationship("ocua", -1f);
        kangcharter.setRelationship("xlu", -0.3f);
        kangcharter.setRelationship("ynadar", -0.3f);
        kangcharter.setRelationship("hylecium", -0.3f);
        kangcharter.setRelationship("augustine", -0.3f);
//Pirate-like
        kangcharter.setRelationship("gmda", -0.6f);
        kangcharter.setRelationship("gmda_patrol", -0.6f);
        kangcharter.setRelationship("cabal", -0.8f);
        kangcharter.setRelationship("al_ars", -0.6f);
        kangcharter.setRelationship("vri", -0.6f);
//Pure, cartoonish Evil
        kangcharter.setRelationship("templars", -1f);
        kangcharter.setRelationship("hiver", -1f);
//Nations on the standard side
        kangcharter.setRelationship("shadow_industry", -0.1f);
        kangcharter.setRelationship("SCY", -0.1f);
        kangcharter.setRelationship("ORA", -0.2f);
        kangcharter.setRelationship("exalted", -0.2f);
        kangcharter.setRelationship("adversary", -0.3f);
        kangcharter.setRelationship("star_federation", -0.3f);
//Like above but trade first
        kangcharter.setRelationship("osiris", 0.1f);
        kangcharter.setRelationship("CFT", 0.3f);
        kangcharter.setRelationship("stardust_ventures", 0f);
//Corporations
        kangcharter.setRelationship("diableavionics", -0.7f);
        kangcharter.setRelationship("vic", -0.7f);
        kangcharter.setRelationship("pearson_exotronics", -0.7f);
        kangcharter.setRelationship("mvs", -0.4f);
        kangcharter.setRelationship("LLI", -0.7f);
        kangcharter.setRelationship("scalartech", -0.4f);
//Autocracies (and Pamed)
        kangcharter.setRelationship("uaf", -0.8f);
        kangcharter.setRelationship("approlight", -0.8f);
        kangcharter.setRelationship("interstellarimperium", -0.8f);
        kangcharter.setRelationship("vanidad", -0.7f);
        kangcharter.setRelationship("xhanempire", -0.7f);
        kangcharter.setRelationship("unitedpamed", -0.2f);
        kangcharter.setRelationship("mayorate", -0.8f);
        kangcharter.setRelationship("dr", -0.7f);
//Junkers (and PRV)
        kangcharter.setRelationship("prv", -0.7f);
        kangcharter.setRelationship("rb", 0.2f);
        kangcharter.setRelationship("JYD", 0f);
//BY THE POWER OF LUDD
        kangcharter.setRelationship("cmc", -0.2f);
        kangcharter.setRelationship("knights_of_selkie", -0.4f);
//Weaponized wokery!
        kangcharter.setRelationship("apex_design", 0.2f);
//SCIENCE!
        kangcharter.setRelationship("dpl_phase_lab", -0.2f);
//Hazard Mining Incorporated
        kangcharter.setRelationship("hmi", -0.8f);
        kangcharter.setRelationship("brighton", 0.3f);
        kangcharter.setRelationship("draco", -1f);
        kangcharter.setRelationship("fang", -1f);
//Misc
        kangcharter.setRelationship("valkyrian", -0.7f);
//That one anime pack
        kangcharter.setRelationship("aria", -0.7f);
        kangcharter.setRelationship("yrxp", -0.4f);
        kangcharter.setRelationship("ryaz", -0.7f);
//Orky Sector
        kangcharter.setRelationship("ls_ds", -1f);
        kangcharter.setRelationship("ls_es", -1f);
        kangcharter.setRelationship("ls_bm", -1f);
    }
}