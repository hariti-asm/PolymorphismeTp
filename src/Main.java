import ma.hariti.asmaa.Camion;
import ma.hariti.asmaa.Car;
import ma.hariti.asmaa.Moto;
import ma.hariti.asmaa.Vehicle;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List < Vehicle> vehicles = new ArrayList< >();
        vehicles.add(new Car( "BMW", "BMW X2", Date.valueOf("2025-09-09"),new BigDecimal("100") , 4 , true));
        vehicles.add(new Moto("Honda", "CIVIC", Date.valueOf("2009-01-01"), new BigDecimal("200"), true));
        vehicles.add(new Camion("Honda", "CIVIC", Date.valueOf("2009-01-01"), new BigDecimal("200"), new BigDecimal("50")));
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getMarque()) ;
            System.out.println(vehicle.getDescription());
            System.out.println(vehicle.getModel());
            System.out.println(vehicle.getYear());
            System.out.println(vehicle.getBasePrice());
            System.out.println( "total price of renting for 2 days \n" +vehicle.getTotalPrice(2));
            System.out.println();
        }

    }
}