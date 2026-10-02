import java.util.function.Function;
import java.util.function.Predicate;

public class RuleFactory {


        public static Predicate<Vehicle> createSpeedLimitRule(int maxSpeed){
            Predicate<Vehicle>vehiclePredicate=(v1)->v1.getSpeedKmh()>100;
            return vehiclePredicate;
        }

    public static Function<Intersection, Integer> calculateGreenLightDuration() {
            Function<Intersection,Integer>SignalTiming=(i1)-> i1.getCurrentLight().equals("GREEN")?i1.getCongestionLevel()-2:30;
        return SignalTiming;
    }

}
