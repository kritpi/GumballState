import java.util.Random;
public class HasQuater implements GumballInterface {
    Random random = new Random(System.currentTimeMillis());
    private final Machine machine;

    public HasQuater(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuater() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void chooseFlavor(String flavor) {
        System.out.println("You have chosen the flavor " + flavor);
        machine.getGumball().setFlavor(flavor);
        machine.setState(machine.getChooseFlavor());
    }

    @Override
    public void ejectQuater() {
        machine.setState(machine.getNoQuarter());
        System.out.println("Quarter returned");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = random.nextInt(5);
        if((winner == 0) && (machine.getGumball().getAmout() > 1)) {
            machine.setState(machine.getWinner());
        } else {
            machine.setState(machine.getGumballSold());
        }
        machine.setState(machine.getGumballSold());
    }

    @Override
    public void dispenseGumball() {
        System.out.println("No gumball dispense");
    }

    @Override
    public String toString() {
        return "Machine has quater";
    }
    
}
//6510405300 Kritpiruch Chaiwong