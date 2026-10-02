public class Intersection {
   private String intersectionId;
    private String currentLight; //("RED", "YELLOW", "GREEN")
    private int congestionLevel; //1to 10

    public Intersection(String intersectionId, String currentLight, int congestionLevel) {
        this.intersectionId = intersectionId;
        this.currentLight = currentLight;
        this.congestionLevel = congestionLevel;
    }

    public String getIntersectionId() {
        return intersectionId;
    }

    public void setIntersectionId(String intersectionId) {
        this.intersectionId = intersectionId;
    }

    public String getCurrentLight() {
        return currentLight;
    }

    public void setCurrentLight(String currentLight) {
        this.currentLight = currentLight;
    }

    public int getCongestionLevel() {
        return congestionLevel;
    }

    public void setCongestionLevel(int congestionLevel) {
        this.congestionLevel = congestionLevel;
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "intersectionId='" + intersectionId + '\'' +
                ", currentLight='" + currentLight + '\'' +
                ", congestionLevel=" + congestionLevel +
                '}';
    }
}
