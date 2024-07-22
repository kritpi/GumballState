public class NoQuater implements GumballInterface {
    private final Machine machine;

    public NoQuater(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuater() {
        machine.setState(machine.getChooseFlavor());
        System.out.println("Quarter inserted");
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
        System.out.println("Please insert quarter first");
    }

    @Override
    public String toString() {
        return "Machine waiting for quarter";
    }
    
}
