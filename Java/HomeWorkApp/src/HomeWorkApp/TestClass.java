package HomeWorkApp;

public class TestClass {

    @Test(4)
    public static void printConsole1() {
        System.out.println("La la la TEST priority " + 4 + " " + Test.class);
    }

    @BeforeSuite
    public static void printConsole2() {
        System.out.println("BeforeSuite " + BeforeSuite.class);
    }

    @Test(1)
    public static void printConsole7() {
        System.out.println("La la la TEST priority " + 1 + " " + Test.class);
    }

    @AfterSuite
    public static void printConsole3() {
        System.out.println("AfterSuite " + Test.class);
    }

    @Test(8)
    public static void printConsole4() {
        System.out.println("La la la TEST priority " + 8 + " " + Test.class);
    }

    @Test() // default priority is 5
    public static void printConsole8() {
        System.out.println("La la la TEST priority " + 5 + " " + Test.class);
    }

    @Test() // default priority is 5
    public static void printConsole9() {
        System.out.println("La la la TEST priority " + 5 +" " + Test.class);
    }

    @Test() // default priority is 5
    public static void printConsole10() {
        System.out.println("La la la TEST priority " + 5 + " " + Test.class);
    }

    // if AfterSuite annotation > 1, throw new RuntimeException
    //@AfterSuite
    public static void printConsole5() {
        System.out.println("AfterSuite " + Test.class);
    }
    // if BeforeSuite annotation > 1, throw new RuntimeException
    //@BeforeSuite
    public static void printConsole6() {
        System.out.println("BeforeSuite " + BeforeSuite.class);
    }
}
