public class Machine {
    private final String name;
    private final Gumball gumball;
    private GumballInterface gumballInterface;

    private final GumballInterface hasQuarter;
    private final GumballInterface noQuarter;
    private final GumballInterface gumballSold;
    private final GumballInterface outOfGumball;
    private final GumballInterface winner;
    private final GumballInterface chooseFlavor;

    public Machine(String name, Gumball gumball) {
        this.name = name;
        this.gumball = gumball;

        this.hasQuarter = new HasQuater(this);
        this.noQuarter = new NoQuater(this);
        this.gumballSold = new GumballSold(this);
        this.winner = new Winner(this);
        this.chooseFlavor = new ChooseFlavor(this);
        this.outOfGumball = new OutOfGumball();

        this.gumballInterface = noQuarter;
    }

    public void gumballSold() {
        gumball.dispenseGumball();
    }

    public void insertQuarter() {
        this.gumballInterface.insertQuater();
    }

    public void ejectQuarter() {
        this.gumballInterface.ejectQuater();
    }

    public void chooseFlavor(String flavor) {
        this.gumballInterface.chooseFlavor(flavor);
    }

    public void turnCrank() {
        this.gumballInterface.turnCrank();
        this.gumballInterface.dispenseGumball();
    }

    @Override
    public String toString() {
        return  "\n" + name + ", Inc\n" +
                "Java-enabled Standing Gumball Model #2004\n" +
                "Inventory: " + gumball.getAmout() + " gumballs\n" +
                gumballInterface + "\n";
    }

    public GumballInterface getHasQuarter() {
        return hasQuarter;
    }

    public GumballInterface getNoQuarter() {
        return noQuarter;
    }

    public GumballInterface getGumballSold() {
        return gumballSold;
    }

    public GumballInterface getOutOfGumball() {
        return outOfGumball;
    }

    public GumballInterface getChooseFlavor() {
        return chooseFlavor;
    }

    public GumballInterface getWinner() {
        return winner;
    }

    public void setState(GumballInterface state) {
        this.gumballInterface = state;
    }

    public Gumball getGumball() {
        return gumball;
    }
}

//6510405300 Kritpiruch Chaiwong