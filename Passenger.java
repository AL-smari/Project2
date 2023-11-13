public abstract class Passenger {
    private String name;
    private String ID;
    private double tripCost;
    private Car car;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;

    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public abstract void cost (Car car) throws Exception;
    public void display() {
        try {


            System.out.println("Passenger name: " + getName() + "\nPassenger ID: " + getID() + "\nCar info: " + car.getCode() + "\nprice: "+tripCost+"\n" );
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
