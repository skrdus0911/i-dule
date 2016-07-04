public abstract class Beverage implements Product{
    private String name;
    private boolean size;  //true: large size, false: small size

    public Beverage(){}
    public Beverage(String name, boolean size)
    {
        this.name = name;
        this.size = size;
    }

    public abstract void serve();
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setSize(boolean size) { this.size = size; }
    public boolean getSize() { return size; }
}
