public class Route {
    private String pickUpAddress;
    private String destinationAddress;
    private double price;

    public Route(String pickUpAddress, String destinationAddress, double price) {
        this.pickUpAddress = pickUpAddress;
        this.destinationAddress = destinationAddress;
        this.price = price;
    }

    public String getPickUpAddress() {
        return pickUpAddress;
    }

    public void setPickUpAddress(String pickUpAddress) {
        this.pickUpAddress = pickUpAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
