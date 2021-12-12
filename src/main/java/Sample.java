@MyAnnotation(name = "class", value = 100)
public class Sample {
    @MyAnnotation(name = "field", value = 200)
    private String name;

    @MyAnnotation(name = "constructor", value = 300)
    public Sample() {}

    @MyAnnotation(name="method", value = 400)
    public void execute() {
        System.out.println("execute");
    }

    public void test(String a, String b, String c) {
        System.out.printf("a:%s, b:%s, c:%s\n", a, b, c);
    }
}
