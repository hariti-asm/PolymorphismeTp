package ma.hariti.asmaa;

import java.math.BigDecimal;
import java.sql.Date;

public class Car  extends Vehicle {
    private Integer numberOfDoors;
    private boolean automatic;

    public Car(String marque, String model, Date year, BigDecimal basePrice, int numberOfDoors, boolean automatic) {
        super(marque, model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
        this.automatic = automatic;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }


    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    @Override
    public String showType() {
        return "Car";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "i have " + numberOfDoors + " doors";
    }

    @Override
    public BigDecimal getTotalPrice(int days) {
        BigDecimal basePrice = super.getBasePrice();
        BigDecimal adjustedPrice = isAutomatic()
                ? basePrice.multiply(new BigDecimal("1.10"))
                : basePrice;

        return adjustedPrice.multiply(new BigDecimal(days));
    }


}