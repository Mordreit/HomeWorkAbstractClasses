import CargoCapaciti.CargoCapaciti;
import beepers.Beeper;
import cabinCapaciti.CabinCapaciti;
import engiens.Engien;
import fuelTank.PrioraTank;

public class Priora extends Car{
    public Priora(Beeper beeper, Engien engien, CargoCapaciti cargoCapaciti, CabinCapaciti cabinCapaciti, PrioraTank prioraTank) {
        super(beeper, engien, cargoCapaciti, cabinCapaciti, prioraTank);
    }
}
