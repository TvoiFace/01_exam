public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Miletary obj1 = new Miletary("1", 1, 1, "1", true);
        Miletary obj2 = new Miletary("2", 2, 2, "2", false);
        Miletary obj3 = new Miletary("3", 3, 3, "3", true);
        Miletary obj4 = new Miletary("4", 4, 4, "4", false);
        Miletary obj5 = new Miletary("5", 5, 5, "5", true);
        Miletary obj6 = new Miletary("6", 6, 6, "6", false);

        Comandor obj11 = new Comandor("11", 11, 11, "11", false, false, 11);
        Comandor obj12 = new Comandor("12", 12, 12, "12", true, true, 12);

        General obj21 = new General("21", 21, 21, "21", false, true, 21, false, true);

        obj1.Fight();
        obj1.ReportBack();

        Man [] unit1 = new Man[9];

        unit1[0] = obj1;
        unit1[1] = obj2;
        unit1[2] = obj3;
        unit1[3] = obj4;
        unit1[4] = obj5;
        unit1[5] = obj6;
        unit1[6] = obj11;
        unit1[7] = obj12;
        unit1[8] = obj21;

        obj1.Fight();
        obj2.Fight();
        obj3.Fight();
        obj4.Fight();
        obj5.Fight();
        obj6.Fight();

        obj11.Fight();
        obj12.Fight();

        obj21.Fight();




    }
}
