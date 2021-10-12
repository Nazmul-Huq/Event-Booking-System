public abstract class SuperClass {
    private int id;
    private String name;
    private String address;

    public SuperClass(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public SuperClass(int id){
        this.id = id;
    }



    public int getId(){return this.id;}
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
