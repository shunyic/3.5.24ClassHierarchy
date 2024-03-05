public class Building
{
    int height;
    int width;
    int length;
    public Building(int h, int w, int l)
    {
        height = h;
        width = w;
        length = l;
    }

    public void destoryBuilding()
    {
        height = 0;
        width = 0;
        length = 0;
        System.out.println("Building destroyed.");
    }

    public void changeBuilding(int h, int w, int l)
    {
        height += h;
        width += w;
        length += l;
        System.out.println("Taller by: " + h + ", Wider by: " + w + ", Longer by: " + l + ".");
    }
    public void print()
    {
        System.out.println(toString());
    }
    public String toString()
    {
        return "Building: " + "\n" + "Height: " + height + " Meters" + "\n" + "Width: " + width + " Meters" + "\n" + "Length: " + length + " Meters";
    }
}
