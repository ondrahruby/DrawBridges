public class Bridge {
    private BridgeState state = new Up();

    // getter, setter

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() throws InterruptedException{
        state.printStatus();
    }
    public void setState( BridgeState state){
        this.state = state;
    }
}
