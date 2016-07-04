public abstract class Cake implements Product{
    private String name;
    private int numOfFork;

    public Cake(){}
    public Cake(String name, int numOfFork)
    {
        this.name = name;
        this.numOfFork = numOfFork;
    }

    public abstract void serve();
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setNumOfFork(int numOfFork) { this.numOfFork = numOfFork; }
    public int getNumOfFork() { return numOfFork; }
}
