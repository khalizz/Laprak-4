package praktic.inheritance.transportation;

public class Bus extends Vehicle {
    String route;

    static final int FAREstop = 2000; 
    
    public Bus(String nama, int capacity, String route) {
        super(nama, capacity, route);
    }

    public void calcualteFare(int stop) {
        getCurrentPassengers();
        
        int fare = getCurrentPassengers() * FAREstop * stop;
        
        System.out.println("Total Penumpang: " + getCurrentPassengers());
        System.out.println("Total Pemberhentian: " + stop);
        System.out.println("Tarif per halte: Rp " + FAREstop);
        System.out.println("Total tarif perjalanan: Rp " + fare);
    }
}