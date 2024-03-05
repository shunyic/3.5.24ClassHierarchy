public class House extends Building
{
    int rooms;
    public House(int h, int w, int l, int rooms)
    {
        super(h, w, l);
        this.rooms = rooms;
    }

    public void destoryHouse()
    {
        rooms = 0;
        super.destoryBuilding();
        System.out.println("This house now has zero rooms, thus it has 0 height, 0 width, and 0 length because it is now flat on the ground.");
    }
    public void changeHouse(int h, int w, int l)
    {
        super.changeBuilding(h, w, l);
    }
    public void print()
    {
        System.out.println(toString());
    }
    public String toString()
    {
        return "House - " + super.toString() + "\n" + "Rooms: " + rooms;
    }
}
