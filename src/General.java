public class General extends Comandor
{
    private  boolean retired;
    private boolean wasInjured;

    public General(String name, int age, int unit, String rank, boolean canFight, boolean isCar, int experience, boolean retired, boolean wasInjured)
    {
        super(name, age, unit, rank, canFight, isCar, experience);
        this.retired = retired;
        this.wasInjured = wasInjured;
    }

    public  void getInfoGeneral()
    {
        System.out.println("\nWas general injured?: " + wasInjured + "\nIs the general retired?: " + retired);
    }

    @Override
    public void Fight()
    {
        if (getCanFight() == true)
        {
            System.out.println("This general CAN FIGHT");
        }
        else
        {
            System.out.println("This general CAN'T FIGHT");
        }
    }

    @Override
    public void ReportBack()
    {
        System.out.println("\nGeneral is " + getName());
    }
}
