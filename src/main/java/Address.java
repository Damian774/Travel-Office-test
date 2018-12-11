public class Address {
    private String street;
    private String zip;

    @Override
    public String toString() {
        return "Street: "+street+" zip: "+zip+" city: "+city;
    }

    private String city;

    public Address(String street,String zip,String city){
        this.street = street;
        this.zip=zip;
        this.city=city;
    }



}
