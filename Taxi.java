package praktic.inheritance.transportation;

public class Taxi extends Vehicle {

    static final int FARE_PER_KM = 5000;

    public Taxi(String nama, int capacity, String route) {
        super(nama, capacity, route);
    }

    public void calcualteFare(int distance) {
        getCurrentPassengers();

        int fare = getCurrentPassengers() * FARE_PER_KM * distance;
        
        System.out.println("Total Penumpang: " + getCurrentPassengers());
        System.out.println("Total jarak rute: " + distance + " KM");
        System.out.println("Tarif per KM: Rp " + FARE_PER_KM);
        System.out.println("Total tarif perjalanan: Rp " + fare);
    }

}