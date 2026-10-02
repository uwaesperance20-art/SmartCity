import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[]args){

        Vehicle vehicle1=new Vehicle("well",1000,"AMBULANCE",true);
        Intersection intersection=new Intersection("done","GREEN",10);

      //EmergencyOverride sirenFirst=
        Predicate<Vehicle>sirenFirst=(v)->v.getType().equals("AMBULANCE");
        EmergencyOverride emergency = (v , i) -> (v.getType().equals("AMBULANCE") || v.getType().equals("POLICE")) && i.getCongestionLevel() > 7 ;
        System.out.println(emergency.shouldOverride(vehicle1 , intersection));

;

        Predicate<Vehicle>speedRule=RuleFactory.createSpeedLimitRule(10000);
        System.out.println(speedRule.test(vehicle1));

        Function<Intersection,Integer> SignalTiming=RuleFactory.calculateGreenLightDuration();
        System.out.println(SignalTiming.apply(intersection));

        Predicate<Vehicle>control=TrafficController.controlTraffic(vehicle1,intersection);
        System.out.println(control.test(vehicle1));
}
    }

