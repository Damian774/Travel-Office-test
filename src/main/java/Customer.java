public class Customer {
    private String name;
    private Address address;
    private Trip trip;

    @Override
    public String toString() {
        return "Client name: "+name+"\nClient Address: "+address.toString()+"\nTrip: "+trip.toString();
    }

    public String getName() {
        return name;
    }

    public Customer(String name){
        this.name=name;
    }

    public void setAddress(Address address){
        this.address=address;
    }

    public void assignTrip(Trip trip){
        this.trip=trip;
    }


}
