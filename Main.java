package praktic.inheritance.mains;

import praktic.inheritance.transportation.Bus;
import praktic.inheritance.transportation.Taxi;
import praktic.inheritance.transportation.Train;

public class Main {
    public static void main(String[] args) {
        Bus Bus = new Bus("Metro bus", 50, "Terminal A - Terminal B");
        Taxi Taxi = new Taxi("Uber taxi", 4, "Bandara - Hotel");
        Train Train = new Train("KRL", 200, "Stasiun Kota - Stasiun Pusat");


        Bus.startJourney();
        Bus.boardPassengers(30);
        Bus.boardPassengers(20);
        Bus.getCurrentPassengers();
        Bus.calcualteFare(5);
        Bus.endJourney();
        Bus.dropPassengers(40);
        System.out.println();
        System.out.println("--------------------------------------------------");

        Train.startJourney();
        Train.boardPassengers(150);
        Train.calcualteFare();
        Train.endJourney();
        Train.dropPassengers(150);
        System.out.println();
        System.out.println("--------------------------------------------------");

        Taxi.startJourney();
        Taxi.boardPassengers(3);
        Taxi.calcualteFare(10);
        Taxi.endJourney();
        Taxi.dropPassengers(3);
        System.out.println();
        System.out.println("--------------------------------------------------");

        Bus.startJourney();
        Bus.boardPassengers(30);
        Bus.boardPassengers(100);
        Bus.getCurrentPassengers();
        Bus.calcualteFare(5);
        Bus.endJourney();
        Bus.dropPassengers(30);
        Bus.dropPassengers(30);
        System.out.println();
        System.out.println("--------------------------------------------------");

        Train.startJourney();
        Train.boardPassengers(150);
        Train.boardPassengers(300);
        Train.calcualteFare();
        Train.endJourney();
        Train.dropPassengers(150);
        Train.dropPassengers(150);
        System.out.println();
        System.out.println("--------------------------------------------------");

        Taxi.startJourney();
        Taxi.boardPassengers(3);
        Taxi.boardPassengers(10);
        Taxi.calcualteFare(10);
        Taxi.endJourney();
        Taxi.dropPassengers(3);
        Taxi.dropPassengers(3);
        System.out.println();
        System.out.println("--------------------------------------------------");
    }
}