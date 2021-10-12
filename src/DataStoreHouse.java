import java.util.ArrayList;

public class DataStoreHouse {

    static ArrayList<Band> bandData = new ArrayList<>();
    static ArrayList<Event> eventData = new ArrayList<>();
    static ArrayList<EventManager> eventManagerData = new ArrayList<>();
    static ArrayList<Contract> contractData = new ArrayList<>();
    static ArrayList<Program> programData = new ArrayList<>();


    //add a newly created band to the bandData arraylist
    public static void addBand(Band newBand){ bandData.add(newBand); }

    //* add a newly created event to the eventData arraylist
    public static void addEvent(Event newEvent) {
        eventData.add(newEvent);
    }

    //add an event manager to the eventManagerData arraylist
    public static void addEventManager(EventManager newEventManager) {
    eventManagerData.add(newEventManager);
    }

    //add a contract to the contractData arraylist
    public static void addContract(Contract newContract) {
        contractData.add(newContract);
    }

    // add a program to the program data
    public static void addProgram(Program newProgram){
        programData.add(newProgram);
    }

    //print list of all band with all data
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

    //method ot print a list of event manager and their data
    public static void printListOfAllEventManager(){
        System.out.println("Manager Id \t Manager Name\t\t\t Manager  Address and Contact");
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

    // print list of all events with all data
    public static void printListOfAllEvents(){
        System.out.println("Event Id. \t Event Name \t Address \t Time \t\t\t Band Id");
        for (int i = 0; i < DataStoreHouse.eventData.size(); i++) {
            Event individualEventInEventData =  DataStoreHouse.eventData.get(i);
            System.out.print(individualEventInEventData.getId()+"\t\t\t\t");
            System.out.print(individualEventInEventData.getName()+"\t\t\t");
            System.out.print(individualEventInEventData.getAddress()+"\t\t\t");
            System.out.print(individualEventInEventData.getEventStartAndFinishTime()+"\t\t\t");
            int[] bandIds = individualEventInEventData.getBandIds();
            for (int  bandid: bandIds) {
                System.out.print(bandid+", ");
            }
            System.out.print(individualEventInEventData.getEventManagerId());
            System.out.println();
        }
    }

    //print list of all contracts
    public static void printListOfAllContract(){
        System.out.println("Contract No. \t Band Id \t Manager Id \t Price \t\t\t Contract Detail");
        for (int i = 0; i < DataStoreHouse.contractData.size(); i++) {
            Contract contractInEventData =  DataStoreHouse.contractData.get(i);
            System.out.print(contractInEventData.getId()+"\t\t\t\t\t");
            System.out.print(contractInEventData.getBandId()+"\t\t\t");
            System.out.print(contractInEventData.getEventManagerId()+"\t\t\t");
            System.out.print(contractInEventData.getContractPrice()+"\t\t\t");
            System.out.print(contractInEventData.getContractDetail()+"\t");
            System.out.println();
        }
    }

    // print list of all program
    public static void printListOfAllProgram(){
        System.out.println("Program Id \t Event Id \t Event manager Id \t Program Detail");
        for (int i = 0; i < DataStoreHouse.programData.size(); i++) {
            Program programInProgramData =  DataStoreHouse.programData.get(i);
            System.out.print(programInProgramData.getId()+"\t\t\t\t");
            System.out.print(programInProgramData.getEventId()+"\t\t\t");
            System.out.print(programInProgramData.getEventManagerId()+"\t\t\t\t");
            System.out.print(programInProgramData.getProgramDetail());
            System.out.println();
        }
    }


} // end of class
