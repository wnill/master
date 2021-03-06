package de.unihohenheim.wi.master.core;
import java.util.LinkedList;
import java.util.List;


public class Auctioneer {

  public static void main(String[] args) {
    Truck truck = new Truck(1, 10, 10);
    LinkedList<Delivery> request = new LinkedList<>();
    // truck.blockSlot(20, 50);
    request.add(new Delivery(1, 10));
    request.add(new Delivery(2, 30));

    truck.blockSlot(40, 60);
    request.add(new Delivery(3, 50));
    request.add(new Delivery(4, 70));
    List<Bid> bids = truck.makeBids(request);
    System.out.println("Truck offers " + bids.size() + " bids: ");
    for (Bid bid : bids) {
      System.out.println(bid);
    }

  }

}
