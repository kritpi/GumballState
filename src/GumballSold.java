public class GumballSold implements GumballInterface{
    private final Machine machine;

    public GumballSold(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("No gumball dispense");
    }

    @Override
    public void ejectQuater() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there are no gumballs");
    }

    @Override
    public void dispenseGumball() {
        machine.gumballSold();
        System.out.println("A gumball comes rolling out the slot");
        if (machine.getGumball().getAmout() > 0) {
            machine.setState(machine.getNoQuarter());
        } else {
            System.out.println("Oops, out of gumballs!");
            machine.setState(machine.getOutOfGumball());
        }
    }

    @Override
    public String toString() {
        return "Machine giving you a gumball";
    }
    

}
//6510405300 Kritpiruch Chaiwong
