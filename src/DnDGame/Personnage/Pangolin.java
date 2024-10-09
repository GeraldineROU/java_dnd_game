package DnDGame.Personnage;

import DnDGame.EquipementOffensif.Caillou;
import DnDGame.EquipementDefensif.SlipSale;

public class Pangolin extends Personnage {

    public static final String PANGOLIN = "pangolin";

    public Pangolin(String name){
        super(name);
        type = PANGOLIN;
        setHP(1);
        setStrength(1);
        this.offensiveEquipment = new Caillou();
        this.defensiveEquipment = new SlipSale();
    }



    public String getType() {
        return PANGOLIN;
    }
}
