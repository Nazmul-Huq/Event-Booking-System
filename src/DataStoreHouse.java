import java.util.ArrayList;

public class DataStoreHouse {

    static ArrayList<Band> bandData = new ArrayList<>();
    static ArrayList<Event> eventData = new ArrayList<>();
    static ArrayList<EventManager> eventManagerData = new ArrayList<>();
    static ArrayList<Contract> contractData = new ArrayList<>();
    static ArrayList<Program> programData = new ArrayList<>();


    /*
    * add a newly created band to the bandData arraylist
     */
    public static void addBand(Band newBand){
        bandData.add(newBand);

    }

    /*
     * add a newly created event to the eventData arraylist
     */
    public static void addEvent(Event newEvent) {
        eventData.add(newEvent);
    }

    /*
     * add an event manager to the eventManagerData arraylist
     */
    public static void addEventManager(EventManager newEventManager) {
    eventManagerData.add(newEventManager);
    }

    /*
     * add a contract to the contractData arraylist
     */
    public static void addContract(Contract newContract) {
        contractData.add(newContract);
    }

    public static void addProgram(Program newProgram){
        programData.add(newProgram);
    }


    /*
    * print list of all band with all data
     */
    public static void printListOfAllBand(){
        System.out.println("Id\tBand Name\t\t\tBand Address");
        for (int i = 0; i < DataStoreHouse.bandData.size(); i++) {
            Band individualBandInBandData =  DataStoreHouse.bandData.get(i);
            System.out.print(individualBandInBandData.getId());
            System.out.print("\t");
            System.out.print(individualBandInBandData.getName());
            System.out.print("\t\t\t");
            System.out.print(individualBandInBandData.getAddress());
            System.out.println();
        }
    }

    /*
    * method ot print a list of event manager and their data
     */
    public static void printListOfAllEventManager(){
        System.out.println("Id\tBand Name\t\t\tBand Address");
        for (int i = 0; i < DataStoreHouse.eventManagerData.size(); i++) {
            EventManager individualManagerInEventManagerData =  DataStoreHouse.eventManagerData.get(i);
            System.out.print(individualManagerInEventManagerData.getId());
            System.out.print("\t");
            System.out.print(individualManagerInEventManagerData.getName());
            System.out.print("\t\t\t");
            System.out.print(individualManagerInEventManagerData.getAddress());
            System.out.print("\t");
            System.out.print(individualManagerInEventManagerData.getEventManagerContact());
            System.out.println();

        }
    }

    /*
    * print list of all events with all data
     */
    public static void printListOfAllEvents(){
        for (int i = 0; i < DataStoreHouse.eventData.size(); i++) {
            Event individualEventInEventData =  DataStoreHouse.eventData.get(i);
            System.out.print(individualEventInEventData.getId()+"\t");
            System.out.print(individualEventInEventData.getName()+"\t");
            System.out.print(individualEventInEventData.getAddress()+"\t");
            System.out.print(individualEventInEventData.getEventStartAndFinishTime()+"\t");
            int[] bandIds = individualEventInEventData.getBandIds();
            for (int  bandid: bandIds) {
                System.out.print(bandid+", ");
            }
            System.out.print(individualEventInEventData.getEventManagerId()+"\t");
            System.out.println();
        }
    }

    /*
     * print list of all contracts
     */
    public static void printListOfAllContract(){
        for (int i = 0; i < DataStoreHouse.contractData.size(); i++) {
            Contract contractInEventData =  DataStoreHouse.contractData.get(i);
            System.out.print(contractInEventData.getId()+"\t");
            System.out.print(contractInEventData.getBandId()+"\t");
            System.out.print(contractInEventData.getEventManagerId()+"\t");
            System.out.print(contractInEventData.getContractDetail()+"\t");
            System.out.print(contractInEventData.getContractPrice()+"\t");
            System.out.println();
        }
    }



    public static int getIndexOfBandFromBandData(String bandName) {
        int arrayIndex = -1;
        for (int i = 0; i < bandData.size(); i++) {
            Band individualBandInBandData =  bandData.get(i);
            String bandNameInBandData = individualBandInBandData.getName();
            if (individualBandInBandData.equals(bandName)) {
                arrayIndex = i;
            }
        }
        return arrayIndex;
    }





    /*
    ???????? may be use later
     static ArrayList<ArrayList<String>> bandData = new ArrayList<>();
        public static void addBand(Band newBand) {
        String id = Integer.toString(newBand.getId());
        String name = newBand.getName();
        String address = newBand.getAddress();
        ArrayList<String> row = new ArrayList<String>();
        row.add(id);
        row.add(name);
        row.add(address);
        bandData.add(row);
    }
     */

} // end of class
