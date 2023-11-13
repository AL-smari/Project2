public class SubscribersPassenger extends Passenger{
    public SubscribersPassenger(String name, String ID) {
        super(name, ID);
    }

    @Override
    public void cost(Car car) throws Exception {
        setCar(car);

        if(car.getMaximumCapacity()<=0){
            throw new Exception("zero capacity");
        }
        double price = car.getRoute().getPrice();
        car.setMaximumCapacity(car.getMaximumCapacity()-1);
        setTripCost(price-price*0.5);

    }
    public void display(){
        try {


        System.out.println("Passenger name: "+getName()+"\nPassenger ID: "+getID()+"\nCar info: "+getCar().getCode()+"\nprice: "+getTripCost()+"\n");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
