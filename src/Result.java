public class Result
{
    public static void main(String[] args)
    {
        Animal cat = new Cat(){};
        Animal lion = new Sher() {};
        Animal tigers = new Tigers() {};
        cat.sound();
        cat.getName();
        lion.sound();
        lion.getName();
        tigers.sound();
        tigers.getName();
    }
}
