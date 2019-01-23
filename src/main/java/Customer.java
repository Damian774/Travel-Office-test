import java.io.Serializable;

public class Customer  implements Serializable {
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
        this.address= new Address("sample_street","sample_zip","sample_city");
        this.trip= new AbroadTrip(Date.createDate("1:1:2018",":"),Date.createDate("10:10:2018",":"),"sample_destination",1500.50,150);
    }

    public void setAddress(Address address){
        this.address=address;
    }

    public void assignTrip(Trip trip){
        this.trip=trip;
    }


}
