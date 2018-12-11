
public abstract class Trip {
    private Date start;
    private Date end;
    private String destination;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Trip(Date start, Date end, String destination, double price){
        this.start = start;
        this.end = end;
        this.destination=destination;
        this.price=price;
    }

    @Override
    public String toString() {
        return "start: "+start.toString()+" end: "+end.toString()+" destination: "+destination+" price: "+getPrice();
    }
}
