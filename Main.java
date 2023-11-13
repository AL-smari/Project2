import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Route r1 =new Route("1233","1324",40);
        Route r2 =new Route("1341","1765",70);
        Car c1 = new Car("114144",r1,0);
        Car c2 = new Car("491572",r2,5);


    Passenger p1 = new SubscribersPassenger("abdulaziz","6421");
    Passenger p2 = new SubscribersPassenger("khalid","1411");
    Passenger p3 = new SubscribersPassenger("fahd","9852");


    Passenger p4 = new NonSubscribersPassenger("nasser","4252",false);
    Passenger p5 = new NonSubscribersPassenger("maher","8493",true);



        ArrayList<Passenger>passengers = new ArrayList<>();
        passengers.add(p1);
        passengers.add(p2);
        passengers.add(p3);
        passengers.add(p4);
        passengers.add(p5);

        for(Passenger p:passengers){
            try {
                p.cost(c2);
                p.display();
                p.cost(c1);
                p.display();


            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }










    }
}