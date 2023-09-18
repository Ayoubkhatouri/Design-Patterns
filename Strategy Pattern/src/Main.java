public class Main {
    public static void main(String[] args) {
        /*A good real world example of a strategy pattern would be a credit card purchase
        When you buy something with a credit card, the type of credit card doesn't matter.*/

        Context c=new Context();
        c.setStrategy(new StrategyImpl1()); //during the runtime i specify wich algorithme to use
        c.effecutuerOperation();
    }
}