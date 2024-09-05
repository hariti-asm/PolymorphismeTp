package ma.hariti.asmaa;

import java.math.BigDecimal;
import java.sql.Date;

public class Moto  extends  Vehicle{
     private boolean  toutTerrain ;

    public Moto(String marque, String model, Date year, BigDecimal basePrice, boolean toutTerrain) {
        super(marque, model, year, basePrice);
        this.toutTerrain = toutTerrain;
    }

    public boolean isToutTerrain() {
        return toutTerrain;
    }

    public void setToutTerrain(boolean toutTerrain) {
        this.toutTerrain = toutTerrain;
    }
    @Override
    public String showType() {
        return "Moto";

    }
    @Override
    public String getDescription(){
        return super.getDescription() +  (isToutTerrain() ?  " i am tout terrain\n" : " i m not tout terrain\n");

    }
    @Override

    public BigDecimal getTotalPrice(int days) {
        BigDecimal basePrice = super.getBasePrice();

        if (isToutTerrain()) {
            return basePrice.multiply(new BigDecimal(days));
        }
        return basePrice.multiply(new BigDecimal("1.20")).multiply(new BigDecimal(days));
    }
}
