public class ChooseFlavor implements GumballInterface {
    private final Machine machine;

    public ChooseFlavor(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuater() {
        System.out.println("You can't insert quarter");
    }

    @Override
    public void chooseFlavor(String flavor) {
        machine.getGumball().setFlavor(flavor);
        System.out.println("You have chosen the flavor " + flavor);
        machine.setState(machine.getHasQuarter());
    }

    @Override
    public void ejectQuater() {
        machine.setState(machine.getNoQuarter());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("Pease choose flavor first");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("No gumball to dispense");
    }

    @Override
    public String toString() {
        return "Machine waiting to choose flavor";
    }
    
}
//6510405300 Kritpiruch Chaiwong