
public class Band extends SuperClass{

    public Band(int id, String name, String address) {
        super(id, name, address);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String toString() {
        return "Band " + super.toString() +"\n";
    }
}
