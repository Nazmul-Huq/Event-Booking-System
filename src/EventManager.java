public class EventManager extends SuperClass{
    private String eventManagerContact;

    public EventManager(int id, String name, String address, String eventManagerContact) {
        super(id, name, address);
        this.eventManagerContact = eventManagerContact;
    }

    public String getEventManagerContact(){
        return this.eventManagerContact;
    }

    @Override
    public String toString() {
        return "EventManager{" +
                super.toString() +
                "eventManagerContact='" + eventManagerContact + '\'' +
                "} " ;
    }
}
