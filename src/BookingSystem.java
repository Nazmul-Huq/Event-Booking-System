import java.util.Scanner;

public class BookingSystem{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //addSomeBandsToMd(); // ???????? just to add some bands will delete later
        //System.out.println(DataStoreHouse.bandData);

        while (true){
            int taskToDo = getTask(); //ask what the booking manager wants to do and get the choice as integer
            startTask(taskToDo); // start the chosen task


            if (quitBookingSystem().equals("q")) { break; } // exit the booking system by entering "q"
        }


        //DataStoreHouse.addBand(newBand);
        //System.out.println(DataStoreHouse.bandData);

       // System.out.println("Index of 'All Female': "+DataStoreHouse.bandData.indexOf("Coldplay"));


    }

    public static void startTask(int taskToDo){
        switch (taskToDo){
            case 1: // add band
                Band newBand = createNewBand(); // create a new band first
                DataStoreHouse.addBand(newBand); // then add the newly created band to the DataStoreHouse
                break;
            default:break;
        }

    }

    public static Band createNewBand(){
        System.out.println("what is band id");
        int bandId = Integer.parseInt(scanner.nextLine());
        System.out.println("What is band name");
        String bandName = scanner.nextLine();
        Band newBand = new Band(bandId, bandName);
        return newBand;
    }

    //????? delete before submission
    public static void addSomeBands(){
        Band newBand1 = new Band(1, "Coldplay");
        DataStoreHouse.addBand(newBand1);
        Band newBand2 = new Band(2, "The Beatles");
        DataStoreHouse.addBand(newBand2);
        Band newBand3 = new Band(3, "All Female");
        DataStoreHouse.addBand(newBand3);
        Band newBand4 = new Band(4, "Led Zeppelin");
        DataStoreHouse.addBand(newBand4);
        Band newBand5 = new Band(5, "Pink Floyd");
        DataStoreHouse.addBand(newBand5);
    }

    //??? delete before submission
    public static void addSomeBandsToMd(){
        Band newBand1 = new Band(1, "Coldplay");
        DataStoreHouse.addBand(newBand1);
        Band newBand2 = new Band(2, "The Beatles");
        DataStoreHouse.addBand(newBand2);
        Band newBand3 = new Band(1, "All Female");
        DataStoreHouse.addBand(newBand3);
        Band newBand4 = new Band(1, "Led Zeppelin");
        DataStoreHouse.addBand(newBand4);
        Band newBand5 = new Band(1, "Pink Floyd");
        DataStoreHouse.addBand(newBand5);
    }

    /*
     *method to get user's choice of task, validate it and then return the task as integer
     */
    public static int getTask(){
        int taskToDo = 0;
        do {
            System.out.println("Type: 1-Add Band, 2-Add Event, 3-Add Contract");
            String input = scanner.nextLine();
            try {
                taskToDo = Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println( "Sorry that input is not valid, please choose a number from 1-3");
            }
        } while((taskToDo > 3 || taskToDo < 1));
        return taskToDo;
    }


    /*
     * if q is typed, this method will break the while loop in main and exit the booking system
     */
    public static String quitBookingSystem(){
        System.out.println("c to continue, q to exit booking system");
        String quitOrContinue = scanner.nextLine();
        return quitOrContinue;
    }
}

