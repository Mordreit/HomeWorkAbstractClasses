import CargoCapaciti.CargoCapaciti;
import beepers.Beeper;
import cabinCapaciti.CabinCapaciti;
import engiens.Engien;
import fuelTank.LamboTank;

public class Lambo extends Car {
    public Lambo(Beeper beeper, Engien engien, CargoCapaciti cargoCapaciti, CabinCapaciti cabinCapaciti, LamboTank lamboTank) {
        super(beeper, engien, cargoCapaciti, cabinCapaciti, lamboTank);
    }
}
