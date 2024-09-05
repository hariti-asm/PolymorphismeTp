package ma.hariti.asmaa;

import java.math.BigDecimal;
import java.sql.Date;

public class Vehicle {

    private String marque;
    private String model;
    private Date year;
    private BigDecimal basePrice;

    public Vehicle(String marque, String model, Date year, BigDecimal basePrice) {
        this.marque = marque;
        this.model = model;
        this.year = year;
        this.basePrice = basePrice;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getTotalPrice(int days) {
        return basePrice.multiply(new BigDecimal(days));
    }

    public String showType() {
        return "Vehicle";
    }
    public String getDescription() {
        return "Marque:\n " + marque +
                ", Model: \n" + model +
                ", Year: \n" + year +
                ", Base Price: \n" + basePrice;
    }

}
