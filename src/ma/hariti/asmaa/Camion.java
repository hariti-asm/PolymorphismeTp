package ma.hariti.asmaa;

import java.math.BigDecimal;
import java.sql.Date;

public class Camion  extends  Vehicle{

    private BigDecimal loadCapacity;



    public Camion(String marque, String model, Date year, BigDecimal basePrice, BigDecimal loadCapacity) {
        super(marque, model, year, basePrice);
        this.loadCapacity = loadCapacity;
    }

    public BigDecimal getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(BigDecimal loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String showType() {
        return "Camion";
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "load capacity is\n" + loadCapacity;
    }

    @Override
        public BigDecimal getTotalPrice(int days) {
            BigDecimal basePrice = super.getBasePrice();
            return loadCapacity.compareTo(new BigDecimal("30")) > 0
                    ? basePrice.multiply(new BigDecimal("1.30")).multiply(new BigDecimal(days))
                    : basePrice.multiply(new BigDecimal(days));
        }

}
