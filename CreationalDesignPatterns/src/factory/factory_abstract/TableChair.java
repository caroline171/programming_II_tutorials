package factory.factory_abstract;

public class TableChair extends Chair{


    @Override
    public int getLegsCount() {
        return 4;
    }

    @Override
    public void displayChairModel() {
        System.out.println(" I am an Old BORING table chair");
    }
}
