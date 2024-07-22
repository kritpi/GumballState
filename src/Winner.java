public class Winner implements GumballInterface {
    private final Machine machine;

    public Winner(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuater() {
        System.out.println("You can't insert quarter");
    }

    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("Please insert quarter first");
    }

    @Override
    public void ejectQuater() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Please insert quarter first");
    }

    @Override
    public void dispenseGumball() {
        System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
        machine.gumballSold();
        if(machine.getGumball().getAmout() == 0) {
            machine.setState(machine.getOutOfGumball());
        } else {
            machine.gumballSold();
            if(machine.getGumball().getAmout() > 0) {
                machine.setState(machine.getNoQuarter());
            } else {
                System.out.println("Oops, out of gumball!");
                machine.setState(machine.getOutOfGumball());
            }
        }
    }

    @Override
    public String toString() {
       
        return "Machine is giving you a gumball"; 
    }
    
}
