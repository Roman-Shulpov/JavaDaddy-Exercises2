package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task4_Season;

public enum Season {
    WINTER(-15.5),
    SPRING(10.0),
    SUMMER(25.0),
    FALL(8.5);

    private final double avgTemp;

    Season(double avgTemp) {
        this.avgTemp = avgTemp;
    }
    @Override
    public String toString() {
        return "Season: " + name() + ", Avg Temp: " + avgTemp + "°C";
    }
}
