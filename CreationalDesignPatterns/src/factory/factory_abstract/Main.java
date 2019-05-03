package factory.factory_abstract;

public class Main {

    public static void main(String args[]){
        FurnitureFactory factory = new FurnitureFactory();
        Chair chairModern = factory.createChair("modern");
        Chair chairVictorian = factory.createChair("victorian");
    }
}
