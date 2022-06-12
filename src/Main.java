import CargoCapaciti.*;
import beepers.*;
import cabinCapaciti.*;
import engiens.*;
import fuelTank.*;

public class Main {

    public static void main(String[] args) {
        // Создание машины
        Beeper horn = new Horn();
        EngienV12 engienV12 = new EngienV12();
        CargoLambo cargoLambo = new CargoLambo();
        CabinLambo cabinLambo = new CabinLambo();
        LamboTank lamboTank = new LamboTank();

        Lambo lambo = new Lambo(horn, engienV12, cargoLambo, cabinLambo, lamboTank);

        Beeper magicSound = new MagicSound();
        Engien engienV6 = new EngienV6();
        CargoPriora cargoPriora = new CargoPriora();
        CabinPriora cabinPriora = new CabinPriora();
        PrioraTank prioraTank = new PrioraTank();

        Priora priora = new Priora(magicSound, engienV6, cargoPriora, cabinPriora, prioraTank);

        Beeper gudok = new Gudok();
        Engien kamAZ740 = new KamAZ740();
        CargoKamaz cargoKamaz = new CargoKamaz();
        CabinKamaz cabinKamaz = new CabinKamaz();
        KamazTank kamazTank = new KamazTank();

        KamAZ65115 kamAZ65115 = new KamAZ65115(gudok, kamAZ740, cargoKamaz, cabinKamaz, kamazTank);

        Beeper klaxon = new Klaxon();
        Engien Caterpillar3116 = new Caterpillar3116();
        CargoLiaz cargoLiaz = new CargoLiaz();
        CabinLiaz cabinLiaz = new CabinLiaz();
        LiazTank liazTank = new LiazTank();

        LiAZ5256 liAZ5256 = new LiAZ5256(klaxon, Caterpillar3116, cargoLiaz, cabinLiaz, liazTank);

        Beeper signal = new Signal();
        EngienV8 engienV8 = new EngienV8();
        CargoBmw cargoBmw = new CargoBmw();
        CabinBmw cabinBmw = new CabinBmw();
        BmwTank bmwTank = new BmwTank();

        BmwM5 bmwM5 = new BmwM5(signal, engienV8, cargoBmw, cabinBmw, bmwTank);


        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engien.getSpeed());
        System.out.println(lambo.cargoCapaciti.weightLimit());
        System.out.println(lambo.cabinCapaciti.maxPeople());
        System.out.println(lambo.fuelTank.volume());
        System.out.println();

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engien.getSpeed());
        System.out.println(priora.cargoCapaciti.weightLimit());
        System.out.println(priora.cabinCapaciti.maxPeople());
        System.out.println(priora.fuelTank.volume());
        System.out.println();

        System.out.println(kamAZ65115.beeper.makeSound());
        System.out.println(kamAZ65115.engien.getSpeed());
        System.out.println(kamAZ65115.cargoCapaciti.weightLimit());
        System.out.println(kamAZ65115.cabinCapaciti.maxPeople());
        System.out.println(kamAZ65115.fuelTank.volume());
        System.out.println();

        System.out.println(liAZ5256.beeper.makeSound());
        System.out.println(liAZ5256.engien.getSpeed());
        System.out.println(liAZ5256.cargoCapaciti.weightLimit());
        System.out.println(liAZ5256.cabinCapaciti.maxPeople());
        System.out.println(liAZ5256.fuelTank.volume());
        System.out.println();

        System.out.println(bmwM5.beeper.makeSound());
        System.out.println(bmwM5.engien.getSpeed());
        System.out.println(bmwM5.cargoCapaciti.weightLimit());
        System.out.println(bmwM5.cabinCapaciti.maxPeople());
        System.out.println(bmwM5.fuelTank.volume());
        System.out.println();
    }
}