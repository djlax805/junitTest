import org.junit.*;

public class TestSuiteTwo {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("TestSuiteTwo This is how you do before SUITE hooks");
    }

    @Before
    public void beforeMethod(){
        System.out.println("TestSuiteTwo This is how you do before hooks");
    }

    @Test
    public void testMethod(){
        System.out.println("TestSuiteTwo Hello Test One!");
    }

    @After
    public void afterMethod(){
        System.out.println("TestSuiteTwo This is how you do after hooks");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("TestSuiteTwo This is how you do after SUITE hooks");
    }
}
