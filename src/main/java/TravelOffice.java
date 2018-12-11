import java.util.*;

public class TravelOffice {

    private Set<Customer> customerSet;
    private Map<String, Trip> tripMap;

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Total clients [" + getCustomerCount() + "]\n\tClient list: ");
        int count = 1;
        for (Customer customer : customerSet) {
            info.append("\n\nClient number [").append(count).append("]\n\n").append(customer.toString());
            ++count;

        }
        return info.toString();
    }


    public TravelOffice() {
        customerSet = new HashSet<>();
        tripMap = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
        customerSet.add(customer);

    }

    public int getCustomerCount() {
        return customerSet.size();
    }

    void addTrip(String keyName, Trip tripName) {
        tripMap.put(keyName, tripName);
    }

    boolean removeTrip(String keyName) {
        if (tripMap.containsKey(keyName)) {
            tripMap.remove(keyName);
            return true;
        } else return false;

    }

    Customer findCustomerByName(String name) {
        Customer customer = new Customer("NON_EXISTENT");
        for (Customer element : customerSet) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return customer;
    }

    boolean removeCustomer(Customer customer) {
        for (Iterator<Customer> i = customerSet.iterator(); i.hasNext(); ) {
            Customer element = i.next();
            if (element.equals(customer)) {
                i.remove();
                return true;
            }
        }
        return false;
    }

    Set<Customer> getAllCustomers(){
        return customerSet;
    }

    Map<String,Trip> getAllTrips(){
        return tripMap;
    }


}





