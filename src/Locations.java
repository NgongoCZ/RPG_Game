public class Locations {

    private String nameOfLocation;
    private String region;
    private int threatLevel;

    public Locations(String nameOfLocation, String region, int threatLevel){
        this.nameOfLocation = nameOfLocation;
        this.region = region;
        this.threatLevel = threatLevel;
    }

    public String getNameOfLocation(){
        return this.nameOfLocation;
    }

    public String getRegion(){
        return this.region;
    }

    public int getThreatLevel(){
        return this.threatLevel;
    }

    @Override
    public String toString(){
        return "Location name: " + this.nameOfLocation + ", Region : " + this.region + ", Threat level: " + this.threatLevel;
    }

}
