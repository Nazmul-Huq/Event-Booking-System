public class Program extends SuperClass{

    private int eventId;
    private int eventManagerId;
    private String programDetail;

    public Program(int id, int eventId, int eventManagerId, String programDetail) {
        super(id);
        this.eventId = eventId;
        this.eventManagerId = eventManagerId;
        this.programDetail = programDetail;
    }

    public int getEventId(){
        return this.eventId;
    }

    public int getEventManagerId(){
        return this.eventManagerId;
    }

    public String getProgramDetail(){
        return this.programDetail;
    }

    @Override
    public String toString() {
        return "Program{" +
                "eventId=" + eventId +
                ", eventManagerId=" + eventManagerId +
                ", programDetail='" + programDetail + '\'' +
                "} " + super.toString();
    }
}
