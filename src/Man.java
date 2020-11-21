public class Man implements CAN_FIGHT
{
    private String name;
    private int age;

    public Man(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void getInfoMan()
    {
        System.out.println("Name: " + name + "\nAge: " + age);
    }

    @Override
    public void Fight() {
    }

    @Override
    public void ReportBack() {
    }
}
