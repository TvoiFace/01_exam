public class Miletary extends Man
{
    private int unit;
    private String rank;
    private boolean canFight;

    public Miletary(String name, int age, int unit, String rank, boolean canFight)
    {
        super(name, age);
        this.unit = unit;
        this.rank = rank;
        this.canFight = canFight;
    }

    public boolean getCanFight()
    {
        return canFight;
    }

    public void getInfoMiletary()
    {
        getInfoMan();
        System.out.println("\nUnit of military: " + unit + "\nMilitary's rank: " + rank);
    }

    @Override
    public void Fight()
    {
        if (canFight == true)
        {
            System.out.println("This miletary CAN FIGHT");
        }
        else
        {
            System.out.println("This miletary CAN'T FIGHT");
        }
    }
}
