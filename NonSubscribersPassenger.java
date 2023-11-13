public class NonSubscribersPassenger extends Passenger{
    private Boolean coupon;

    public NonSubscribersPassenger(String name, String ID,boolean coupon) {
        super(name, ID);
        this.coupon=coupon;
    }

    public Boolean getCoupon() {
        return coupon;
    }

    public void setCoupon(Boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public void cost(Car car) throws Exception{
        setCar(car);
        if(car.getMaximumCapacity()<=0){
            throw new Exception("zero capacity");
        }
        double price = car.getRoute().getPrice();
        car.setMaximumCapacity(car.getMaximumCapacity()-1);
        if(coupon) {

            setTripCost(price - price * 0.1);
        }else setTripCost(price);

    }
    public void display() {
        try {


            System.out.println("Passenger name: " + getName() + "\nPassenger ID: " + getID() + "\nCar info: " + getCar().getCode() + "\nprice: " + getTripCost()+"\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
