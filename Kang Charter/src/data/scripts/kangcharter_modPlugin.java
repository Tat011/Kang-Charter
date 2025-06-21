package data.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.campaign.PersonImportance;
import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.characters.FullName;
import com.fs.starfarer.api.characters.PersonAPI;
import com.fs.starfarer.api.impl.campaign.ids.Ranks;
import com.fs.starfarer.api.impl.campaign.ids.Skills;

import exerelin.campaign.SectorManager;

import data.scripts.world.KangGen;

import campaign.econ.impl.KANGItemEffectsRepo;

public class kangcharter_modPlugin extends BaseModPlugin {
//If Nexerelim on
    @Override
    public void onNewGame() {
        boolean haveNexerelin = Global.getSettings().getModManager().isModEnabled("nexerelin");
        if (!haveNexerelin || SectorManager.getManager().isCorvusMode()) {
            new KangGen().generate(Global.getSector());
        }
        if (Global.getSettings().getModManager().isModEnabled("IndEvo")) {
            MarketAPI KANG_MARKET = Global.getSector().getEconomy().getMarket("kang_market");
            if (KANG_MARKET != null) {
                KANG_MARKET.addIndustry("IndEvo_senate");
                KANG_MARKET.addIndustry("IndEvo_Memorial");
            }
            MarketAPI LOKE_MARKET = Global.getSector().getEconomy().getMarket("loke_market");
            if (LOKE_MARKET != null) {
                LOKE_MARKET.addIndustry("IndEvo_EngHub");
            }
            MarketAPI VURMUN_MARKET = Global.getSector().getEconomy().getMarket("vurmun_market");
            if (VURMUN_MARKET != null) {
                VURMUN_MARKET.addIndustry("IndEvo_embassy");
            }
        }
    }
//Corrupted Synchrotron
    public void onApplicationLoad() {
          KANGItemEffectsRepo.addItemEffectsToVanillaRepo();
    }

//Administrators
    public void onNewGameAfterEconomyLoad() {
//Kang
        MarketAPI KANG_MARKET = Global.getSector().getEconomy().getMarket("kang_market");
        if (KANG_MARKET != null) {
//Kang Administrator. should i develop this character?
            PersonAPI ellen_orkun = Global.getFactory().createPerson();
            ellen_orkun.setId("ellen_orkun");
            ellen_orkun.setFaction("kangcharter");
            ellen_orkun.setGender(FullName.Gender.FEMALE);
            ellen_orkun.setPortraitSprite("graphics/portraits/portrait_league00.png");
      	    ellen_orkun.setPersonality("steady");
            ellen_orkun.setRankId(Ranks.POST_ADMINISTRATOR);
            ellen_orkun.setPostId(Ranks.POST_ADMINISTRATOR);
            ellen_orkun.setImportance(PersonImportance.VERY_HIGH);
            ellen_orkun.getName().setFirst("Ellen");
            ellen_orkun.getName().setLast("Orkun");
            ellen_orkun.getStats().setSkillLevel(Skills.INDUSTRIAL_PLANNING, 1);

            Global.getSector().getImportantPeople().addPerson(ellen_orkun);
            Global.getSector().getImportantPeople().getPerson("ellen_orkun").addTag("trade");

            KANG_MARKET.getCommDirectory().addPerson(ellen_orkun);
            KANG_MARKET.getCommDirectory().getEntryForPerson(ellen_orkun).setHidden(false);
            KANG_MARKET.addPerson(ellen_orkun);
            KANG_MARKET.setAdmin(ellen_orkun);
        }
//Loke
        MarketAPI LOKE_MARKET = Global.getSector().getEconomy().getMarket("loke_market");
        if (LOKE_MARKET != null) {
//Loke Administrator. should i develop this character?
            PersonAPI ares_dubinenko = Global.getFactory().createPerson();
            ares_dubinenko.setId("ares_dubinenko");
            ares_dubinenko.setFaction("kangcharter");
            ares_dubinenko.setGender(FullName.Gender.MALE);
            ares_dubinenko.setPortraitSprite("graphics/portraits/portrait13.png");
            ares_dubinenko.setRankId(Ranks.POST_ADMINISTRATOR);
            ares_dubinenko.setPostId(Ranks.POST_ADMINISTRATOR);
            ares_dubinenko.setImportance(PersonImportance.VERY_HIGH);
            ares_dubinenko.getName().setFirst("Ares");
            ares_dubinenko.getName().setLast("Dubinenko");
	    	ares_dubinenko.getStats().setSkillLevel(Skills.INDUSTRIAL_PLANNING, 2);

            Global.getSector().getImportantPeople().addPerson(ares_dubinenko);
            Global.getSector().getImportantPeople().getPerson("ares_dubinenko").addTag("trade");

            LOKE_MARKET.setAdmin(ares_dubinenko);
	    	LOKE_MARKET.getCommDirectory().addPerson(ares_dubinenko);
            LOKE_MARKET.getCommDirectory().getEntryForPerson(ares_dubinenko).setHidden(false);
            LOKE_MARKET.addPerson(ares_dubinenko);
        }
//Vurmun
        MarketAPI VURMUN_MARKET = Global.getSector().getEconomy().getMarket("vurmun_market");
        if (VURMUN_MARKET != null) {
//Vurmun Administrator. should i develop this character?
            PersonAPI ceres_aver = Global.getFactory().createPerson();
            ceres_aver.setId("ceres_aver");
            ceres_aver.setFaction("kangcharter");
            ceres_aver.setGender(FullName.Gender.ANY);
            ceres_aver.setPortraitSprite("graphics/portraits/portrait49.png");
            ceres_aver.setRankId(Ranks.POST_ADMINISTRATOR);
            ceres_aver.setPostId(Ranks.POST_ADMINISTRATOR);
            ceres_aver.setImportance(PersonImportance.VERY_HIGH);
            ceres_aver.getName().setFirst("Ceres");
            ceres_aver.getName().setLast("Aver");
            ceres_aver.getStats().setSkillLevel(Skills.INDUSTRIAL_PLANNING, 1);

            Global.getSector().getImportantPeople().addPerson(ceres_aver);
            Global.getSector().getImportantPeople().getPerson("ceres_aver").addTag("trade");

            VURMUN_MARKET.setAdmin(ceres_aver);
            VURMUN_MARKET.getCommDirectory().addPerson(ceres_aver);
            VURMUN_MARKET.getCommDirectory().getEntryForPerson(ceres_aver).setHidden(false);
            VURMUN_MARKET.addPerson(ceres_aver);
        }
//Vurmun
        MarketAPI HELM_MARKET = Global.getSector().getEconomy().getMarket("helm_market");
        if (HELM_MARKET != null) {
//Helm Administrator
            PersonAPI silen_make = Global.getFactory().createPerson();
            silen_make.setId("silen_make");
            silen_make.setFaction("kangcharter");
            silen_make.setGender(FullName.Gender.MALE);
            silen_make.setPortraitSprite("graphics/portraits/portrait_pirate14.png");
            silen_make.setRankId(Ranks.POST_ADMINISTRATOR);
            silen_make.setPostId(Ranks.POST_ADMINISTRATOR);
            silen_make.setImportance(PersonImportance.VERY_HIGH);
            silen_make.getName().setFirst("Silen");
            silen_make.getName().setLast("Make");
            silen_make.getStats().setSkillLevel(Skills.INDUSTRIAL_PLANNING, 1);

            Global.getSector().getImportantPeople().addPerson(silen_make);
            Global.getSector().getImportantPeople().getPerson("silen_make").addTag("trade");

            HELM_MARKET.setAdmin(silen_make);
            HELM_MARKET.getCommDirectory().addPerson(silen_make);
            HELM_MARKET.getCommDirectory().getEntryForPerson(silen_make).setHidden(false);
            HELM_MARKET.addPerson(silen_make);
        }
    }
}