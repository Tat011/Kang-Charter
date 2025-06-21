package data.scripts.util;

import com.fs.starfarer.api.Global;

public class Kang_txt {   
    private static final String KANG="kangcharter";    
    
    public static String txt(String id){
        return Global.getSettings().getString(KANG, id);
    }
}