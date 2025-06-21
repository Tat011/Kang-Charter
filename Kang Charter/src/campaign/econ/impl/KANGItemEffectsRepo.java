package campaign.econ.impl;

import java.util.HashMap;
import java.util.Map;

import com.fs.starfarer.api.campaign.SpecialItemData;
import com.fs.starfarer.api.campaign.econ.Industry;
import com.fs.starfarer.api.campaign.econ.InstallableIndustryItemPlugin.InstallableItemDescriptionMode;
import com.fs.starfarer.api.ui.TooltipMakerAPI;
import com.fs.starfarer.api.util.Misc;

import com.fs.starfarer.api.impl.campaign.econ.impl.BoostIndustryInstallableItemEffect;
import com.fs.starfarer.api.impl.campaign.econ.impl.InstallableItemEffect;
import com.fs.starfarer.api.impl.campaign.econ.impl.ItemEffectsRepo;

public class KANGItemEffectsRepo {
    public static void addItemEffectsToVanillaRepo() {
        ItemEffectsRepo.ITEM_EFFECTS.putAll(ITEM_EFFECTS);
    }
	public static int TAT_CORRUPTED_SYNCHROTRON_FUEL_BONUS = 1;

	public static Map<String, InstallableItemEffect> ITEM_EFFECTS = new HashMap<String, InstallableItemEffect>() {{
		put("tat_corrupted_synchrotron", new BoostIndustryInstallableItemEffect("tat_corrupted_synchrotron", TAT_CORRUPTED_SYNCHROTRON_FUEL_BONUS, 0) {
			protected void addItemDescriptionImpl(Industry industry, TooltipMakerAPI text, SpecialItemData data, InstallableItemDescriptionMode mode, String pre, float pad) {
				//text.addPara(pre + "Increases fuel production and demand for volatiles by %s.",
				text.addPara(pre + "Increases fuel production output by %s units.", pad, Misc.getHighlightColor(), "" + TAT_CORRUPTED_SYNCHROTRON_FUEL_BONUS);
			}
		});
	}};
}