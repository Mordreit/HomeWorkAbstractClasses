import CargoCapaciti.CargoCapaciti;
import beepers.Beeper;
import cabinCapaciti.CabinCapaciti;
import engiens.Engien;
import fuelTank.FuelTank;

public abstract class Car {

    Beeper beeper;
    Engien engien;
    CargoCapaciti cargoCapaciti;
    CabinCapaciti cabinCapaciti;
    FuelTank fuelTank;


    public Car(Beeper beeper, Engien engien, CargoCapaciti cargoCapaciti, CabinCapaciti cabinCapaciti, FuelTank fuelTank) {
        this.beeper = beeper;
        this.engien = engien;
        this.cargoCapaciti = cargoCapaciti;
        this.cabinCapaciti = cabinCapaciti;
        this.fuelTank = fuelTank;

    }
}
