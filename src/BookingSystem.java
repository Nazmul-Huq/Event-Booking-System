import java.util.ArrayList;
import java.util.Scanner;

public class BookingSystem{
    static Scanner scanner = new Scanner(System.in);
    static final String COMPANY_ADDRESS = "Hundige bygade 00, 2670, Greve";
    public static void main(String[] args) {

        addSomeBandsToDataStoreHouse(); // add some bands to the Data Store house to start with
        addSomeEventsToEventData(); // add some events to the Data Store house to start with
        add5EventManager(); // add five event manager to the data store house to start with
        addSomeContract(); // will add some contracts to the data store house to start with
        addSomeProgram(); // add some program to the data store house to start with

        //DataStoreHouse.printListOfAllBand(); // print a list of all band
        //DataStoreHouse.printListOfAllEvents(); // print a list of all events
        //DataStoreHouse.printListOfAllEventManager(); // print a list of all event manager
        //DataStoreHouse.printListOfAllContract(); // will print a list of all contract
        //System.out.println(DataStoreHouse.programData);



        //int choseATask = getTask();
        //startTask(choseATask);

        while (true){
            int taskToDo = getAddOrUpdateOrView(); //ask what the booking manager wants to do and get the choice as integer
            startTask(taskToDo); // start the chosen task
            if (quitBookingSystem().equals("q")) { break; } // exit the booking system by entering "q"
        }
    } // end of main

    public static void startTask(int taskToDo){
        if (taskToDo == 1) { // create and add something to the data store house
            int whatToAdd = getWhatToAdd();
            createAndAdd(whatToAdd);
        } else if (taskToDo == 2) {
            int whatToUpdate = getWhatToUpdate();
            updateData(whatToUpdate);
        } else if (taskToDo == 3) { // view list of different data
            int whatToView = getWhatToView();
            viewChosenData(whatToView);
        } else {
            System.out.println("Something went wrong, please restart the program");
        }
    }

    //get users choice to add, create that choice, add it to the data store house
    //give message if added successfully and show the data that was added
    public static void createAndAdd(int whatToAdd){
        switch (whatToAdd){
            case 1: // add Band
                Band newBand = createNewBand(); // call to create an event and get it back
                DataStoreHouse.addBand(newBand); // add band to data store house
                System.out.println("Following has been added successfully to the data store house");
                System.out.println(DataStoreHouse.bandData.get(DataStoreHouse.bandData.size()-1)); // print the last added band data
                break;
            case 2: //add Event
                Event newEvent = createNewEvent(); // call to create an event and get it back
                DataStoreHouse.addEvent(newEvent);
                System.out.println("Following has been added successfully to the data store house");
                System.out.println(DataStoreHouse.eventData.get(DataStoreHouse.eventData.size()-1)); // print the last added event data
                break;
            case 3: // add Contract
                Contract newContract = createNewContract();
                DataStoreHouse.addContract(newContract);
                System.out.println("Following has been added successfully to the data store house");
                System.out.println(DataStoreHouse.contractData.get(DataStoreHouse.contractData.size()-1)); // print the last added contract data
                break;
            case 4: // add Event Manager
                EventManager newEventManager = createNewEventManager();
                DataStoreHouse.addEventManager(newEventManager);
                System.out.println("Following has been added successfully to the data store house");
                System.out.println(DataStoreHouse.eventManagerData.get(DataStoreHouse.eventManagerData.size()-1)); // print the last added event manager data
                break;
            case 5: // add Program
                Program newProgram = createNewProgram();
                DataStoreHouse.addProgram(newProgram);
                System.out.println("Following has been added successfully to the data store house");
                System.out.println(DataStoreHouse.programData.get(DataStoreHouse.programData.size()-1)); // print the last added program data
                break;

            default:break;
        }

    }

    public static void updateData(int whatToUpdate){
        switch (whatToUpdate) {
            case 1: // update a Band
                break;
            case 2: //update an Event
                /*
                int idOfDataToUpdate = 3;
                checkIfIdExist(whatToUpdate, idOfDataToUpdate);

                for (int i = 0; i < 1; i++) {
                    Event individualEventInEventData =  DataStoreHouse.eventData.get(i);
                    int eventIdInEventData = individualEventInEventData.getId();
                    if (eventIdInEventData == idOfDataToUpdate) {
                        System.out.println("Found");
                    } else{
                        System.out.println("Given id do not exist");
                        System.out.println();
                    }

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

                 */
                break;
            case 3: // update a Contract
                break;
            case 4: // update an Event Manager
                break;
            case 5: // update a Program
                break;
            default:break;
        }
    }

    public static void checkIfIdExist(int whatToUpdate, int idOfDataToUpdate){
        switch (whatToUpdate) {
            case 1: // update a Band
                break;
            case 2: //update an Event
                break;
            case 3: // update a Contract
                break;
            case 4: // update an Event Manager
                break;
            case 5: // update a Program
                break;
            default:break;
        }



    }

    //???????? retrieve data from data store house and print it
    public static void viewChosenData(int whatToView){
        switch (whatToView) {
            case 1: // view Band
                System.out.println(DataStoreHouse.bandData);
                //DataStoreHouse.printListOfAllBand(); // print a list of all band
                break;
            case 2: //view Event
                DataStoreHouse.printListOfAllEvents(); // print a list of all events
                break;
            case 3: // view Contract
                DataStoreHouse.printListOfAllContract(); // will print a list of all contract
                break;
            case 4: // view Event Manager
                DataStoreHouse.printListOfAllEventManager(); // print a list of all event manager
                break;
            case 5: // view Program
                System.out.println(DataStoreHouse.programData);
                break;
            default:break;
        }
    }

    //create a new  program and return it
    public static Program createNewProgram() {
       System.out.println("what is program id");
       int programId = Integer.parseInt(scanner.nextLine());
       System.out.println("what is event id");
       int eventId = Integer.parseInt(scanner.nextLine());
       System.out.println("Enter event manager id");
       int eventManagerId = Integer.parseInt(scanner.nextLine());
       System.out.println("write program detail");
       String  programDetail = scanner.nextLine();

       Program newProgram = new Program(programId, eventId, eventManagerId, programDetail);
       return newProgram;
   }

    //create a new event manager and return it
    public static EventManager createNewEventManager(){
        System.out.println("what is event manager id");
        int eventManagerId = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter event manager name");
        String eventManagerName = scanner.nextLine();
        System.out.println("Enter event manager contract detail");
        String eventManagerContact = scanner.nextLine();

        EventManager newEventManager = new EventManager(eventManagerId, eventManagerName, COMPANY_ADDRESS, eventManagerContact);
        return newEventManager;
    }

    //create a new  contract and return it
    public static Contract createNewContract(){
        System.out.println("what is contract id");
        int contractId = Integer.parseInt(scanner.nextLine());
        System.out.println("what is band id");
        int bandId = Integer.parseInt(scanner.nextLine());
        System.out.println("what is event manager id");
        int eventManagerId = Integer.parseInt(scanner.nextLine());
        System.out.println("what is contract price");
        double contractPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter contract detail");
        String contractDetail = scanner.nextLine();
        Contract newContract = new Contract(contractId, bandId, eventManagerId, contractPrice, contractDetail);
        return newContract;
    }

    //create a new  event and return it
    public static Event createNewEvent(){
        System.out.println("what is event id");
        int eventId = Integer.parseInt(scanner.nextLine());
        System.out.println("What is event name");
        String eventName = scanner.nextLine();
        System.out.println("Please enter Event Address");
        String eventAddress = scanner.nextLine();
        System.out.println("Event start and finish time");
        String eventStartAndFinishTime = scanner.nextLine();
        System.out.println("what is band id? Can add up to  5 bands.");
        int[] bandIds = new int[5]; // up to 5 bands can be added to an event
        for (int i = 0; i < bandIds.length; i++) { // ask and get band id 5 times
            int bandId = Integer.parseInt(scanner.nextLine());
            bandIds[i] = bandId;
            System.out.println("Add another Band. Enter 0 if you do not want to add another band");
        }
        System.out.println("what is Event Manager Id");
        int eventManagerId = Integer.parseInt(scanner.nextLine());

        Event newEvent = new Event(eventId, eventName, eventAddress, eventStartAndFinishTime, bandIds, eventManagerId);
        return newEvent;
    }

    //create a new band and return it
    public static Band createNewBand(){
        System.out.println("what is band id");
        int bandId = Integer.parseInt(scanner.nextLine());
        System.out.println("What is band name");
        String bandName = scanner.nextLine();
        System.out.println("Please enter Address");
        String bandAddress = scanner.nextLine();
        Band newBand = new Band(bandId, bandName, bandAddress);
        return newBand;
    }

    // ask if user like to add or update or see a list of data and return the choice
    public static int getAddOrUpdateOrView(){
        int choseAddOrUpdateOrView = 0;
        do {
            System.out.println("Type: 1-add new Band/Event/Contract/Event Manager");
            System.out.println("Type: 2-Update existing Band/Event/Contract/Event Manager");
            System.out.println("Type: 3-View list of all Bands/Events/Contracts/Event Manager");
            String input = scanner.nextLine();
            try {
                choseAddOrUpdateOrView = Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println( "Sorry that input is not valid, please choose a number from 1-3");
            }
        } while((choseAddOrUpdateOrView > 3 || choseAddOrUpdateOrView < 1));
        return choseAddOrUpdateOrView;
    }

    // and get what kind of dat user like to update
    public static int getWhatToUpdate(){
        int choseWhatToUpdate = 0;
        do {
            System.out.println("Chose one from below list to update");
            System.out.println("Type: 1-Band, 2-Event, 3-Contract, 4-Event Manager, 5-Program");
            String input = scanner.nextLine();
            try {
                choseWhatToUpdate = Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println( "Sorry that input is not valid, please choose a number from 1-5");
            }
        } while((choseWhatToUpdate > 5 || choseWhatToUpdate < 1));
        return choseWhatToUpdate;
        }

    //ask what user like to add and return the choice
    public static int getWhatToAdd(){
        int choseWhatToAdd = 0;
        do {
            System.out.println("Chose from below list to creat and add in Data Store House");
            System.out.println("Type: 1-Band, 2-Event, 3-Contract, 4-Event Manager, 5-Program");
            String input = scanner.nextLine();
            try {
                choseWhatToAdd = Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println( "Sorry that input is not valid, please choose a number from 1-5");
            }
        } while((choseWhatToAdd > 5 || choseWhatToAdd < 1));
        return choseWhatToAdd;
    }

    //ask and decide what ot view from data store house and return the choice
    public static int getWhatToView(){
        int choseWhatToView = 0;
        do {
            System.out.println("Chose from below list to see a list of data");
            System.out.println("Type: 1-Band, 2-Event, 3-Contract, 4-Event Manager, 5-Program");
            String input = scanner.nextLine();
            try {
                choseWhatToView = Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println( "Sorry that input is not valid, please choose a number from 1-5");
            }
        } while((choseWhatToView > 5 || choseWhatToView < 1));
        return choseWhatToView;
    }

    //if q is typed, this method will break the while loop in main and exit the booking system
    public static String quitBookingSystem(){
        System.out.println("c to continue, q to exit booking system");
        String quitOrContinue = scanner.nextLine();
        return quitOrContinue;
    }

    //add some bands to start with, so it will be easy to test different functions
    public static void addSomeBandsToDataStoreHouse(){
        Band newBand1 = new Band(1, "Coldplay", "Copenhagen, Denmark");
        DataStoreHouse.addBand(newBand1);
        Band newBand2 = new Band(2, "The Beatles", "Stockholm, Sweden");
        DataStoreHouse.addBand(newBand2);
        Band newBand3 = new Band(3, "All Female", "New York, USA");
        DataStoreHouse.addBand(newBand3);
        Band newBand4 = new Band(4, "Red Bull", "London, UK");
        DataStoreHouse.addBand(newBand4);
        Band newBand5 = new Band(5, "Pink Floyd", "Los Angeles, USA");
        DataStoreHouse.addBand(newBand5);
        Band newBand6 = new Band(6, "Totally Black", "Berlin, Germany");
        DataStoreHouse.addBand(newBand6);
        Band newBand7 = new Band(7, "Vagabond", "Oslo, Norway");
        DataStoreHouse.addBand(newBand7);
        Band newBand8 = new Band(8, "Angels", "Rome, Italy");
        DataStoreHouse.addBand(newBand8);
    }

    //add some events to start with, so it will be easy to test different functions
    public static void addSomeEventsToEventData(){
        int[] event1Bands = {2, 7, 8};
        Event newEvent1 = new Event(1, "Farum", "Farum, Copenhagen", "20-10-2021:15:00", event1Bands, 0);
        DataStoreHouse.addEvent(newEvent1);
        int[] event2Bands = {1, 3, 5};
        Event newEvent2 = new Event(2, "Kongelige Theater", "Cental, Copenhagen", "20-10-2021:15:00", event2Bands, 1);
        DataStoreHouse.addEvent(newEvent2);
        int[] event3Bands = {0};
        Event newEvent3 = new Event(3, "Farum", "Farum, Copenhagen", "20-10-2021:15:00", event3Bands, 0);
        DataStoreHouse.addEvent(newEvent3);
    }

    //add few event manager to start with, so it will be easy to test different functions
    public static void add5EventManager(){
        EventManager newEventManager = new EventManager(1, "Peter Hansen", COMPANY_ADDRESS, "email: phansen@event.dk, phone: 00000000");
        DataStoreHouse.addEventManager(newEventManager);
        EventManager newEventManager2 = new EventManager(2, "Nazmul Huq", COMPANY_ADDRESS, "email: nazmulhuq@event.dk, phone: 00000000");
        DataStoreHouse.addEventManager(newEventManager2);
        EventManager newEventManager3 = new EventManager(3, "Oliver Jensen", COMPANY_ADDRESS, "email: ojensen@event.dk, phone: 00000000");
        DataStoreHouse.addEventManager(newEventManager3);
        EventManager newEventManager4 = new EventManager(4, "Peter Iversen", COMPANY_ADDRESS, "email: peversen@event.dk, phone: 00000000");
        DataStoreHouse.addEventManager(newEventManager4);
        EventManager newEventManager5 = new EventManager(5, "Olivia Frederiksen", COMPANY_ADDRESS, "email: ofrederiksen@event.dk, phone: 00000000");
        DataStoreHouse.addEventManager(newEventManager5);
    }

    //add some contracts to start with, so it will be easy to test different functions
    public static void addSomeContract(){
        Contract newContract1 = new Contract(1, 4, 3, 20000, "Contract detail of contract number 1");
        DataStoreHouse.addContract(newContract1);
        Contract newContract2 = new Contract(2, 2, 1, 15000, "Contract detail of contract number 2");
        DataStoreHouse.addContract(newContract1);
    }

    //add some programs to start with, so it will be easy to test different functions
    public static void addSomeProgram(){
        Program newProgram1 = new Program(1, 2, 3, "Kl 1700: Coldplay, Kl 1900: Vagabond");
        DataStoreHouse.addProgram(newProgram1);
        Program newProgram2 = new Program(2, 1, 5, "Kl 1900: All Female, Kl 2100: Red Bull");
        DataStoreHouse.addProgram(newProgram2);
    }
}

