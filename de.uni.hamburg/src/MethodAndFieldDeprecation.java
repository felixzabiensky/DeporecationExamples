public class MethodAndFieldDeprecation {

    @Deprecated
    private String testField = "TestField";

    @Deprecated
    public static String testStaticField;

    @Deprecated(since = "1.0",forRemoval = false)
    public void test(){
        System.out.println("This is a test from: " + MethodAndFieldDeprecation.class.getName());
    }
    public String getTestField(){
        return testField;
    }
}
