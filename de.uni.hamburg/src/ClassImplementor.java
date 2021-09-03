public class ClassImplementor {
    ClassDeprecation classDeprecation = new ClassDeprecation();

    public void test(){
        classDeprecation.test();
    }

    public void testFieldAndMethod(){
        MethodAndFieldDeprecation methodAndFieldDeprecation = new MethodAndFieldDeprecation();
        methodAndFieldDeprecation.test();
        String test = methodAndFieldDeprecation.getTestField();
        MethodAndFieldDeprecation.testStaticField = "Test";
        System.out.println(test);
        System.out.println(MethodAndFieldDeprecation.testStaticField);
    }
}
