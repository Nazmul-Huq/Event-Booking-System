import java.util.ArrayList;

public class DataStoreHouse{
    static ArrayList<ArrayList<String>> bandData = new ArrayList<>();
    static ArrayList<ArrayList<String>> eventData = new ArrayList<>();
    static ArrayList<ArrayList<String>> contractData = new ArrayList<>();




    public static void addBand(Band newBand){
        String name= newBand.getName();
        String id = Integer.toString(newBand.getBandId());
        ArrayList<String > row = new ArrayList<String >();
        row.add(id);
        row.add(name);
        bandData.add(row);
    }

    public static void addEvent(Event newEvent){

    }

    public static void addContract(Contract newContract){


    }

}
