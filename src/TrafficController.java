
    import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
    import java.util.function.Predicate;

    public class TrafficController {
    public static Predicate<Vehicle> controlTraffic(Vehicle vehicle, Intersection intersection) {
            BiPredicate<Vehicle, Intersection> mustStop = (v, i) -> i.getCurrentLight().equals("RED") &&(!v.isAutonomous() ||v.equals(v.getIsEmergency()));
        System.out.println(mustStop);

            BiConsumer<Vehicle, Intersection> action = (v, i) -> {

                if (mustStop.test(v, i)) {
                            System.out.println(i.getIntersectionId() + ": Vehicle " + v.getId() + " commanded to STOP.");
                        } else {
                            System.out.println(
                                    i.getIntersectionId() + ": Vehicle " + v.getId() + " routing THROUGH."
                            );
                        }
                    };
        action.accept(vehicle,intersection);
        return controlTraffic(vehicle,intersection);


    }
    }

