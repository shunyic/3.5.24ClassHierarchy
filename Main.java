public class Main
{
    public static void main(String[] args)
    {
        Building school = new Building(10, 10, 10);
        House theCrib = new House(20, 30, 40, 10);
        school.print();
        theCrib.print();
        theCrib.destoryHouse();
        school.print();
        theCrib.print();
        theCrib.changeBuilding(5, 5, 5);
        theCrib.print();
        theCrib.changeHouse(6, 6, 6);
        theCrib.print();
        theCrib.destoryBuilding();
        theCrib.print();;
    }
}
