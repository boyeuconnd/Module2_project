public class BAR extends StrategySearch {
    private int state =1;

    @Override
    protected void preProcess() {
        System.out.println("Pre process ");

    }

    @Override
    boolean search() {
        System.out.print("Search-" + state++ + "  ");
        return state == 3 ? true : false;
    }

    @Override
    void postProcess() {
        System.out.println("Post process ");

    }
}
