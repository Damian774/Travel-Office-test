import java.util.*;

public class MainHandler implements UserInterface {

    private TravelOffice travelOffice;
    private boolean shouldExit;
    private Scanner scanner;

    MainHandler() {
        travelOffice = new TravelOffice();
        boolean shouldExit = false;
        scanner = new Scanner(System.in);

    }

    public void startGui() {
        do {
            System.out.println(
                    "\n\t1.Add client\n\t2.Add trip\n\t3.Assign trip to client\n\t4.Remove client\n\t5.Remove trip\n\t6.Show clients\n\t7.Show trips\n\t8.Exit\n"
            );


            System.out.print("Your pick: ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    addClient();

                    break;
                case 2:
                    addTrip();

                    break;
                case 3:
                    assignTrip();

                    break;
                case 4:
                    removeClient();
                    break;
                case 5:
                    removeTrip();
                    break;
                case 6:
                    showClients();
                    break;
                case 7:
                    showTrips();
                    break;
                case 8:
                    exit();

                    break;
            }

        } while (shouldExit == false);

    }


    @Override
    public void addClient() {
        System.out.print("Client name: ");
        travelOffice.addCustomer(new Customer(scanner.nextLine()));
    }

    @Override
    public void addTrip() {
        System.out.println("Trip type: \n\t1.Abroad\n\t2.Domestic");
        int pick = Integer.parseInt(scanner.nextLine());
        if ( pick == 1) {
            System.out.println("Trip name: ");
            String tripName = scanner.nextLine();
            System.out.println("Start date(year:month:day) :");
            Date startDate = Date.createDate(scanner.nextLine(), ":");
            System.out.println("End date(year:month:day) :");
            Date endDate = Date.createDate(scanner.nextLine(), ":");
            System.out.println("Trip destination: ");
            String dest = scanner.nextLine();
            System.out.println("Trip price: ");
            double tripPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Insurance price: ");
            double insuPrice = Double.parseDouble(scanner.nextLine());
            AbroadTrip abroadTrip = new AbroadTrip(startDate, endDate, dest, tripPrice, insuPrice);
            travelOffice.addTrip(tripName, abroadTrip);
        } else if (pick == 2) {
            System.out.println("Trip name: ");
            String tripName = scanner.nextLine();
            System.out.println("Start date(year:month:day) :");
            Date startDate = Date.createDate(scanner.nextLine(), ":");
            System.out.println("End date(year:month:day) :");
            Date endDate = Date.createDate(scanner.nextLine(), ":");
            System.out.println("Trip destination: ");
            String dest = scanner.nextLine();
            System.out.println("Trip price: ");
            double tripPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Discount value: ");
            double discPrice = Double.parseDouble(scanner.nextLine());
            DomesticTrip domesticTrip = new DomesticTrip(startDate, endDate, dest, tripPrice, discPrice);
            travelOffice.addTrip(tripName, domesticTrip);
        }
    }

    @Override
    public void assignTrip() {
        System.out.println("Choose customer by name: ");
        String name = scanner.nextLine();
        Customer customer1 = travelOffice.findCustomerByName(name);
        System.out.println("Choose trip by name: ");
        String tripName = scanner.nextLine();
        Trip trip = travelOffice.findTripByName(tripName);
        customer1.assignTrip(trip);
    }

    @Override
    public void removeClient() {
        System.out.println("Choose customer by name: ");
        Customer customer2 = travelOffice.findCustomerByName(scanner.nextLine());
        travelOffice.removeCustomer(customer2);
    }

    @Override
    public void removeTrip() {
        System.out.println("Choose trip by name: ");
        travelOffice.removeTrip(scanner.nextLine());
    }

    @Override
    public void showClients() {
        System.out.println(travelOffice.toString());
    }

    @Override
    public void showTrips() {
        for (HashMap.Entry entry : travelOffice.getAllTrips().entrySet()) {
            String key = (String) entry.getKey();
            Trip value = (Trip) entry.getValue();
            System.out.println(key + value.toString());

        }
    }

    @Override
    public void exit() {
        shouldExit = true;
    }

}
