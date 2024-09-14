import java.util.ArrayList;

public class Map_Creation {

    private ArrayList<Locations>map;
    private int numOfLocations;

    public Map_Creation(){
        this.map = new ArrayList<>();
        this.numOfLocations = 0;
    }

    public void addLocation(Locations location){
        if (location != null){
            map.add(location);
            numOfLocations++;
        }else {
            System.out.println("No usable location");
        }
    }


    public String toString(){
        String returnLocation = "";
        for (Locations location : map){
            returnLocation = returnLocation + location +"\n";
        }
        return returnLocation;
    }

}
