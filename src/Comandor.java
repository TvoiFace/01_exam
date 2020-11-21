public class Comandor extends Miletary
{
    private int experience;
    private boolean isCar;

    public Comandor(String name, int age, int unit, String rank, boolean canFight, boolean isCar, int experience)
    {
        super(name, age, unit, rank, canFight);
        this.experience = experience;
        this.isCar = isCar;
    }

    public void getInfoComandor()
    {
        getInfoMiletary();
        System.out.println("\nComandor's experience: " + experience + "\nHas Comandor company car?: " + isCar);
    }

    @Override
    public void Fight()
    {
        if (getCanFight() == true)
        {
            System.out.println("This comandor CAN FIGHT");
        }
        else
        {
            System.out.println("This comandor CAN'T FIGHT");
        }
    }

    @Override
    public void ReportBack()
    {
        System.out.println("\nComandor is " + getName());
    }
}
