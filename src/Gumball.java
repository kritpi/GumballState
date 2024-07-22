public class Gumball {
    private int amout;
    private String flavor;

    public Gumball(int amount){
        this.amout = amount;
    }

    public void dispenseGumball(){
        setAmout(getAmout() - 1);
    }
    
    public int getAmout() {
        return amout;
    }
    
    public void setAmout(int amout) {
        this.amout = amout;
    }   

    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

}
