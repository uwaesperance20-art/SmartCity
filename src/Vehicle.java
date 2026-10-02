public class Vehicle {

   private String id;
   private int speedKmh;
   private String type;
   private boolean isAutonomous;
   private String isEmergency;

    public Vehicle(String id, int speedKmh, String type, boolean isAutonomous) {
        this.id = id;
        this.speedKmh = speedKmh;
        this.type = type;
        this.isAutonomous = isAutonomous;
        this.isEmergency=isEmergency;
    }

    public String getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(String isEmergency) {
        this.isEmergency = isEmergency;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSpeedKmh() {
        return speedKmh;
    }

    public void setSpeedKmh(int speedKmh) {
        this.speedKmh = speedKmh;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAutonomous() {
        return isAutonomous;
    }

    public void setAutonomous(boolean autonomous) {
        isAutonomous = autonomous;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", speedKmh=" + speedKmh +
                ", type='" + type + '\'' +
                ", isAutonomous=" + isAutonomous +
                '}';
    }
}
