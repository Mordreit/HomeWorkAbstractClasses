import CargoCapaciti.CargoCapaciti;
import beepers.Beeper;
import cabinCapaciti.CabinCapaciti;
import engiens.Engien;
import fuelTank.BmwTank;

public class BmwM5 extends Car{
    public BmwM5(Beeper beeper, Engien engien, CargoCapaciti cargoCapaciti, CabinCapaciti cabinCapaciti, BmwTank bmwTank) {
        super(beeper, engien, cargoCapaciti, cabinCapaciti, bmwTank);
    }
}
