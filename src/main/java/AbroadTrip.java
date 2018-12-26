public class AbroadTrip extends Trip {
    private double insurance;

    public AbroadTrip(Date start, Date end, String destination, double price, double insurance) {
        super(start, end, destination, price);
        this.insurance = insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice()+getInsurance();
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return super.toString()+"insurance: "+getInsurance();
    }
}
