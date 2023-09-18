public class Context {

    private Strategy strategy=new DefaultStrategyImpl();

    public void effecutuerOperation(){
        System.out.println("****************");
        strategy.operationStrategy();
        System.out.println("================");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
