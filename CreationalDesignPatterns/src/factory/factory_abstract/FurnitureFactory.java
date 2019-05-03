package factory.factory_abstract;

public class FurnitureFactory {

    public Chair createChair(String type){
        Chair chair = null;
        if(type == "modern"){
            chair = new LazyBoy();
        } else if(type == "victorian"){
            chair = new TableChair();
        }
        System.out.println("Chair has " +
                chair.getLegsCount() + " legs");
        chair.displayChairModel();
        return chair;
    }

}
