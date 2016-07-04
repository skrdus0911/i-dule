public abstract class Coffee extends Beverage{
    private int numOfSpoons;

    public Coffee(){}
    public Coffee(String name, boolean size, int numOfSpoons)
    {
        super(name, size);
        this.numOfSpoons = numOfSpoons;
    }

    public abstract void serve();

    public int getNumOfSpoons() {
        return numOfSpoons;
    }
    public void setNumOfSpoons(int numOfSpoons) {
        this.numOfSpoons = numOfSpoons;
    }
}
