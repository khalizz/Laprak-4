package praktic.inheritance.transportation;

public class Train extends Vehicle {
    String route;

    static final int FIXED_FARE = 10000;

    public Train(String nama, int capacity, String route) {
        super(nama, capacity, route);
    }

    public void calcualteFare(){
        getCurrentPassengers();

        int fare = FIXED_FARE * getCurrentPassengers();
        
        System.out.println("Total Penumpang: Rp" + getCurrentPassengers());
        System.out.println("Tarif tetap per penumpang: " + FIXED_FARE);
        System.out.println("Total tarif perjalanan: Rp " + fare);
    }

}